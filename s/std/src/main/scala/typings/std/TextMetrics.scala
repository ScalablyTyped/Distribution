package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
@js.native
trait TextMetrics extends js.Object {
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val alphabeticBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val emHeightAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val emHeightDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxAscent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxDescent: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val hangingBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double = js.native
  /**
    * Returns the measurement described below.
    */
  val width: Double = js.native
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
  @scala.inline
  implicit class TextMetricsOps[Self <: TextMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActualBoundingBoxAscent(value: Double): Self = this.set("actualBoundingBoxAscent", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualBoundingBoxDescent(value: Double): Self = this.set("actualBoundingBoxDescent", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualBoundingBoxLeft(value: Double): Self = this.set("actualBoundingBoxLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualBoundingBoxRight(value: Double): Self = this.set("actualBoundingBoxRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlphabeticBaseline(value: Double): Self = this.set("alphabeticBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmHeightAscent(value: Double): Self = this.set("emHeightAscent", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmHeightDescent(value: Double): Self = this.set("emHeightDescent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontBoundingBoxAscent(value: Double): Self = this.set("fontBoundingBoxAscent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontBoundingBoxDescent(value: Double): Self = this.set("fontBoundingBoxDescent", value.asInstanceOf[js.Any])
    @scala.inline
    def setHangingBaseline(value: Double): Self = this.set("hangingBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdeographicBaseline(value: Double): Self = this.set("ideographicBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

