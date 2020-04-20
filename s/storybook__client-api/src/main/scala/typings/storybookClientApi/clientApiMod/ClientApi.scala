package typings.storybookClientApi.clientApiMod

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookClientApi.AnonFileName
import typings.storybookClientApi.AnonHierarchyRootSeparator
import typings.storybookClientApi.AnonHierarchySeparator
import typings.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends js.Object {
  var _addons: js.Any
  var _decorateStory: js.Any
  var _storyStore: js.Any
  def addDecorator(decorator: DecoratorFunction[_]): Unit
  def addParameters(parameters: Parameters): Unit
  def clearDecorators(): Unit
  def clearParameters(): Unit
  def getSeparators(): AnonHierarchyRootSeparator | AnonHierarchySeparator
  def getStorybook(): js.Array[AnonFileName]
  def raw(): js.Array[StoreItem]
  def setAddon(addon: js.Any): Unit
  def store(): typings.storybookClientApi.storyStoreMod.default
  def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType]
}

object ClientApi {
  @scala.inline
  def apply(
    _addons: js.Any,
    _decorateStory: js.Any,
    _storyStore: js.Any,
    addDecorator: DecoratorFunction[_] => Unit,
    addParameters: Parameters => Unit,
    clearDecorators: () => Unit,
    clearParameters: () => Unit,
    getSeparators: () => AnonHierarchyRootSeparator | AnonHierarchySeparator,
    getStorybook: () => js.Array[AnonFileName],
    raw: () => js.Array[StoreItem],
    setAddon: js.Any => Unit,
    store: () => typings.storybookClientApi.storyStoreMod.default,
    storiesOf: (String, NodeModule) => StoryApi[js.Any]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(_addons = _addons.asInstanceOf[js.Any], _decorateStory = _decorateStory.asInstanceOf[js.Any], _storyStore = _storyStore.asInstanceOf[js.Any], addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), clearParameters = js.Any.fromFunction0(clearParameters), getSeparators = js.Any.fromFunction0(getSeparators), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), store = js.Any.fromFunction0(store), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientApi]
  }
}

