package typings
package semanticDashUiDashApiLib.SemanticUINs.ApiNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.disabled'
    */
  var disabled: java.lang.String
  /**
    * @default 'form'
    */
  var form: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(disabled: java.lang.String, form: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("form")(form)
    __obj.asInstanceOf[_Impl]
  }
}

