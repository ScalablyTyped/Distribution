package typings.rax.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ======================================================================
  * Rax Component Specs and Lifecycle
  * ======================================================================
  */
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as Rax will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
trait ComponentLifecycle[P, S, SS] extends js.Object {
  /**
    * Catches exceptions generated in descendant components. Unhandled exceptions will cause
    * the entire component tree to unmount.
    */
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
  /**
    * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
    */
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.undefined
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ js.Any, Unit]] = js.undefined
  /**
    * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
    * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
    */
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Unit]
  ] = js.undefined
  /**
    * Runs before Rax applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.undefined
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
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Boolean]
  ] = js.undefined
}

object ComponentLifecycle {
  @scala.inline
  def apply[P, S, SS](
    componentDidCatch: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit = null,
    componentDidMount: () => Unit = null,
    componentDidUpdate: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit = null,
    componentWillMount: () => Unit = null,
    componentWillReceiveProps: (/* nextProps */ P, /* nextContext */ js.Any) => Unit = null,
    componentWillUnmount: () => Unit = null,
    componentWillUpdate: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Unit = null,
    getSnapshotBeforeUpdate: (/* prevProps */ P, /* prevState */ S) => SS | Null = null,
    shouldComponentUpdate: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Boolean = null
  ): ComponentLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
    __obj.asInstanceOf[ComponentLifecycle[P, S, SS]]
  }
}

