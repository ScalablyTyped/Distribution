package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSSkewY")
@js.native
open class CSSSkewY protected ()
  extends StObject
     with typings.std.CSSSkewY {
  /* standard dom */
  def this(ay: typings.std.CSSNumericValue) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSkewY/ay) */
  /* standard dom */
  /* CompleteClass */
  var ay: typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D) */
  /* standard dom */
  /* CompleteClass */
  var is2D: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix) */
  /* standard dom */
  /* CompleteClass */
  override def toMatrix(): typings.std.DOMMatrix = js.native
}
