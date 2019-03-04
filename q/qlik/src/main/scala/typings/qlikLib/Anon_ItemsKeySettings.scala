package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsKeySettings extends js.Object {
  var items: js.UndefOr[org.scalablytyped.runtime.StringDictionary[qlikLib.qlikMod.CustomProperty]] = js.undefined
  var uses: qlikLib.qlikLibStrings.settings
}

object Anon_ItemsKeySettings {
  @scala.inline
  def apply(
    uses: qlikLib.qlikLibStrings.settings,
    items: org.scalablytyped.runtime.StringDictionary[qlikLib.qlikMod.CustomProperty] = null
  ): Anon_ItemsKeySettings = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_ItemsKeySettings]
  }
}

