package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplDefaultText extends js.Object {
  var defaultText: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var placeholderText: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplDefaultText {
  @scala.inline
  def apply(
    defaultText: String = null,
    defaultValue: String = null,
    placeholderText: String = null,
    text: String = null,
    value: String = null
  ): PartialPickImplkeyofImplDefaultText = {
    val __obj = js.Dynamic.literal()
    if (defaultText != null) __obj.updateDynamic("defaultText")(defaultText.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplDefaultText]
  }
}

