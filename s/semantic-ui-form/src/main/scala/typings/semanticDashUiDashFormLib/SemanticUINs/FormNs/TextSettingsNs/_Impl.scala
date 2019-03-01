package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs.TextSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'This field'
    */
  var unspecifiedField: java.lang.String
  /**
    * @default 'Please enter a valid value'
    */
  var unspecifiedRule: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(unspecifiedField: java.lang.String, unspecifiedRule: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unspecifiedField")(unspecifiedField)
    __obj.updateDynamic("unspecifiedRule")(unspecifiedRule)
    __obj.asInstanceOf[_Impl]
  }
}

