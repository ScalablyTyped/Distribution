package typings
package reactDashPlotlyDotJsLib.reactDashPlotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotParams extends js.Object {
  /**
    * applied to the <div> into which the plot is rendered
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var config: js.UndefOr[stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Config]] = js.undefined
  var data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data]
  /**
    * Assign the graph div to window.gd for debugging
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * id assigned to the <div> into which the plot is rendered.
    */
  var divId: js.UndefOr[java.lang.String] = js.undefined
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  var layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  var onAfterExport: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAfterPlot: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAnimated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAnimatingFrame: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.FrameAnimationEvent, scala.Unit]
  ] = js.undefined
  var onAnimationInterrupted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAutoSize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBeforeExport: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onButtonClicked: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.ButtonClickEvent, scala.Unit]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotMouseEvent, scala.Unit]
  ] = js.undefined
  var onClickAnnotation: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.ClickAnnotationEvent, scala.Unit]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback executed when a plotly.js API method rejects
    * @param err Error
    */
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  var onFramework: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHover: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotMouseEvent, scala.Unit]
  ] = js.undefined
  /**
    * Callback executed after plot is initialized.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onInitialized: js.UndefOr[js.Function2[/* figure */ Figure, /* graphDiv */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onLegendClick: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.LegendClickEvent, scala.Boolean]
  ] = js.undefined
  var onLegendDoubleClick: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.LegendClickEvent, scala.Boolean]
  ] = js.undefined
  /**
    * Callback executed when component unmounts, before Plotly.purge strips the graphDiv of all private attributes.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onPurge: js.UndefOr[js.Function2[/* figure */ Figure, /* graphDiv */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onRedraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRelayout: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotRelayoutEvent, scala.Unit]
  ] = js.undefined
  var onRestyle: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotRestyleEvent, scala.Unit]
  ] = js.undefined
  var onSelected: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotSelectionEvent, scala.Unit]
  ] = js.undefined
  var onSelecting: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotSelectionEvent, scala.Unit]
  ] = js.undefined
  var onSliderChange: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.SliderChangeEvent, scala.Unit]
  ] = js.undefined
  var onSliderEnd: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.SliderEndEvent, scala.Unit]
  ] = js.undefined
  var onSliderStart: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.SliderStartEvent, scala.Unit]
  ] = js.undefined
  var onTransitionInterrupted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitioning: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUnhover: js.UndefOr[
    js.Function1[/* event */ plotlyDotJsLib.plotlyDotJsMod.PlotMouseEvent, scala.Unit]
  ] = js.undefined
  /**
    * Callback executed when when a plot is updated due to new data or layout, or when user interacts with a plot.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onUpdate: js.UndefOr[js.Function2[/* figure */ Figure, /* graphDiv */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  /**
    * When provided, causes the plot to update only when the revision is incremented.
    */
  var revision: js.UndefOr[scala.Double] = js.undefined
  /**
    * used to style the <div> into which the plot is rendered
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * When true, adds a call to Plotly.Plot.resize() as a window.resize event handler
    */
  var useResizeHandler: js.UndefOr[scala.Boolean] = js.undefined
}

object PlotParams {
  @scala.inline
  def apply(
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout],
    className: java.lang.String = null,
    config: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Config] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    divId: java.lang.String = null,
    frames: js.Array[Frame] = null,
    onAfterExport: () => scala.Unit = null,
    onAfterPlot: () => scala.Unit = null,
    onAnimated: () => scala.Unit = null,
    onAnimatingFrame: /* event */ plotlyDotJsLib.plotlyDotJsMod.FrameAnimationEvent => scala.Unit = null,
    onAnimationInterrupted: () => scala.Unit = null,
    onAutoSize: () => scala.Unit = null,
    onBeforeExport: () => scala.Unit = null,
    onButtonClicked: /* event */ plotlyDotJsLib.plotlyDotJsMod.ButtonClickEvent => scala.Unit = null,
    onClick: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotMouseEvent => scala.Unit = null,
    onClickAnnotation: /* event */ plotlyDotJsLib.plotlyDotJsMod.ClickAnnotationEvent => scala.Unit = null,
    onDeselect: () => scala.Unit = null,
    onDoubleClick: () => scala.Unit = null,
    onError: /* err */ stdLib.Error => scala.Unit = null,
    onFramework: () => scala.Unit = null,
    onHover: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotMouseEvent => scala.Unit = null,
    onInitialized: (/* figure */ Figure, /* graphDiv */ stdLib.HTMLElement) => scala.Unit = null,
    onLegendClick: /* event */ plotlyDotJsLib.plotlyDotJsMod.LegendClickEvent => scala.Boolean = null,
    onLegendDoubleClick: /* event */ plotlyDotJsLib.plotlyDotJsMod.LegendClickEvent => scala.Boolean = null,
    onPurge: (/* figure */ Figure, /* graphDiv */ stdLib.HTMLElement) => scala.Unit = null,
    onRedraw: () => scala.Unit = null,
    onRelayout: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotRelayoutEvent => scala.Unit = null,
    onRestyle: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotRestyleEvent => scala.Unit = null,
    onSelected: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotSelectionEvent => scala.Unit = null,
    onSelecting: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotSelectionEvent => scala.Unit = null,
    onSliderChange: /* event */ plotlyDotJsLib.plotlyDotJsMod.SliderChangeEvent => scala.Unit = null,
    onSliderEnd: /* event */ plotlyDotJsLib.plotlyDotJsMod.SliderEndEvent => scala.Unit = null,
    onSliderStart: /* event */ plotlyDotJsLib.plotlyDotJsMod.SliderStartEvent => scala.Unit = null,
    onTransitionInterrupted: () => scala.Unit = null,
    onTransitioning: () => scala.Unit = null,
    onUnhover: /* event */ plotlyDotJsLib.plotlyDotJsMod.PlotMouseEvent => scala.Unit = null,
    onUpdate: (/* figure */ Figure, /* graphDiv */ stdLib.HTMLElement) => scala.Unit = null,
    revision: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    useResizeHandler: js.UndefOr[scala.Boolean] = js.undefined
  ): PlotParams = {
    val __obj = js.Dynamic.literal(data = data, layout = layout)
    if (className != null) __obj.updateDynamic("className")(className)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (divId != null) __obj.updateDynamic("divId")(divId)
    if (frames != null) __obj.updateDynamic("frames")(frames)
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
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useResizeHandler)) __obj.updateDynamic("useResizeHandler")(useResizeHandler)
    __obj.asInstanceOf[PlotParams]
  }
}

