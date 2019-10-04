package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupParameters extends js.Object {
  var channelGroup: String
}

object DeleteGroupParameters {
  @scala.inline
  def apply(channelGroup: String): DeleteGroupParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup)
  
    __obj.asInstanceOf[DeleteGroupParameters]
  }
}

