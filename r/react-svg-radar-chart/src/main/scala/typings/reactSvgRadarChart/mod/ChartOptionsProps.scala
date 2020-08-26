package typings.reactSvgRadarChart.mod

import typings.reactSvgRadarChart.anon.ClassName
import typings.reactSvgRadarChart.anon.Fill
import typings.reactSvgRadarChart.anon.FontFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptionsProps extends js.Object {
  /**
    * show axes
    * @default true
    */
  var axes: js.UndefOr[Boolean] = js.native
  /**
    * set caption margin
    * @default 10
    */
  var captionMargin: js.UndefOr[Double] = js.native
  /**
    * show captions
    * @default true
    */
  var captions: js.UndefOr[Boolean] = js.native
  /**
    * show dots
    * @default false
    */
  var dots: js.UndefOr[Boolean] = js.native
  /**
    * show scale circles
    * @default 3
    */
  var scales: js.UndefOr[Double] = js.native
  /** custom viewBox */
  var setViewBox: js.UndefOr[js.Function1[/* options */ this.type, Double]] = js.native
  /**
    * set size
    * @default 300
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * where on the axes are the captions
    * @default 1.2
    */
  var zoomDistance: js.UndefOr[Double] = js.native
  def axisProps(): ClassName = js.native
  /** custom captions props */
  def captionProps(): FontFamily = js.native
  def dotProps(): ClassName = js.native
  def scaleProps(): Fill = js.native
  def shapeProps(): ClassName = js.native
  /** custom smoothing fn */
  def smoothing(points: js.Array[js.Array[js.Any]]): String = js.native
}

object ChartOptionsProps {
  @scala.inline
  def apply(
    axisProps: () => ClassName,
    captionProps: () => FontFamily,
    dotProps: () => ClassName,
    scaleProps: () => Fill,
    shapeProps: () => ClassName,
    smoothing: js.Array[js.Array[js.Any]] => String
  ): ChartOptionsProps = {
    val __obj = js.Dynamic.literal(axisProps = js.Any.fromFunction0(axisProps), captionProps = js.Any.fromFunction0(captionProps), dotProps = js.Any.fromFunction0(dotProps), scaleProps = js.Any.fromFunction0(scaleProps), shapeProps = js.Any.fromFunction0(shapeProps), smoothing = js.Any.fromFunction1(smoothing))
    __obj.asInstanceOf[ChartOptionsProps]
  }
  @scala.inline
  implicit class ChartOptionsPropsOps[Self <: ChartOptionsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxisProps(value: () => ClassName): Self = this.set("axisProps", js.Any.fromFunction0(value))
    @scala.inline
    def setCaptionProps(value: () => FontFamily): Self = this.set("captionProps", js.Any.fromFunction0(value))
    @scala.inline
    def setDotProps(value: () => ClassName): Self = this.set("dotProps", js.Any.fromFunction0(value))
    @scala.inline
    def setScaleProps(value: () => Fill): Self = this.set("scaleProps", js.Any.fromFunction0(value))
    @scala.inline
    def setShapeProps(value: () => ClassName): Self = this.set("shapeProps", js.Any.fromFunction0(value))
    @scala.inline
    def setSmoothing(value: js.Array[js.Array[js.Any]] => String): Self = this.set("smoothing", js.Any.fromFunction1(value))
    @scala.inline
    def setAxes(value: Boolean): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setCaptionMargin(value: Double): Self = this.set("captionMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionMargin: Self = this.set("captionMargin", js.undefined)
    @scala.inline
    def setCaptions(value: Boolean): Self = this.set("captions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptions: Self = this.set("captions", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setScales(value: Double): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setSetViewBox(value: ChartOptionsProps => Double): Self = this.set("setViewBox", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetViewBox: Self = this.set("setViewBox", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setZoomDistance(value: Double): Self = this.set("zoomDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomDistance: Self = this.set("zoomDistance", js.undefined)
  }
  
}

