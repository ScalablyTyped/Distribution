package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var filters: js.UndefOr[Variables] = js.undefined
  var key: String
}

object Key {
  @scala.inline
  def apply(key: String, filters: Variables = null): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

