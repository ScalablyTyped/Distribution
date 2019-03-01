package typings
package rangyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangyClassApplierOptions extends js.Object {
  var applyToEditableOnly: js.UndefOr[scala.Boolean] = js.undefined
  var elementAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var elementProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var elementTagName: js.UndefOr[java.lang.String] = js.undefined
  var ignoreWhiteSpace: js.UndefOr[scala.Boolean] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var onElementCreate: js.UndefOr[
    js.Function2[/* element */ stdLib.Element, /* classApplier */ RangyClassApplier, scala.Unit]
  ] = js.undefined
  var tagNames: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var useExistingElements: js.UndefOr[scala.Boolean] = js.undefined
}

object RangyClassApplierOptions {
  @scala.inline
  def apply(
    applyToEditableOnly: js.UndefOr[scala.Boolean] = js.undefined,
    elementAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    elementProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    elementTagName: java.lang.String = null,
    ignoreWhiteSpace: js.UndefOr[scala.Boolean] = js.undefined,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    onElementCreate: js.Function2[/* element */ stdLib.Element, /* classApplier */ RangyClassApplier, scala.Unit] = null,
    tagNames: java.lang.String | js.Array[java.lang.String] = null,
    useExistingElements: js.UndefOr[scala.Boolean] = js.undefined
  ): RangyClassApplierOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToEditableOnly)) __obj.updateDynamic("applyToEditableOnly")(applyToEditableOnly)
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes)
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (elementTagName != null) __obj.updateDynamic("elementTagName")(elementTagName)
    if (!js.isUndefined(ignoreWhiteSpace)) __obj.updateDynamic("ignoreWhiteSpace")(ignoreWhiteSpace)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (onElementCreate != null) __obj.updateDynamic("onElementCreate")(onElementCreate)
    if (tagNames != null) __obj.updateDynamic("tagNames")(tagNames.asInstanceOf[js.Any])
    if (!js.isUndefined(useExistingElements)) __obj.updateDynamic("useExistingElements")(useExistingElements)
    __obj.asInstanceOf[RangyClassApplierOptions]
  }
}

