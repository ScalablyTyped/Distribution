package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OESDrawBuffersIndexed extends StObject {
  
  /* standard dom */
  def blendEquationSeparateiOES(buf: GLuint, modeRGB: GLenum, modeAlpha: GLenum): Unit
  
  /* standard dom */
  def blendEquationiOES(buf: GLuint, mode: GLenum): Unit
  
  /* standard dom */
  def blendFuncSeparateiOES(buf: GLuint, srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit
  
  /* standard dom */
  def blendFunciOES(buf: GLuint, src: GLenum, dst: GLenum): Unit
  
  /* standard dom */
  def colorMaskiOES(buf: GLuint, r: GLboolean, g: GLboolean, b: GLboolean, a: GLboolean): Unit
  
  /* standard dom */
  def disableiOES(target: GLenum, index: GLuint): Unit
  
  /* standard dom */
  def enableiOES(target: GLenum, index: GLuint): Unit
}
object OESDrawBuffersIndexed {
  
  inline def apply(
    blendEquationSeparateiOES: (GLuint, GLenum, GLenum) => Unit,
    blendEquationiOES: (GLuint, GLenum) => Unit,
    blendFuncSeparateiOES: (GLuint, GLenum, GLenum, GLenum, GLenum) => Unit,
    blendFunciOES: (GLuint, GLenum, GLenum) => Unit,
    colorMaskiOES: (GLuint, GLboolean, GLboolean, GLboolean, GLboolean) => Unit,
    disableiOES: (GLenum, GLuint) => Unit,
    enableiOES: (GLenum, GLuint) => Unit
  ): OESDrawBuffersIndexed = {
    val __obj = js.Dynamic.literal(blendEquationSeparateiOES = js.Any.fromFunction3(blendEquationSeparateiOES), blendEquationiOES = js.Any.fromFunction2(blendEquationiOES), blendFuncSeparateiOES = js.Any.fromFunction5(blendFuncSeparateiOES), blendFunciOES = js.Any.fromFunction3(blendFunciOES), colorMaskiOES = js.Any.fromFunction5(colorMaskiOES), disableiOES = js.Any.fromFunction2(disableiOES), enableiOES = js.Any.fromFunction2(enableiOES))
    __obj.asInstanceOf[OESDrawBuffersIndexed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OESDrawBuffersIndexed] (val x: Self) extends AnyVal {
    
    inline def setBlendEquationSeparateiOES(value: (GLuint, GLenum, GLenum) => Unit): Self = StObject.set(x, "blendEquationSeparateiOES", js.Any.fromFunction3(value))
    
    inline def setBlendEquationiOES(value: (GLuint, GLenum) => Unit): Self = StObject.set(x, "blendEquationiOES", js.Any.fromFunction2(value))
    
    inline def setBlendFuncSeparateiOES(value: (GLuint, GLenum, GLenum, GLenum, GLenum) => Unit): Self = StObject.set(x, "blendFuncSeparateiOES", js.Any.fromFunction5(value))
    
    inline def setBlendFunciOES(value: (GLuint, GLenum, GLenum) => Unit): Self = StObject.set(x, "blendFunciOES", js.Any.fromFunction3(value))
    
    inline def setColorMaskiOES(value: (GLuint, GLboolean, GLboolean, GLboolean, GLboolean) => Unit): Self = StObject.set(x, "colorMaskiOES", js.Any.fromFunction5(value))
    
    inline def setDisableiOES(value: (GLenum, GLuint) => Unit): Self = StObject.set(x, "disableiOES", js.Any.fromFunction2(value))
    
    inline def setEnableiOES(value: (GLenum, GLuint) => Unit): Self = StObject.set(x, "enableiOES", js.Any.fromFunction2(value))
  }
}
