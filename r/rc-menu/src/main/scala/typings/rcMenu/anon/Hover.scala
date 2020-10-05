package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hover extends js.Object {
  var hover: Boolean = js.native
  var key: typings.react.mod.Key = js.native
}

object Hover {
  @scala.inline
  def apply(hover: Boolean, key: typings.react.mod.Key): Hover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  @scala.inline
  implicit class HoverOps[Self <: Hover] (val x: Self) extends AnyVal {
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
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

