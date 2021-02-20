package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordDeleted extends IEventArgs {
  
  var changeKey: IChangeKey = js.native
  
  var recordIdx: Double = js.native
  
  var recordKey: Double = js.native
}
object RecordDeleted {
  
  @scala.inline
  def apply(changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordDeleted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDeleted]
  }
  
  @scala.inline
  implicit class RecordDeletedMutableBuilder[Self <: RecordDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdx(value: Double): Self = StObject.set(x, "recordIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
