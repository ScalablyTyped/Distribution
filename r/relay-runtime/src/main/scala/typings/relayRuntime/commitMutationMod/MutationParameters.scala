package typings.relayRuntime.commitMutationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationParameters extends js.Object {
  val rawResponse: js.UndefOr[js.Object] = js.undefined
}

object MutationParameters {
  @scala.inline
  def apply(rawResponse: js.Object = null): MutationParameters = {
    val __obj = js.Dynamic.literal()
    if (rawResponse != null) __obj.updateDynamic("rawResponse")(rawResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationParameters]
  }
}

