package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupId[T /* <: KnobType */] extends js.Object {
  var groupId: js.UndefOr[String] = js.undefined
  var `type`: T
}

object Anon_GroupId {
  @scala.inline
  def apply[T /* <: KnobType */](`type`: T, groupId: String = null): Anon_GroupId[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupId[T]]
  }
}

