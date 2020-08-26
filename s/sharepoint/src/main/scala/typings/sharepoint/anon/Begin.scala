package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Begin extends js.Object {
  var begin: js.Any = js.native
  var end: js.Any = js.native
  var keys: js.Any = js.native
}

object Begin {
  @scala.inline
  def apply(begin: js.Any, end: js.Any, keys: js.Any): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  @scala.inline
  implicit class BeginOps[Self <: Begin] (val x: Self) extends AnyVal {
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
    def setBegin(value: js.Any): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: js.Any): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

