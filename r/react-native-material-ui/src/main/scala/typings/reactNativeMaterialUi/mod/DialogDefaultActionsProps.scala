package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.DefaultActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogDefaultActionsProps extends js.Object {
  
  var actions: js.Array[String] = js.native
  
  def onActionPress(action: String): Unit = js.native
  
  var style: js.UndefOr[DefaultActionsContainer] = js.native
}
object DialogDefaultActionsProps {
  
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): DialogDefaultActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    __obj.asInstanceOf[DialogDefaultActionsProps]
  }
  
  @scala.inline
  implicit class DialogDefaultActionsPropsOps[Self <: DialogDefaultActionsProps] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActionPress(value: String => Unit): Self = this.set("onActionPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: DefaultActionsContainer): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
