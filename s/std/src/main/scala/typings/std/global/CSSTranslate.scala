package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSTranslate")
@js.native
open class CSSTranslate protected ()
  extends StObject
     with typings.std.CSSTranslate {
  /* standard dom */
  def this(x: typings.std.CSSNumericValue, y: typings.std.CSSNumericValue) = this()
  def this(x: typings.std.CSSNumericValue, y: typings.std.CSSNumericValue, z: typings.std.CSSNumericValue) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D) */
  /* standard dom */
  /* CompleteClass */
  var is2D: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix) */
  /* standard dom */
  /* CompleteClass */
  override def toMatrix(): typings.std.DOMMatrix = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/x) */
  /* standard dom */
  /* CompleteClass */
  var x: typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/y) */
  /* standard dom */
  /* CompleteClass */
  var y: typings.std.CSSNumericValue = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTranslate/z) */
  /* standard dom */
  /* CompleteClass */
  var z: typings.std.CSSNumericValue = js.native
}
