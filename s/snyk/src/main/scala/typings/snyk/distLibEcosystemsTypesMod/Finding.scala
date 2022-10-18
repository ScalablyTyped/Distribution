package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finding extends StObject {
  
  var data: Any
  
  var `type`: FindingType
}
object Finding {
  
  inline def apply(data: Any, `type`: FindingType): Finding = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  extension [Self <: Finding](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: FindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
