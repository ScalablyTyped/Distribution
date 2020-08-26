package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupId[T /* <: KnobType */] extends js.Object {
  var groupId: js.UndefOr[String] = js.native
  var `type`: T = js.native
}

object GroupId {
  @scala.inline
  def apply[/* <: typings.storybookAddonKnobs.typesMod.KnobType */ T](`type`: T): GroupId[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId[T]]
  }
  @scala.inline
  implicit class GroupIdOps[Self <: GroupId[_], /* <: typings.storybookAddonKnobs.typesMod.KnobType */ T] (val x: Self with GroupId[T]) extends AnyVal {
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
  }
  
}

