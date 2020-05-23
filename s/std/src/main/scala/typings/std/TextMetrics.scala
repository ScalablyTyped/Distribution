package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
trait TextMetrics extends js.Object {
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double
  /**
    * Returns the measurement described below.
    */
  val alphabeticBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val emHeightAscent: Double
  /**
    * Returns the measurement described below.
    */
  val emHeightDescent: Double
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxAscent: Double
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxDescent: Double
  /**
    * Returns the measurement described below.
    */
  val hangingBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val width: Double
}

object TextMetrics {
  @scala.inline
  def apply(
    actualBoundingBoxAscent: Double,
    actualBoundingBoxDescent: Double,
    actualBoundingBoxLeft: Double,
    actualBoundingBoxRight: Double,
    alphabeticBaseline: Double,
    emHeightAscent: Double,
    emHeightDescent: Double,
    fontBoundingBoxAscent: Double,
    fontBoundingBoxDescent: Double,
    hangingBaseline: Double,
    ideographicBaseline: Double,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(actualBoundingBoxAscent = actualBoundingBoxAscent.asInstanceOf[js.Any], actualBoundingBoxDescent = actualBoundingBoxDescent.asInstanceOf[js.Any], actualBoundingBoxLeft = actualBoundingBoxLeft.asInstanceOf[js.Any], actualBoundingBoxRight = actualBoundingBoxRight.asInstanceOf[js.Any], alphabeticBaseline = alphabeticBaseline.asInstanceOf[js.Any], emHeightAscent = emHeightAscent.asInstanceOf[js.Any], emHeightDescent = emHeightDescent.asInstanceOf[js.Any], fontBoundingBoxAscent = fontBoundingBoxAscent.asInstanceOf[js.Any], fontBoundingBoxDescent = fontBoundingBoxDescent.asInstanceOf[js.Any], hangingBaseline = hangingBaseline.asInstanceOf[js.Any], ideographicBaseline = ideographicBaseline.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
}

