package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxFieldProperties extends StObject {
  
  var qOneAndOnlyOne: Boolean
}
object INxFieldProperties {
  
  inline def apply(qOneAndOnlyOne: Boolean): INxFieldProperties = {
    val __obj = js.Dynamic.literal(qOneAndOnlyOne = qOneAndOnlyOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldProperties]
  }
  
  extension [Self <: INxFieldProperties](x: Self) {
    
    inline def setQOneAndOnlyOne(value: Boolean): Self = StObject.set(x, "qOneAndOnlyOne", value.asInstanceOf[js.Any])
  }
}
