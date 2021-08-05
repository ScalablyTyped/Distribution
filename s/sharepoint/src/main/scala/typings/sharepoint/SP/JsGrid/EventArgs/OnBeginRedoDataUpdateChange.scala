package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeginRedoDataUpdateChange
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
}
object OnBeginRedoDataUpdateChange {
  
  inline def apply(changeKey: IChangeKey): OnBeginRedoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginRedoDataUpdateChange]
  }
  
  extension [Self <: OnBeginRedoDataUpdateChange](x: Self) {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
