package typings.atStorybookAddons.atStorybookAddonsMod

import typings.atStorybookReact.atStorybookReactMod.RenderFunction
import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorator[ParameterName /* <: String */, Options, Parameters] extends js.Object {
  // Support for older styles which pass options.
  // See DecoratorWithOptions above.
  def apply(options: Options): DecoratorWithOptions[ParameterName, Parameters] = js.native
  def apply(options: Options*): DecoratorWithOptions[ParameterName, Parameters] = js.native
  // Supports newer style:
  //   .addDecorator(decorator)
  //   .add('story', () => <Story />)
  def apply(story: RenderFunction, context: DecoratorContext[ParameterName, Parameters]): ReturnType[StoryDecorator] = js.native
}

