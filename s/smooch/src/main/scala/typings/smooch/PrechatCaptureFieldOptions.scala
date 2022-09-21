package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrechatCaptureFieldOptions extends StObject {
  
  var label: String
  
  var name: String
}
object PrechatCaptureFieldOptions {
  
  inline def apply(label: String, name: String): PrechatCaptureFieldOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrechatCaptureFieldOptions]
  }
  
  extension [Self <: PrechatCaptureFieldOptions](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
