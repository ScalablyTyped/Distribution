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
  
  inline def apply(recordKey: Double): OnRowEscape = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowEscape]
  }
  
  extension [Self <: OnRowEscape](x: Self) {
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
