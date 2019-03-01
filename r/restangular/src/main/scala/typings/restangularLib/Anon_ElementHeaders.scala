package typings
package restangularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementHeaders extends js.Object {
  var element: js.Any
  var headers: js.Any
  var httpConfig: angularLib.angularMod.angularNs.IRequestShortcutConfig
  var params: js.Any
}

object Anon_ElementHeaders {
  @scala.inline
  def apply(
    element: js.Any,
    headers: js.Any,
    httpConfig: angularLib.angularMod.angularNs.IRequestShortcutConfig,
    params: js.Any
  ): Anon_ElementHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("httpConfig")(httpConfig)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_ElementHeaders]
  }
}

