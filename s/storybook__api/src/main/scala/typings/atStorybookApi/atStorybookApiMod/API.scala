package typings.atStorybookApi.atStorybookApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookApi.Anon_Filename
import typings.atStorybookApi.Anon_Path
import typings.atStorybookApi.distModulesAddonsMod.Collection
import typings.atStorybookApi.distModulesAddonsMod.Types
import typings.atStorybookApi.distModulesLayoutMod.PanelPositions
import typings.atStorybookApi.distModulesNotificationsMod.Notification
import typings.atStorybookApi.distModulesShortcutsMod.Action
import typings.atStorybookApi.distModulesShortcutsMod.Event
import typings.atStorybookApi.distModulesShortcutsMod.KeyCollection
import typings.atStorybookApi.distModulesShortcutsMod.Shortcuts
import typings.atStorybookApi.distModulesStoriesMod.Direction
import typings.atStorybookApi.distModulesStoriesMod.Group
import typings.atStorybookApi.distModulesStoriesMod.ParameterName
import typings.atStorybookApi.distModulesStoriesMod.StoriesRaw
import typings.atStorybookApi.distModulesStoriesMod.Story
import typings.atStorybookApi.distModulesStoriesMod.StoryId
import typings.atStorybookApi.distModulesUrlMod.QueryParams
import typings.atStorybookApi.distModulesVersionsMod.Version
import typings.atStorybookApi.distStoreMod.Options
import typings.atStorybookChannels.atStorybookChannelsMod.Channel
import typings.atStorybookChannels.atStorybookChannelsMod.Listener
import typings.react.reactMod.ReactElement
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
  def emit(`type`: String, args: js.Any*): Unit = js.native
  def getAddonState[S](addonId: String): S = js.native
  def getChannel(): Channel = js.native
  def getCurrentParameter[S](): S = js.native
  def getCurrentParameter[S](parameterName: ParameterName): S = js.native
  def getCurrentStoryData(): Story | Group = js.native
  def getCurrentVersion(): Version = js.native
  def getData(storyId: StoryId): Story | Group = js.native
  def getElements(`type`: Types): Collection = js.native
  def getLatestVersion(): Version = js.native
  def getPanels(): Collection = js.native
  def getParameters(storyId: StoryId): Anon_Filename | js.Any = js.native
  def getParameters(storyId: StoryId, parameterName: ParameterName): Anon_Filename | js.Any = js.native
  def getQueryParam(key: String): js.UndefOr[String] = js.native
  def getSelectedPanel(): String = js.native
  def getShortcutKeys(): Shortcuts = js.native
  def getStoryPanels(): Collection = js.native
  def getUrlState(): Anon_Path = js.native
  def handleKeydownEvent(api: API, event: Event): Unit = js.native
  def handleShortcutFeature(api: API, feature: Action): Unit = js.native
  def jumpToComponent(direction: Direction): Unit = js.native
  def jumpToStory(direction: Direction): Unit = js.native
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
  def setAddonState[S](addonId: String, newStateOrMerger: typings.atStorybookApi.distModulesAddonsMod.StateMerger[S]): js.Promise[S] = js.native
  def setAddonState[S](
    addonId: String,
    newStateOrMerger: typings.atStorybookApi.distModulesAddonsMod.StateMerger[S],
    options: Options
  ): js.Promise[S] = js.native
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

