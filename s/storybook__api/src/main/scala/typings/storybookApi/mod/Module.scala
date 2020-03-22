package typings.storybookApi.mod

import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.storybookApi.storeMod.default
import typings.storybookApi.storybookApiStrings.development
import typings.storybookApi.storybookApiStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api.StoreData & @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & {  mode ? :'production' | 'development',   state  :@storybook/api.@storybook/api.State} */
trait Module extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[WindowLocation] = js.undefined
  var mode: js.UndefOr[production | development] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var provider: typings.storybookApi.initProviderApiMod.Provider
  var state: State
  var store: default
  var storyId: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
}

object Module {
  @scala.inline
  def apply(
    provider: typings.storybookApi.initProviderApiMod.Provider,
    state: State,
    store: default,
    default: js.UndefOr[Boolean] = js.undefined,
    location: WindowLocation = null,
    mode: production | development = null,
    navigate: NavigateFn = null,
    path: String = null,
    storyId: String = null,
    uri: String = null,
    viewMode: String = null
  ): Module = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

