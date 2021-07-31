package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.delete
import typings.sparqljs.sparqljsStrings.deletewhere
import typings.sparqljs.sparqljsStrings.insert
import typings.sparqljs.sparqljsStrings.insertdelete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertDeleteOperation
  extends StObject
     with UpdateOperation {
  
  var delete: js.UndefOr[js.Array[Quads]] = js.undefined
  
  var graph: js.UndefOr[IriTerm] = js.undefined
  
  var insert: js.UndefOr[js.Array[Quads]] = js.undefined
  
  var updateType: insert | delete | deletewhere | insertdelete
  
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}
object InsertDeleteOperation {
  
  @scala.inline
  def apply(updateType: insert | delete | deletewhere | insertdelete): InsertDeleteOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDeleteOperation]
  }
  
  @scala.inline
  implicit class InsertDeleteOperationMutableBuilder[Self <: InsertDeleteOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: js.Array[Quads]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDeleteVarargs(value: Quads*): Self = StObject.set(x, "delete", js.Array(value :_*))
    
    @scala.inline
    def setGraph(value: IriTerm): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    @scala.inline
    def setInsert(value: js.Array[Quads]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setInsertVarargs(value: Quads*): Self = StObject.set(x, "insert", js.Array(value :_*))
    
    @scala.inline
    def setUpdateType(value: insert | delete | deletewhere | insertdelete): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Array[Pattern]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: Pattern*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
