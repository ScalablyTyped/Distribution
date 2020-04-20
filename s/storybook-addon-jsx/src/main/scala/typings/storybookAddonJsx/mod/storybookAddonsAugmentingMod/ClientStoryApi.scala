package typings.storybookAddonJsx.mod.storybookAddonsAugmentingMod

import typings.node.NodeModule
import typings.storybookAddonJsx.AnonAddWithJSX
import typings.storybookAddonJsx.ParametersjsxAddonParamet
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStoryApi[StoryFnReturnType] extends js.Object {
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
  def addParameters(parameter: ParametersjsxAddonParamet): StoryApi[StoryFnReturnType]
  def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType] with AnonAddWithJSX[StoryFnReturnType]
}

object ClientStoryApi {
  @scala.inline
  def apply[StoryFnReturnType](
    addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
    addParameters: ParametersjsxAddonParamet => StoryApi[StoryFnReturnType],
    storiesOf: (String, NodeModule) => StoryApi[StoryFnReturnType] with AnonAddWithJSX[StoryFnReturnType]
  ): ClientStoryApi[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
  }
}

