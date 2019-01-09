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
  var config: js.UndefOr[
    stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Config */ _
    ]
  ] = js.undefined
  var data: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Data */ _
  ]
  /**
    * Assign the graph div to window.gd for debugging
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * id assigned to the <div> into which the plot is rendered.
    */
  var divId: js.UndefOr[java.lang.String] = js.undefined
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  var layout: stdLib.Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Layout */ _
  ]
  var onAfterExport: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAfterPlot: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAnimated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAnimatingFrame: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.FrameAnimationEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onAnimationInterrupted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAutoSize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBeforeExport: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onButtonClicked: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.ButtonClickEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotMouseEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onClickAnnotation: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.ClickAnnotationEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback executed when a plotly.js API method rejects
    * @param err Error
    */
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Readonly[stdLib.Error], scala.Unit]] = js.undefined
  var onFramework: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHover: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotMouseEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback executed after plot is initialized.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onInitialized: js.UndefOr[
    js.Function2[
      /* figure */ stdLib.Readonly[Figure], 
      /* graphDiv */ stdLib.Readonly[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onLegendClick: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.LegendClickEvent */ _
      ], 
      scala.Boolean
    ]
  ] = js.undefined
  var onLegendDoubleClick: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.LegendClickEvent */ _
      ], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Callback executed when component unmounts, before Plotly.purge strips the graphDiv of all private attributes.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onPurge: js.UndefOr[
    js.Function2[
      /* figure */ stdLib.Readonly[Figure], 
      /* graphDiv */ stdLib.Readonly[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onRedraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRelayout: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotRelayoutEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onRestyle: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotRestyleEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelected: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotSelectionEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelecting: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotSelectionEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onSliderChange: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.SliderChangeEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onSliderEnd: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.SliderEndEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onSliderStart: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.SliderStartEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionInterrupted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitioning: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUnhover: js.UndefOr[
    js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotMouseEvent */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback executed when when a plot is updated due to new data or layout, or when user interacts with a plot.
    * @param figure Object with three keys corresponding to input props: data, layout and frames.
    * @param graphDiv Reference to the DOM node into which the figure was rendered.
    */
  var onUpdate: js.UndefOr[
    js.Function2[
      /* figure */ stdLib.Readonly[Figure], 
      /* graphDiv */ stdLib.Readonly[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * When provided, causes the plot to update only when the revision is incremented.
    */
  var revision: js.UndefOr[scala.Double] = js.undefined
  /**
    * used to style the <div> into which the plot is rendered
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * When true, adds a call to Plotly.Plot.resize() as a window.resize event handler
    */
  var useResizeHandler: js.UndefOr[scala.Boolean] = js.undefined
}

