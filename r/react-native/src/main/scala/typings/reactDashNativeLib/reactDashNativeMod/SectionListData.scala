package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListData[ItemT]
  extends SectionBase[ItemT]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object SectionListData {
  @scala.inline
  def apply[ItemT](
    data: js.Array[ItemT],
    ItemSeparatorComponent: reactLib.reactMod.ReactNs.ComponentType[_] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null,
    keyExtractor: (ItemT, /* index */ scala.Double) => java.lang.String = null,
    renderItem: SectionListRenderItem[ItemT] = null
  ): SectionListData[ItemT] = {
    val __obj = js.Dynamic.literal(data = data)
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (renderItem != null) __obj.updateDynamic("renderItem")(renderItem)
    __obj.asInstanceOf[SectionListData[ItemT]]
  }
}

