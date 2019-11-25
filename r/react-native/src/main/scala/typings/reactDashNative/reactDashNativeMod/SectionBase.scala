package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionBase[ItemT] extends js.Object {
  var ItemSeparatorComponent: js.UndefOr[ComponentType[_] | Null] = js.undefined
  var data: js.Array[ItemT]
  var key: js.UndefOr[String] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.undefined
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.undefined
}

object SectionBase {
  @scala.inline
  def apply[ItemT](
    data: js.Array[ItemT],
    ItemSeparatorComponent: ComponentType[_] = null,
    key: String = null,
    keyExtractor: (/* item */ ItemT, /* index */ Double) => String = null,
    renderItem: /* info */ SectionListRenderItemInfo[ItemT] => ReactElement | Null = null
  ): SectionBase[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[SectionBase[ItemT]]
  }
}

