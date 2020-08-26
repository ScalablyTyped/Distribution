package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listid extends js.Object {
  var list_id: String = js.native
}

object Listid {
  @scala.inline
  def apply(list_id: String): Listid = {
    val __obj = js.Dynamic.literal(list_id = list_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listid]
  }
  @scala.inline
  implicit class ListidOps[Self <: Listid] (val x: Self) extends AnyVal {
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
    def setList_id(value: String): Self = this.set("list_id", value.asInstanceOf[js.Any])
  }
  
}

