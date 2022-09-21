package typings.reactVirtualized.esGridMod

import typings.react.mod.ReactNode
import typings.reactVirtualized.esGridMod.^
import typings.reactVirtualized.mod.OverscanIndexRange
import typings.reactVirtualized.reactVirtualizedStrings.horizontal
import typings.reactVirtualized.reactVirtualizedStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SCROLLING_RESET_TIME_INTERVAL").asInstanceOf[/* 150 */ Double]

inline def accessibilityOverscanIndicesGetter: OverscanIndicesGetter = ^.asInstanceOf[js.Dynamic].selectDynamic("accessibilityOverscanIndicesGetter").asInstanceOf[OverscanIndicesGetter]

inline def defaultCellRangeRenderer: GridCellRangeRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRangeRenderer").asInstanceOf[GridCellRangeRenderer]

inline def defaultOverscanIndicesGetter: OverscanIndicesGetter = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultOverscanIndicesGetter").asInstanceOf[OverscanIndicesGetter]

type GridCellRangeRenderer = js.Function1[/* params */ GridCellRangeProps, js.Array[ReactNode]]

type GridCellRenderer = js.Function1[/* props */ GridCellProps, ReactNode]

type OverscanIndices = OverscanIndexRange

type OverscanIndicesGetter = js.Function1[/* params */ OverscanIndicesGetterParams, OverscanIndices]

type SCROLL_DIRECTION_HORIZONTAL = horizontal

type SCROLL_DIRECTION_VERTICAL = vertical

type SectionRenderedParams = RenderedSection
