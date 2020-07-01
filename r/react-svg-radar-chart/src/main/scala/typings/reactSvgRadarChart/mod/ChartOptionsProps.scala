package typings.reactSvgRadarChart.mod

import typings.reactSvgRadarChart.anon.ClassName
import typings.reactSvgRadarChart.anon.Fill
import typings.reactSvgRadarChart.anon.FontFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptionsProps extends js.Object {
  /**
    * show axes
    * @default true
    */
  var axes: js.UndefOr[Boolean] = js.undefined
  /**
    * set caption margin
    * @default 10
    */
  var captionMargin: js.UndefOr[Double] = js.undefined
  /**
    * show captions
    * @default true
    */
  var captions: js.UndefOr[Boolean] = js.undefined
  /**
    * show dots
    * @default false
    */
  var dots: js.UndefOr[Boolean] = js.undefined
  /**
    * show scale circles
    * @default 3
    */
  var scales: js.UndefOr[Double] = js.undefined
  /** custom viewBox */
  var setViewBox: js.UndefOr[js.Function1[/* options */ ChartOptionsProps, Double]] = js.undefined
  /**
    * set size
    * @default 300
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * where on the axes are the captions
    * @default 1.2
    */
  var zoomDistance: js.UndefOr[Double] = js.undefined
  def axisProps(): ClassName
  /** custom captions props */
  def captionProps(): FontFamily
  def dotProps(): ClassName
  def scaleProps(): Fill
  def shapeProps(): ClassName
  /** custom smoothing fn */
  def smoothing(points: js.Array[js.Array[js.Any]]): String
}

object ChartOptionsProps {
  @scala.inline
  def apply(
    axisProps: () => ClassName,
    captionProps: () => FontFamily,
    dotProps: () => ClassName,
    scaleProps: () => Fill,
    shapeProps: () => ClassName,
    smoothing: js.Array[js.Array[js.Any]] => String,
    axes: js.UndefOr[Boolean] = js.undefined,
    captionMargin: js.UndefOr[Double] = js.undefined,
    captions: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    scales: js.UndefOr[Double] = js.undefined,
    setViewBox: /* options */ ChartOptionsProps => Double = null,
    size: js.UndefOr[Double] = js.undefined,
    zoomDistance: js.UndefOr[Double] = js.undefined
  ): ChartOptionsProps = {
    val __obj = js.Dynamic.literal(axisProps = js.Any.fromFunction0(axisProps), captionProps = js.Any.fromFunction0(captionProps), dotProps = js.Any.fromFunction0(dotProps), scaleProps = js.Any.fromFunction0(scaleProps), shapeProps = js.Any.fromFunction0(shapeProps), smoothing = js.Any.fromFunction1(smoothing))
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captionMargin)) __obj.updateDynamic("captionMargin")(captionMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captions)) __obj.updateDynamic("captions")(captions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scales)) __obj.updateDynamic("scales")(scales.get.asInstanceOf[js.Any])
    if (setViewBox != null) __obj.updateDynamic("setViewBox")(js.Any.fromFunction1(setViewBox))
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomDistance)) __obj.updateDynamic("zoomDistance")(zoomDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptionsProps]
  }
}

