package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorWithOptions[ParameterName /* <: java.lang.String */, T] extends js.Object {
  // Support for the deprecated style:
  //   .add(decorator(options)(() => <Story />)
  def apply(story: atStorybookReactLib.atStorybookReactMod.RenderFunction): js.Function1[
    /* context */ DecoratorContext[ParameterName, T], 
    stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator]
  ] = js.native
  // Support for older, but not deprecated style:
  //   .addDecorator(decorator(options))
  def apply(
    story: atStorybookReactLib.atStorybookReactMod.RenderFunction,
    context: DecoratorContext[ParameterName, T]
  ): stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator] = js.native
}

