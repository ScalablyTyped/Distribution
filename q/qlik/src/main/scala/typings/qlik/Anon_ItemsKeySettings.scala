package typings.qlik

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikMod.CustomProperty
import typings.qlik.qlikStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsKeySettings extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var uses: settings
}

object Anon_ItemsKeySettings {
  @scala.inline
  def apply(uses: settings, items: StringDictionary[CustomProperty] = null): Anon_ItemsKeySettings = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_ItemsKeySettings]
  }
}

