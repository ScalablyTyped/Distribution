package typings.rollup.mod

import typings.rollup.rollupStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePlaceholder extends js.Object {
  var `type`: placeholder = js.native
}

object FilePlaceholder {
  @scala.inline
  def apply(`type`: placeholder): FilePlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePlaceholder]
  }
  @scala.inline
  implicit class FilePlaceholderOps[Self <: FilePlaceholder] (val x: Self) extends AnyVal {
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
    def setType(value: placeholder): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

