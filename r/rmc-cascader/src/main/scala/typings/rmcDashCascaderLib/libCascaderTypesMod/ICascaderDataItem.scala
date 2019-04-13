package typings
package rmcDashCascaderLib.libCascaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICascaderDataItem extends js.Object {
  var children: js.UndefOr[js.Array[ICascaderDataItem]] = js.undefined
  var label: reactLib.reactMod.ReactNode
  var value: CascaderOneValue
}

object ICascaderDataItem {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNode,
    value: CascaderOneValue,
    children: js.Array[ICascaderDataItem] = null
  ): ICascaderDataItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ICascaderDataItem]
  }
}

