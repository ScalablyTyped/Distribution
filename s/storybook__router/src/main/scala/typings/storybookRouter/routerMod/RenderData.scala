package typings.storybookRouter.routerMod

import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @reach/router.@reach/router.RouteComponentProps<{}> & @storybook/router.@storybook/router/dist/router.Other */
trait RenderData extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[WindowLocation] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var storyId: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
}

object RenderData {
  @scala.inline
  def apply(
    default: js.UndefOr[Boolean] = js.undefined,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    path: String = null,
    storyId: String = null,
    uri: String = null,
    viewMode: String = null
  ): RenderData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderData]
  }
}

