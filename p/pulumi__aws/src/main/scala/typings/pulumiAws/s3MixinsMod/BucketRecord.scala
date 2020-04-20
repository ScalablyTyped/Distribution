package typings.pulumiAws.s3MixinsMod

import typings.pulumiAws.AnonBucket
import typings.pulumiAws.AnonPrincipalIdString
import typings.pulumiAws.AnonSourceIPAddress
import typings.pulumiAws.AnonXamzid2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketRecord extends js.Object {
  var awsRegion: String = js.native
  var eventName: String = js.native
  var eventSource: String = js.native
  var eventTime: String = js.native
  var eventVersion: String = js.native
  var requestParameters: AnonSourceIPAddress = js.native
  var responseElements: AnonXamzid2 = js.native
  var s3: AnonBucket = js.native
  var userIdentity: AnonPrincipalIdString = js.native
}

object BucketRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: AnonSourceIPAddress,
    responseElements: AnonXamzid2,
    s3: AnonBucket,
    userIdentity: AnonPrincipalIdString
  ): BucketRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketRecord]
  }
}

