package typings.reactPlotlyJs.mod

import typings.plotlyJs.mod.ButtonClickEvent
import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import typings.plotlyJs.mod.PlotRestyleEvent
import typings.react.mod.CSSProperties
import typings.reactPlotlyJs.anon.PartialConfig
import typings.reactPlotlyJs.anon.PartialLayout
import typings.reactPlotlyJs.anon.ReadonlyClickAnnotationEv
import typings.reactPlotlyJs.anon.ReadonlyError
import typings.reactPlotlyJs.anon.ReadonlyFigure
import typings.reactPlotlyJs.anon.ReadonlyFrameAnimationEve
import typings.reactPlotlyJs.anon.ReadonlyHTMLElement
import typings.reactPlotlyJs.anon.ReadonlyLegendClickEvent
import typings.reactPlotlyJs.anon.ReadonlyPlotMouseEvent
import typings.reactPlotlyJs.anon.ReadonlyPlotRelayoutEvent
import typings.reactPlotlyJs.anon.ReadonlyPlotSelectionEven
import typings.reactPlotlyJs.anon.ReadonlySliderChangeEvent
import typings.reactPlotlyJs.anon.ReadonlySliderEndEvent
import typings.reactPlotlyJs.anon.ReadonlySliderStartEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotParams extends js.Object {
  
  /**
    * applied to the <div> into which the plot is rendered
    */
  var className: js.UndefOr[String] = js.native
  
  var config: js.UndefOr[PartialConfig] = js.native
  
  var data: js.Array[Data] = js.native
  
  /**
    * Assign the graph div to window.gd for debugging
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * id assigned to the <div> into which the plot is rendered.
    */
  var divId: js.UndefOr[String] = js.native
  
  var frames: js.UndefOr[js.Array[Frame]] = js.native
  
  var layout: PartialLayout = js.native
  
  var onAfterExport: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAfterPlot: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAnimated: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAnimatingFrame: js.UndefOr[js.Function1[/* event */ ReadonlyFrameAnimationEve, Unit]] = js.native
  
  var onAnimationInterrupted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAutoSize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBeforeExport: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onButtonClicked: js.UndefOr[js.Function1[/* event */ ButtonClickEvent, Unit]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.native
  
  var onClickAnnotation: js.UndefOr[js.Function1[/* event */ ReadonlyClickAnnotationEv, Unit]] = js.native
  
  var onDeselect: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback executed when a plotly.js API method rejects
    * @param err Error
    */
  var onError: js.UndefOr[js.Function1[/* err */ ReadonlyError, Unit]] = js.native
  
  var onFramework: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onHover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.native
  
  /**
    * Callback executed after plot is initialized.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onInitialized: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.native
  
  var onLegendClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.native
  
  var onLegendDoubleClick: js.UndefOr[js.Function1[/* event */ ReadonlyLegendClickEvent, Boolean]] = js.native
  
  /**
    * Callback executed when component unmounts, before Plotly.purge strips the graphDiv of all private attributes.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onPurge: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.native
  
  var onRedraw: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRelayout: js.UndefOr[js.Function1[/* event */ ReadonlyPlotRelayoutEvent, Unit]] = js.native
  
  var onRestyle: js.UndefOr[js.Function1[/* event */ PlotRestyleEvent, Unit]] = js.native
  
  var onSelected: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.native
  
  var onSelecting: js.UndefOr[js.Function1[/* event */ ReadonlyPlotSelectionEven, Unit]] = js.native
  
  var onSliderChange: js.UndefOr[js.Function1[/* event */ ReadonlySliderChangeEvent, Unit]] = js.native
  
  var onSliderEnd: js.UndefOr[js.Function1[/* event */ ReadonlySliderEndEvent, Unit]] = js.native
  
  var onSliderStart: js.UndefOr[js.Function1[/* event */ ReadonlySliderStartEvent, Unit]] = js.native
  
  var onTransitionInterrupted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTransitioning: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onUnhover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Unit]] = js.native
  
  /**
    * Callback executed when when a plot is updated due to new data or layout, or when user interacts with a plot.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onUpdate: js.UndefOr[
    js.Function2[/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement, Unit]
  ] = js.native
  
  /**
    * When provided, causes the plot to update only when the revision is incremented.
    */
  var revision: js.UndefOr[Double] = js.native
  
  /**
    * used to style the <div> into which the plot is rendered
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * When true, adds a call to Plotly.Plot.resize() as a window.resize event handler
    */
  var useResizeHandler: js.UndefOr[Boolean] = js.native
}
object PlotParams {
  
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout): PlotParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotParams]
  }
  
  @scala.inline
  implicit class PlotParamsOps[Self <: PlotParams] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Data*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: PartialLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setConfig(value: PartialConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDivId(value: String): Self = this.set("divId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivId: Self = this.set("divId", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setOnAfterExport(value: () => Unit): Self = this.set("onAfterExport", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAfterExport: Self = this.set("onAfterExport", js.undefined)
    
    @scala.inline
    def setOnAfterPlot(value: () => Unit): Self = this.set("onAfterPlot", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAfterPlot: Self = this.set("onAfterPlot", js.undefined)
    
    @scala.inline
    def setOnAnimated(value: () => Unit): Self = this.set("onAnimated", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimated: Self = this.set("onAnimated", js.undefined)
    
    @scala.inline
    def setOnAnimatingFrame(value: /* event */ ReadonlyFrameAnimationEve => Unit): Self = this.set("onAnimatingFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimatingFrame: Self = this.set("onAnimatingFrame", js.undefined)
    
    @scala.inline
    def setOnAnimationInterrupted(value: () => Unit): Self = this.set("onAnimationInterrupted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimationInterrupted: Self = this.set("onAnimationInterrupted", js.undefined)
    
    @scala.inline
    def setOnAutoSize(value: () => Unit): Self = this.set("onAutoSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAutoSize: Self = this.set("onAutoSize", js.undefined)
    
    @scala.inline
    def setOnBeforeExport(value: () => Unit): Self = this.set("onBeforeExport", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBeforeExport: Self = this.set("onBeforeExport", js.undefined)
    
    @scala.inline
    def setOnButtonClicked(value: /* event */ ButtonClickEvent => Unit): Self = this.set("onButtonClicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnButtonClicked: Self = this.set("onButtonClicked", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClickAnnotation(value: /* event */ ReadonlyClickAnnotationEv => Unit): Self = this.set("onClickAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickAnnotation: Self = this.set("onClickAnnotation", js.undefined)
    
    @scala.inline
    def setOnDeselect(value: () => Unit): Self = this.set("onDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: () => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnError(value: /* err */ ReadonlyError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFramework(value: () => Unit): Self = this.set("onFramework", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFramework: Self = this.set("onFramework", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = this.set("onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    
    @scala.inline
    def setOnInitialized(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = this.set("onInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
    
    @scala.inline
    def setOnLegendClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = this.set("onLegendClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLegendClick: Self = this.set("onLegendClick", js.undefined)
    
    @scala.inline
    def setOnLegendDoubleClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = this.set("onLegendDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLegendDoubleClick: Self = this.set("onLegendDoubleClick", js.undefined)
    
    @scala.inline
    def setOnPurge(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = this.set("onPurge", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPurge: Self = this.set("onPurge", js.undefined)
    
    @scala.inline
    def setOnRedraw(value: () => Unit): Self = this.set("onRedraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRedraw: Self = this.set("onRedraw", js.undefined)
    
    @scala.inline
    def setOnRelayout(value: /* event */ ReadonlyPlotRelayoutEvent => Unit): Self = this.set("onRelayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRelayout: Self = this.set("onRelayout", js.undefined)
    
    @scala.inline
    def setOnRestyle(value: /* event */ PlotRestyleEvent => Unit): Self = this.set("onRestyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRestyle: Self = this.set("onRestyle", js.undefined)
    
    @scala.inline
    def setOnSelected(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = this.set("onSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelected: Self = this.set("onSelected", js.undefined)
    
    @scala.inline
    def setOnSelecting(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = this.set("onSelecting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelecting: Self = this.set("onSelecting", js.undefined)
    
    @scala.inline
    def setOnSliderChange(value: /* event */ ReadonlySliderChangeEvent => Unit): Self = this.set("onSliderChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSliderChange: Self = this.set("onSliderChange", js.undefined)
    
    @scala.inline
    def setOnSliderEnd(value: /* event */ ReadonlySliderEndEvent => Unit): Self = this.set("onSliderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSliderEnd: Self = this.set("onSliderEnd", js.undefined)
    
    @scala.inline
    def setOnSliderStart(value: /* event */ ReadonlySliderStartEvent => Unit): Self = this.set("onSliderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSliderStart: Self = this.set("onSliderStart", js.undefined)
    
    @scala.inline
    def setOnTransitionInterrupted(value: () => Unit): Self = this.set("onTransitionInterrupted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTransitionInterrupted: Self = this.set("onTransitionInterrupted", js.undefined)
    
    @scala.inline
    def setOnTransitioning(value: () => Unit): Self = this.set("onTransitioning", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTransitioning: Self = this.set("onTransitioning", js.undefined)
    
    @scala.inline
    def setOnUnhover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = this.set("onUnhover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnhover: Self = this.set("onUnhover", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = this.set("onUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUseResizeHandler(value: Boolean): Self = this.set("useResizeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseResizeHandler: Self = this.set("useResizeHandler", js.undefined)
  }
}
