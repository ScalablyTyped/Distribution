package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn extends js.Object {
  var events: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var filterPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var filterSuffix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var lambdaFunctionArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn {
  @scala.inline
  def apply(
    events: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    filterPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    filterSuffix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lambdaFunctionArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lambdaFunctionArn != null) __obj.updateDynamic("lambdaFunctionArn")(lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
  }
}

