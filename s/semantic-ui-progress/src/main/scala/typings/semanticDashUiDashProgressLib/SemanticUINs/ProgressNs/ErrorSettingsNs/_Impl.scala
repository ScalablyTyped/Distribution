package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default 'Progress value is non numeric'
    */
  var nonNumeric: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(method: java.lang.String, nonNumeric: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("nonNumeric")(nonNumeric)
    __obj.asInstanceOf[_Impl]
  }
}

