package typings.atStorybookReactDashNative

import typings.atStorybookClientDashApi.atStorybookClientDashApiMod.ClientApi
import typings.atStorybookClientDashApi.atStorybookClientDashApiMod.StoryStore
import typings.atStorybookClientDashApi.distTypesMod.StoreItem
import typings.atStorybookReactDashNative.distPreviewComponentsSharedThemeMod.EmotionProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview", JSImport.Namespace)
@js.native
object distPreviewMod extends js.Object {
  @js.native
  trait Preview extends js.Object {
    var _addons: js.Any = js.native
    var _asyncStorageStoryId: String = js.native
    var _clientApi: ClientApi = js.native
    var _decorators: js.Array[_] = js.native
    var _stories: StoryStore = js.native
    def _checkStory(storyId: String): StoreItem = js.native
    def _getInitialStory(initialSelection: js.Any): js.Function0[js.Promise[StoreItem]] = js.native
    def _getInitialStory(initialSelection: js.Any, shouldPersistSelection: Boolean): js.Function0[js.Promise[StoreItem]] = js.native
    def _getStory(storyId: String): StoreItem = js.native
    def _selectStory(story: js.Any): Unit = js.native
    def _selectStoryEvent(hasStoryId: Anon_StoryId): Unit = js.native
    def _sendSetStories(): Unit = js.native
    def _setInitialStory(initialSelection: js.Any): js.Promise[Unit] = js.native
    def _setInitialStory(initialSelection: js.Any, shouldPersistSelection: Boolean): js.Promise[Unit] = js.native
    def api(): ClientApi = js.native
    def configure(loadStories: js.Function0[Unit], module: js.Any): Unit = js.native
    def getStorybookUI(): Anon_Context = js.native
    def getStorybookUI(params: Partial[Params]): Anon_Context = js.native
  }
  
  @js.native
  class default () extends Preview
  
  type Params = Anon_DisableWebsockets with EmotionProps
}

