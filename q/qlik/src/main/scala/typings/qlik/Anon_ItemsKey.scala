package typings.qlik

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikMod.CustomProperty
import typings.qlik.qlikStrings.sorting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsKey extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var uses: sorting
}

object Anon_ItemsKey {
  @scala.inline
  def apply(uses: sorting, items: StringDictionary[CustomProperty] = null): Anon_ItemsKey = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_ItemsKey]
  }
}

