package typings.atReachRouter

import typings.atReachRouter.atReachRouterMod.NavigateFn
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
    navigate: NavigateFn = null,
    path: String = null,
    uri: String = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

