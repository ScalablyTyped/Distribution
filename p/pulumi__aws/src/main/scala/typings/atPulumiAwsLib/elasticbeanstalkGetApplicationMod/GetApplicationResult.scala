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
  val name: java.lang.String
}

object GetApplicationResult {
  @scala.inline
  def apply(
    appversionLifecycle: atPulumiAwsLib.Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount,
    arn: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String
  ): GetApplicationResult = {
    val __obj = js.Dynamic.literal(appversionLifecycle = appversionLifecycle, arn = arn, description = description, id = id, name = name)
  
    __obj.asInstanceOf[GetApplicationResult]
  }
}

