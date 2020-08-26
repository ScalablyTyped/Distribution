package typings.pulumiAws.getPlanMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlanResult extends js.Object {
  /**
    * The ARN of the backup plan.
    */
  val arn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The display name of a backup plan.
    */
  val name: String = js.native
  val planId: String = js.native
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: StringDictionary[String] = js.native
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
    */
  val version: String = js.native
}

object GetPlanResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    name: String,
    planId: String,
    tags: StringDictionary[String],
    version: String
  ): GetPlanResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlanResult]
  }
  @scala.inline
  implicit class GetPlanResultOps[Self <: GetPlanResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

