package typings.storybookAddons.makeDecoratorMod

import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import typings.storybookAddons.typesMod.StoryWrapper
import typings.storybookAddons.typesMod.WrapperSettings
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
    if (!js.isUndefined(allowDeprecatedUsage)) __obj.updateDynamic("allowDeprecatedUsage")(allowDeprecatedUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfNoParametersOrOptions)) __obj.updateDynamic("skipIfNoParametersOrOptions")(skipIfNoParametersOrOptions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDecoratorOptions]
  }
}

