package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRowEscape
  extends StObject
     with IEventArgs {
  
  var recordKey: Double
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
