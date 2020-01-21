package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageCountsResponse extends js.Object {
  var channels: StringDictionary[Double]
}

object MessageCountsResponse {
  @scala.inline
  def apply(channels: StringDictionary[Double]): MessageCountsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageCountsResponse]
  }
}

