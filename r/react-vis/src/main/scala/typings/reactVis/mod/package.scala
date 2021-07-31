package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def ContinuousColorLegend: typings.react.mod.SFC[typings.reactVis.mod.ContinuousColorLegendProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContinuousColorLegend").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.ContinuousColorLegendProps]]

@scala.inline
def ContinuousSizeLegend: typings.react.mod.SFC[typings.reactVis.mod.ContinuousSizeLegendProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContinuousSizeLegend").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.ContinuousSizeLegendProps]]

@scala.inline
def DiscreteColorLegend: typings.react.mod.SFC[typings.reactVis.mod.DiscreteColorLegendProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DiscreteColorLegend").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.DiscreteColorLegendProps]]

@scala.inline
def HorizontalGridLines: typings.react.mod.SFC[typings.reactVis.mod.HorizontalGridLinesProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HorizontalGridLines").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.HorizontalGridLinesProps]]

@scala.inline
def SearchableDiscreteColorLegend: typings.react.mod.SFC[typings.reactVis.mod.SearchableDiscreteColorLegendProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SearchableDiscreteColorLegend").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.SearchableDiscreteColorLegendProps]]

@scala.inline
def VerticalGridLines: typings.react.mod.SFC[typings.reactVis.mod.VerticalGridLinesProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VerticalGridLines").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.VerticalGridLinesProps]]

@scala.inline
def Voronoi: typings.react.mod.SFC[typings.reactVis.mod.VoronoiProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Voronoi").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.VoronoiProps]]

@scala.inline
def XAxis: typings.react.mod.SFC[typings.reactVis.mod.XAxisProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("XAxis").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.XAxisProps]]

@scala.inline
def YAxis: typings.react.mod.SFC[typings.reactVis.mod.YAxisProps] = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].selectDynamic("YAxis").asInstanceOf[typings.react.mod.SFC[typings.reactVis.mod.YAxisProps]]

@scala.inline
def makeHeightFlexible(): js.Any = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeHeightFlexible")().asInstanceOf[js.Any]
@scala.inline
def makeHeightFlexible(component: js.Any): js.Any = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeHeightFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def makeVisFlexible(): js.Any = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeVisFlexible")().asInstanceOf[js.Any]
@scala.inline
def makeVisFlexible(component: js.Any): js.Any = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeVisFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def makeWidthFlexible(): js.Any = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeWidthFlexible")().asInstanceOf[js.Any]
@scala.inline
def makeWidthFlexible(component: js.Any): js.Any = typings.reactVis.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeWidthFlexible")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]

type AbstractSeriesPoint = org.scalablytyped.runtime.StringDictionary[js.Any]

type DecorativeAxisPoint = typings.reactVis.mod.AbstractSeriesPoint

type HeatmapSeriesProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.HeatmapSeriesPoint]

type HorizontalRectSeriesCanvasProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.HorizontalRectSeriesPoint]

type HorizontalRectSeriesPoint = typings.reactVis.mod.RectSeriesPoint

type HorizontalRectSeriesProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.HorizontalRectSeriesPoint]

type LineMarkSeriesCanvasProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.LineMarkSeriesPoint]

type MarkSeriesCanvasProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.MarkSeriesPoint]

type PolygonSeriesProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.PolygonSeriesPoint]

type RVGet[T /* <: typings.reactVis.mod.AbstractSeriesPoint */, K /* <: /* keyof T */ java.lang.String */] = js.Function1[
/* datapoint */ T, 
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type RVGetAlignStyle = js.Function3[
/* align */ typings.reactVis.anon.Horizontal, 
/* x */ scala.Double, 
/* y */ scala.Double, 
typings.react.mod.CSSProperties]

type RVGetNull[T /* <: typings.reactVis.mod.AbstractSeriesPoint */] = js.Function1[/* datapoint */ T, js.Any]

type RVItemEventHandler = js.Function3[
/* item */ js.Any, 
/* index */ scala.Double, 
/* event */ typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent], 
scala.Unit]

type RVMouseEventHandler = typings.react.mod.MouseEventHandler[typings.std.HTMLElement]

type RVNearestXEventHandler[T /* <: typings.reactVis.mod.AbstractSeriesPoint */] = js.Function2[/* datapoint */ T, /* data */ typings.reactVis.mod.RVNearestXData[T], scala.Unit]

type RVNearestXYEventHandler[T /* <: typings.reactVis.mod.AbstractSeriesPoint */] = js.Function2[/* datapoint */ T, /* data */ typings.reactVis.mod.RVNearestXYData[T], scala.Unit]

type RVTickFormat = js.Function1[/* tick */ js.Any, java.lang.String]

type RVTouchEventHandler = typings.react.mod.TouchEventHandler[typings.std.HTMLElement]

type RVValueEventHandler[T /* <: typings.reactVis.mod.AbstractSeriesPoint */] = js.Function2[
/* datapoint */ T, 
/* event */ typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent], 
scala.Unit]

type RVWheelEventHandler = typings.react.mod.WheelEventHandler[typings.std.HTMLElement]

type RadarChartPoint = typings.reactVis.mod.AbstractSeriesPoint

type RectSeriesCanvasProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.RectSeriesPoint]

type VerticalRectSeriesCanvasProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.VerticalRectSeriesPoint]

type VerticalRectSeriesPoint = typings.reactVis.mod.RectSeriesPoint

type VerticalRectSeriesProps = typings.reactVis.mod.AbstractSeriesProps[typings.reactVis.mod.VerticalRectSeriesPoint]
