package typings.slickgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CancelCurrentEdit extends StObject {
    
    def cancelCurrentEdit(): Boolean = js.native
    
    def commitCurrentEdit(): Boolean = js.native
  }
  object CancelCurrentEdit {
    
    @scala.inline
    def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): CancelCurrentEdit = {
      val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
      __obj.asInstanceOf[CancelCurrentEdit]
    }
    
    @scala.inline
    implicit class CancelCurrentEditMutableBuilder[Self <: CancelCurrentEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelCurrentEdit(value: () => Boolean): Self = StObject.set(x, "cancelCurrentEdit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCommitCurrentEdit(value: () => Boolean): Self = StObject.set(x, "commitCurrentEdit", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ColumnId extends StObject {
    
    var columnId: String = js.native
    
    var sortAsc: Boolean = js.native
  }
  object ColumnId {
    
    @scala.inline
    def apply(columnId: String, sortAsc: Boolean): ColumnId = {
      val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnId]
    }
    
    @scala.inline
    implicit class ColumnIdMutableBuilder[Self <: ColumnId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAsc(value: Boolean): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectActiveRow extends StObject {
    
    var selectActiveRow: Boolean = js.native
  }
  object SelectActiveRow {
    
    @scala.inline
    def apply(selectActiveRow: Boolean): SelectActiveRow = {
      val __obj = js.Dynamic.literal(selectActiveRow = selectActiveRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectActiveRow]
    }
    
    @scala.inline
    implicit class SelectActiveRowMutableBuilder[Self <: SelectActiveRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectActiveRow(value: Boolean): Self = StObject.set(x, "selectActiveRow", value.asInstanceOf[js.Any])
    }
  }
}
