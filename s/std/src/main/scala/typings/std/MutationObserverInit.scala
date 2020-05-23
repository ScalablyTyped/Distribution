package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationObserverInit extends js.Object {
  /**
    * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
    */
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
    */
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
    */
  var attributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
    */
  var characterData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
    */
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true if mutations to target's children are to be observed.
    */
  var childList: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true if mutations to not just target, but also target's descendants are to be observed.
    */
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
    if (attributeFilter != null) __obj.updateDynamic("attributeFilter")(attributeFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(attributeOldValue)) __obj.updateDynamic("attributeOldValue")(attributeOldValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(characterData)) __obj.updateDynamic("characterData")(characterData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(characterDataOldValue)) __obj.updateDynamic("characterDataOldValue")(characterDataOldValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(childList)) __obj.updateDynamic("childList")(childList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subtree)) __obj.updateDynamic("subtree")(subtree.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationObserverInit]
  }
}

