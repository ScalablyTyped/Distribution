package typings.reachRouter.anon

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[WindowLocation[LocationState]] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Default {
  @scala.inline
  def apply(
    default: js.UndefOr[Boolean] = js.undefined,
    location: WindowLocation[LocationState] = null,
    navigate: NavigateFn = null,
    path: String = null,
    uri: String = null
  ): Default = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

