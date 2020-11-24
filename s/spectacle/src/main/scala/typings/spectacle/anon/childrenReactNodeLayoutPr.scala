package typings.spectacle.anon

import typings.react.mod.ReactNode
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  children :react.react.ReactNode} & styled-system.styled-system.LayoutProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.GridProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.PositionProps<styled-system.styled-system.RequiredTheme> */
@js.native
trait childrenReactNodeLayoutPr extends js.Object {
  
  /**
    * The bottom CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var bottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  var children: ReactNode = js.native
  
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-area CSS property is a shorthand property for grid-row-start, grid-column-start, grid-row-end
    * and grid-column-end, specifying a grid item’s size and location within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area)
    */
  var gridArea: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridArea */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-auto-columns CSS property specifies the size of an implicitly-created grid column track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
    */
  var gridAutoColumns: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-auto-rows CSS property specifies the size of an implicitly-created grid row track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
    */
  var gridAutoRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-column CSS property is a shorthand property for grid-column-start and grid-column-end specifying
    * a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic)
    * to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column)
    */
  var gridColumn: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The gap CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for row-gap
    * and column-gap.
    *
    * @deprecated use gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/gap)
    */
  var gridGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-row CSS property is a shorthand property for grid-row-start and grid-row-end specifying a grid item’s
    * size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid
    * placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row)
    */
  var gridRow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The row-gap CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * @deprecated use row-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
    */
  var gridRowGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-template-areas CSS property specifies named grid areas.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
    */
  var gridTemplateAreas: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-template-columns CSS property defines the line names and track sizing functions of the grid columns.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
    */
  var gridTemplateColumns: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The left CSS property participates in specifying the horizontal position
    * of a positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/left)
    */
  var left: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The right CSS property participates in specifying the horizontal position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/right)
    */
  var right: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  var size: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The top CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var top: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  
  /**
    * The z-index CSS property sets the z-order of a positioned element and its descendants or
    * flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index)
    */
  var zIndex: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _, 
      RequiredTheme
    ]
  ] = js.native
}
object childrenReactNodeLayoutPr {
  
