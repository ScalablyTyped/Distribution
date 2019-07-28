package typings.atPulumiAws.s3S3MixinsMod

import typings.atPulumiAws.Anon_BucketConfigurationId
import typings.atPulumiAws.Anon_PrincipalIdString
import typings.atPulumiAws.Anon_SourceIPAddress
import typings.atPulumiAws.Anon_Xamzid2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketRecord extends js.Object {
  var awsRegion: String
  var eventName: String
  var eventSource: String
  var eventTime: String
  var eventVersion: String
  var requestParameters: Anon_SourceIPAddress
  var responseElements: Anon_Xamzid2
  var s3: Anon_BucketConfigurationId
  var userIdentity: Anon_PrincipalIdString
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
    s3: Anon_BucketConfigurationId,
    userIdentity: Anon_PrincipalIdString
  ): BucketRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, eventName = eventName, eventSource = eventSource, eventTime = eventTime, eventVersion = eventVersion, requestParameters = requestParameters, responseElements = responseElements, s3 = s3, userIdentity = userIdentity)
  
    __obj.asInstanceOf[BucketRecord]
  }
}

