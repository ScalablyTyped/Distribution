package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsKey extends js.Object {
  var items: js.UndefOr[org.scalablytyped.runtime.StringDictionary[qlikLib.qlikMod.CustomProperty]] = js.undefined
  var uses: qlikLib.qlikLibStrings.sorting
}

object Anon_ItemsKey {
  @scala.inline
  def apply(
    uses: qlikLib.qlikLibStrings.sorting,
    items: org.scalablytyped.runtime.StringDictionary[qlikLib.qlikMod.CustomProperty] = null
  ): Anon_ItemsKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uses")(uses)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_ItemsKey]
  }
}

