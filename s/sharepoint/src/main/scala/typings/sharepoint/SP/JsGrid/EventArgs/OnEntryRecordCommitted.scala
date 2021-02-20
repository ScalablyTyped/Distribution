package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEntryRecordCommitted extends IEventArgs {
  
  var changeKey: IChangeKey = js.native
  
  var originalRecordKey: Double = js.native
  
  var recordKey: Double = js.native
}
object OnEntryRecordCommitted {
  
  @scala.inline
  def apply(changeKey: IChangeKey, originalRecordKey: Double, recordKey: Double): OnEntryRecordCommitted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], originalRecordKey = originalRecordKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordCommitted]
  }
  
  @scala.inline
  implicit class OnEntryRecordCommittedMutableBuilder[Self <: OnEntryRecordCommitted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRecordKey(value: Double): Self = StObject.set(x, "originalRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
