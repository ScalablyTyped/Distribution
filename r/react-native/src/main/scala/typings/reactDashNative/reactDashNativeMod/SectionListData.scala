package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListData[ItemT]
  extends SectionBase[ItemT]
     with /* key */ StringDictionary[js.Any]

object SectionListData {
  @scala.inline
  def apply[ItemT](
    data: js.Array[ItemT],
    ItemSeparatorComponent: ComponentType[_] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    key: String = null,
    keyExtractor: (ItemT, /* index */ Double) => String = null,
    renderItem: /* info */ SectionListRenderItemInfo[ItemT] => ReactElement | Null = null
  ): SectionListData[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[SectionListData[ItemT]]
  }
}

