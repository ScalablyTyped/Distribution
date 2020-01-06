package typings.atPulumiAws.s3S3MixinsMod

import typings.atPulumiAws.Anon_Bucket
import typings.atPulumiAws.Anon_PrincipalIdString
import typings.atPulumiAws.Anon_SourceIPAddress
import typings.atPulumiAws.Anon_Xamzid2
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
  var requestParameters: Anon_SourceIPAddress = js.native
  var responseElements: Anon_Xamzid2 = js.native
  var s3: Anon_Bucket = js.native
  var userIdentity: Anon_PrincipalIdString = js.native
}

object BucketRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventName: String,
    eventSource: String,
    eventTime: String,
    eventVersion: String,
    requestParameters: Anon_SourceIPAddress,
    responseElements: Anon_Xamzid2,
    s3: Anon_Bucket,
    userIdentity: Anon_PrincipalIdString
  ): BucketRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], responseElements = responseElements.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketRecord]
  }
}

