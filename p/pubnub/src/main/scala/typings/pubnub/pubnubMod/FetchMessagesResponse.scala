package typings.pubnub.pubnubMod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.Anon_Actions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMessagesResponse extends js.Object {
  var channels: StringDictionary[js.Array[Anon_Actions]]
}

object FetchMessagesResponse {
  @scala.inline
  def apply(channels: StringDictionary[js.Array[Anon_Actions]]): FetchMessagesResponse = {
    val __obj = js.Dynamic.literal(channels = channels)
  
    __obj.asInstanceOf[FetchMessagesResponse]
  }
}

