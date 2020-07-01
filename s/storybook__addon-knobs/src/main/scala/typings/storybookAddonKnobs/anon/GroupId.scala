package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupId[T /* <: KnobType */] extends js.Object {
  var groupId: js.UndefOr[String] = js.undefined
  var `type`: T
}

object GroupId {
  @scala.inline
  def apply[/* <: typings.storybookAddonKnobs.typesMod.KnobType */ T](`type`: T, groupId: String = null): GroupId[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId[T]]
  }
}

