package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookupInfo extends StObject {
  
  var localString: String
  
  var value: Double
}
object ILookupInfo {
  
  inline def apply(localString: String, value: Double): ILookupInfo = {
    val __obj = js.Dynamic.literal(localString = localString.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookupInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILookupInfo] (val x: Self) extends AnyVal {
    
    inline def setLocalString(value: String): Self = StObject.set(x, "localString", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
