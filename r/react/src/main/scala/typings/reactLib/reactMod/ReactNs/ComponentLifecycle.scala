package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Component Specs and Lifecycle
// ----------------------------------------------------------------------
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as React will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
trait ComponentLifecycle[P, S, SS]
  extends NewLifecycle[P, S, SS]
     with DeprecatedLifecycle[P, S] {
  /**
    * Catches exceptions generated in descendant components. Unhandled exceptions will cause
    * the entire component tree to unmount.
    */
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ stdLib.Error, /* errorInfo */ ErrorInfo, scala.Unit]] = js.undefined
  /**
    * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
    */
  var componentDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
    * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
    */
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called to determine whether the change in props and state should trigger a re-render.
    *
    * `Component` always returns true.
    * `PureComponent` implements a shallow comparison on props and state and returns true if any
    * props or states have changed.
    *
    * If false is returned, `Component#render`, `componentWillUpdate`
    * and `componentDidUpdate` will not be called.
    */
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
}

object ComponentLifecycle {
  @scala.inline
  def apply[P, S, SS](
    UNSAFE_componentWillMount: js.Function0[scala.Unit] = null,
    UNSAFE_componentWillReceiveProps: js.Function2[/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any, scala.Unit] = null,
    UNSAFE_componentWillUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Unit
    ] = null,
    componentDidCatch: js.Function2[/* error */ stdLib.Error, /* errorInfo */ ErrorInfo, scala.Unit] = null,
    componentDidMount: js.Function0[scala.Unit] = null,
    componentDidUpdate: js.Function3[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      /* snapshot */ js.UndefOr[SS], 
      scala.Unit
    ] = null,
    componentWillMount: js.Function0[scala.Unit] = null,
    componentWillReceiveProps: js.Function2[/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any, scala.Unit] = null,
    componentWillUnmount: js.Function0[scala.Unit] = null,
    componentWillUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Unit
    ] = null,
    getSnapshotBeforeUpdate: js.Function2[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      SS | scala.Null
    ] = null,
    shouldComponentUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ] = null
  ): ComponentLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(UNSAFE_componentWillMount)
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(UNSAFE_componentWillReceiveProps)
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(UNSAFE_componentWillUpdate)
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(componentDidCatch)
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(componentDidMount)
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(componentDidUpdate)
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(componentWillMount)
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(componentWillReceiveProps)
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(componentWillUnmount)
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(componentWillUpdate)
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(getSnapshotBeforeUpdate)
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(shouldComponentUpdate)
    __obj.asInstanceOf[ComponentLifecycle[P, S, SS]]
  }
}

