package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
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
class TextMetricsCls () extends TextMetrics {
  /* CompleteClass */
  override val actualBoundingBoxAscent: scala.Double = js.native
  /* CompleteClass */
  override val actualBoundingBoxDescent: scala.Double = js.native
  /* CompleteClass */
  override val actualBoundingBoxLeft: scala.Double = js.native
  /* CompleteClass */
  override val actualBoundingBoxRight: scala.Double = js.native
  /* CompleteClass */
  override val alphabeticBaseline: scala.Double = js.native
  /* CompleteClass */
  override val emHeightAscent: scala.Double = js.native
  /* CompleteClass */
  override val emHeightDescent: scala.Double = js.native
  /* CompleteClass */
  override val fontBoundingBoxAscent: scala.Double = js.native
  /* CompleteClass */
  override val fontBoundingBoxDescent: scala.Double = js.native
  /* CompleteClass */
  override val hangingBaseline: scala.Double = js.native
  /**
    * Returns the measurement described below.
    */
  /* CompleteClass */
  override val ideographicBaseline: scala.Double = js.native
  /* CompleteClass */
  override val width: scala.Double = js.native
}

@JSGlobal("TextMetrics")
@js.native
object TextMetrics
  extends org.scalablytyped.runtime.Instantiable0[TextMetrics]

