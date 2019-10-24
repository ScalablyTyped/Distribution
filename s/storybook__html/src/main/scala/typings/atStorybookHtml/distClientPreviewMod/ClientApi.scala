package typings.atStorybookHtml.distClientPreviewMod

import typings.atStorybookAddons.distTypesMod.ClientStoryApi
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.Loadable
import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookHtml.distClientPreviewTypesMod.IStorybookSection
import typings.atStorybookHtml.distClientPreviewTypesMod.StoryFnHtmlReturnType
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi extends ClientStoryApi[StoryFnHtmlReturnType] {
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
    addDecorator: DecoratorFunction[StoryFnHtmlReturnType] => StoryApi[StoryFnHtmlReturnType],
    addParameters: Parameters => StoryApi[StoryFnHtmlReturnType],
    clearDecorators: () => Unit,
    configure: (Loadable, NodeModule) => Unit,
    forceReRender: () => Unit,
    getStorybook: () => js.Array[IStorybookSection],
    raw: () => js.Any,
    setAddon: js.Any => Unit,
    storiesOf: (String, NodeModule) => StoryApi[StoryFnHtmlReturnType]
  ): ClientApi = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
  
    __obj.asInstanceOf[ClientApi]
  }
}

