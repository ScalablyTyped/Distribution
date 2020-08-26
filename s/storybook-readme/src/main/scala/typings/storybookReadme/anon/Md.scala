package typings.storybookReadme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Md extends js.Object {
  var md: String = js.native
}

object Md {
  @scala.inline
  def apply(md: String): Md = {
    val __obj = js.Dynamic.literal(md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md]
  }
  @scala.inline
  implicit class MdOps[Self <: Md] (val x: Self) extends AnyVal {
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
    def setMd(value: String): Self = this.set("md", value.asInstanceOf[js.Any])
  }
  
}

