package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupParameters extends js.Object {
  var channelGroup: String
}

object DeleteGroupParameters {
  @scala.inline
  def apply(channelGroup: String): DeleteGroupParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupParameters]
  }
}

