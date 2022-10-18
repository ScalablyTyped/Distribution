package typings.reactMdTable

import typings.reactMdTable.reactMdTableStrings.padded
import typings.reactMdTable.typesConfigMod.TableCellHorizontalAlignment
import typings.reactMdTable.typesConfigMod.TableCellVerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<@react-md/table.@react-md/table/types/config.TableConfig> */
  trait RequiredTableConfig extends StObject {
    
    var disableBorders: Boolean
    
    var disableHover: Boolean
    
    var hAlign: TableCellHorizontalAlignment
    
    var header: Boolean
    
    var lineWrap: Boolean | padded
    
    var vAlign: TableCellVerticalAlignment
  }
  object RequiredTableConfig {
    
    inline def apply(
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
    
    extension [Self <: RequiredTableConfig](x: Self) {
      
      inline def setDisableBorders(value: Boolean): Self = StObject.set(x, "disableBorders", value.asInstanceOf[js.Any])
      
      inline def setDisableHover(value: Boolean): Self = StObject.set(x, "disableHover", value.asInstanceOf[js.Any])
      
      inline def setHAlign(value: TableCellHorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setLineWrap(value: Boolean | padded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setVAlign(value: TableCellVerticalAlignment): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
    }
  }
}
