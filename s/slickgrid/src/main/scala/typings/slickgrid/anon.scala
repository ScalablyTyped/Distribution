package typings.slickgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CancelCurrentEdit extends StObject {
    
    def cancelCurrentEdit(): Boolean
    
    def commitCurrentEdit(): Boolean
  }
  object CancelCurrentEdit {
    
    inline def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): CancelCurrentEdit = {
      val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
      __obj.asInstanceOf[CancelCurrentEdit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelCurrentEdit] (val x: Self) extends AnyVal {
      
      inline def setCancelCurrentEdit(value: () => Boolean): Self = StObject.set(x, "cancelCurrentEdit", js.Any.fromFunction0(value))
      
      inline def setCommitCurrentEdit(value: () => Boolean): Self = StObject.set(x, "commitCurrentEdit", js.Any.fromFunction0(value))
    }
  }
  
  trait ColumnId extends StObject {
    
    var columnId: String
    
    var sortAsc: Boolean
  }
  object ColumnId {
    
    inline def apply(columnId: String, sortAsc: Boolean): ColumnId = {
      val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnId] (val x: Self) extends AnyVal {
      
      inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      inline def setSortAsc(value: Boolean): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectActiveRow extends StObject {
    
    var selectActiveRow: Boolean
  }
  object SelectActiveRow {
    
    inline def apply(selectActiveRow: Boolean): SelectActiveRow = {
      val __obj = js.Dynamic.literal(selectActiveRow = selectActiveRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectActiveRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectActiveRow] (val x: Self) extends AnyVal {
      
      inline def setSelectActiveRow(value: Boolean): Self = StObject.set(x, "selectActiveRow", value.asInstanceOf[js.Any])
    }
  }
}
