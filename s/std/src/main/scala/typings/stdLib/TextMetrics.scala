package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMetrics extends js.Object {
  val actualBoundingBoxAscent: scala.Double
  val actualBoundingBoxDescent: scala.Double
  val actualBoundingBoxLeft: scala.Double
  val actualBoundingBoxRight: scala.Double
  val alphabeticBaseline: scala.Double
  val emHeightAscent: scala.Double
  val emHeightDescent: scala.Double
  val fontBoundingBoxAscent: scala.Double
  val fontBoundingBoxDescent: scala.Double
  val hangingBaseline: scala.Double
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: scala.Double
  val width: scala.Double
}

@JSGlobal("TextMetrics")
@js.native
object TextMetrics
  extends org.scalablytyped.runtime.Instantiable0[TextMetrics]

