package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashFormat extends StObject {
  
  var data: String
  
  var format: Double
}
object HashFormat {
  
  inline def apply(data: String, format: Double): HashFormat = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashFormat]
  }
  
  extension [Self <: HashFormat](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
