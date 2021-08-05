package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTBlendMinmax extends StObject {
  
  val MAX_EXT: GLenum
  
  val MIN_EXT: GLenum
}
object EXTBlendMinmax {
  
  inline def apply(MAX_EXT: GLenum, MIN_EXT: GLenum): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT.asInstanceOf[js.Any], MIN_EXT = MIN_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTBlendMinmax]
  }
  
  extension [Self <: EXTBlendMinmax](x: Self) {
    
    inline def setMAX_EXT(value: GLenum): Self = StObject.set(x, "MAX_EXT", value.asInstanceOf[js.Any])
    
    inline def setMIN_EXT(value: GLenum): Self = StObject.set(x, "MIN_EXT", value.asInstanceOf[js.Any])
  }
}
