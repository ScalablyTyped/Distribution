package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Policy.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolicy extends js.Object {
  /** Policy entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.undefined
  /** Policy name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IPolicy {
  @scala.inline
  def apply(
    entries: js.UndefOr[Null | js.Array[IEntry]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicy]
  }
}

