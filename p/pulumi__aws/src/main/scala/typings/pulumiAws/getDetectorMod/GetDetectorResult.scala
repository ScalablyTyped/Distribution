package typings.pulumiAws.getDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorResult extends js.Object {
  /**
    * The frequency of notifications sent about subsequent finding occurrences.
    */
  val findingPublishingFrequency: String = js.native
  val id: js.UndefOr[String] = js.native
  /**
    * The service-linked role that grants GuardDuty access to the resources in the AWS account.
    */
  val serviceRoleArn: String = js.native
  /**
    * The current status of the detector.
    */
  val status: String = js.native
}

object GetDetectorResult {
  @scala.inline
  def apply(findingPublishingFrequency: String, serviceRoleArn: String, status: String, id: String = null): GetDetectorResult = {
    val __obj = js.Dynamic.literal(findingPublishingFrequency = findingPublishingFrequency.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResult]
  }
}

