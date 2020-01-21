package typings.storybookClientApi.clientApiMod

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookClientApi.AnonFileName
import typings.storybookClientApi.AnonHierarchyRootSeparator
import typings.storybookClientApi.AnonHierarchyRootSeparatorHierarchySeparator
import typings.storybookClientApi.typesMod.ClientApiParams
import typings.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/client_api", JSImport.Default)
@js.native
class default protected () extends ClientApi {
  def this(hasStoryStoreDecorateStory: ClientApiParams) = this()
  /* CompleteClass */
  override var _addons: js.Any = js.native
  /* CompleteClass */
  override var _decorateStory: js.Any = js.native
  /* CompleteClass */
  override var _storyStore: js.Any = js.native
  /* CompleteClass */
  override def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  /* CompleteClass */
  override def addParameters(parameters: Parameters): Unit = js.native
  /* CompleteClass */
  override def clearDecorators(): Unit = js.native
  /* CompleteClass */
  override def clearParameters(): Unit = js.native
  /* CompleteClass */
  override def getSeparators(): AnonHierarchyRootSeparator | AnonHierarchyRootSeparatorHierarchySeparator = js.native
  /* CompleteClass */
  override def getStorybook(): js.Array[AnonFileName] = js.native
  /* CompleteClass */
  override def raw(): js.Array[StoreItem] = js.native
  /* CompleteClass */
  override def setAddon(addon: js.Any): Unit = js.native
  /* CompleteClass */
  override def store(): typings.storybookClientApi.storyStoreMod.default = js.native
  /* CompleteClass */
  override def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
}