  @scala.inline
  def apply(): childrenReactNodeLayoutPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[childrenReactNodeLayoutPr]
  }
  
  @scala.inline
  implicit class childrenReactNodeLayoutPrOps[Self <: childrenReactNodeLayoutPr] (val x: Self) extends AnyVal {
    
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
    def setBottomVarargs(value: (js.Any | Null)*): Self = this.set("bottom", js.Array(value :_*))
    
    @scala.inline
    def setBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setBottomNull: Self = this.set("bottom", null)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisplayVarargs(value: (js.Any | Null)*): Self = this.set("display", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _, 
          RequiredTheme
        ]
    ): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDisplayNull: Self = this.set("display", null)
    
    @scala.inline
    def setGridAreaVarargs(value: (js.Any | Null)*): Self = this.set("gridArea", js.Array(value :_*))
    
    @scala.inline
    def setGridArea(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridArea */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setGridAreaNull: Self = this.set("gridArea", null)
    
    @scala.inline
    def setGridAutoColumnsVarargs(value: (js.Any | Null)*): Self = this.set("gridAutoColumns", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoColumns(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoColumns: Self = this.set("gridAutoColumns", js.undefined)
    
    @scala.inline
    def setGridAutoColumnsNull: Self = this.set("gridAutoColumns", null)
    
    @scala.inline
    def setGridAutoFlowVarargs(value: (js.Any | Null)*): Self = this.set("gridAutoFlow", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoFlow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoFlow: Self = this.set("gridAutoFlow", js.undefined)
    
    @scala.inline
    def setGridAutoFlowNull: Self = this.set("gridAutoFlow", null)
    
    @scala.inline
    def setGridAutoRowsVarargs(value: (js.Any | Null)*): Self = this.set("gridAutoRows", js.Array(value :_*))
    
    @scala.inline
    def setGridAutoRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAutoRows: Self = this.set("gridAutoRows", js.undefined)
    
    @scala.inline
    def setGridAutoRowsNull: Self = this.set("gridAutoRows", null)
    
    @scala.inline
    def setGridColumnVarargs(value: (js.Any | Null)*): Self = this.set("gridColumn", js.Array(value :_*))
    
    @scala.inline
    def setGridColumn(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColumn: Self = this.set("gridColumn", js.undefined)
    
    @scala.inline
    def setGridColumnNull: Self = this.set("gridColumn", null)
    
    @scala.inline
    def setGridColumnGapVarargs(value: (js.Any | Null)*): Self = this.set("gridColumnGap", js.Array(value :_*))
    
    @scala.inline
    def setGridColumnGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
    
    @scala.inline
    def setGridColumnGapNull: Self = this.set("gridColumnGap", null)
    
    @scala.inline
    def setGridGapVarargs(value: (js.Any | Null)*): Self = this.set("gridGap", js.Array(value :_*))
    
    @scala.inline
    def setGridGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
    
    @scala.inline
    def setGridGapNull: Self = this.set("gridGap", null)
    
    @scala.inline
    def setGridRowVarargs(value: (js.Any | Null)*): Self = this.set("gridRow", js.Array(value :_*))
    
    @scala.inline
    def setGridRow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRow: Self = this.set("gridRow", js.undefined)
    
    @scala.inline
    def setGridRowNull: Self = this.set("gridRow", null)
    
    @scala.inline
    def setGridRowGapVarargs(value: (js.Any | Null)*): Self = this.set("gridRowGap", js.Array(value :_*))
    
    @scala.inline
    def setGridRowGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
    
    @scala.inline
    def setGridRowGapNull: Self = this.set("gridRowGap", null)
    
    @scala.inline
    def setGridTemplateAreasVarargs(value: (js.Any | Null)*): Self = this.set("gridTemplateAreas", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateAreas(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateAreas: Self = this.set("gridTemplateAreas", js.undefined)
    
    @scala.inline
    def setGridTemplateAreasNull: Self = this.set("gridTemplateAreas", null)
    
    @scala.inline
    def setGridTemplateColumnsVarargs(value: (js.Any | Null)*): Self = this.set("gridTemplateColumns", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateColumns(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateColumns: Self = this.set("gridTemplateColumns", js.undefined)
    
    @scala.inline
    def setGridTemplateColumnsNull: Self = this.set("gridTemplateColumns", null)
    
    @scala.inline
    def setGridTemplateRowsVarargs(value: (js.Any | Null)*): Self = this.set("gridTemplateRows", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateRows: Self = this.set("gridTemplateRows", js.undefined)
    
    @scala.inline
    def setGridTemplateRowsNull: Self = this.set("gridTemplateRows", null)
    
    @scala.inline
    def setHeightVarargs(value: (js.Any | Null)*): Self = this.set("height", js.Array(value :_*))
    
    @scala.inline
    def setHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    
    @scala.inline
    def setLeftVarargs(value: (js.Any | Null)*): Self = this.set("left", js.Array(value :_*))
    
    @scala.inline
    def setLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLeftNull: Self = this.set("left", null)
    
    @scala.inline
    def setMaxHeightVarargs(value: (js.Any | Null)*): Self = this.set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def setMaxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxHeightNull: Self = this.set("maxHeight", null)
    
    @scala.inline
    def setMaxWidthVarargs(value: (js.Any | Null)*): Self = this.set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMaxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMaxWidthNull: Self = this.set("maxWidth", null)
    
    @scala.inline
    def setMinHeightVarargs(value: (js.Any | Null)*): Self = this.set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def setMinHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinHeightNull: Self = this.set("minHeight", null)
    
    @scala.inline
    def setMinWidthVarargs(value: (js.Any | Null)*): Self = this.set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def setMinWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMinWidthNull: Self = this.set("minWidth", null)
    
    @scala.inline
    def setOverflowVarargs(value: (js.Any | Null)*): Self = this.set("overflow", js.Array(value :_*))
    
    @scala.inline
    def setOverflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setOverflowNull: Self = this.set("overflow", null)
    
    @scala.inline
    def setOverflowXVarargs(value: (js.Any | Null)*): Self = this.set("overflowX", js.Array(value :_*))
    
    @scala.inline
    def setOverflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    
    @scala.inline
    def setOverflowXNull: Self = this.set("overflowX", null)
    
    @scala.inline
    def setOverflowYVarargs(value: (js.Any | Null)*): Self = this.set("overflowY", js.Array(value :_*))
    
    @scala.inline
    def setOverflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    
    @scala.inline
    def setOverflowYNull: Self = this.set("overflowY", null)
    
    @scala.inline
    def setPositionVarargs(value: (js.Any | Null)*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _, 
          RequiredTheme
        ]
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    
    @scala.inline
    def setRightVarargs(value: (js.Any | Null)*): Self = this.set("right", js.Array(value :_*))
    
    @scala.inline
    def setRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRightNull: Self = this.set("right", null)
    
    @scala.inline
    def setSizeVarargs(value: (js.Any | Null)*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
    
    @scala.inline
    def setTopVarargs(value: (js.Any | Null)*): Self = this.set("top", js.Array(value :_*))
    
    @scala.inline
    def setTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTopNull: Self = this.set("top", null)
    
    @scala.inline
    def setVerticalAlignVarargs(value: (js.Any | Null)*): Self = this.set("verticalAlign", js.Array(value :_*))
    
    @scala.inline
    def setVerticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlignNull: Self = this.set("verticalAlign", null)
    
    @scala.inline
    def setWidthVarargs(value: (js.Any | Null)*): Self = this.set("width", js.Array(value :_*))
    
    @scala.inline
    def setWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
    
    @scala.inline
    def setZIndexVarargs(value: (js.Any | Null)*): Self = this.set("zIndex", js.Array(value :_*))
    
    @scala.inline
    def setZIndex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _, 
          RequiredTheme
        ]
    ): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZIndexNull: Self = this.set("zIndex", null)
  }
}
