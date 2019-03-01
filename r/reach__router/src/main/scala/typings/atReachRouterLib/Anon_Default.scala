package typings
package atReachRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[atReachRouterLib.atReachRouterMod.WindowLocation] = js.undefined
  var navigate: js.UndefOr[atReachRouterLib.atReachRouterMod.NavigateFn] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    default: js.UndefOr[scala.Boolean] = js.undefined,
    location: atReachRouterLib.atReachRouterMod.WindowLocation = null,
    navigate: atReachRouterLib.atReachRouterMod.NavigateFn = null,
    path: java.lang.String = null,
    uri: java.lang.String = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (location != null) __obj.updateDynamic("location")(location)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (path != null) __obj.updateDynamic("path")(path)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Default]
  }
}

