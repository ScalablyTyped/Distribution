package typings.sawtoothSdk.protobufMod.Policy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Entry. */
trait IEntry extends js.Object {
  /** Entry key */
  var key: js.UndefOr[String | Null] = js.undefined
  /** Entry type */
  var `type`: js.UndefOr[EntryType | Null] = js.undefined
}

object IEntry {
  @scala.inline
  def apply(key: js.UndefOr[Null | String] = js.undefined, `type`: js.UndefOr[Null | EntryType] = js.undefined): IEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntry]
  }
}

