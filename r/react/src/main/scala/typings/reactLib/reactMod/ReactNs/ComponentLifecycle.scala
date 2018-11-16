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

