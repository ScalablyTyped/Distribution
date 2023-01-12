package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CLAMP extends StObject {
  
  var CLAMP: String
  
  var EXTEND: String
  
  var IDENTITY: String
}
object CLAMP {
  
  inline def apply(CLAMP: String, EXTEND: String, IDENTITY: String): CLAMP = {
    val __obj = js.Dynamic.literal(CLAMP = CLAMP.asInstanceOf[js.Any], EXTEND = EXTEND.asInstanceOf[js.Any], IDENTITY = IDENTITY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLAMP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CLAMP] (val x: Self) extends AnyVal {
    
    inline def setCLAMP(value: String): Self = StObject.set(x, "CLAMP", value.asInstanceOf[js.Any])
    
    inline def setEXTEND(value: String): Self = StObject.set(x, "EXTEND", value.asInstanceOf[js.Any])
    
    inline def setIDENTITY(value: String): Self = StObject.set(x, "IDENTITY", value.asInstanceOf[js.Any])
  }
}
