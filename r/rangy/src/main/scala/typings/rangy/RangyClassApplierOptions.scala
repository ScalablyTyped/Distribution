package typings.rangy

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangyClassApplierOptions extends js.Object {
  var applyToEditableOnly: js.UndefOr[Boolean] = js.undefined
  var elementAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var elementProperties: js.UndefOr[StringDictionary[String]] = js.undefined
  var elementTagName: js.UndefOr[String] = js.undefined
  var ignoreWhiteSpace: js.UndefOr[Boolean] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
  var onElementCreate: js.UndefOr[js.Function2[/* element */ Element, /* classApplier */ RangyClassApplier, Unit]] = js.undefined
  var tagNames: js.UndefOr[String | js.Array[String]] = js.undefined
  var useExistingElements: js.UndefOr[Boolean] = js.undefined
}

object RangyClassApplierOptions {
  @scala.inline
  def apply(
    applyToEditableOnly: js.UndefOr[Boolean] = js.undefined,
    elementAttributes: StringDictionary[String] = null,
    elementProperties: StringDictionary[String] = null,
    elementTagName: String = null,
    ignoreWhiteSpace: js.UndefOr[Boolean] = js.undefined,
    normalize: js.UndefOr[Boolean] = js.undefined,
    onElementCreate: (/* element */ Element, /* classApplier */ RangyClassApplier) => Unit = null,
    tagNames: String | js.Array[String] = null,
    useExistingElements: js.UndefOr[Boolean] = js.undefined
  ): RangyClassApplierOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToEditableOnly)) __obj.updateDynamic("applyToEditableOnly")(applyToEditableOnly.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (elementTagName != null) __obj.updateDynamic("elementTagName")(elementTagName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhiteSpace)) __obj.updateDynamic("ignoreWhiteSpace")(ignoreWhiteSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (onElementCreate != null) __obj.updateDynamic("onElementCreate")(js.Any.fromFunction2(onElementCreate))
    if (tagNames != null) __obj.updateDynamic("tagNames")(tagNames.asInstanceOf[js.Any])
    if (!js.isUndefined(useExistingElements)) __obj.updateDynamic("useExistingElements")(useExistingElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangyClassApplierOptions]
  }
}

