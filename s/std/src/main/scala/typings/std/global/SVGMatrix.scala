package typings.std.global

import typings.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGMatrix")
@js.native
class SVGMatrix ()
  extends StObject
     with typings.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
/* was `typeof DOMMatrix` */
object SVGMatrix {
  
  @JSGlobal("SVGMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromFloat32Array(array32: typings.std.Float32Array): typings.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMMatrix]
  
  @scala.inline
  def fromFloat64Array(array64: typings.std.Float64Array): typings.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMMatrix]
  
  @scala.inline
  def fromMatrix(): typings.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[typings.std.DOMMatrix]
  @scala.inline
  def fromMatrix(other: DOMMatrixInit): typings.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[typings.std.DOMMatrix]
}
