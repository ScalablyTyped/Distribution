package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEntryRecordAdded extends IEventArgs {
  
  var recordKey: Double = js.native
}
object OnEntryRecordAdded {
  
  @scala.inline
  def apply(recordKey: Double): OnEntryRecordAdded = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordAdded]
  }
  
  @scala.inline
  implicit class OnEntryRecordAddedMutableBuilder[Self <: OnEntryRecordAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
