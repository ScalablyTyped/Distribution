package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDecoratorOptions[ParameterName /* <: java.lang.String */, Options, Parameters] extends js.Object {
  var allowDeprecatedUsage: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var parameterName: ParameterName
  var skipIfNoParametersOrOptions: js.UndefOr[scala.Boolean] = js.undefined
  var wrapper: Wrapper[Options, Parameters]
}

object MakeDecoratorOptions {
  @scala.inline
  def apply[ParameterName /* <: java.lang.String */, Options, Parameters](
    name: java.lang.String,
    parameterName: ParameterName,
    wrapper: Wrapper[Options, Parameters],
    allowDeprecatedUsage: js.UndefOr[scala.Boolean] = js.undefined,
    skipIfNoParametersOrOptions: js.UndefOr[scala.Boolean] = js.undefined
  ): MakeDecoratorOptions[ParameterName, Options, Parameters] = {
    val __obj = js.Dynamic.literal(name = name, parameterName = parameterName.asInstanceOf[js.Any], wrapper = wrapper)
    if (!js.isUndefined(allowDeprecatedUsage)) __obj.updateDynamic("allowDeprecatedUsage")(allowDeprecatedUsage)
    if (!js.isUndefined(skipIfNoParametersOrOptions)) __obj.updateDynamic("skipIfNoParametersOrOptions")(skipIfNoParametersOrOptions)
    __obj.asInstanceOf[MakeDecoratorOptions[ParameterName, Options, Parameters]]
  }
}

