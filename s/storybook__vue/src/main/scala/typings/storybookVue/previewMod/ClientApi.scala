package typings.storybookVue.previewMod

import typings.node.NodeModule
import typings.storybookAddons.typesMod.ClientStoryApi
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookVue.typesMod.IStorybookSection
import typings.storybookVue.typesMod.StoryFnVueReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends ClientStoryApi[StoryFnVueReturnType] {
  def clearDecorators(): Unit
  def configure(loader: Loadable, module: NodeModule): Unit
  def forceReRender(): Unit
  def getStorybook(): js.Array[IStorybookSection]
  def load(args: js.Any*): Unit
  def raw(): js.Any
  def setAddon(addon: js.Any): Unit
}

object ClientApi {
  @scala.inline
  def apply(
    addDecorator: DecoratorFunction[StoryFnVueReturnType] => StoryApi[StoryFnVueReturnType],
    addParameters: Parameters => StoryApi[StoryFnVueReturnType],
    clearDecorators: () => Unit,
    configure: (Loadable, NodeModule) => Unit,
    forceReRender: () => Unit,
    getStorybook: () => js.Array[IStorybookSection],
    load: /* repeated */ js.Any => Unit,
    raw: () => js.Any,
    setAddon: js.Any => Unit,
    storiesOf: (String, NodeModule) => StoryApi[StoryFnVueReturnType]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), load = js.Any.fromFunction1(load), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientApi]
  }
}

