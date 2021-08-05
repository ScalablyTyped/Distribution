package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentInfoValue extends StObject {
  
  var `type`: Double
  
  var `val`: String
}
object ExtentInfoValue {
  
  inline def apply(`type`: Double, `val`: String): ExtentInfoValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentInfoValue]
  }
  
  extension [Self <: ExtentInfoValue](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
