package typings.std.global

import typings.std.CSSNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSScale")
@js.native
open class CSSScale protected ()
  extends StObject
     with typings.std.CSSScale {
  /* standard dom */
  def this(x: CSSNumberish, y: CSSNumberish) = this()
  def this(x: CSSNumberish, y: CSSNumberish, z: CSSNumberish) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D) */
  /* standard dom */
  /* CompleteClass */
  var is2D: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix) */
  /* standard dom */
  /* CompleteClass */
  override def toMatrix(): typings.std.DOMMatrix = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale/x) */
  /* standard dom */
  /* CompleteClass */
  var x: CSSNumberish = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale/y) */
  /* standard dom */
  /* CompleteClass */
  var y: CSSNumberish = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSScale/z) */
  /* standard dom */
  /* CompleteClass */
  var z: CSSNumberish = js.native
}
