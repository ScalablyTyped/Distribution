package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn extends js.Object {
  var events: Input[js.Array[Input[String]]]
  var filterPrefix: js.UndefOr[Input[String]] = js.undefined
  var filterSuffix: js.UndefOr[Input[String]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var lambdaFunctionArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn {
  @scala.inline
  def apply(
    events: Input[js.Array[Input[String]]],
    filterPrefix: Input[String] = null,
    filterSuffix: Input[String] = null,
    id: Input[String] = null,
    lambdaFunctionArn: Input[String] = null
  ): Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lambdaFunctionArn != null) __obj.updateDynamic("lambdaFunctionArn")(lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
  }
}

