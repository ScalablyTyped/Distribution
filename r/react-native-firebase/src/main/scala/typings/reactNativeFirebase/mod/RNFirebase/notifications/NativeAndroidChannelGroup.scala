package typings.reactNativeFirebase.mod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeAndroidChannelGroup extends js.Object {
  // Android API >= 28
  var channels: Unit | js.Array[NativeAndroidChannel]
  // Android API >= 28
  var description: String | Unit
  var groupId: String
  var name: String
}

object NativeAndroidChannelGroup {
  @scala.inline
  def apply(
    channels: Unit | js.Array[NativeAndroidChannel],
    description: String | Unit,
    groupId: String,
    name: String
  ): NativeAndroidChannelGroup = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannelGroup]
  }
}

