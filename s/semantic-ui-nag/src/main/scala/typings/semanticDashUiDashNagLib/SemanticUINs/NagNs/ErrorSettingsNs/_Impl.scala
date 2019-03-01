package typings
package semanticDashUiDashNagLib.SemanticUINs.NagNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default '$.cookie is not included. A storage solution is required.'
    */
  var noCookieStorage: java.lang.String
  /**
    * @default 'Neither $.cookie or store is defined. A storage solution is required for storing state'
    */
  var noStorage: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(method: java.lang.String, noCookieStorage: java.lang.String, noStorage: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("noCookieStorage")(noCookieStorage)
    __obj.updateDynamic("noStorage")(noStorage)
    __obj.asInstanceOf[_Impl]
  }
}

