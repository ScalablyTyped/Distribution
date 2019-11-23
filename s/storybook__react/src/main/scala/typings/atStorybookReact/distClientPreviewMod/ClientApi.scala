package typings.atStorybookReact.distClientPreviewMod

import typings.atStorybookAddons.distTypesMod.ClientStoryApi
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.Loadable
import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookReact.distClientPreviewTypesMod.IStorybookSection
import typings.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends ClientStoryApi[StoryFnReactReturnType] {
  def clearDecorators(): Unit
  def configure(loader: Loadable, module: NodeModule): Unit
  def forceReRender(): Unit
  def getStorybook(): js.Array[IStorybookSection]
  def raw(): js.Any
  def setAddon(addon: js.Any): Unit
}

object ClientApi {
  @scala.inline
  def apply(
    addDecorator: DecoratorFunction[StoryFnReactReturnType] => StoryApi[StoryFnReactReturnType],
    addParameters: Parameters => StoryApi[StoryFnReactReturnType],
    clearDecorators: () => Unit,
    configure: (Loadable, NodeModule) => Unit,
    forceReRender: () => Unit,
    getStorybook: () => js.Array[IStorybookSection],
    raw: () => js.Any,
    setAddon: js.Any => Unit,
    storiesOf: (String, NodeModule) => StoryApi[StoryFnReactReturnType]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
  
    __obj.asInstanceOf[ClientApi]
  }
}

