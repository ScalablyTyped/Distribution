package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
trait TextMetrics extends js.Object {
  val actualBoundingBoxAscent: Double
  val actualBoundingBoxDescent: Double
  val actualBoundingBoxLeft: Double
  val actualBoundingBoxRight: Double
  val alphabeticBaseline: Double
  val emHeightAscent: Double
  val emHeightDescent: Double
  val fontBoundingBoxAscent: Double
  val fontBoundingBoxDescent: Double
  val hangingBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double
  val width: Double
}

@JSGlobal("TextMetrics")
@js.native
class TextMetricsCls () extends TextMetrics {
  /* CompleteClass */
  override val actualBoundingBoxAscent: Double = js.native
  /* CompleteClass */
  override val actualBoundingBoxDescent: Double = js.native
  /* CompleteClass */
  override val actualBoundingBoxLeft: Double = js.native
  /* CompleteClass */
  override val actualBoundingBoxRight: Double = js.native
  /* CompleteClass */
  override val alphabeticBaseline: Double = js.native
  /* CompleteClass */
  override val emHeightAscent: Double = js.native
  /* CompleteClass */
  override val emHeightDescent: Double = js.native
  /* CompleteClass */
  override val fontBoundingBoxAscent: Double = js.native
  /* CompleteClass */
  override val fontBoundingBoxDescent: Double = js.native
  /* CompleteClass */
  override val hangingBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  /* CompleteClass */
  override val ideographicBaseline: Double = js.native
  /* CompleteClass */
  override val width: Double = js.native
}

@JSGlobal("TextMetrics")
@js.native
object TextMetrics extends Instantiable0[TextMetrics]

