package typings.reactTypesShared

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactTypesShared.reactTypesSharedStrings.`column dense`
import typings.reactTypesShared.reactTypesSharedStrings.`column-reverse`
import typings.reactTypesShared.reactTypesSharedStrings.`first baseline`
import typings.reactTypesShared.reactTypesSharedStrings.`flex-end`
import typings.reactTypesShared.reactTypesSharedStrings.`flex-start`
import typings.reactTypesShared.reactTypesSharedStrings.`last baseline`
import typings.reactTypesShared.reactTypesSharedStrings.`legacy center`
import typings.reactTypesShared.reactTypesSharedStrings.`legacy left`
import typings.reactTypesShared.reactTypesSharedStrings.`legacy right`
import typings.reactTypesShared.reactTypesSharedStrings.`row dense`
import typings.reactTypesShared.reactTypesSharedStrings.`row-reverse`
import typings.reactTypesShared.reactTypesSharedStrings.`safe center`
import typings.reactTypesShared.reactTypesSharedStrings.`self-end`
import typings.reactTypesShared.reactTypesSharedStrings.`self-start`
import typings.reactTypesShared.reactTypesSharedStrings.`space-around`
import typings.reactTypesShared.reactTypesSharedStrings.`space-between`
import typings.reactTypesShared.reactTypesSharedStrings.`space-evenly`
import typings.reactTypesShared.reactTypesSharedStrings.`unsafe center`
import typings.reactTypesShared.reactTypesSharedStrings.`wrap-reverse`
import typings.reactTypesShared.reactTypesSharedStrings.absolute
import typings.reactTypesShared.reactTypesSharedStrings.auto
import typings.reactTypesShared.reactTypesSharedStrings.baseline
import typings.reactTypesShared.reactTypesSharedStrings.center
import typings.reactTypesShared.reactTypesSharedStrings.column
import typings.reactTypesShared.reactTypesSharedStrings.end
import typings.reactTypesShared.reactTypesSharedStrings.fixed
import typings.reactTypesShared.reactTypesSharedStrings.left
import typings.reactTypesShared.reactTypesSharedStrings.normal
import typings.reactTypesShared.reactTypesSharedStrings.nowrap
import typings.reactTypesShared.reactTypesSharedStrings.relative
import typings.reactTypesShared.reactTypesSharedStrings.right
import typings.reactTypesShared.reactTypesSharedStrings.row
import typings.reactTypesShared.reactTypesSharedStrings.start
import typings.reactTypesShared.reactTypesSharedStrings.static
import typings.reactTypesShared.reactTypesSharedStrings.sticky
import typings.reactTypesShared.reactTypesSharedStrings.stretch
import typings.reactTypesShared.reactTypesSharedStrings.wrap
import typings.reactTypesShared.srcDnaMod.BackgroundColorValue
import typings.reactTypesShared.srcDnaMod.BackgroundColorValueV6
import typings.reactTypesShared.srcDnaMod.BorderColorValue
import typings.reactTypesShared.srcDnaMod.BorderColorValueV6
import typings.reactTypesShared.srcDnaMod.BorderRadiusValue
import typings.reactTypesShared.srcDnaMod.BorderSizeValue
import typings.reactTypesShared.srcDnaMod.DimensionValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStyleMod {
  
  trait BackgroundColor extends StObject {
    
    var `5`: BackgroundColorValue
    
    var `6`: BackgroundColorValueV6
  }
  object BackgroundColor {
    
    inline def apply(`5`: BackgroundColorValue, `6`: BackgroundColorValueV6): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      inline def set5(value: BackgroundColorValue): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: BackgroundColorValueV6): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    }
  }
  
  trait BorderColor extends StObject {
    
    var `5`: BorderColorValue
    
    var `6`: BorderColorValueV6
  }
  object BorderColor {
    
    inline def apply(`5`: BorderColorValue, `6`: BorderColorValueV6): BorderColor = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderColor] (val x: Self) extends AnyVal {
      
      inline def set5(value: BorderColorValue): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: BorderColorValueV6): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoxAlignmentStyleProps extends StObject {
    
    /**
      * The distribution of space around child items along the cross axis. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content).
      * @default 'start'
      */
    var alignContent: js.UndefOr[
        Responsive[
          start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
        ]
      ] = js.undefined
    
    /**
      * The alignment of children within their container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items).
      * @default 'stretch'
      */
    var alignItems: js.UndefOr[
        Responsive[
          start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
        ]
      ] = js.undefined
    
    /** The space to display between columns. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap). */
    var columnGap: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The space to display between both rows and columns. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/gap). */
    var gap: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /**
      * The distribution of space around items along the main axis. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content).
      * @default 'stretch'
      */
    var justifyContent: js.UndefOr[
        Responsive[
          start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
        ]
      ] = js.undefined
    
    /** The space to display between rows. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap). */
    var rowGap: js.UndefOr[Responsive[DimensionValue]] = js.undefined
  }
  object BoxAlignmentStyleProps {
    
    inline def apply(): BoxAlignmentStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxAlignmentStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxAlignmentStyleProps] (val x: Self) extends AnyVal {
      
      inline def setAlignContent(
        value: Responsive[
              start | end | center | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
            ]
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(
        value: Responsive[
              start | end | center | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
            ]
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setColumnGap(value: Responsive[DimensionValue]): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setGap(value: Responsive[DimensionValue]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setJustifyContent(
        value: Responsive[
              start | end | center | left | right | `space-between` | `space-around` | `space-evenly` | stretch | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`)
            ]
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setRowGap(value: Responsive[DimensionValue]): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedInts.`5`
    - typings.reactTypesShared.reactTypesSharedInts.`6`
  */
  trait ColorVersion extends StObject
  object ColorVersion {
    
    inline def `5`: typings.reactTypesShared.reactTypesSharedInts.`5` = 5.asInstanceOf[typings.reactTypesShared.reactTypesSharedInts.`5`]
    
    inline def `6`: typings.reactTypesShared.reactTypesSharedInts.`6` = 6.asInstanceOf[typings.reactTypesShared.reactTypesSharedInts.`6`]
  }
  
  trait FlexStyleProps
    extends StObject
       with BoxAlignmentStyleProps
       with StyleProps {
    
    /**
      * The direction in which to layout children. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction).
      * @default 'row'
      */
    var direction: js.UndefOr[Responsive[row | column | `row-reverse` | `column-reverse`]] = js.undefined
    
    /**
      * Whether to wrap items onto multiple lines. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap).
      * @default false
      */
    var wrap: js.UndefOr[
        Responsive[
          Boolean | typings.reactTypesShared.reactTypesSharedStrings.wrap | nowrap | `wrap-reverse`
        ]
      ] = js.undefined
  }
  object FlexStyleProps {
    
    inline def apply(): FlexStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexStyleProps] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Responsive[row | column | `row-reverse` | `column-reverse`]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setWrap(value: Responsive[Boolean | wrap | nowrap | `wrap-reverse`]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait GridStyleProps
    extends StObject
       with BoxAlignmentStyleProps
       with StyleProps {
    
    /** Defines named grid areas. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas). */
    var areas: js.UndefOr[Responsive[js.Array[String]]] = js.undefined
    
    /** Defines the size of implicitly generated columns. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns). */
    var autoColumns: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** Controls how auto-placed items are flowed into the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow). */
    var autoFlow: js.UndefOr[Responsive[row | column | (`row dense`) | (`column dense`)]] = js.undefined
    
    /** Defines the size of implicitly generated rows. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows). */
    var autoRows: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** Defines the sizes of each column in the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns). */
    var columns: js.UndefOr[Responsive[String | js.Array[DimensionValue]]] = js.undefined
    
    /** Defines the default `justifySelf` for all items in the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items). */
    var justifyItems: js.UndefOr[
        Responsive[
          auto | normal | start | end | center | left | right | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`) | (`legacy right`) | (`legacy left`) | (`legacy center`)
        ]
      ] = js.undefined
    
    /** Defines the sizes of each row in the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows). */
    var rows: js.UndefOr[Responsive[String | js.Array[DimensionValue]]] = js.undefined
  }
  object GridStyleProps {
    
    inline def apply(): GridStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridStyleProps] (val x: Self) extends AnyVal {
      
      inline def setAreas(value: Responsive[js.Array[String]]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
      
      inline def setAreasVarargs(value: String*): Self = StObject.set(x, "areas", js.Array(value*))
      
      inline def setAutoColumns(value: Responsive[DimensionValue]): Self = StObject.set(x, "autoColumns", value.asInstanceOf[js.Any])
      
      inline def setAutoColumnsUndefined: Self = StObject.set(x, "autoColumns", js.undefined)
      
      inline def setAutoFlow(value: Responsive[row | column | (`row dense`) | (`column dense`)]): Self = StObject.set(x, "autoFlow", value.asInstanceOf[js.Any])
      
      inline def setAutoFlowUndefined: Self = StObject.set(x, "autoFlow", js.undefined)
      
      inline def setAutoRows(value: Responsive[DimensionValue]): Self = StObject.set(x, "autoRows", value.asInstanceOf[js.Any])
      
      inline def setAutoRowsUndefined: Self = StObject.set(x, "autoRows", js.undefined)
      
      inline def setColumns(value: Responsive[String | js.Array[DimensionValue]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: DimensionValue*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setJustifyItems(
        value: Responsive[
              auto | normal | start | end | center | left | right | stretch | `self-start` | `self-end` | baseline | (`first baseline`) | (`last baseline`) | (`safe center`) | (`unsafe center`) | (`legacy right`) | (`legacy left`) | (`legacy center`)
            ]
      ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setRows(value: Responsive[String | js.Array[DimensionValue]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: DimensionValue*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  type Responsive[T] = T | ResponsiveProp[T]
  
  trait ResponsiveProp[T]
    extends StObject
       with /* custom */ StringDictionary[js.UndefOr[T]] {
    
    var L: js.UndefOr[T] = js.undefined
    
    var M: js.UndefOr[T] = js.undefined
    
    var S: js.UndefOr[T] = js.undefined
    
    var base: js.UndefOr[T] = js.undefined
  }
  object ResponsiveProp {
    
    inline def apply[T](): ResponsiveProp[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveProp[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveProp[?], T] (val x: Self & ResponsiveProp[T]) extends AnyVal {
      
      inline def setBase(value: T): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setL(value: T): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setM(value: T): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      inline def setS(value: T): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "S", js.undefined)
    }
  }
  
  trait StyleProps extends StObject {
    
    // For backward compatibility!
    /** Sets the CSS [className](https://developer.mozilla.org/en-US/docs/Web/API/Element/className) for the element. Only use as a **last resort**. Use style props instead. */
    var UNSAFE_className: js.UndefOr[String] = js.undefined
    
    /** Sets inline [style](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style) for the element. Only use as a **last resort**. Use style props instead. */
    var UNSAFE_style: js.UndefOr[CSSProperties] = js.undefined
    
    // ...
    /** Overrides the `alignItems` property of a flex or grid container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self). */
    var alignSelf: js.UndefOr[
        Responsive[
          auto | normal | start | end | center | `flex-start` | `flex-end` | `self-start` | `self-end` | stretch
        ]
      ] = js.undefined
    
    /** The bottom position for the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/bottom). */
    var bottom: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The logical end position for the element, depending on layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/inset-inline-end). */
    var end: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** When used in a flex layout, specifies how the element will grow or shrink to fit the space available. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex). */
    var flex: js.UndefOr[Responsive[String | Double | Boolean]] = js.undefined
    
    /** When used in a flex layout, specifies the initial main size of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-basis). */
    var flexBasis: js.UndefOr[Responsive[Double | String]] = js.undefined
    
    /** When used in a flex layout, specifies how the element will grow to fit the space available. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow). */
    var flexGrow: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** When used in a flex layout, specifies how the element will shrink to fit the space available. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink). */
    var flexShrink: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** When used in a grid layout, specifies the named grid area that the element should be placed in within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area). */
    var gridArea: js.UndefOr[Responsive[String]] = js.undefined
    
    /** When used in a grid layout, specifies the column the element should be placed in within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column). */
    var gridColumn: js.UndefOr[Responsive[String]] = js.undefined
    
    /** When used in a grid layout, specifies the ending column to span within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end). */
    var gridColumnEnd: js.UndefOr[Responsive[String]] = js.undefined
    
    /** When used in a grid layout, specifies the starting column to span within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start). */
    var gridColumnStart: js.UndefOr[Responsive[String]] = js.undefined
    
    /** When used in a grid layout, specifies the row the element should be placed in within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row). */
    var gridRow: js.UndefOr[Responsive[String]] = js.undefined
    
    /** When used in a grid layout, specifies the ending row to span within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end). */
    var gridRowEnd: js.UndefOr[Responsive[String]] = js.undefined
    
    /** When used in a grid layout, specifies the starting row to span within the grid. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start). */
    var gridRowStart: js.UndefOr[Responsive[String]] = js.undefined
    
    /** The height of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/height). */
    var height: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** Hides the element. */
    var isHidden: js.UndefOr[Responsive[Boolean]] = js.undefined
    
    /** Specifies how the element is justified inside a flex or grid container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self). */
    var justifySelf: js.UndefOr[
        Responsive[
          auto | normal | start | end | `flex-start` | `flex-end` | `self-start` | `self-end` | center | left | right | stretch
        ]
      ] = js.undefined
    
    /** The left position for the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/left). Consider using `start` instead for RTL support. */
    var left: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The margin for all four sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin). */
    var margin: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The margin for the bottom side of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin-bottom). */
    var marginBottom: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The margin for the logical end side of an element, depending on layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin-inline-end). */
    var marginEnd: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The margin for the logical start side of the element, depending on layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin-inline-start). */
    var marginStart: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    // /** The margin for the left side of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left). Consider using `marginStart` instead for RTL support. */
    // marginLeft?: Responsive<DimensionValue>,
    // /** The margin for the right side of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin-left). Consider using `marginEnd` instead for RTL support. */
    // marginRight?: Responsive<DimensionValue>,
    /** The margin for the top side of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin-top). */
    var marginTop: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The margin for both the left and right sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin). */
    var marginX: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The margin for both the top and bottom sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/margin). */
    var marginY: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The maximum height of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height). */
    var maxHeight: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The maximum width of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width). */
    var maxWidth: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The minimum height of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/min-height). */
    var minHeight: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The minimum width of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width). */
    var minWidth: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The layout order for the element within a flex or grid container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/order). */
    var order: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Specifies how the element is positioned. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/position). */
    var position: js.UndefOr[Responsive[static | relative | absolute | fixed | sticky]] = js.undefined
    
    /** The right position for the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/right). Consider using `start` instead for RTL support. */
    var right: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The logical start position for the element, depending on layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/inset-inline-start). */
    var start: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The top position for the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/top). */
    var top: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The width of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/width). */
    var width: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The stacking order for the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index). */
    var zIndex: js.UndefOr[Responsive[Double]] = js.undefined
  }
  object StyleProps {
    
    inline def apply(): StyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleProps] (val x: Self) extends AnyVal {
      
      inline def setAlignSelf(
        value: Responsive[
              auto | normal | start | end | center | `flex-start` | `flex-end` | `self-start` | `self-end` | stretch
            ]
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBottom(value: Responsive[DimensionValue]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setEnd(value: Responsive[DimensionValue]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFlex(value: Responsive[String | Double | Boolean]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(value: Responsive[Double | String]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexGrow(value: Responsive[Double]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: Responsive[Double]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setGridArea(value: Responsive[String]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridColumn(value: Responsive[String]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(value: Responsive[String]): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      inline def setGridColumnStart(value: Responsive[String]): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridRow(value: Responsive[String]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(value: Responsive[String]): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      inline def setGridRowStart(value: Responsive[String]): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setHeight(value: Responsive[DimensionValue]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsHidden(value: Responsive[Boolean]): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      inline def setJustifySelf(
        value: Responsive[
              auto | normal | start | end | `flex-start` | `flex-end` | `self-start` | `self-end` | center | left | right | stretch
            ]
      ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setLeft(value: Responsive[DimensionValue]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMargin(value: Responsive[DimensionValue]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Responsive[DimensionValue]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginEnd(value: Responsive[DimensionValue]): Self = StObject.set(x, "marginEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginEndUndefined: Self = StObject.set(x, "marginEnd", js.undefined)
      
      inline def setMarginStart(value: Responsive[DimensionValue]): Self = StObject.set(x, "marginStart", value.asInstanceOf[js.Any])
      
      inline def setMarginStartUndefined: Self = StObject.set(x, "marginStart", js.undefined)
      
      inline def setMarginTop(value: Responsive[DimensionValue]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginX(value: Responsive[DimensionValue]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginY(value: Responsive[DimensionValue]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMaxHeight(value: Responsive[DimensionValue]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Responsive[DimensionValue]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Responsive[DimensionValue]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Responsive[DimensionValue]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOrder(value: Responsive[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPosition(value: Responsive[static | relative | absolute | fixed | sticky]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRight(value: Responsive[DimensionValue]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setStart(value: Responsive[DimensionValue]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTop(value: Responsive[DimensionValue]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setUNSAFE_className(value: String): Self = StObject.set(x, "UNSAFE_className", value.asInstanceOf[js.Any])
      
      inline def setUNSAFE_classNameUndefined: Self = StObject.set(x, "UNSAFE_className", js.undefined)
      
      inline def setUNSAFE_style(value: CSSProperties): Self = StObject.set(x, "UNSAFE_style", value.asInstanceOf[js.Any])
      
      inline def setUNSAFE_styleUndefined: Self = StObject.set(x, "UNSAFE_style", js.undefined)
      
      inline def setWidth(value: Responsive[DimensionValue]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Responsive[Double]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait ViewStyleProps[C /* <: ColorVersion */]
    extends StObject
       with StyleProps {
    
    /** The background color for the element. */
    var backgroundColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BackgroundColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The color of the bottom border. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color). */
    var borderBottomColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The border radius for the bottom end corner of the element, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-end-end-radius). */
    var borderBottomEndRadius: js.UndefOr[Responsive[BorderRadiusValue]] = js.undefined
    
    /** The border radius for the bottom start corner of the element, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-end-start-radius). */
    var borderBottomStartRadius: js.UndefOr[Responsive[BorderRadiusValue]] = js.undefined
    
    /** The width of the bottom border. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width). */
    var borderBottomWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    /** The color of the element's border on all four sides. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color). */
    var borderColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The color of the border on the logical end side, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-inline-end-color). */
    var borderEndColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The width of the border on the logical end side, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-inline-end-width). */
    var borderEndWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    /** The border radius on all four sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius). */
    var borderRadius: js.UndefOr[Responsive[BorderRadiusValue]] = js.undefined
    
    /** The color of the border on the logical start side, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-inline-start-color). */
    var borderStartColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The width of the border on the logical start side, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-inline-start-width). */
    var borderStartWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    // borderLeftColor?: BorderColorValue,
    // borderRightColor?: BorderColorValue,
    /** The color of the top border. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color). */
    var borderTopColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The border radius for the top end corner of the element, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-start-end-radius). */
    var borderTopEndRadius: js.UndefOr[Responsive[BorderRadiusValue]] = js.undefined
    
    /** The border radius for the top start corner of the element, depending on the layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-start-start-radius). */
    var borderTopStartRadius: js.UndefOr[Responsive[BorderRadiusValue]] = js.undefined
    
    // borderLeftWidth?: BorderSizeValue,
    // borderRightWidth?: BorderSizeValue,
    /** The width of the top border. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width). */
    var borderTopWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    /** The width of the element's border on all four sides. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width). */
    var borderWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    /** The color of the left and right borders. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color). */
    var borderXColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The width of the left and right borders. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width). */
    var borderXWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    /** The color of the top and bottom borders. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width). */
    var borderYColor: js.UndefOr[
        Responsive[
          /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
        ]
      ] = js.undefined
    
    /** The width of the top and bottom borders. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width). */
    var borderYWidth: js.UndefOr[Responsive[BorderSizeValue]] = js.undefined
    
    /**
      * The Spectrum color token version number.
      * @default 5
      */
    var colorVersion: js.UndefOr[C] = js.undefined
    
    /** Species what to do when the element's content is too long to fit its size. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow). */
    var overflow: js.UndefOr[Responsive[String]] = js.undefined
    
    // borderTopLeftRadius?: BorderRadiusValue,
    // borderTopRightRadius?: BorderRadiusValue,
    // borderBottomLeftRadius?: BorderRadiusValue,
    // borderBottomRightRadius?: BorderRadiusValue,
    /** The padding for all four sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding). */
    var padding: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The padding for the bottom side of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding-bottom). */
    var paddingBottom: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The padding for the logical end side of an element, depending on layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding-inline-end). */
    var paddingEnd: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The padding for the logical start side of the element, depending on layout direction. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding-inline-start). */
    var paddingStart: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    // paddingLeft?: Responsive<DimensionValue>,
    // paddingRight?: Responsive<DimensionValue>,
    /** The padding for the top side of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding-top). */
    var paddingTop: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The padding for both the left and right sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding). */
    var paddingX: js.UndefOr[Responsive[DimensionValue]] = js.undefined
    
    /** The padding for both the top and bottom sides of the element. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/padding). */
    var paddingY: js.UndefOr[Responsive[DimensionValue]] = js.undefined
  }
  object ViewStyleProps {
    
    inline def apply[C /* <: ColorVersion */](): ViewStyleProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewStyleProps[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewStyleProps[?], C /* <: ColorVersion */] (val x: Self & ViewStyleProps[C]) extends AnyVal {
      
      inline def setBackgroundColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BackgroundColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderBottomColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomEndRadius(value: Responsive[BorderRadiusValue]): Self = StObject.set(x, "borderBottomEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomEndRadiusUndefined: Self = StObject.set(x, "borderBottomEndRadius", js.undefined)
      
      inline def setBorderBottomStartRadius(value: Responsive[BorderRadiusValue]): Self = StObject.set(x, "borderBottomStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomStartRadiusUndefined: Self = StObject.set(x, "borderBottomStartRadius", js.undefined)
      
      inline def setBorderBottomWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      inline def setBorderColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderEndColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderEndColorUndefined: Self = StObject.set(x, "borderEndColor", js.undefined)
      
      inline def setBorderEndWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderEndWidthUndefined: Self = StObject.set(x, "borderEndWidth", js.undefined)
      
      inline def setBorderRadius(value: Responsive[BorderRadiusValue]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderStartColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderStartColorUndefined: Self = StObject.set(x, "borderStartColor", js.undefined)
      
      inline def setBorderStartWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderStartWidthUndefined: Self = StObject.set(x, "borderStartWidth", js.undefined)
      
      inline def setBorderTopColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopEndRadius(value: Responsive[BorderRadiusValue]): Self = StObject.set(x, "borderTopEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopEndRadiusUndefined: Self = StObject.set(x, "borderTopEndRadius", js.undefined)
      
      inline def setBorderTopStartRadius(value: Responsive[BorderRadiusValue]): Self = StObject.set(x, "borderTopStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopStartRadiusUndefined: Self = StObject.set(x, "borderTopStartRadius", js.undefined)
      
      inline def setBorderTopWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      inline def setBorderWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBorderXColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderXColor", value.asInstanceOf[js.Any])
      
      inline def setBorderXColorUndefined: Self = StObject.set(x, "borderXColor", js.undefined)
      
      inline def setBorderXWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderXWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderXWidthUndefined: Self = StObject.set(x, "borderXWidth", js.undefined)
      
      inline def setBorderYColor(
        value: Responsive[
              /* import warning: importer.ImportType#apply Failed type conversion: @react-types/shared.@react-types/shared/src/style.BorderColor[C] */ js.Any
            ]
      ): Self = StObject.set(x, "borderYColor", value.asInstanceOf[js.Any])
      
      inline def setBorderYColorUndefined: Self = StObject.set(x, "borderYColor", js.undefined)
      
      inline def setBorderYWidth(value: Responsive[BorderSizeValue]): Self = StObject.set(x, "borderYWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderYWidthUndefined: Self = StObject.set(x, "borderYWidth", js.undefined)
      
      inline def setColorVersion(value: C): Self = StObject.set(x, "colorVersion", value.asInstanceOf[js.Any])
      
      inline def setColorVersionUndefined: Self = StObject.set(x, "colorVersion", js.undefined)
      
      inline def setOverflow(value: Responsive[String]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPadding(value: Responsive[DimensionValue]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: Responsive[DimensionValue]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingEnd(value: Responsive[DimensionValue]): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
      
      inline def setPaddingStart(value: Responsive[DimensionValue]): Self = StObject.set(x, "paddingStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingStartUndefined: Self = StObject.set(x, "paddingStart", js.undefined)
      
      inline def setPaddingTop(value: Responsive[DimensionValue]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingX(value: Responsive[DimensionValue]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingY(value: Responsive[DimensionValue]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    }
  }
}
