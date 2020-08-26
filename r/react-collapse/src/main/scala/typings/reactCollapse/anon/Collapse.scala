package typings.reactCollapse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapse extends js.Object {
  var collapse: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
}

object Collapse {
  @scala.inline
  def apply(): Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapse]
  }
  @scala.inline
  implicit class CollapseOps[Self <: Collapse] (val x: Self) extends AnyVal {
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
    def setCollapse(value: String): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

