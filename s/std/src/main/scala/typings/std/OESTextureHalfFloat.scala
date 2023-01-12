package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The OES_texture_half_float extension is part of the WebGL API and adds texture formats with 16- (aka half float) and 32-bit floating-point components. */
trait OESTextureHalfFloat extends StObject {
  
  /* standard dom */
  val HALF_FLOAT_OES: GLenum
}
object OESTextureHalfFloat {
  
  inline def apply(HALF_FLOAT_OES: GLenum): OESTextureHalfFloat = {
    val __obj = js.Dynamic.literal(HALF_FLOAT_OES = HALF_FLOAT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureHalfFloat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OESTextureHalfFloat] (val x: Self) extends AnyVal {
    
    inline def setHALF_FLOAT_OES(value: GLenum): Self = StObject.set(x, "HALF_FLOAT_OES", value.asInstanceOf[js.Any])
  }
}
