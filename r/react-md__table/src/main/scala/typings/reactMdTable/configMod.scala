package typings.reactMdTable

import typings.react.mod.Provider
import typings.reactMdTable.anon.RequiredTableConfig
import typings.reactMdTable.reactMdTableStrings.padded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@react-md/table/types/config", "TableConfigProvider")
  @js.native
  val TableConfigProvider: Provider[RequiredTableConfig] = js.native
  
  @JSImport("@react-md/table/types/config", "useTableConfig")
  @js.native
  def useTableConfig(options: TableConfig): TableConfigContext = js.native
  
  @js.native
  trait TableCellConfig extends TableCellConfiguration {
    
    /**
      * Boolean if all the `TableCell` components should be rendered as a `<th>`
      * instead of a `<td>`. This is really just a convenience prop for the
      * `TableHeader` component so the user of `react-md` doesn't need to keep
      * setting the `type="th"` fot the `TableCell` if using the low-level
      * components.
      *
      * @private
      */
    var header: js.UndefOr[Boolean] = js.native
  }
  object TableCellConfig {
    
    @scala.inline
    def apply(): TableCellConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellConfig]
    }
    
    @scala.inline
    implicit class TableCellConfigMutableBuilder[Self <: TableCellConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  @js.native
  trait TableCellConfiguration extends StObject {
    
    /**
      * The horizontal alignment for the content within a cell.
      *
      * Note: Table default behavior is to align to the left.
      */
    var hAlign: js.UndefOr[TableCellHorizontalAlignment] = js.native
    
    /**
      * Boolean if the `<td>` and `<th>` cells should support line wrapping. This
      * is disabled by default since you _normally_ don't want line wrapping in
      * tables unless it provides additional descriptions or other content.
      *
      * If this is set to the string `"padded"`, line wrapping will be enabled
      * along with adding some additional vertical padding to each cell.
      */
    var lineWrap: js.UndefOr[Boolean | padded] = js.native
    
    /**
      * The vertical alignment for the content within a cell.
      *
      * Note: When this is set to `"top"` or `"bottom"`, `padding-top` or
      * `padding-bottom` will also be applied due to how styling tables work. This
      * padding can be configured with the `$rmd-table-cell-vertical-padding` or
      * `$rmd-table-cell-vertical-alignments` variables.
      */
    var vAlign: js.UndefOr[TableCellVerticalAlignment] = js.native
  }
  object TableCellConfiguration {
    
    @scala.inline
    def apply(): TableCellConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellConfiguration]
    }
    
    @scala.inline
    implicit class TableCellConfigurationMutableBuilder[Self <: TableCellConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHAlign(value: TableCellHorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      @scala.inline
      def setLineWrap(value: Boolean | padded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      @scala.inline
      def setVAlign(value: TableCellVerticalAlignment): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTable.reactMdTableStrings.left
    - typings.reactMdTable.reactMdTableStrings.center
    - typings.reactMdTable.reactMdTableStrings.right
  */
  trait TableCellHorizontalAlignment extends StObject
  object TableCellHorizontalAlignment {
    
    @scala.inline
    def center: typings.reactMdTable.reactMdTableStrings.center = "center".asInstanceOf[typings.reactMdTable.reactMdTableStrings.center]
    
    @scala.inline
    def left: typings.reactMdTable.reactMdTableStrings.left = "left".asInstanceOf[typings.reactMdTable.reactMdTableStrings.left]
    
    @scala.inline
    def right: typings.reactMdTable.reactMdTableStrings.right = "right".asInstanceOf[typings.reactMdTable.reactMdTableStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTable.reactMdTableStrings.top
    - typings.reactMdTable.reactMdTableStrings.middle
    - typings.reactMdTable.reactMdTableStrings.bottom
  */
  trait TableCellVerticalAlignment extends StObject
  object TableCellVerticalAlignment {
    
    @scala.inline
    def bottom: typings.reactMdTable.reactMdTableStrings.bottom = "bottom".asInstanceOf[typings.reactMdTable.reactMdTableStrings.bottom]
    
    @scala.inline
    def middle: typings.reactMdTable.reactMdTableStrings.middle = "middle".asInstanceOf[typings.reactMdTable.reactMdTableStrings.middle]
    
    @scala.inline
    def top: typings.reactMdTable.reactMdTableStrings.top = "top".asInstanceOf[typings.reactMdTable.reactMdTableStrings.top]
  }
  
  @js.native
  trait TableConfig
    extends TableCellConfig
       with TableRowConfiguration
  object TableConfig {
    
    @scala.inline
    def apply(): TableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableConfig]
    }
  }
  
  /* Inlined std.Required<@react-md/table.@react-md/table/types/config.TableConfig> */
  @js.native
  trait TableConfigContext extends StObject {
    
    var disableBorders: Boolean = js.native
    
    var disableHover: Boolean = js.native
    
    var hAlign: TableCellHorizontalAlignment = js.native
    
    var header: Boolean = js.native
    
    var lineWrap: Boolean | padded = js.native
    
    var vAlign: TableCellVerticalAlignment = js.native
  }
  object TableConfigContext {
    
    @scala.inline
    def apply(
      disableBorders: Boolean,
      disableHover: Boolean,
      hAlign: TableCellHorizontalAlignment,
      header: Boolean,
      lineWrap: Boolean | padded,
      vAlign: TableCellVerticalAlignment
    ): TableConfigContext = {
      val __obj = js.Dynamic.literal(disableBorders = disableBorders.asInstanceOf[js.Any], disableHover = disableHover.asInstanceOf[js.Any], hAlign = hAlign.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableConfigContext]
    }
    
    @scala.inline
    implicit class TableConfigContextMutableBuilder[Self <: TableConfigContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableBorders(value: Boolean): Self = StObject.set(x, "disableBorders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHover(value: Boolean): Self = StObject.set(x, "disableHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlign(value: TableCellHorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrap(value: Boolean | padded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlign(value: TableCellVerticalAlignment): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableConfiguration
    extends TableRowConfiguration
       with TableCellConfiguration {
    
    /**
      * Boolean if the table should use the dense spec to reduce the height of each
      * cell.
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the `<table>` element should span the entire width of the
      * container `<div>` element instead of having its width be determined by the
      * table's contents.
      *
      * Note: There will always be horizontal overflow if the table is too wide.
      */
    var fullWidth: js.UndefOr[Boolean] = js.native
  }
  object TableConfiguration {
    
    @scala.inline
    def apply(): TableConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableConfiguration]
    }
    
    @scala.inline
    implicit class TableConfigurationMutableBuilder[Self <: TableConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    }
  }
  
  @js.native
  trait TableRowConfiguration extends StObject {
    
    /**
      * Boolean if the table should no longer have a border-bottom applied to each
      * row within the `<tbody>`.
      */
    var disableBorders: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the rows should no longer applied a different background color
      * when hovered.
      */
    var disableHover: js.UndefOr[Boolean] = js.native
  }
  object TableRowConfiguration {
    
    @scala.inline
    def apply(): TableRowConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowConfiguration]
    }
    
    @scala.inline
    implicit class TableRowConfigurationMutableBuilder[Self <: TableRowConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableBorders(value: Boolean): Self = StObject.set(x, "disableBorders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableBordersUndefined: Self = StObject.set(x, "disableBorders", js.undefined)
      
      @scala.inline
      def setDisableHover(value: Boolean): Self = StObject.set(x, "disableHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHoverUndefined: Self = StObject.set(x, "disableHover", js.undefined)
    }
  }
}
