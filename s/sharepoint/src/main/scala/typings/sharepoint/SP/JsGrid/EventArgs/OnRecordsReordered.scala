package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
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
  implicit class OnRecordsReorderedMutableBuilder[Self <: OnRecordsReordered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderedKeys(value: js.Array[String]): Self = StObject.set(x, "reorderedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderedKeysVarargs(value: String*): Self = StObject.set(x, "reorderedKeys", js.Array(value :_*))
  }
}
