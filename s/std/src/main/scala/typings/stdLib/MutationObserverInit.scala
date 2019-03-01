package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationObserverInit extends js.Object {
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.undefined
  var attributes: js.UndefOr[scala.Boolean] = js.undefined
  var characterData: js.UndefOr[scala.Boolean] = js.undefined
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.undefined
  var childList: js.UndefOr[scala.Boolean] = js.undefined
  var subtree: js.UndefOr[scala.Boolean] = js.undefined
}

object MutationObserverInit {
  @scala.inline
  def apply(
    attributeFilter: js.Array[java.lang.String] = null,
    attributeOldValue: js.UndefOr[scala.Boolean] = js.undefined,
    attributes: js.UndefOr[scala.Boolean] = js.undefined,
    characterData: js.UndefOr[scala.Boolean] = js.undefined,
    characterDataOldValue: js.UndefOr[scala.Boolean] = js.undefined,
    childList: js.UndefOr[scala.Boolean] = js.undefined,
    subtree: js.UndefOr[scala.Boolean] = js.undefined
  ): MutationObserverInit = {
    val __obj = js.Dynamic.literal()
    if (attributeFilter != null) __obj.updateDynamic("attributeFilter")(attributeFilter)
    if (!js.isUndefined(attributeOldValue)) __obj.updateDynamic("attributeOldValue")(attributeOldValue)
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(characterData)) __obj.updateDynamic("characterData")(characterData)
    if (!js.isUndefined(characterDataOldValue)) __obj.updateDynamic("characterDataOldValue")(characterDataOldValue)
    if (!js.isUndefined(childList)) __obj.updateDynamic("childList")(childList)
    if (!js.isUndefined(subtree)) __obj.updateDynamic("subtree")(subtree)
    __obj.asInstanceOf[MutationObserverInit]
  }
}

