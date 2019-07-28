package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only. */
trait SVGAngle extends js.Object {
  val SVG_ANGLETYPE_DEG: Double
  val SVG_ANGLETYPE_GRAD: Double
  val SVG_ANGLETYPE_RAD: Double
  val SVG_ANGLETYPE_UNKNOWN: Double
  val SVG_ANGLETYPE_UNSPECIFIED: Double
  val unitType: Double
  var value: Double
  var valueAsString: java.lang.String
  var valueInSpecifiedUnits: Double
  def convertToSpecifiedUnits(unitType: Double): Unit
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
}

@JSGlobal("SVGAngle")
@js.native
class SVGAngleCls () extends SVGAngle {
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
  override val unitType: Double = js.native
  /* CompleteClass */
  override var value: Double = js.native
  /* CompleteClass */
  override var valueAsString: java.lang.String = js.native
  /* CompleteClass */
  override var valueInSpecifiedUnits: Double = js.native
  /* CompleteClass */
  override def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  /* CompleteClass */
  override def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
}

@JSGlobal("SVGAngle")
@js.native
object SVGAngle extends Instantiable0[SVGAngle] {
  val SVG_ANGLETYPE_DEG: Double = js.native
  val SVG_ANGLETYPE_GRAD: Double = js.native
  val SVG_ANGLETYPE_RAD: Double = js.native
  val SVG_ANGLETYPE_UNKNOWN: Double = js.native
  val SVG_ANGLETYPE_UNSPECIFIED: Double = js.native
}

