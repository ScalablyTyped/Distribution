package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheetIOSOptions extends js.Object {
  
  var anchor: js.UndefOr[Double] = js.native
  
  var cancelButtonIndex: js.UndefOr[Double] = js.native
  
  var destructiveButtonIndex: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var options: js.Array[String] = js.native
  
  var tintColor: js.UndefOr[ColorValue | ProcessedColorValue] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ActionSheetIOSOptions {
  
  @scala.inline
  def apply(options: js.Array[String]): ActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetIOSOptions]
  }
  
  @scala.inline
  implicit class ActionSheetIOSOptionsOps[Self <: ActionSheetIOSOptions] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor(value: Double): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setCancelButtonIndex(value: Double): Self = this.set("cancelButtonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonIndex: Self = this.set("cancelButtonIndex", js.undefined)
    
    @scala.inline
    def setDestructiveButtonIndex(value: Double): Self = this.set("destructiveButtonIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestructiveButtonIndex: Self = this.set("destructiveButtonIndex", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue | ProcessedColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
