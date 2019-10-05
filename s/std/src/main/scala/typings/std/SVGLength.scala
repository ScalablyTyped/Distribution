package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Correspond to the <length> basic data type. */
trait SVGLength extends js.Object {
  val SVG_LENGTHTYPE_CM: Double
  val SVG_LENGTHTYPE_EMS: Double
  val SVG_LENGTHTYPE_EXS: Double
  val SVG_LENGTHTYPE_IN: Double
  val SVG_LENGTHTYPE_MM: Double
  val SVG_LENGTHTYPE_NUMBER: Double
  val SVG_LENGTHTYPE_PC: Double
  val SVG_LENGTHTYPE_PERCENTAGE: Double
  val SVG_LENGTHTYPE_PT: Double
  val SVG_LENGTHTYPE_PX: Double
  val SVG_LENGTHTYPE_UNKNOWN: Double
  val unitType: Double
  var value: Double
  var valueAsString: java.lang.String
  var valueInSpecifiedUnits: Double
  def convertToSpecifiedUnits(unitType: Double): Unit
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
}

@JSGlobal("SVGLength")
@js.native
object SVGLength extends Instantiable0[SVGLength] {
  val SVG_LENGTHTYPE_CM: Double = js.native
  val SVG_LENGTHTYPE_EMS: Double = js.native
  val SVG_LENGTHTYPE_EXS: Double = js.native
  val SVG_LENGTHTYPE_IN: Double = js.native
  val SVG_LENGTHTYPE_MM: Double = js.native
  val SVG_LENGTHTYPE_NUMBER: Double = js.native
  val SVG_LENGTHTYPE_PC: Double = js.native
  val SVG_LENGTHTYPE_PERCENTAGE: Double = js.native
  val SVG_LENGTHTYPE_PT: Double = js.native
  val SVG_LENGTHTYPE_PX: Double = js.native
  val SVG_LENGTHTYPE_UNKNOWN: Double = js.native
}

