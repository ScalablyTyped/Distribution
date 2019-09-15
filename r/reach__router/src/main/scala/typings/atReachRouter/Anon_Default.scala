package typings.atReachRouter

import typings.atReachRouter.atReachRouterMod.NavigateFn
import typings.atReachRouter.atReachRouterMod.NavigateOptions
import typings.atReachRouter.atReachRouterMod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[WindowLocation] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    default: js.UndefOr[Boolean] = js.undefined,
    location: WindowLocation = null,
    navigate: (/* to */ String, /* options */ js.UndefOr[NavigateOptions[js.Object]]) => Unit = null,
    path: String = null,
    uri: String = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (location != null) __obj.updateDynamic("location")(location)
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction2(navigate))
    if (path != null) __obj.updateDynamic("path")(path)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Default]
  }
}

