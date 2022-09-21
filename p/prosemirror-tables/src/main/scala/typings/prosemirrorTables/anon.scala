package typings.prosemirrorTables

import org.scalablytyped.runtime.Instantiable3
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorView.mod.EditorView
import typings.prosemirrorView.mod.NodeView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellMinWidth extends StObject {
    
    var View: js.UndefOr[
        Instantiable3[/* node */ Node, /* cellMinWidth */ Double, /* view */ EditorView, NodeView]
      ] = js.undefined
    
    var cellMinWidth: js.UndefOr[Double] = js.undefined
    
    var handleWidth: js.UndefOr[Double] = js.undefined
  }
  object CellMinWidth {
    
    inline def apply(): CellMinWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMinWidth]
    }
    
    extension [Self <: CellMinWidth](x: Self) {
      
      inline def setCellMinWidth(value: Double): Self = StObject.set(x, "cellMinWidth", value.asInstanceOf[js.Any])
      
      inline def setCellMinWidthUndefined: Self = StObject.set(x, "cellMinWidth", js.undefined)
      
      inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      inline def setView(value: Instantiable3[/* node */ Node, /* cellMinWidth */ Double, /* view */ EditorView, NodeView]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
    }
  }
  
  /* Inlined std.Record<prosemirror-tables.prosemirror-tables.TableRoles, prosemirror-model.prosemirror-model.NodeType> */
  trait RecordTableRolesNodeType extends StObject {
    
    var cell: NodeType
    
    var header_cell: NodeType
    
    var row: NodeType
    
    var table: NodeType
  }
  object RecordTableRolesNodeType {
    
    inline def apply(cell: NodeType, header_cell: NodeType, row: NodeType, table: NodeType): RecordTableRolesNodeType = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], header_cell = header_cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordTableRolesNodeType]
    }
    
    extension [Self <: RecordTableRolesNodeType](x: Self) {
      
      inline def setCell(value: NodeType): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setHeader_cell(value: NodeType): Self = StObject.set(x, "header_cell", value.asInstanceOf[js.Any])
      
      inline def setRow(value: NodeType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setTable(value: NodeType): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseDeprecatedLogic extends StObject {
    
    var useDeprecatedLogic: js.UndefOr[Boolean] = js.undefined
  }
  object UseDeprecatedLogic {
    
    inline def apply(): UseDeprecatedLogic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDeprecatedLogic]
    }
    
    extension [Self <: UseDeprecatedLogic](x: Self) {
      
      inline def setUseDeprecatedLogic(value: Boolean): Self = StObject.set(x, "useDeprecatedLogic", value.asInstanceOf[js.Any])
      
      inline def setUseDeprecatedLogicUndefined: Self = StObject.set(x, "useDeprecatedLogic", js.undefined)
    }
  }
}
