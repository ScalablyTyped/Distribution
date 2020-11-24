package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginateInstOptions[T] extends BasicPaginateOptions[T] {
  
  var raw: js.UndefOr[Boolean] = js.native
}
object PaginateInstOptions {
  
  @scala.inline
  def apply[T](): PaginateInstOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginateInstOptions[T]]
  }
  
  @scala.inline
  implicit class PaginateInstOptionsOps[Self <: PaginateInstOptions[_], T] (val x: Self with PaginateInstOptions[T]) extends AnyVal {
    
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
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
