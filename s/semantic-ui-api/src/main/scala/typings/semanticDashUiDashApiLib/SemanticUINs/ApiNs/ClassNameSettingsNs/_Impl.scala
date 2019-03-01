package typings
package semanticDashUiDashApiLib.SemanticUINs.ApiNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'error'
    */
  var error: java.lang.String
  /**
    * @default 'loading'
    */
  var loading: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(error: java.lang.String, loading: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[_Impl]
  }
}

