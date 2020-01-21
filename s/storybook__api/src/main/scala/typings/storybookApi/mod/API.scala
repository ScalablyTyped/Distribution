package typings.storybookApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reachRouter.mod.NavigateOptions
import typings.react.mod.ReactElement
import typings.storybookApi.AnonFilename
import typings.storybookApi.AnonPath
import typings.storybookApi.addonsMod.Collection
import typings.storybookApi.addonsMod.Types_
import typings.storybookApi.layoutMod.PanelPositions
import typings.storybookApi.notificationsMod.Notification
import typings.storybookApi.shortcutsMod.Action
import typings.storybookApi.shortcutsMod.Event
import typings.storybookApi.shortcutsMod.KeyCollection
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookApi.storeMod.Options
import typings.storybookApi.storiesMod.Direction
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.ParameterName
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storiesMod.Story
import typings.storybookApi.storiesMod.StoryId
import typings.storybookApi.urlMod.QueryParams
import typings.storybookApi.versionsMod.Version
import typings.storybookChannels.mod.Channel
import typings.storybookChannels.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api/dist/modules/addons.SubAPI & @storybook/api.@storybook/api/dist/modules/channel.SubAPI & @storybook/api.@storybook/api/dist/init-provider-api.SubAPI & @storybook/api.@storybook/api/dist/modules/stories.SubAPI & @storybook/api.@storybook/api/dist/modules/layout.SubAPI & @storybook/api.@storybook/api/dist/modules/notifications.SubAPI & @storybook/api.@storybook/api/dist/modules/shortcuts.SubAPI & @storybook/api.@storybook/api/dist/modules/versions.SubAPI & @storybook/api.@storybook/api/dist/modules/url.SubAPI & @storybook/api.@storybook/api.OtherAPI */
@js.native
trait API
  extends /* key */ StringDictionary[js.Any] {
  var renderPreview: js.UndefOr[js.Function0[ReactElement]] = js.native
  var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
  def addNotification(notification: Notification): Unit = js.native
  def clearNotification(id: String): Unit = js.native
  def collapseAll(): Unit = js.native
  def emit(`type`: String, args: js.Any*): Unit = js.native
  def expandAll(): Unit = js.native
  def getAddonState[S](addonId: String): S = js.native
  def getChannel(): Channel = js.native
  def getCurrentParameter[S](): S = js.native
  def getCurrentParameter[S](parameterName: ParameterName): S = js.native
  def getCurrentStoryData(): Story | Group = js.native
  def getCurrentVersion(): Version = js.native
  def getData(storyId: StoryId): Story | Group = js.native
  def getElements(`type`: Types_): Collection = js.native
  def getLatestVersion(): Version = js.native
  def getPanels(): Collection = js.native
  def getParameters(storyId: StoryId): AnonFilename | js.Any = js.native
  def getParameters(storyId: StoryId, parameterName: ParameterName): AnonFilename | js.Any = js.native
  def getQueryParam(key: String): js.UndefOr[String] = js.native
  def getSelectedPanel(): String = js.native
  def getShortcutKeys(): Shortcuts = js.native
  def getStoryPanels(): Collection = js.native
  def getUrlState(): AnonPath = js.native
  def handleKeydownEvent(api: API, event: Event): Unit = js.native
  def handleShortcutFeature(api: API, feature: Action): Unit = js.native
  def jumpToComponent(direction: Direction): Unit = js.native
  def jumpToStory(direction: Direction): Unit = js.native
  def navigateUrl(url: String, options: NavigateOptions[js.Object]): Unit = js.native
  def off(`type`: String, cb: Listener): Unit = js.native
  def on(`type`: String, cb: Listener): js.Function0[Unit] = js.native
  def on(`type`: String, cb: Listener, peer: Boolean): js.Function0[Unit] = js.native
  def onStory(cb: Listener): Unit = js.native
  def once(`type`: String, cb: Listener): Unit = js.native
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts] = js.native
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection] = js.native
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def selectStory(kindOrId: String, story: String, obj: js.Any): Unit = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: S): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: S, options: Options): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: typings.storybookApi.addonsMod.StateMerger[S]): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: typings.storybookApi.addonsMod.StateMerger[S], options: Options): js.Promise[S] = js.native
  def setOptions(options: js.Any): Unit = js.native
  def setQueryParams(input: QueryParams): Unit = js.native
  def setSelectedPanel(panelName: String): Unit = js.native
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection] = js.native
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts] = js.native
  def setStories(stories: StoriesRaw): Unit = js.native
  def toggleFullscreen(): Unit = js.native
  def toggleFullscreen(toggled: Boolean): Unit = js.native
  def toggleNav(): Unit = js.native
  def toggleNav(toggled: Boolean): Unit = js.native
  def togglePanel(): Unit = js.native
  def togglePanel(toggled: Boolean): Unit = js.native
  def togglePanelPosition(): Unit = js.native
  def togglePanelPosition(position: PanelPositions): Unit = js.native
  def toggleToolbar(): Unit = js.native
  def toggleToolbar(toggled: Boolean): Unit = js.native
  def versionUpdateAvailable(): Boolean = js.native
}

