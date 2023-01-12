package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VacateChange
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
}
object VacateChange {
  
  inline def apply(changeKey: IChangeKey): VacateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VacateChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VacateChange] (val x: Self) extends AnyVal {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
