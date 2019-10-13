package typings.atStorybookAddons.distMakeDashDecoratorMod

import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryGetter
import typings.atStorybookAddons.distTypesMod.StoryWrapper
import typings.atStorybookAddons.distTypesMod.WrapperSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDecoratorOptions extends js.Object {
  var allowDeprecatedUsage: js.UndefOr[Boolean] = js.undefined
  var name: String
  var parameterName: String
  var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
  var wrapper: StoryWrapper
}

object MakeDecoratorOptions {
  @scala.inline
  def apply(
    name: String,
    parameterName: String,
    wrapper: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any,
    allowDeprecatedUsage: js.UndefOr[Boolean] = js.undefined,
    skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.undefined
  ): MakeDecoratorOptions = {
    val __obj = js.Dynamic.literal(name = name, parameterName = parameterName, wrapper = js.Any.fromFunction3(wrapper))
    if (!js.isUndefined(allowDeprecatedUsage)) __obj.updateDynamic("allowDeprecatedUsage")(allowDeprecatedUsage)
    if (!js.isUndefined(skipIfNoParametersOrOptions)) __obj.updateDynamic("skipIfNoParametersOrOptions")(skipIfNoParametersOrOptions)
    __obj.asInstanceOf[MakeDecoratorOptions]
  }
}

