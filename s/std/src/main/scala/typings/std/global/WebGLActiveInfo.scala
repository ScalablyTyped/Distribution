package typings.std.global

import typings.std.GLenum
import typings.std.GLint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WebGLActiveInfo")
@js.native
/* standard dom */
open class WebGLActiveInfo ()
  extends StObject
     with typings.std.WebGLActiveInfo {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo/name) */
  /* standard dom */
  /* CompleteClass */
  override val name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo/size) */
  /* standard dom */
  /* CompleteClass */
  override val size: GLint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: GLenum = js.native
}
