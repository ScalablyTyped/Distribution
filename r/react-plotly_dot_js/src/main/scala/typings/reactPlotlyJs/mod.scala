package typings.reactPlotlyJs

import typings.plotlyJs.mod.ButtonClickEvent
import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import typings.plotlyJs.mod.PlotRestyleEvent
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-plotly.js", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[PlotParams, js.Object, js.Any]
  
  @js.native
  trait Figure extends StObject {
    
    var data: js.Array[Data] = js.native
    
    var frames: js.Array[Frame] | Null = js.native
    
    var layout: PartialLayout = js.native
  }
  object Figure {
    
    @scala.inline
    def apply(data: js.Array[Data], layout: PartialLayout): Figure = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Figure]
    }
    
    @scala.inline
    implicit class FigureMutableBuilder[Self <: Figure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesNull: Self = StObject.set(x, "frames", null)
      
      @scala.inline
      def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
  
  type Plot = PureComponent[PlotParams, js.Object, js.Any]
  
  @js.native
  trait PlotParams extends StObject {
    
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
    implicit class PlotParamsMutableBuilder[Self <: PlotParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDivId(value: String): Self = StObject.set(x, "divId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivIdUndefined: Self = StObject.set(x, "divId", js.undefined)
      
      @scala.inline
      def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      @scala.inline
      def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAfterExport(value: () => Unit): Self = StObject.set(x, "onAfterExport", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterExportUndefined: Self = StObject.set(x, "onAfterExport", js.undefined)
      
      @scala.inline
      def setOnAfterPlot(value: () => Unit): Self = StObject.set(x, "onAfterPlot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterPlotUndefined: Self = StObject.set(x, "onAfterPlot", js.undefined)
      
      @scala.inline
      def setOnAnimated(value: () => Unit): Self = StObject.set(x, "onAnimated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimatedUndefined: Self = StObject.set(x, "onAnimated", js.undefined)
      
      @scala.inline
      def setOnAnimatingFrame(value: /* event */ ReadonlyFrameAnimationEve => Unit): Self = StObject.set(x, "onAnimatingFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimatingFrameUndefined: Self = StObject.set(x, "onAnimatingFrame", js.undefined)
      
      @scala.inline
      def setOnAnimationInterrupted(value: () => Unit): Self = StObject.set(x, "onAnimationInterrupted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAnimationInterruptedUndefined: Self = StObject.set(x, "onAnimationInterrupted", js.undefined)
      
      @scala.inline
      def setOnAutoSize(value: () => Unit): Self = StObject.set(x, "onAutoSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAutoSizeUndefined: Self = StObject.set(x, "onAutoSize", js.undefined)
      
      @scala.inline
      def setOnBeforeExport(value: () => Unit): Self = StObject.set(x, "onBeforeExport", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeExportUndefined: Self = StObject.set(x, "onBeforeExport", js.undefined)
      
      @scala.inline
      def setOnButtonClicked(value: /* event */ ButtonClickEvent => Unit): Self = StObject.set(x, "onButtonClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnButtonClickedUndefined: Self = StObject.set(x, "onButtonClicked", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickAnnotation(value: /* event */ ReadonlyClickAnnotationEv => Unit): Self = StObject.set(x, "onClickAnnotation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickAnnotationUndefined: Self = StObject.set(x, "onClickAnnotation", js.undefined)
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: () => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: () => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ ReadonlyError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFramework(value: () => Unit): Self = StObject.set(x, "onFramework", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFrameworkUndefined: Self = StObject.set(x, "onFramework", js.undefined)
      
      @scala.inline
      def setOnHover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOnInitialized(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      @scala.inline
      def setOnLegendClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = StObject.set(x, "onLegendClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLegendClickUndefined: Self = StObject.set(x, "onLegendClick", js.undefined)
      
      @scala.inline
      def setOnLegendDoubleClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = StObject.set(x, "onLegendDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLegendDoubleClickUndefined: Self = StObject.set(x, "onLegendDoubleClick", js.undefined)
      
      @scala.inline
      def setOnPurge(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = StObject.set(x, "onPurge", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPurgeUndefined: Self = StObject.set(x, "onPurge", js.undefined)
      
      @scala.inline
      def setOnRedraw(value: () => Unit): Self = StObject.set(x, "onRedraw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRedrawUndefined: Self = StObject.set(x, "onRedraw", js.undefined)
      
      @scala.inline
      def setOnRelayout(value: /* event */ ReadonlyPlotRelayoutEvent => Unit): Self = StObject.set(x, "onRelayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRelayoutUndefined: Self = StObject.set(x, "onRelayout", js.undefined)
      
      @scala.inline
      def setOnRestyle(value: /* event */ PlotRestyleEvent => Unit): Self = StObject.set(x, "onRestyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRestyleUndefined: Self = StObject.set(x, "onRestyle", js.undefined)
      
      @scala.inline
      def setOnSelected(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectedUndefined: Self = StObject.set(x, "onSelected", js.undefined)
      
      @scala.inline
      def setOnSelecting(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = StObject.set(x, "onSelecting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectingUndefined: Self = StObject.set(x, "onSelecting", js.undefined)
      
      @scala.inline
      def setOnSliderChange(value: /* event */ ReadonlySliderChangeEvent => Unit): Self = StObject.set(x, "onSliderChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSliderChangeUndefined: Self = StObject.set(x, "onSliderChange", js.undefined)
      
      @scala.inline
      def setOnSliderEnd(value: /* event */ ReadonlySliderEndEvent => Unit): Self = StObject.set(x, "onSliderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSliderEndUndefined: Self = StObject.set(x, "onSliderEnd", js.undefined)
      
      @scala.inline
      def setOnSliderStart(value: /* event */ ReadonlySliderStartEvent => Unit): Self = StObject.set(x, "onSliderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSliderStartUndefined: Self = StObject.set(x, "onSliderStart", js.undefined)
      
      @scala.inline
      def setOnTransitionInterrupted(value: () => Unit): Self = StObject.set(x, "onTransitionInterrupted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTransitionInterruptedUndefined: Self = StObject.set(x, "onTransitionInterrupted", js.undefined)
      
      @scala.inline
      def setOnTransitioning(value: () => Unit): Self = StObject.set(x, "onTransitioning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTransitioningUndefined: Self = StObject.set(x, "onTransitioning", js.undefined)
      
      @scala.inline
      def setOnUnhover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = StObject.set(x, "onUnhover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnhoverUndefined: Self = StObject.set(x, "onUnhover", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUseResizeHandler(value: Boolean): Self = StObject.set(x, "useResizeHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseResizeHandlerUndefined: Self = StObject.set(x, "useResizeHandler", js.undefined)
    }
  }
}
