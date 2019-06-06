package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomQueryParams extends js.Object {
  var customQueryParams: atStorybookApiLib.distModulesUrlMod.QueryParams
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var dismissedVersionNotification: java.lang.String
  var lastVersionCheck: scala.Double
  var layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.Layout */ js.Any
  var location: atReachRouterLib.atReachRouterMod.WindowLocation
  var navigate: js.UndefOr[atReachRouterLib.atReachRouterMod.NavigateFn] = js.undefined
  var notifications: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/notifications.Notification */ _
  ]
  var path: java.lang.String
  var selectedPanel: java.lang.String
  var shortcuts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/shortcuts.Shortcuts */ js.Any
  var storiesConfigured: scala.Boolean
  var storiesHash: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/stories.StoriesHash */ js.Any
  var storyId: java.lang.String
  var theme: atStorybookThemingLib.distTypesMod.ThemeVars
  var ui: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.UI */ js.Any
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var versions: Anon_Current
  var viewMode: java.lang.String
}

object Anon_CustomQueryParams {
  @scala.inline
  def apply(
    customQueryParams: atStorybookApiLib.distModulesUrlMod.QueryParams,
    dismissedVersionNotification: java.lang.String,
    lastVersionCheck: scala.Double,
    layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.Layout */ js.Any,
    location: atReachRouterLib.atReachRouterMod.WindowLocation,
    notifications: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/notifications.Notification */ _
    ],
    path: java.lang.String,
    selectedPanel: java.lang.String,
    shortcuts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/shortcuts.Shortcuts */ js.Any,
    storiesConfigured: scala.Boolean,
    storiesHash: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/stories.StoriesHash */ js.Any,
    storyId: java.lang.String,
    theme: atStorybookThemingLib.distTypesMod.ThemeVars,
    ui: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/api/dist/modules/layout.UI */ js.Any,
    versions: Anon_Current,
    viewMode: java.lang.String,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    navigate: atReachRouterLib.atReachRouterMod.NavigateFn = null,
    uri: java.lang.String = null
  ): Anon_CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams, dismissedVersionNotification = dismissedVersionNotification, lastVersionCheck = lastVersionCheck, layout = layout, location = location, notifications = notifications, path = path, selectedPanel = selectedPanel, shortcuts = shortcuts, storiesConfigured = storiesConfigured, storiesHash = storiesHash, storyId = storyId, theme = theme, ui = ui, versions = versions, viewMode = viewMode)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_CustomQueryParams]
  }
}

