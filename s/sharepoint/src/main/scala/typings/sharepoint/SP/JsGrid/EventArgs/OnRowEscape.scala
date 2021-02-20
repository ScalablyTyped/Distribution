package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRowEscape extends IEventArgs {
  
  var recordKey: Double = js.native
}
object OnRowEscape {
  
  @scala.inline
  def apply(recordKey: Double): OnRowEscape = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowEscape]
  }
  
  @scala.inline
  implicit class OnRowEscapeMutableBuilder[Self <: OnRowEscape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
