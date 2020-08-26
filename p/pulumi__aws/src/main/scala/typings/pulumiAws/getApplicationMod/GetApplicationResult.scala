package typings.pulumiAws.getApplicationMod

import typings.pulumiAws.outputMod.elasticbeanstalk.GetApplicationAppversionLifecycle
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
    * The provider-assigned unique ID for this managed resource.
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
  @scala.inline
  implicit class GetApplicationResultOps[Self <: GetApplicationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppversionLifecycle(value: GetApplicationAppversionLifecycle): Self = this.set("appversionLifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

