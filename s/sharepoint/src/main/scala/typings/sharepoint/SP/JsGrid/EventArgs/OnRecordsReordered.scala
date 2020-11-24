package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRecordsReordered extends IEventArgs {
  
  var changeKey: IChangeKey = js.native
  
  var reorderedKeys: js.Array[String] = js.native
}
object OnRecordsReordered {
  
  @scala.inline
  def apply(changeKey: IChangeKey, reorderedKeys: js.Array[String]): OnRecordsReordered = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], reorderedKeys = reorderedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRecordsReordered]
  }
  
  @scala.inline
  implicit class OnRecordsReorderedOps[Self <: OnRecordsReordered] (val x: Self) extends AnyVal {
    
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
    def setChangeKey(value: IChangeKey): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderedKeysVarargs(value: String*): Self = this.set("reorderedKeys", js.Array(value :_*))
    
    @scala.inline
    def setReorderedKeys(value: js.Array[String]): Self = this.set("reorderedKeys", value.asInstanceOf[js.Any])
  }
}
