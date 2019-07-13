package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupName extends js.Object {
  var groupName: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var streamName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_GroupName {
  @scala.inline
  def apply(
    groupName: java.lang.String = null,
    status: java.lang.String = null,
    streamName: java.lang.String = null
  ): Anon_GroupName = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (status != null) __obj.updateDynamic("status")(status)
    if (streamName != null) __obj.updateDynamic("streamName")(streamName)
    __obj.asInstanceOf[Anon_GroupName]
  }
}

