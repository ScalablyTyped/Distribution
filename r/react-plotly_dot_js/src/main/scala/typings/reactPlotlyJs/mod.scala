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
import typings.reactPlotlyJs.anon.ReadonlyPlotHoverEvent
import typings.reactPlotlyJs.anon.ReadonlyPlotMouseEvent
import typings.reactPlotlyJs.anon.ReadonlyPlotRelayoutEvent
import typings.reactPlotlyJs.anon.ReadonlyPlotSelectionEven
import typings.reactPlotlyJs.anon.ReadonlySliderChangeEvent
import typings.reactPlotlyJs.anon.ReadonlySliderEndEvent
import typings.reactPlotlyJs.anon.ReadonlySliderStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-plotly.js", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PlotParams, js.Object, Any]
  
  trait Figure extends StObject {
    
    var data: js.Array[Data]
    
    var frames: js.Array[Frame] | Null
    
    var layout: PartialLayout
  }
  object Figure {
    
    inline def apply(data: js.Array[Data], layout: PartialLayout): Figure = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], frames = null)
      __obj.asInstanceOf[Figure]
    }
    
    extension [Self <: Figure](x: Self) {
      
      inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesNull: Self = StObject.set(x, "frames", null)
      
      inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
  
  type Plot = PureComponent[PlotParams, js.Object, Any]
  
  trait PlotParams extends StObject {
    
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
    
    var onBeforeHover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotMouseEvent, Boolean]] = js.undefined
    
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
    
    var onHover: js.UndefOr[js.Function1[/* event */ ReadonlyPlotHoverEvent, Unit]] = js.undefined
    
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
    
    inline def apply(data: js.Array[Data], layout: PartialLayout): PlotParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlotParams]
    }
    
    extension [Self <: PlotParams](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDivId(value: String): Self = StObject.set(x, "divId", value.asInstanceOf[js.Any])
      
      inline def setDivIdUndefined: Self = StObject.set(x, "divId", js.undefined)
      
      inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setOnAfterExport(value: () => Unit): Self = StObject.set(x, "onAfterExport", js.Any.fromFunction0(value))
      
      inline def setOnAfterExportUndefined: Self = StObject.set(x, "onAfterExport", js.undefined)
      
      inline def setOnAfterPlot(value: () => Unit): Self = StObject.set(x, "onAfterPlot", js.Any.fromFunction0(value))
      
      inline def setOnAfterPlotUndefined: Self = StObject.set(x, "onAfterPlot", js.undefined)
      
      inline def setOnAnimated(value: () => Unit): Self = StObject.set(x, "onAnimated", js.Any.fromFunction0(value))
      
      inline def setOnAnimatedUndefined: Self = StObject.set(x, "onAnimated", js.undefined)
      
      inline def setOnAnimatingFrame(value: /* event */ ReadonlyFrameAnimationEve => Unit): Self = StObject.set(x, "onAnimatingFrame", js.Any.fromFunction1(value))
      
      inline def setOnAnimatingFrameUndefined: Self = StObject.set(x, "onAnimatingFrame", js.undefined)
      
      inline def setOnAnimationInterrupted(value: () => Unit): Self = StObject.set(x, "onAnimationInterrupted", js.Any.fromFunction0(value))
      
      inline def setOnAnimationInterruptedUndefined: Self = StObject.set(x, "onAnimationInterrupted", js.undefined)
      
      inline def setOnAutoSize(value: () => Unit): Self = StObject.set(x, "onAutoSize", js.Any.fromFunction0(value))
      
      inline def setOnAutoSizeUndefined: Self = StObject.set(x, "onAutoSize", js.undefined)
      
      inline def setOnBeforeExport(value: () => Unit): Self = StObject.set(x, "onBeforeExport", js.Any.fromFunction0(value))
      
      inline def setOnBeforeExportUndefined: Self = StObject.set(x, "onBeforeExport", js.undefined)
      
      inline def setOnBeforeHover(value: /* event */ ReadonlyPlotMouseEvent => Boolean): Self = StObject.set(x, "onBeforeHover", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHoverUndefined: Self = StObject.set(x, "onBeforeHover", js.undefined)
      
      inline def setOnButtonClicked(value: /* event */ ButtonClickEvent => Unit): Self = StObject.set(x, "onButtonClicked", js.Any.fromFunction1(value))
      
      inline def setOnButtonClickedUndefined: Self = StObject.set(x, "onButtonClicked", js.undefined)
      
      inline def setOnClick(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickAnnotation(value: /* event */ ReadonlyClickAnnotationEv => Unit): Self = StObject.set(x, "onClickAnnotation", js.Any.fromFunction1(value))
      
      inline def setOnClickAnnotationUndefined: Self = StObject.set(x, "onClickAnnotation", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDeselect(value: () => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction0(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnDoubleClick(value: () => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction0(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnError(value: /* err */ ReadonlyError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFramework(value: () => Unit): Self = StObject.set(x, "onFramework", js.Any.fromFunction0(value))
      
      inline def setOnFrameworkUndefined: Self = StObject.set(x, "onFramework", js.undefined)
      
      inline def setOnHover(value: /* event */ ReadonlyPlotHoverEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnInitialized(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction2(value))
      
      inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      inline def setOnLegendClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = StObject.set(x, "onLegendClick", js.Any.fromFunction1(value))
      
      inline def setOnLegendClickUndefined: Self = StObject.set(x, "onLegendClick", js.undefined)
      
      inline def setOnLegendDoubleClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): Self = StObject.set(x, "onLegendDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnLegendDoubleClickUndefined: Self = StObject.set(x, "onLegendDoubleClick", js.undefined)
      
      inline def setOnPurge(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = StObject.set(x, "onPurge", js.Any.fromFunction2(value))
      
      inline def setOnPurgeUndefined: Self = StObject.set(x, "onPurge", js.undefined)
      
      inline def setOnRedraw(value: () => Unit): Self = StObject.set(x, "onRedraw", js.Any.fromFunction0(value))
      
      inline def setOnRedrawUndefined: Self = StObject.set(x, "onRedraw", js.undefined)
      
      inline def setOnRelayout(value: /* event */ ReadonlyPlotRelayoutEvent => Unit): Self = StObject.set(x, "onRelayout", js.Any.fromFunction1(value))
      
      inline def setOnRelayoutUndefined: Self = StObject.set(x, "onRelayout", js.undefined)
      
      inline def setOnRestyle(value: /* event */ PlotRestyleEvent => Unit): Self = StObject.set(x, "onRestyle", js.Any.fromFunction1(value))
      
      inline def setOnRestyleUndefined: Self = StObject.set(x, "onRestyle", js.undefined)
      
      inline def setOnSelected(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
      
      inline def setOnSelectedUndefined: Self = StObject.set(x, "onSelected", js.undefined)
      
      inline def setOnSelecting(value: /* event */ ReadonlyPlotSelectionEven => Unit): Self = StObject.set(x, "onSelecting", js.Any.fromFunction1(value))
      
      inline def setOnSelectingUndefined: Self = StObject.set(x, "onSelecting", js.undefined)
      
      inline def setOnSliderChange(value: /* event */ ReadonlySliderChangeEvent => Unit): Self = StObject.set(x, "onSliderChange", js.Any.fromFunction1(value))
      
      inline def setOnSliderChangeUndefined: Self = StObject.set(x, "onSliderChange", js.undefined)
      
      inline def setOnSliderEnd(value: /* event */ ReadonlySliderEndEvent => Unit): Self = StObject.set(x, "onSliderEnd", js.Any.fromFunction1(value))
      
      inline def setOnSliderEndUndefined: Self = StObject.set(x, "onSliderEnd", js.undefined)
      
      inline def setOnSliderStart(value: /* event */ ReadonlySliderStartEvent => Unit): Self = StObject.set(x, "onSliderStart", js.Any.fromFunction1(value))
      
      inline def setOnSliderStartUndefined: Self = StObject.set(x, "onSliderStart", js.undefined)
      
      inline def setOnTransitionInterrupted(value: () => Unit): Self = StObject.set(x, "onTransitionInterrupted", js.Any.fromFunction0(value))
      
      inline def setOnTransitionInterruptedUndefined: Self = StObject.set(x, "onTransitionInterrupted", js.undefined)
      
      inline def setOnTransitioning(value: () => Unit): Self = StObject.set(x, "onTransitioning", js.Any.fromFunction0(value))
      
      inline def setOnTransitioningUndefined: Self = StObject.set(x, "onTransitioning", js.undefined)
      
      inline def setOnUnhover(value: /* event */ ReadonlyPlotMouseEvent => Unit): Self = StObject.set(x, "onUnhover", js.Any.fromFunction1(value))
      
      inline def setOnUnhoverUndefined: Self = StObject.set(x, "onUnhover", js.undefined)
      
      inline def setOnUpdate(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseResizeHandler(value: Boolean): Self = StObject.set(x, "useResizeHandler", value.asInstanceOf[js.Any])
      
      inline def setUseResizeHandlerUndefined: Self = StObject.set(x, "useResizeHandler", js.undefined)
    }
  }
}
