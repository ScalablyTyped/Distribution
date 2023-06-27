package typings.std.global

import typings.std.CSSNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSRotate")
@js.native
open class CSSRotate protected ()
  extends StObject
     with typings.std.CSSRotate {
  /* standard dom */
  def this(angle: typings.std.CSSNumericValue) = this()
  /* standard dom */
  def this(x: CSSNumberish, y: CSSNumberish, z: CSSNumberish, angle: typings.std.CSSNumericValue) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/angle) */
  /* standard dom */
  /* CompleteClass */
  var angle: typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D) */
  /* standard dom */
  /* CompleteClass */
  var is2D: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix) */
  /* standard dom */
  /* CompleteClass */
  override def toMatrix(): typings.std.DOMMatrix = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/x) */
  /* standard dom */
  /* CompleteClass */
  var x: CSSNumberish = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/y) */
  /* standard dom */
  /* CompleteClass */
  var y: CSSNumberish = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRotate/z) */
  /* standard dom */
  /* CompleteClass */
  var z: CSSNumberish = js.native
}
