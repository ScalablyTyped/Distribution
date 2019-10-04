package typings.atPulumiAws.elasticbeanstalkGetApplicationMod

import typings.atPulumiAws.typesOutputMod.elasticbeanstalkNs.GetApplicationAppversionLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationResult extends js.Object {
  val appversionLifecycle: GetApplicationAppversionLifecycle
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  val arn: String
  /**
    * Short description of the application
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
}

object GetApplicationResult {
  @scala.inline
  def apply(
    appversionLifecycle: GetApplicationAppversionLifecycle,
    arn: String,
    description: String,
    id: String,
    name: String
  ): GetApplicationResult = {
    val __obj = js.Dynamic.literal(appversionLifecycle = appversionLifecycle, arn = arn, description = description, id = id, name = name)
  
    __obj.asInstanceOf[GetApplicationResult]
  }
}

