package typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'defaultText'
    */
  var defaultText: String
  /**
    * @default 'defaultValue'
    */
  var defaultValue: String
  /**
    * @default 'placeholderText'
    */
  var placeholderText: String
  /**
    * @default 'text'
    */
  var text: String
  /**
    * @default 'value'
    */
  var value: String
}

object Impl {
  @scala.inline
  def apply(defaultText: String, defaultValue: String, placeholderText: String, text: String, value: String): Impl = {
    val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], placeholderText = placeholderText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

