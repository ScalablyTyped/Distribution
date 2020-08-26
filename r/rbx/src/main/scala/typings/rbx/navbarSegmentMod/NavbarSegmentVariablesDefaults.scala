package typings.rbx.navbarSegmentMod

import typings.rbx.rbxStrings.end
import typings.rbx.rbxStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarSegmentVariablesDefaults extends js.Object {
  var alignments: start | end = js.native
}

object NavbarSegmentVariablesDefaults {
  @scala.inline
  def apply(alignments: start | end): NavbarSegmentVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarSegmentVariablesDefaults]
  }
  @scala.inline
  implicit class NavbarSegmentVariablesDefaultsOps[Self <: NavbarSegmentVariablesDefaults] (val x: Self) extends AnyVal {
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
    def setAlignments(value: start | end): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
  
}

