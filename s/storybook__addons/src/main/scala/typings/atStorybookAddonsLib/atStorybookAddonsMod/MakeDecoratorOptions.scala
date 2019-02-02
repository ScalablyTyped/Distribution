package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeDecoratorOptions[ParameterName /* <: java.lang.String */, Options, Parameters] extends js.Object {
  var allowDeprecatedUsage: js.UndefOr[scala.Boolean] = js.native
  var name: java.lang.String = js.native
  var parameterName: ParameterName = js.native
  var skipIfNoParametersOrOptions: js.UndefOr[scala.Boolean] = js.native
  @JSName("wrapper")
  var wrapper_Original: Wrapper[Options, Parameters] = js.native
  def wrapper(
    getStory: GetStoryFunc,
    context: Context,
    optsAndParams: atStorybookAddonsLib.Anon_Options[Options, Parameters]
  ): stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator] = js.native
}

