package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var index: String = js.native
  var left_bound: js.UndefOr[String] = js.native
   // 'closed'
  var right_bound: js.UndefOr[String] = js.native
}

object Index {
  @scala.inline
  def apply(index: String): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft_bound(value: String): Self = this.set("left_bound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft_bound: Self = this.set("left_bound", js.undefined)
    @scala.inline
    def setRight_bound(value: String): Self = this.set("right_bound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight_bound: Self = this.set("right_bound", js.undefined)
  }
  
}

