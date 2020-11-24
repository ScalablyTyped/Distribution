package typings.sharepoint.CUI.Page

import typings.sharepoint.CUI.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusManager
  extends CommandDispatcher
     with ICommandHandler {
  
  def getFocusedComponents(): js.Array[Component] = js.native
  
  def releaseAllFoci(): Boolean = js.native
  
  def releaseFocusFromComponent(component: Component): js.Any = js.native
  
  def requestFocusForComponent(component: Component): js.Any = js.native
}
object FocusManager {
  
  @scala.inline
  def apply(
    canHandleCommand: String => Boolean,
    executeCommand: (String, js.Any) => js.Any,
    getFocusedComponents: () => js.Array[Component],
    handleCommand: (String, js.Any, Double) => Boolean,
    releaseAllFoci: () => Boolean,
    releaseFocusFromComponent: Component => js.Any,
    requestFocusForComponent: Component => js.Any
  ): FocusManager = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), executeCommand = js.Any.fromFunction2(executeCommand), getFocusedComponents = js.Any.fromFunction0(getFocusedComponents), handleCommand = js.Any.fromFunction3(handleCommand), releaseAllFoci = js.Any.fromFunction0(releaseAllFoci), releaseFocusFromComponent = js.Any.fromFunction1(releaseFocusFromComponent), requestFocusForComponent = js.Any.fromFunction1(requestFocusForComponent))
    __obj.asInstanceOf[FocusManager]
  }
  
  @scala.inline
  implicit class FocusManagerOps[Self <: FocusManager] (val x: Self) extends AnyVal {
    
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
    def setGetFocusedComponents(value: () => js.Array[Component]): Self = this.set("getFocusedComponents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReleaseAllFoci(value: () => Boolean): Self = this.set("releaseAllFoci", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReleaseFocusFromComponent(value: Component => js.Any): Self = this.set("releaseFocusFromComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestFocusForComponent(value: Component => js.Any): Self = this.set("requestFocusForComponent", js.Any.fromFunction1(value))
  }
}
