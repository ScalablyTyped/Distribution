package typings.std.global

import typings.std.CSSMatrixComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CSSMatrixComponent")
@js.native
open class CSSMatrixComponent protected ()
  extends StObject
     with typings.std.CSSMatrixComponent {
  /* standard dom */
  def this(matrix: typings.std.DOMMatrixReadOnly) = this()
  def this(matrix: typings.std.DOMMatrixReadOnly, options: CSSMatrixComponentOptions) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/is2D) */
  /* standard dom */
  /* CompleteClass */
  var is2D: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMatrixComponent/matrix) */
  /* standard dom */
  /* CompleteClass */
  var matrix: typings.std.DOMMatrix = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformComponent/toMatrix) */
  /* standard dom */
  /* CompleteClass */
  override def toMatrix(): typings.std.DOMMatrix = js.native
}
