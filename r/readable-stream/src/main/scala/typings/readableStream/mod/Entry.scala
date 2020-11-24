package typings.readableStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== BufferList ====
@js.native
trait Entry[D] extends js.Object {
  
  var data: D = js.native
  
  var next: Entry[D] | Null = js.native
}
object Entry {
  
  @scala.inline
  def apply[D](data: D): Entry[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[D]]
  }
  
  @scala.inline
  implicit class EntryOps[Self <: Entry[_], D] (val x: Self with Entry[D]) extends AnyVal {
    
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Entry[D]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
  }
}
