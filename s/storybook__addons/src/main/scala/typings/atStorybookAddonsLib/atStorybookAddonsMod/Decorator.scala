package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorator[ParameterName /* <: java.lang.String */, Options, Parameters] extends js.Object {
  // Support for older styles which pass options.
  // See DecoratorWithOptions above.
  def apply(options: Options): DecoratorWithOptions[ParameterName, Parameters] = js.native
  def apply(options: Options*): DecoratorWithOptions[ParameterName, Parameters] = js.native
  // Supports newer style:
  //   .addDecorator(decorator)
  //   .add('story', () => <Story />)
  def apply(
    story: atStorybookReactLib.atStorybookReactMod.RenderFunction,
    context: DecoratorContext[ParameterName, Parameters]
  ): stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator] = js.native
}

