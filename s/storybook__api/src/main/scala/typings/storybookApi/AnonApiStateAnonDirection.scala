package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiStateAnonDirection extends js.Object {
  var api: AnonDirection
  var state: AnonStoriesConfigured
}

object AnonApiStateAnonDirection {
  @scala.inline
  def apply(api: AnonDirection, state: AnonStoriesConfigured): AnonApiStateAnonDirection = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiStateAnonDirection]
  }
}

