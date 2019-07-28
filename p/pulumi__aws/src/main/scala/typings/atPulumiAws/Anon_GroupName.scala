package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupName extends js.Object {
  var groupName: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var streamName: js.UndefOr[String] = js.undefined
}

object Anon_GroupName {
  @scala.inline
  def apply(groupName: String = null, status: String = null, streamName: String = null): Anon_GroupName = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (status != null) __obj.updateDynamic("status")(status)
    if (streamName != null) __obj.updateDynamic("streamName")(streamName)
    __obj.asInstanceOf[Anon_GroupName]
  }
}

