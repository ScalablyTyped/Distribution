package typings
package atPulumiAwsLib.pinpointAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppState extends js.Object {
  /**
    * The Application ID of the Pinpoint App.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
    */
  val campaignHook: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LambdaFunctionNameMode]] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
    */
  val limits: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DailyMaximumDuration]] = js.undefined
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Pinpoint application. Conflicts with `name`
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
    */
  val quietTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndStart]] = js.undefined
}

object AppState {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    campaignHook: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LambdaFunctionNameMode] = null,
    limits: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DailyMaximumDuration] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    quietTime: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndStart] = null
  ): AppState = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (campaignHook != null) __obj.updateDynamic("campaignHook")(campaignHook.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (quietTime != null) __obj.updateDynamic("quietTime")(quietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppState]
  }
}

