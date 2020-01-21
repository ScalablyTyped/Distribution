package typings.storybookApi.mod

import typings.reachRouter.mod.NavigateFn
import typings.react.mod.Component
import typings.storybookApi.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api.Children & @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & @storybook/api.@storybook/api.DocsModeData */
trait Props extends js.Object {
  var children: (Component[js.Object, js.Object, _]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object, _]])
  var default: js.UndefOr[Boolean] = js.undefined
  var docsMode: Boolean
  var location: js.UndefOr[WindowLocation] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var provider: typings.storybookApi.initProviderApiMod.Provider
  var storyId: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: (Component[js.Object, js.Object, _]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object, _]]),
    docsMode: Boolean,
    provider: typings.storybookApi.initProviderApiMod.Provider,
    default: js.UndefOr[Boolean] = js.undefined,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    path: String = null,
    storyId: String = null,
    uri: String = null,
    viewMode: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], docsMode = docsMode.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

