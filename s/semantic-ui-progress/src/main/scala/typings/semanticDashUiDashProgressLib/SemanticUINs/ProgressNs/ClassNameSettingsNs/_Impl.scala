package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: java.lang.String
  /**
    * @default 'error'
    */
  var error: java.lang.String
  /**
    * @default 'success'
    */
  var success: java.lang.String
  /**
    * @default 'warning'
    */
  var warning: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    active: java.lang.String,
    error: java.lang.String,
    success: java.lang.String,
    warning: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[_Impl]
  }
}

