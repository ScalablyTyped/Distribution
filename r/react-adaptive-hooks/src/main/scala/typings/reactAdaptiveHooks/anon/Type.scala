package typings.reactAdaptiveHooks.anon

import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.`media-source`
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.file
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.record
import typings.reactAdaptiveHooks.reactAdaptiveHooksStrings.transmission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var `type`: file | record | transmission | `media-source` = js.native
}

object Type {
  @scala.inline
  def apply(`type`: file | record | transmission | `media-source`): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setType(value: file | record | transmission | `media-source`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

