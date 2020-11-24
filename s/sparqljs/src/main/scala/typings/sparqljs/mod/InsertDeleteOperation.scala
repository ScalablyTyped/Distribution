package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.delete
import typings.sparqljs.sparqljsStrings.deletewhere
import typings.sparqljs.sparqljsStrings.insert
import typings.sparqljs.sparqljsStrings.insertdelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertDeleteOperation extends UpdateOperation {
  
  var delete: js.UndefOr[js.Array[Quads]] = js.native
  
  var graph: js.UndefOr[IriTerm] = js.native
  
  var insert: js.UndefOr[js.Array[Quads]] = js.native
  
  var updateType: insert | delete | deletewhere | insertdelete = js.native
  
  var where: js.UndefOr[js.Array[Pattern]] = js.native
}
object InsertDeleteOperation {
  
  @scala.inline
  def apply(updateType: insert | delete | deletewhere | insertdelete): InsertDeleteOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDeleteOperation]
  }
  
  @scala.inline
  implicit class InsertDeleteOperationOps[Self <: InsertDeleteOperation] (val x: Self) extends AnyVal {
    
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
    def setUpdateType(value: insert | delete | deletewhere | insertdelete): Self = this.set("updateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteVarargs(value: Quads*): Self = this.set("delete", js.Array(value :_*))
    
    @scala.inline
    def setDelete(value: js.Array[Quads]): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setGraph(value: IriTerm): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    
    @scala.inline
    def setInsertVarargs(value: Quads*): Self = this.set("insert", js.Array(value :_*))
    
    @scala.inline
    def setInsert(value: js.Array[Quads]): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: Pattern*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: js.Array[Pattern]): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
