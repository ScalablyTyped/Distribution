package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupId[T /* <: KnobType */] extends js.Object {
  var groupId: js.UndefOr[String] = js.undefined
  var `type`: T
}

object AnonGroupId {
  @scala.inline
  def apply[T /* <: KnobType */](`type`: T, groupId: String = null): AnonGroupId[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupId[T]]
  }
}

