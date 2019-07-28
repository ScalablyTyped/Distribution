package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HiveJsonSerDe extends js.Object {
  var hiveJsonSerDe: js.UndefOr[Anon_TimestampFormats] = js.undefined
  var openXJsonSerDe: js.UndefOr[Anon_CaseInsensitive] = js.undefined
}

object Anon_HiveJsonSerDe {
  @scala.inline
  def apply(hiveJsonSerDe: Anon_TimestampFormats = null, openXJsonSerDe: Anon_CaseInsensitive = null): Anon_HiveJsonSerDe = {
    val __obj = js.Dynamic.literal()
    if (hiveJsonSerDe != null) __obj.updateDynamic("hiveJsonSerDe")(hiveJsonSerDe)
    if (openXJsonSerDe != null) __obj.updateDynamic("openXJsonSerDe")(openXJsonSerDe)
    __obj.asInstanceOf[Anon_HiveJsonSerDe]
  }
}

