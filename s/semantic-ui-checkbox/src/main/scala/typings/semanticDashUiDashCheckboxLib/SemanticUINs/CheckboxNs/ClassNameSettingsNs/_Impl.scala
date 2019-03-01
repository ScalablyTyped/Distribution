package typings
package semanticDashUiDashCheckboxLib.SemanticUINs.CheckboxNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'checked'
    */
  var checked: java.lang.String
  /**
    * @default 'disabled'
    */
  var disabled: java.lang.String
  /**
    * @default 'radio'
    */
  var radio: java.lang.String
  /**
    * @default 'read-only'
    */
  var readOnly: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    checked: java.lang.String,
    disabled: java.lang.String,
    radio: java.lang.String,
    readOnly: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("radio")(radio)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[_Impl]
  }
}

