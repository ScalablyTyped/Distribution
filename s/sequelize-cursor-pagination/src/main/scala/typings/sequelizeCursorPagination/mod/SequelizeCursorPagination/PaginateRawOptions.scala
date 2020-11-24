package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typings.sequelizeCursorPagination.sequelizeCursorPaginationBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
  
  var raw: `true` = js.native
}
object PaginateRawOptions {
  
  @scala.inline
  def apply[T](raw: `true`): PaginateRawOptions[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateRawOptions[T]]
  }
  
  @scala.inline
  implicit class PaginateRawOptionsOps[Self <: PaginateRawOptions[_], T] (val x: Self with PaginateRawOptions[T]) extends AnyVal {
    
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
    def setRaw(value: `true`): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
}
