package typings
package atPulumiAwsLib.elasticbeanstalkGetApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationResult extends js.Object {
  val appversionLifecycle: atPulumiAwsLib.Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  val arn: java.lang.String
  /**
    * Short description of the application
    */
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetApplicationResult {
  @scala.inline
  def apply(
    appversionLifecycle: atPulumiAwsLib.Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount,
    arn: java.lang.String,
    description: java.lang.String,
    id: java.lang.String
  ): GetApplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appversionLifecycle")(appversionLifecycle)
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetApplicationResult]
  }
}

