package typings.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
  
  /**
    * When pure, compares the result of mergeProps to its previous value.
    * @default shallowEqual
    */
  var areMergedPropsEqual: js.UndefOr[
    js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
  ] = js.native
  
  /**
    * When pure, compares incoming props to its previous value.
    * @default shallowEqual
    */
  var areOwnPropsEqual: js.UndefOr[
    js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
  ] = js.native
  
  /**
    * When pure, compares the result of mapStateToProps to its previous value.
    * @default shallowEqual
    */
  var areStatePropsEqual: js.UndefOr[
    js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
  ] = js.native
  
  /**
    * When pure, compares incoming store state to its previous value.
    * @default strictEqual
    */
  var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.native
  
  /**
    * If true, use React's forwardRef to expose a ref of the wrapped component
    *
    * @default false
    */
  var forwardRef: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
    * preventing unnecessary updates, assuming that the component is a “pure” component
    * and does not rely on any input or state other than its props and the selected Redux store’s state.
    * Defaults to true.
    * @default true
    */
  var pure: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[State, TStateProps, TOwnProps, TMergedProps](): Options[State, TStateProps, TOwnProps, TMergedProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _, _, _], State, TStateProps, TOwnProps, TMergedProps] (val x: Self with (Options[State, TStateProps, TOwnProps, TMergedProps])) extends AnyVal {
    
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
    def setAreMergedPropsEqual(value: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => Boolean): Self = this.set("areMergedPropsEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAreMergedPropsEqual: Self = this.set("areMergedPropsEqual", js.undefined)
    
    @scala.inline
    def setAreOwnPropsEqual(value: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => Boolean): Self = this.set("areOwnPropsEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAreOwnPropsEqual: Self = this.set("areOwnPropsEqual", js.undefined)
    
    @scala.inline
    def setAreStatePropsEqual(value: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => Boolean): Self = this.set("areStatePropsEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAreStatePropsEqual: Self = this.set("areStatePropsEqual", js.undefined)
    
    @scala.inline
    def setAreStatesEqual(value: (/* nextState */ State, /* prevState */ State) => Boolean): Self = this.set("areStatesEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAreStatesEqual: Self = this.set("areStatesEqual", js.undefined)
    
    @scala.inline
    def setForwardRef(value: Boolean): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
    
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
  }
}
