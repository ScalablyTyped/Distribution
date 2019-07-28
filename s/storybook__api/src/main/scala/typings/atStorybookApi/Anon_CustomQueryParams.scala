package typings.atStorybookApi

import typings.atReachRouter.atReachRouterMod.NavigateFn
import typings.atReachRouter.atReachRouterMod.WindowLocation
import typings.atStorybookApi.distModulesUrlMod.QueryParams
import typings.atStorybookTheming.distTypesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomQueryParams extends js.Object {
  var customQueryParams: QueryParams
  var default: js.UndefOr[Boolean] = js.undefined
  var dismissedVersionNotification: String
  var lastVersionCheck: Double
  var layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.Layout */ js.Any
  var location: WindowLocation
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var notifications: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/notifications.Notification */ _
  ]
  var path: String
  var selectedPanel: String
  var shortcuts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/shortcuts.Shortcuts */ js.Any
  var storiesConfigured: Boolean
  var storiesHash: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/stories.StoriesHash */ js.Any
  var storyId: String
  var theme: ThemeVars
  var ui: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.UI */ js.Any
  var uri: js.UndefOr[String] = js.undefined
  var versions: Anon_Current
  var viewMode: String
}

object Anon_CustomQueryParams {
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    lastVersionCheck: Double,
    layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.Layout */ js.Any,
    location: WindowLocation,
    notifications: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/notifications.Notification */ _
    ],
    path: String,
    selectedPanel: String,
    shortcuts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/shortcuts.Shortcuts */ js.Any,
    storiesConfigured: Boolean,
    storiesHash: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/stories.StoriesHash */ js.Any,
    storyId: String,
    theme: ThemeVars,
    ui: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.UI */ js.Any,
    versions: Anon_Current,
    viewMode: String,
    default: js.UndefOr[Boolean] = js.undefined,
    navigate: NavigateFn = null,
    uri: String = null
  ): Anon_CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams, dismissedVersionNotification = dismissedVersionNotification, lastVersionCheck = lastVersionCheck, layout = layout, location = location, notifications = notifications, path = path, selectedPanel = selectedPanel, shortcuts = shortcuts, storiesConfigured = storiesConfigured, storiesHash = storiesHash, storyId = storyId, theme = theme, ui = ui, versions = versions, viewMode = viewMode)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_CustomQueryParams]
  }
}

