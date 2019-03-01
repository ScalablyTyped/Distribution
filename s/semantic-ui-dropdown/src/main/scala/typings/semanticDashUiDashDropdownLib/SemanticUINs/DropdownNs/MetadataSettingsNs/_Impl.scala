package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.MetadataSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'defaultText'
    */
  var defaultText: java.lang.String
  /**
    * @default 'defaultValue'
    */
  var defaultValue: java.lang.String
  /**
    * @default 'placeholderText'
    */
  var placeholderText: java.lang.String
  /**
    * @default 'text'
    */
  var text: java.lang.String
  /**
    * @default 'value'
    */
  var value: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    defaultText: java.lang.String,
    defaultValue: java.lang.String,
    placeholderText: java.lang.String,
    text: java.lang.String,
    value: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultText")(defaultText)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("placeholderText")(placeholderText)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[_Impl]
  }
}

