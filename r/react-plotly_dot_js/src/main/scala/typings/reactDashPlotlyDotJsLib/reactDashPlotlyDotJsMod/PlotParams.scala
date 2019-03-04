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

object PlotParams {
  @scala.inline
  def apply(
    data: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Data */ _
    ],
    layout: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Layout */ _
    ],
    className: java.lang.String = null,
    config: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.Config */ _
    ] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    divId: java.lang.String = null,
    frames: js.Array[Frame] = null,
    onAfterExport: js.Function0[scala.Unit] = null,
    onAfterPlot: js.Function0[scala.Unit] = null,
    onAnimated: js.Function0[scala.Unit] = null,
    onAnimatingFrame: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.FrameAnimationEvent */ _
      ], 
      scala.Unit
    ] = null,
    onAnimationInterrupted: js.Function0[scala.Unit] = null,
    onAutoSize: js.Function0[scala.Unit] = null,
    onBeforeExport: js.Function0[scala.Unit] = null,
    onButtonClicked: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.ButtonClickEvent */ _
      ], 
      scala.Unit
    ] = null,
    onClick: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotMouseEvent */ _
      ], 
      scala.Unit
    ] = null,
    onClickAnnotation: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.ClickAnnotationEvent */ _
      ], 
      scala.Unit
    ] = null,
    onDeselect: js.Function0[scala.Unit] = null,
    onDoubleClick: js.Function0[scala.Unit] = null,
    onError: js.Function1[/* err */ stdLib.Readonly[stdLib.Error], scala.Unit] = null,
    onFramework: js.Function0[scala.Unit] = null,
    onHover: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotMouseEvent */ _
      ], 
      scala.Unit
    ] = null,
    onInitialized: js.Function2[
      /* figure */ stdLib.Readonly[Figure], 
      /* graphDiv */ stdLib.Readonly[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onLegendClick: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.LegendClickEvent */ _
      ], 
      scala.Boolean
    ] = null,
    onLegendDoubleClick: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.LegendClickEvent */ _
      ], 
      scala.Boolean
    ] = null,
    onPurge: js.Function2[
      /* figure */ stdLib.Readonly[Figure], 
      /* graphDiv */ stdLib.Readonly[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    onRedraw: js.Function0[scala.Unit] = null,
    onRelayout: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotRelayoutEvent */ _
      ], 
      scala.Unit
    ] = null,
    onRestyle: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotRestyleEvent */ _
      ], 
      scala.Unit
    ] = null,
    onSelected: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotSelectionEvent */ _
      ], 
      scala.Unit
    ] = null,
    onSelecting: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotSelectionEvent */ _
      ], 
      scala.Unit
    ] = null,
    onSliderChange: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.SliderChangeEvent */ _
      ], 
      scala.Unit
    ] = null,
    onSliderEnd: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.SliderEndEvent */ _
      ], 
      scala.Unit
    ] = null,
    onSliderStart: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.SliderStartEvent */ _
      ], 
      scala.Unit
    ] = null,
    onTransitionInterrupted: js.Function0[scala.Unit] = null,
    onTransitioning: js.Function0[scala.Unit] = null,
    onUnhover: js.Function1[
      /* event */ stdLib.Readonly[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Plotly.PlotMouseEvent */ _
      ], 
      scala.Unit
    ] = null,
    onUpdate: js.Function2[
      /* figure */ stdLib.Readonly[Figure], 
      /* graphDiv */ stdLib.Readonly[reactLib.HTMLElement], 
      scala.Unit
    ] = null,
    revision: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useResizeHandler: js.UndefOr[scala.Boolean] = js.undefined
  ): PlotParams = {
    val __obj = js.Dynamic.literal(data = data, layout = layout)
    if (className != null) __obj.updateDynamic("className")(className)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (divId != null) __obj.updateDynamic("divId")(divId)
    if (frames != null) __obj.updateDynamic("frames")(frames)
    if (onAfterExport != null) __obj.updateDynamic("onAfterExport")(onAfterExport)
    if (onAfterPlot != null) __obj.updateDynamic("onAfterPlot")(onAfterPlot)
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(onAnimated)
    if (onAnimatingFrame != null) __obj.updateDynamic("onAnimatingFrame")(onAnimatingFrame)
    if (onAnimationInterrupted != null) __obj.updateDynamic("onAnimationInterrupted")(onAnimationInterrupted)
    if (onAutoSize != null) __obj.updateDynamic("onAutoSize")(onAutoSize)
    if (onBeforeExport != null) __obj.updateDynamic("onBeforeExport")(onBeforeExport)
    if (onButtonClicked != null) __obj.updateDynamic("onButtonClicked")(onButtonClicked)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClickAnnotation != null) __obj.updateDynamic("onClickAnnotation")(onClickAnnotation)
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(onDeselect)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFramework != null) __obj.updateDynamic("onFramework")(onFramework)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(onInitialized)
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick)
    if (onLegendDoubleClick != null) __obj.updateDynamic("onLegendDoubleClick")(onLegendDoubleClick)
    if (onPurge != null) __obj.updateDynamic("onPurge")(onPurge)
    if (onRedraw != null) __obj.updateDynamic("onRedraw")(onRedraw)
    if (onRelayout != null) __obj.updateDynamic("onRelayout")(onRelayout)
    if (onRestyle != null) __obj.updateDynamic("onRestyle")(onRestyle)
    if (onSelected != null) __obj.updateDynamic("onSelected")(onSelected)
    if (onSelecting != null) __obj.updateDynamic("onSelecting")(onSelecting)
    if (onSliderChange != null) __obj.updateDynamic("onSliderChange")(onSliderChange)
    if (onSliderEnd != null) __obj.updateDynamic("onSliderEnd")(onSliderEnd)
    if (onSliderStart != null) __obj.updateDynamic("onSliderStart")(onSliderStart)
    if (onTransitionInterrupted != null) __obj.updateDynamic("onTransitionInterrupted")(onTransitionInterrupted)
    if (onTransitioning != null) __obj.updateDynamic("onTransitioning")(onTransitioning)
    if (onUnhover != null) __obj.updateDynamic("onUnhover")(onUnhover)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useResizeHandler)) __obj.updateDynamic("useResizeHandler")(useResizeHandler)
    __obj.asInstanceOf[PlotParams]
  }
}

