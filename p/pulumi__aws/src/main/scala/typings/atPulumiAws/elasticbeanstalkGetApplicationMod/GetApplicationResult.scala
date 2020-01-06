package typings.atPulumiAws.elasticbeanstalkGetApplicationMod

import typings.atPulumiAws.typesOutputMod.elasticbeanstalk.GetApplicationAppversionLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationResult extends js.Object {
  val appversionLifecycle: GetApplicationAppversionLifecycle = js.native
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  val arn: String = js.native
  /**
    * Short description of the application
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
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
    val __obj = js.Dynamic.literal(appversionLifecycle = appversionLifecycle.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApplicationResult]
  }
}

