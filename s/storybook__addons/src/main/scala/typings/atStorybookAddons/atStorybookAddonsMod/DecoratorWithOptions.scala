package typings.atStorybookAddons.atStorybookAddonsMod

import typings.atStorybookReact.atStorybookReactMod.RenderFunction
import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorWithOptions[ParameterName /* <: String */, T] extends js.Object {
  // Support for the deprecated style:
  //   .add(decorator(options)(() => <Story />)
  def apply(story: RenderFunction): js.Function1[/* context */ DecoratorContext[ParameterName, T], ReturnType[StoryDecorator]] = js.native
  // Support for older, but not deprecated style:
  //   .addDecorator(decorator(options))
  def apply(story: RenderFunction, context: DecoratorContext[ParameterName, T]): ReturnType[StoryDecorator] = js.native
}

