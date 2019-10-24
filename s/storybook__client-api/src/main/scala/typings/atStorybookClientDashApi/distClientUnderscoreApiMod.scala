package typings.atStorybookClientDashApi

import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.OptionsParameter
import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookAddons.distTypesMod.StoryFn
import typings.atStorybookClientDashApi.distClientUnderscoreApiMod.ClientApi
import typings.atStorybookClientDashApi.distTypesMod.ClientApiParams
import typings.atStorybookClientDashApi.distTypesMod.StoreItem
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/client_api", JSImport.Namespace)
@js.native
object distClientUnderscoreApiMod extends js.Object {
  @js.native
  trait ClientApi extends js.Object {
    var _addons: js.Any = js.native
    var _decorateStory: js.Any = js.native
    var _globalDecorators: js.Any = js.native
    var _globalParameters: js.Any = js.native
    var _storyStore: js.Any = js.native
    def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
    def addParameters(parameters: Parameters): Unit = js.native
    def addParameters(parameters: Anon_GlobalParameter): Unit = js.native
    def clearDecorators(): Unit = js.native
    def getSeparators(): Anon_HierarchyRootSeparator with OptionsParameter = js.native
    def getStorybook(): js.Array[Anon_FileName] = js.native
    def raw(): js.Array[StoreItem] = js.native
    def setAddon(addon: js.Any): Unit = js.native
    def store(): typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default = js.native
    def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
  }
  
  @js.native
  class default protected () extends ClientApi {
    def this(hasStoryStoreDecorateStory: ClientApiParams) = this()
  }
  
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): StoryFn[_] = js.native
}

