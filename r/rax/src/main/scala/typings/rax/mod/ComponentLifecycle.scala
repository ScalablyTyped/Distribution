package typings.rax.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ======================================================================
  * Rax Component Specs and Lifecycle
  * ======================================================================
  */
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as Rax will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
@js.native
trait ComponentLifecycle[P, S, SS] extends js.Object {
  
  /**
    * Catches exceptions generated in descendant components. Unhandled exceptions will cause
    * the entire component tree to unmount.
    */
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  /**
    * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
    */
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ js.Any, Unit]] = js.native
  
  /**
    * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
    * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
    */
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  /**
    * Runs before Rax applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.native
  
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
  ] = js.native
}
object ComponentLifecycle {
  
  @scala.inline
  def apply[P, S, SS](): ComponentLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentLifecycle[P, S, SS]]
  }
  
  @scala.inline
  implicit class ComponentLifecycleOps[Self <: ComponentLifecycle[_, _, _], P, S, SS] (val x: Self with (ComponentLifecycle[P, S, SS])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentDidCatch(value: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit): Self = this.set("componentDidCatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComponentDidCatch: Self = this.set("componentDidCatch", js.undefined)
    
    @scala.inline
    def setComponentDidMount(value: () => Unit): Self = this.set("componentDidMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentDidMount: Self = this.set("componentDidMount", js.undefined)
    
    @scala.inline
    def setComponentDidUpdate(value: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit): Self = this.set("componentDidUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteComponentDidUpdate: Self = this.set("componentDidUpdate", js.undefined)
    
    @scala.inline
    def setComponentWillMount(value: () => Unit): Self = this.set("componentWillMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentWillMount: Self = this.set("componentWillMount", js.undefined)
    
    @scala.inline
    def setComponentWillReceiveProps(value: (/* nextProps */ P, /* nextContext */ js.Any) => Unit): Self = this.set("componentWillReceiveProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComponentWillReceiveProps: Self = this.set("componentWillReceiveProps", js.undefined)
    
    @scala.inline
    def setComponentWillUnmount(value: () => Unit): Self = this.set("componentWillUnmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentWillUnmount: Self = this.set("componentWillUnmount", js.undefined)
    
    @scala.inline
    def setComponentWillUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Unit): Self = this.set("componentWillUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteComponentWillUpdate: Self = this.set("componentWillUpdate", js.undefined)
    
    @scala.inline
    def setGetSnapshotBeforeUpdate(value: (/* prevProps */ P, /* prevState */ S) => SS | Null): Self = this.set("getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetSnapshotBeforeUpdate: Self = this.set("getSnapshotBeforeUpdate", js.undefined)
    
    @scala.inline
    def setShouldComponentUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Boolean): Self = this.set("shouldComponentUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteShouldComponentUpdate: Self = this.set("shouldComponentUpdate", js.undefined)
  }
}
