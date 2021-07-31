package typings.prosemirrorTables

import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.NodeView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Anchor extends StObject {
    
    var anchor: Double
    
    var head: Double
  }
  object Anchor {
    
    @scala.inline
    def apply(anchor: Double, head: Double): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    @scala.inline
    implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  trait Buttom extends StObject {
    
    var buttom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Buttom {
    
    @scala.inline
    def apply(buttom: Double, left: Double, right: Double, top: Double): Buttom = {
      val __obj = js.Dynamic.literal(buttom = buttom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buttom]
    }
    
    @scala.inline
    implicit class ButtomMutableBuilder[Self <: Buttom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtom(value: Double): Self = StObject.set(x, "buttom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellMinWidth[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var View: js.UndefOr[NodeView[S]] = js.undefined
    
    var cellMinWidth: js.UndefOr[Double] = js.undefined
    
    var handleWidth: js.UndefOr[Double] = js.undefined
  }
  object CellMinWidth {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](): CellMinWidth[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMinWidth[S]]
    }
    
    @scala.inline
    implicit class CellMinWidthMutableBuilder[Self <: CellMinWidth[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & CellMinWidth[S]) extends AnyVal {
      
      @scala.inline
      def setCellMinWidth(value: Double): Self = StObject.set(x, "cellMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMinWidthUndefined: Self = StObject.set(x, "cellMinWidth", js.undefined)
      
      @scala.inline
      def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      @scala.inline
      def setView(value: NodeView[S]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
    }
  }
  
  /* Inlined std.Record<prosemirror-tables.prosemirror-tables.TableRoles, prosemirror-model.prosemirror-model.NodeType<any>> */
  trait RecordTableRolesNodeTypea extends StObject {
    
    var cell: NodeType[js.Any]
    
    var header_cell: NodeType[js.Any]
    
    var row: NodeType[js.Any]
    
    var table: NodeType[js.Any]
  }
  object RecordTableRolesNodeTypea {
    
    @scala.inline
    def apply(
      cell: NodeType[js.Any],
      header_cell: NodeType[js.Any],
      row: NodeType[js.Any],
      table: NodeType[js.Any]
    ): RecordTableRolesNodeTypea = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], header_cell = header_cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordTableRolesNodeTypea]
    }
    
    @scala.inline
    implicit class RecordTableRolesNodeTypeaMutableBuilder[Self <: RecordTableRolesNodeTypea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: NodeType[js.Any]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader_cell(value: NodeType[js.Any]): Self = StObject.set(x, "header_cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: NodeType[js.Any]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable(value: NodeType[js.Any]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseDeprecatedLogic extends StObject {
    
    var useDeprecatedLogic: js.UndefOr[Boolean] = js.undefined
  }
  object UseDeprecatedLogic {
    
    @scala.inline
    def apply(): UseDeprecatedLogic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseDeprecatedLogic]
    }
    
    @scala.inline
    implicit class UseDeprecatedLogicMutableBuilder[Self <: UseDeprecatedLogic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseDeprecatedLogic(value: Boolean): Self = StObject.set(x, "useDeprecatedLogic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDeprecatedLogicUndefined: Self = StObject.set(x, "useDeprecatedLogic", js.undefined)
    }
  }
}
