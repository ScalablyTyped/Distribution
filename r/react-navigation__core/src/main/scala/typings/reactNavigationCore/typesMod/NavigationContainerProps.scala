package typings.reactNavigationCore.typesMod

import typings.react.mod.ReactNode
import typings.reactNavigationRouters.typesMod.InitialState
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationContainerProps extends js.Object {
  
  /**
    * Children elements to render.
    */
  var children: ReactNode = js.native
  
  /**
    * Whether this navigation container should be independent of parent containers.
    * If this is not set to `true`, this container cannot be nested inside another container.
    * Setting it to `true` disconnects any children navigators from parent container.
    */
  var independent: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial navigation state for the child navigators.
    */
  var initialState: js.UndefOr[InitialState] = js.native
  
  /**
    * Callback which is called with the latest navigation state when it changes.
    */
  var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.native
  
  /**
    * Callback which is called when an action is not handled.
    */
  var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.native
}
object NavigationContainerProps {
  
  @scala.inline
  def apply(): NavigationContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerProps]
  }
  
  @scala.inline
  implicit class NavigationContainerPropsOps[Self <: NavigationContainerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setIndependent(value: Boolean): Self = this.set("independent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndependent: Self = this.set("independent", js.undefined)
    
    @scala.inline
    def setInitialState(value: InitialState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = this.set("onUnhandledAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnhandledAction: Self = this.set("onUnhandledAction", js.undefined)
  }
}
