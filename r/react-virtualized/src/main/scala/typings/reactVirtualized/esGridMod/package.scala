package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ scala.Double = typings.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SCROLLING_RESET_TIME_INTERVAL").asInstanceOf[/* 150 */ scala.Double]

inline def accessibilityOverscanIndicesGetter: typings.reactVirtualized.esGridMod.OverscanIndicesGetter = typings.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("accessibilityOverscanIndicesGetter").asInstanceOf[typings.reactVirtualized.esGridMod.OverscanIndicesGetter]

inline def defaultCellRangeRenderer: typings.reactVirtualized.esGridMod.GridCellRangeRenderer = typings.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRangeRenderer").asInstanceOf[typings.reactVirtualized.esGridMod.GridCellRangeRenderer]

inline def defaultOverscanIndicesGetter: typings.reactVirtualized.esGridMod.OverscanIndicesGetter = typings.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultOverscanIndicesGetter").asInstanceOf[typings.reactVirtualized.esGridMod.OverscanIndicesGetter]

type GridCellRangeRenderer = js.Function1[
/* params */ typings.reactVirtualized.esGridMod.GridCellRangeProps, 
js.Array[typings.react.mod.ReactNode]]

type GridCellRenderer = js.Function1[
/* props */ typings.reactVirtualized.esGridMod.GridCellProps, 
typings.react.mod.ReactNode]

type OverscanIndices = typings.reactVirtualized.mod.OverscanIndexRange

type OverscanIndicesGetter = js.Function1[
/* params */ typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams, 
typings.reactVirtualized.esGridMod.OverscanIndices]

type SCROLL_DIRECTION_HORIZONTAL = typings.reactVirtualized.reactVirtualizedStrings.horizontal

type SCROLL_DIRECTION_VERTICAL = typings.reactVirtualized.reactVirtualizedStrings.vertical

type SectionRenderedParams = typings.reactVirtualized.esGridMod.RenderedSection
