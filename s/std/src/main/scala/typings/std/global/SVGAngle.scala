package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGAngle")
@js.native
class SVGAngle ()
  extends StObject
     with typings.std.SVGAngle {
  
  /* CompleteClass */
  override val SVG_ANGLETYPE_DEG: Double = js.native
  
  /* CompleteClass */
  override val SVG_ANGLETYPE_GRAD: Double = js.native
  
  /* CompleteClass */
  override val SVG_ANGLETYPE_RAD: Double = js.native
  
  /* CompleteClass */
  override val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  
  /* CompleteClass */
  override val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
  
  /* CompleteClass */
  override def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  
  /* CompleteClass */
  override def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
  
  /* CompleteClass */
  override val unitType: Double = js.native
  
  /* CompleteClass */
  var value: Double = js.native
  
  /* CompleteClass */
  var valueAsString: java.lang.String = js.native
  
  /* CompleteClass */
  var valueInSpecifiedUnits: Double = js.native
}
object SVGAngle {
  
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_DEG")
  @js.native
  val SVG_ANGLETYPE_DEG: Double = js.native
  
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_GRAD")
  @js.native
  val SVG_ANGLETYPE_GRAD: Double = js.native
  
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_RAD")
  @js.native
  val SVG_ANGLETYPE_RAD: Double = js.native
  
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_UNKNOWN")
  @js.native
  val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  
  @JSGlobal("SVGAngle.SVG_ANGLETYPE_UNSPECIFIED")
  @js.native
  val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
}
