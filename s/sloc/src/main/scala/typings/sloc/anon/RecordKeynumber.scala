package typings.sloc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<sloc.sloc.Key, number> */
@js.native
trait RecordKeynumber extends js.Object {
  
  var block: Double = js.native
  
  var blockEmpty: Double = js.native
  
  var comment: Double = js.native
  
  var empty: Double = js.native
  
  var mixed: Double = js.native
  
  var single: Double = js.native
  
  var source: Double = js.native
  
  var todo: Double = js.native
  
  var total: Double = js.native
}
object RecordKeynumber {
  
  @scala.inline
  def apply(
    block: Double,
    blockEmpty: Double,
    comment: Double,
    empty: Double,
    mixed: Double,
    single: Double,
    source: Double,
    todo: Double,
    total: Double
  ): RecordKeynumber = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockEmpty = blockEmpty.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordKeynumber]
  }
  
  @scala.inline
  implicit class RecordKeynumberOps[Self <: RecordKeynumber] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Double): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockEmpty(value: Double): Self = this.set("blockEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Double): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: Double): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixed(value: Double): Self = this.set("mixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: Double): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Double): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodo(value: Double): Self = this.set("todo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
