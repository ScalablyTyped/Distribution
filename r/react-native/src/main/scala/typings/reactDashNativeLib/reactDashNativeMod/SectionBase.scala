package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionBase[ItemT] extends js.Object {
  var ItemSeparatorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_] | scala.Null] = js.undefined
  var data: js.Array[ItemT]
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ scala.Double, java.lang.String]] = js.undefined
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.undefined
}

object SectionBase {
  @scala.inline
  def apply[ItemT](
    data: js.Array[ItemT],
    ItemSeparatorComponent: reactLib.reactMod.ReactNs.ComponentType[_] = null,
    key: java.lang.String = null,
    keyExtractor: (/* item */ ItemT, /* index */ scala.Double) => java.lang.String = null,
    renderItem: SectionListRenderItem[ItemT] = null
  ): SectionBase[ItemT] = {
    val __obj = js.Dynamic.literal(data = data)
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (renderItem != null) __obj.updateDynamic("renderItem")(renderItem)
    __obj.asInstanceOf[SectionBase[ItemT]]
  }
}

