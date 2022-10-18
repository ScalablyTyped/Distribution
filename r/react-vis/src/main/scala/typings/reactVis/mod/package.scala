package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactVis.anon.Vertical
import typings.reactVis.mod.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ContinuousColorLegend: FC[ContinuousColorLegendProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("ContinuousColorLegend").asInstanceOf[FC[ContinuousColorLegendProps]]

inline def ContinuousSizeLegend: FC[ContinuousSizeLegendProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("ContinuousSizeLegend").asInstanceOf[FC[ContinuousSizeLegendProps]]

inline def DiscreteColorLegend: FC[DiscreteColorLegendProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("DiscreteColorLegend").asInstanceOf[FC[DiscreteColorLegendProps]]

inline def HorizontalGridLines: FC[HorizontalGridLinesProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("HorizontalGridLines").asInstanceOf[FC[HorizontalGridLinesProps]]

inline def SearchableDiscreteColorLegend: FC[SearchableDiscreteColorLegendProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SearchableDiscreteColorLegend").asInstanceOf[FC[SearchableDiscreteColorLegendProps]]

inline def VerticalGridLines: FC[VerticalGridLinesProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("VerticalGridLines").asInstanceOf[FC[VerticalGridLinesProps]]

inline def Voronoi: FC[VoronoiProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Voronoi").asInstanceOf[FC[VoronoiProps]]

inline def XAxis: FC[XAxisProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("XAxis").asInstanceOf[FC[XAxisProps]]

inline def YAxis: FC[YAxisProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("YAxis").asInstanceOf[FC[YAxisProps]]

inline def makeHeightFlexible(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeHeightFlexible")().asInstanceOf[Any]
inline def makeHeightFlexible(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeHeightFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def makeVisFlexible(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeVisFlexible")().asInstanceOf[Any]
inline def makeVisFlexible(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeVisFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def makeWidthFlexible(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeWidthFlexible")().asInstanceOf[Any]
inline def makeWidthFlexible(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeWidthFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[Any]

type AbstractSeriesPoint = StringDictionary[Any]

type DecorativeAxisPoint = AbstractSeriesPoint

type HeatmapSeriesProps = AbstractSeriesProps[HeatmapSeriesPoint]

type HorizontalRectSeriesCanvasProps = AbstractSeriesProps[HorizontalRectSeriesPoint]

type HorizontalRectSeriesPoint = RectSeriesPoint

type HorizontalRectSeriesProps = AbstractSeriesProps[HorizontalRectSeriesPoint]

type LineMarkSeriesCanvasProps = AbstractSeriesProps[LineMarkSeriesPoint]

type MarkSeriesCanvasProps = AbstractSeriesProps[MarkSeriesPoint]

type PolygonSeriesProps = AbstractSeriesProps[PolygonSeriesPoint]

type RVGet[T /* <: AbstractSeriesPoint */, K /* <: /* keyof T */ String */] = js.Function1[
/* datapoint */ T, 
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type RVGetAlignStyle = js.Function3[/* align */ Vertical, /* x */ Double, /* y */ Double, CSSProperties]

type RVGetNull[T /* <: AbstractSeriesPoint */] = js.Function1[/* datapoint */ T, Any]

type RVItemEventHandler = js.Function3[
/* item */ Any, 
/* index */ Double, 
/* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
Unit]

type RVMouseEventHandler = MouseEventHandler[HTMLElement]

type RVNearestXEventHandler[T /* <: AbstractSeriesPoint */] = js.Function2[/* datapoint */ T, /* data */ RVNearestXData[T], Unit]

type RVNearestXYEventHandler[T /* <: AbstractSeriesPoint */] = js.Function2[/* datapoint */ T, /* data */ RVNearestXYData[T], Unit]

type RVTickFormat = js.Function1[/* tick */ Any, String]

type RVTouchEventHandler = TouchEventHandler[HTMLElement]

type RVValueEventHandler[T /* <: AbstractSeriesPoint */] = js.Function2[/* datapoint */ T, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]

type RVWheelEventHandler = WheelEventHandler[HTMLElement]

type RadarChartPoint = AbstractSeriesPoint

type RectSeriesCanvasProps = AbstractSeriesProps[RectSeriesPoint]

type VerticalRectSeriesCanvasProps = AbstractSeriesProps[VerticalRectSeriesPoint]

type VerticalRectSeriesPoint = RectSeriesPoint

type VerticalRectSeriesProps = AbstractSeriesProps[VerticalRectSeriesPoint]
