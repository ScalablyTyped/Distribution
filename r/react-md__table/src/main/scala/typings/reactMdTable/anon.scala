package typings.reactMdTable

import typings.reactMdTable.configMod.TableCellHorizontalAlignment
import typings.reactMdTable.configMod.TableCellVerticalAlignment
import typings.reactMdTable.reactMdTableStrings.padded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<@react-md/table.@react-md/table/types/config.TableConfig> */
  @js.native
  trait RequiredTableConfig extends StObject {
    
    var disableBorders: Boolean = js.native
    
    var disableHover: Boolean = js.native
    
    var hAlign: TableCellHorizontalAlignment = js.native
    
    var header: Boolean = js.native
    
    var lineWrap: Boolean | padded = js.native
    
    var vAlign: TableCellVerticalAlignment = js.native
  }
  object RequiredTableConfig {
    
    @scala.inline
    def apply(
      disableBorders: Boolean,
      disableHover: Boolean,
      hAlign: TableCellHorizontalAlignment,
      header: Boolean,
      lineWrap: Boolean | padded,
      vAlign: TableCellVerticalAlignment
    ): RequiredTableConfig = {
      val __obj = js.Dynamic.literal(disableBorders = disableBorders.asInstanceOf[js.Any], disableHover = disableHover.asInstanceOf[js.Any], hAlign = hAlign.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredTableConfig]
    }
    
    @scala.inline
    implicit class RequiredTableConfigMutableBuilder[Self <: RequiredTableConfig] (val x: Self) extends AnyVal {
      
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
}
