package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTBlendMinmax extends StObject {
  
  /* standard dom */
  val MAX_EXT: GLenum
  
  /* standard dom */
  val MIN_EXT: GLenum
}
object EXTBlendMinmax {
  
  inline def apply(MAX_EXT: GLenum, MIN_EXT: GLenum): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT.asInstanceOf[js.Any], MIN_EXT = MIN_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTBlendMinmax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EXTBlendMinmax] (val x: Self) extends AnyVal {
    
    inline def setMAX_EXT(value: GLenum): Self = StObject.set(x, "MAX_EXT", value.asInstanceOf[js.Any])
    
    inline def setMIN_EXT(value: GLenum): Self = StObject.set(x, "MIN_EXT", value.asInstanceOf[js.Any])
  }
}
