package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursors extends js.Object {
  
  var after: String | Null = js.native
  
  var before: String | Null = js.native
  
  var hasNext: Boolean = js.native
  
  var hasPrevious: Boolean = js.native
}
object Cursors {
  
  @scala.inline
  def apply(hasNext: Boolean, hasPrevious: Boolean): Cursors = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursors]
  }
  
  @scala.inline
  implicit class CursorsOps[Self <: Cursors] (val x: Self) extends AnyVal {
    
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
    def setHasNext(value: Boolean): Self = this.set("hasNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrevious(value: Boolean): Self = this.set("hasPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterNull: Self = this.set("after", null)
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeNull: Self = this.set("before", null)
  }
}
