package typings
package atPulumiAwsLib.elasticbeanstalkApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationArgs extends js.Object {
  val appversionLifecycle: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteSourceFromS3MaxAgeInDays]
  ] = js.undefined
  /**
    * Short description of the application
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the application, must be unique within your account
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ApplicationArgs {
  @scala.inline
  def apply(
    appversionLifecycle: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteSourceFromS3MaxAgeInDays] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ApplicationArgs = {
    val __obj = js.Dynamic.literal()
    if (appversionLifecycle != null) __obj.updateDynamic("appversionLifecycle")(appversionLifecycle.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationArgs]
  }
}

