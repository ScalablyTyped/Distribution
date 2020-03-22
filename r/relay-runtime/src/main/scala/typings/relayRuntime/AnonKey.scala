package typings.relayRuntime

import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var filters: js.UndefOr[Variables] = js.undefined
  var key: String
}

object AnonKey {
  @scala.inline
  def apply(key: String, filters: Variables = null): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

