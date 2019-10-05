package typings.atStorybookAddons.atStorybookAddonsMod

import typings.atStorybookAddons.Anon_Options
import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDecoratorOptions[ParameterName /* <: String */, Options, Parameters] extends js.Object {
  var allowDeprecatedUsage: js.UndefOr[Boolean] = js.undefined
  var name: String
  var parameterName: ParameterName
  var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
  var wrapper: Wrapper[Options, Parameters]
}

object MakeDecoratorOptions {
  @scala.inline
  def apply[ParameterName /* <: String */, Options, Parameters](
    name: String,
    parameterName: ParameterName,
    wrapper: (/* getStory */ GetStoryFunc, /* context */ Context, /* optsAndParams */ Anon_Options[Options, Parameters]) => ReturnType[StoryDecorator],
    allowDeprecatedUsage: js.UndefOr[Boolean] = js.undefined,
    skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
  ): MakeDecoratorOptions[ParameterName, Options, Parameters] = {
    val __obj = js.Dynamic.literal(name = name, parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
    if (!js.isUndefined(allowDeprecatedUsage)) __obj.updateDynamic("allowDeprecatedUsage")(allowDeprecatedUsage)
    if (!js.isUndefined(skipIfNoParametersOrOptions)) __obj.updateDynamic("skipIfNoParametersOrOptions")(skipIfNoParametersOrOptions)
    __obj.asInstanceOf[MakeDecoratorOptions[ParameterName, Options, Parameters]]
  }
}

