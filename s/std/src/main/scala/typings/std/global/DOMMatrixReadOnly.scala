package typings.std.global

import typings.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMMatrixReadOnly")
@js.native
class DOMMatrixReadOnly ()
  extends StObject
     with typings.std.DOMMatrixReadOnly {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
object DOMMatrixReadOnly {
  
  @JSGlobal("DOMMatrixReadOnly")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromFloat32Array(array32: typings.std.Float32Array): typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMMatrixReadOnly]
  
  @scala.inline
  def fromFloat64Array(array64: typings.std.Float64Array): typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMMatrixReadOnly]
  
  @scala.inline
  def fromMatrix(): typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[typings.std.DOMMatrixReadOnly]
  @scala.inline
  def fromMatrix(other: DOMMatrixInit): typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMMatrixReadOnly]
  
  @scala.inline
  def toString_(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[java.lang.String]
}
