package typings.reactPlotlyJs.mod

import typings.plotlyJs.mod.ButtonClickEvent
import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import typings.plotlyJs.mod.PlotRestyleEvent
import typings.react.mod.CSSProperties
import typings.reactPlotlyJs.PartialConfig
import typings.reactPlotlyJs.PartialLayout
import typings.reactPlotlyJs.ReadonlyClickAnnotationEv
import typings.reactPlotlyJs.ReadonlyError
import typings.reactPlotlyJs.ReadonlyFigure
import typings.reactPlotlyJs.ReadonlyFrameAnimationEve
import typings.reactPlotlyJs.ReadonlyHTMLElement
import typings.reactPlotlyJs.ReadonlyLegendClickEvent
import typings.reactPlotlyJs.ReadonlyPlotMouseEvent
import typings.reactPlotlyJs.ReadonlyPlotRelayoutEvent
import typings.reactPlotlyJs.ReadonlyPlotSelectionEven
import typings.reactPlotlyJs.ReadonlySliderChangeEvent
import typings.reactPlotlyJs.ReadonlySliderEndEvent
import typings.reactPlotlyJs.ReadonlySliderStartEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParams extends js.Object {
  /**
    * applied to the <div> into which the plot is rendered
    */
  var className: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[PartialConfig] = js.undefined
  var data: js.Array[Data]
  /**
    * Assign the graph div to window.gd for debugging
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * id assigned to the <div> into which the plot is rendered.
    */
  var divId: js.UndefOr[String] = js.undefined
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  var layout: PartialLayout
  var onAfterExport: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAfterPlot: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAnimated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAnimatingFrame: js.UndefOr[js.Function1[/* event */ ReadonlyFrameAnimationEve, Unit]] = js.undefined
  var onAnimationInterrupted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAutoSize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBeforeExport: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onButtonClicked: js.UndefOr[js.Function1[/* event */ ButtonClickEvent, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.undefined
  var onClickAnnotation: js.UndefOr[js.Function1[/* event */ ReadonlyClickAnnotationEv, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback executed when a plotly.js API method rejects
    * @param err Error
    */
  var onError: js.UndefOr[js.Function1[/* err */ ReadonlyError, Unit]] = js.undefined
  var onFramework: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.undefined
  /**
    * Callback executed after plot is initialized.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onInitialized: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.undefined
  var onLegendClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.undefined
  var onLegendDoubleClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.undefined
  /**
    * Callback executed when component unmounts, before Plotly.purge strips the graphDiv of all private attributes.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onPurge: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.undefined
  var onRedraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRelayout: js.UndefOr[js.Function1[/* event */ ReadonlyPlotRelayoutEvent, Unit]] = js.undefined
  var onRestyle: js.UndefOr[js.Function1[/* event */ PlotRestyleEvent, Unit]] = js.undefined
  var onSelected: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.undefined
  var onSelecting: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.undefined
  var onSliderChange: js.UndefOr[js.Function1[/* event */ ReadonlySliderChangeEvent, Unit]] = js.undefined
  var onSliderEnd: js.UndefOr[js.Function1[/* event */ ReadonlySliderEndEvent, Unit]] = js.undefined
  var onSliderStart: js.UndefOr[js.Function1[/* event */ ReadonlySliderStartEvent, Unit]] = js.undefined
  var onTransitionInterrupted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitioning: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnhover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.undefined
  /**
    * Callback executed when when a plot is updated due to new data or layout, or when user interacts with a plot.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onUpdate: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.undefined
  /**
    * When provided, causes the plot to update only when the revision is incremented.
    */
  var revision: js.UndefOr[Double] = js.undefined
  /**
    * used to style the <div> into which the plot is rendered
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * When true, adds a call to Plotly.Plot.resize() as a window.resize event handler
    */
  var useResizeHandler: js.UndefOr[Boolean] = js.undefined
}

object PlotParams {
  @scala.inline
  def apply(
    data: js.Array[Data],
    layout: PartialLayout,
    className: String = null,
    config: PartialConfig = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    divId: String = null,
    frames: js.Array[Frame] = null,
    onAfterExport: () => Unit = null,
    onAfterPlot: () => Unit = null,
    onAnimated: () => Unit = null,
    onAnimatingFrame: /* event */ ReadonlyFrameAnimationEve => Unit = null,
    onAnimationInterrupted: () => Unit = null,
    onAutoSize: () => Unit = null,
    onBeforeExport: () => Unit = null,
    onButtonClicked: /* event */ ButtonClickEvent => Unit = null,
    onClick: /* event */ ReadonlyPlotMouseEvent => Unit = null,
    onClickAnnotation: /* event */ ReadonlyClickAnnotationEv => Unit = null,
    onDeselect: () => Unit = null,
    onDoubleClick: () => Unit = null,
    onError: /* err */ ReadonlyError => Unit = null,
    onFramework: () => Unit = null,
    onHover: /* event */ ReadonlyPlotMouseEvent => Unit = null,
    onInitialized: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit = null,
    onLegendClick: /* event */ ReadonlyLegendClickEvent => Boolean = null,
    onLegendDoubleClick: /* event */ ReadonlyLegendClickEvent => Boolean = null,
    onPurge: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit = null,
    onRedraw: () => Unit = null,
    onRelayout: /* event */ ReadonlyPlotRelayoutEvent => Unit = null,
    onRestyle: /* event */ PlotRestyleEvent => Unit = null,
    onSelected: /* event */ ReadonlyPlotSelectionEven => Unit = null,
    onSelecting: /* event */ ReadonlyPlotSelectionEven => Unit = null,
    onSliderChange: /* event */ ReadonlySliderChangeEvent => Unit = null,
    onSliderEnd: /* event */ ReadonlySliderEndEvent => Unit = null,
    onSliderStart: /* event */ ReadonlySliderStartEvent => Unit = null,
    onTransitionInterrupted: () => Unit = null,
    onTransitioning: () => Unit = null,
    onUnhover: /* event */ ReadonlyPlotMouseEvent => Unit = null,
    onUpdate: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit = null,
    revision: Int | Double = null,
    style: CSSProperties = null,
    useResizeHandler: js.UndefOr[Boolean] = js.undefined
  ): PlotParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (divId != null) __obj.updateDynamic("divId")(divId.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (onAfterExport != null) __obj.updateDynamic("onAfterExport")(js.Any.fromFunction0(onAfterExport))
    if (onAfterPlot != null) __obj.updateDynamic("onAfterPlot")(js.Any.fromFunction0(onAfterPlot))
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(js.Any.fromFunction0(onAnimated))
    if (onAnimatingFrame != null) __obj.updateDynamic("onAnimatingFrame")(js.Any.fromFunction1(onAnimatingFrame))
    if (onAnimationInterrupted != null) __obj.updateDynamic("onAnimationInterrupted")(js.Any.fromFunction0(onAnimationInterrupted))
    if (onAutoSize != null) __obj.updateDynamic("onAutoSize")(js.Any.fromFunction0(onAutoSize))
    if (onBeforeExport != null) __obj.updateDynamic("onBeforeExport")(js.Any.fromFunction0(onBeforeExport))
    if (onButtonClicked != null) __obj.updateDynamic("onButtonClicked")(js.Any.fromFunction1(onButtonClicked))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickAnnotation != null) __obj.updateDynamic("onClickAnnotation")(js.Any.fromFunction1(onClickAnnotation))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction0(onDeselect))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFramework != null) __obj.updateDynamic("onFramework")(js.Any.fromFunction0(onFramework))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction2(onInitialized))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(js.Any.fromFunction1(onLegendClick))
    if (onLegendDoubleClick != null) __obj.updateDynamic("onLegendDoubleClick")(js.Any.fromFunction1(onLegendDoubleClick))
    if (onPurge != null) __obj.updateDynamic("onPurge")(js.Any.fromFunction2(onPurge))
    if (onRedraw != null) __obj.updateDynamic("onRedraw")(js.Any.fromFunction0(onRedraw))
    if (onRelayout != null) __obj.updateDynamic("onRelayout")(js.Any.fromFunction1(onRelayout))
    if (onRestyle != null) __obj.updateDynamic("onRestyle")(js.Any.fromFunction1(onRestyle))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1(onSelected))
    if (onSelecting != null) __obj.updateDynamic("onSelecting")(js.Any.fromFunction1(onSelecting))
    if (onSliderChange != null) __obj.updateDynamic("onSliderChange")(js.Any.fromFunction1(onSliderChange))
    if (onSliderEnd != null) __obj.updateDynamic("onSliderEnd")(js.Any.fromFunction1(onSliderEnd))
    if (onSliderStart != null) __obj.updateDynamic("onSliderStart")(js.Any.fromFunction1(onSliderStart))
    if (onTransitionInterrupted != null) __obj.updateDynamic("onTransitionInterrupted")(js.Any.fromFunction0(onTransitionInterrupted))
    if (onTransitioning != null) __obj.updateDynamic("onTransitioning")(js.Any.fromFunction0(onTransitioning))
    if (onUnhover != null) __obj.updateDynamic("onUnhover")(js.Any.fromFunction1(onUnhover))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useResizeHandler)) __obj.updateDynamic("useResizeHandler")(useResizeHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParams]
  }
}

