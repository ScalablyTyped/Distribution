package typings.prosemirrorTables

import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorTables.mod.ColWidths
import typings.prosemirrorTables.mod.Problem
import typings.prosemirrorTables.prosemirrorTablesStrings.`colwidth mismatch`
import typings.prosemirrorTables.prosemirrorTablesStrings.collision
import typings.prosemirrorTables.prosemirrorTablesStrings.missing
import typings.prosemirrorTables.prosemirrorTablesStrings.overlong_rowspan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colwidth
    extends StObject
       with Problem {
    
    var colwidth: ColWidths
    
    var pos: Double
    
    var `type`: `colwidth mismatch`
  }
  object Colwidth {
    
    inline def apply(colwidth: ColWidths, pos: Double): Colwidth = {
      val __obj = js.Dynamic.literal(colwidth = colwidth.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("colwidth mismatch")
      __obj.asInstanceOf[Colwidth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colwidth] (val x: Self) extends AnyVal {
      
      inline def setColwidth(value: ColWidths): Self = StObject.set(x, "colwidth", value.asInstanceOf[js.Any])
      
      inline def setColwidthVarargs(value: Double*): Self = StObject.set(x, "colwidth", js.Array(value*))
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setType(value: `colwidth mismatch`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FixTables extends StObject {
    
    var fixTables: Boolean
  }
  object FixTables {
    
    inline def apply(fixTables: Boolean): FixTables = {
      val __obj = js.Dynamic.literal(fixTables = fixTables.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixTables]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixTables] (val x: Self) extends AnyVal {
      
      inline def setFixTables(value: Boolean): Self = StObject.set(x, "fixTables", value.asInstanceOf[js.Any])
    }
  }
  
  trait N
    extends StObject
       with Problem {
    
    var n: Double
    
    var pos: Double
    
    var row: Double
    
    var `type`: collision
  }
  object N {
    
    inline def apply(n: Double, pos: Double, row: Double): N = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("collision")
      __obj.asInstanceOf[N]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: N] (val x: Self) extends AnyVal {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setType(value: collision): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pos
    extends StObject
       with Problem {
    
    var n: Double
    
    var pos: Double
    
    var `type`: overlong_rowspan
  }
  object Pos {
    
    inline def apply(n: Double, pos: Double): Pos = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("overlong_rowspan")
      __obj.asInstanceOf[Pos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pos] (val x: Self) extends AnyVal {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setType(value: overlong_rowspan): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<prosemirror-tables.prosemirror-tables.TableRole, prosemirror-model.prosemirror-model.NodeType> */
  trait RecordTableRoleNodeType extends StObject {
    
    var cell: NodeType
    
    var header_cell: NodeType
    
    var row: NodeType
    
    var table: NodeType
  }
  object RecordTableRoleNodeType {
    
    inline def apply(cell: NodeType, header_cell: NodeType, row: NodeType, table: NodeType): RecordTableRoleNodeType = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], header_cell = header_cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordTableRoleNodeType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordTableRoleNodeType] (val x: Self) extends AnyVal {
      
      inline def setCell(value: NodeType): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setHeader_cell(value: NodeType): Self = StObject.set(x, "header_cell", value.asInstanceOf[js.Any])
      
      inline def setRow(value: NodeType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setTable(value: NodeType): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Row
    extends StObject
       with Problem {
    
    var n: Double
    
    var row: Double
    
    var `type`: missing
  }
  object Row {
    
    inline def apply(n: Double, row: Double): Row = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("missing")
      __obj.asInstanceOf[Row]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setType(value: missing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseDeprecatedLogic extends StObject {
    
    var useDeprecatedLogic: Boolean
  }
  object UseDeprecatedLogic {
    
    inline def apply(useDeprecatedLogic: Boolean): UseDeprecatedLogic = {
      val __obj = js.Dynamic.literal(useDeprecatedLogic = useDeprecatedLogic.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseDeprecatedLogic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseDeprecatedLogic] (val x: Self) extends AnyVal {
      
      inline def setUseDeprecatedLogic(value: Boolean): Self = StObject.set(x, "useDeprecatedLogic", value.asInstanceOf[js.Any])
    }
  }
}
