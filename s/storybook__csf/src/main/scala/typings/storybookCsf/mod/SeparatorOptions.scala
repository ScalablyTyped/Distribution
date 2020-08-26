package typings.storybookCsf.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeparatorOptions extends js.Object {
  var groupSeparator: String | RegExp = js.native
  var rootSeparator: String | RegExp = js.native
}

object SeparatorOptions {
  @scala.inline
  def apply(groupSeparator: String | RegExp, rootSeparator: String | RegExp): SeparatorOptions = {
    val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorOptions]
  }
  @scala.inline
  implicit class SeparatorOptionsOps[Self <: SeparatorOptions] (val x: Self) extends AnyVal {
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
    def setGroupSeparator(value: String | RegExp): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootSeparator(value: String | RegExp): Self = this.set("rootSeparator", value.asInstanceOf[js.Any])
  }
  
}

