package typings
package atPulumiAwsLib.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketRecord extends js.Object {
  var awsRegion: java.lang.String
  var eventName: java.lang.String
  var eventSource: java.lang.String
  var eventTime: java.lang.String
  var eventVersion: java.lang.String
  var requestParameters: atPulumiAwsLib.Anon_SourceIPAddress
  var responseElements: atPulumiAwsLib.Anon_Xamzid2
  var s3: atPulumiAwsLib.Anon_BucketConfigurationId
  var userIdentity: atPulumiAwsLib.Anon_PrincipalIdString
}

object BucketRecord {
  @scala.inline
  def apply(
    awsRegion: java.lang.String,
    eventName: java.lang.String,
    eventSource: java.lang.String,
    eventTime: java.lang.String,
    eventVersion: java.lang.String,
    requestParameters: atPulumiAwsLib.Anon_SourceIPAddress,
    responseElements: atPulumiAwsLib.Anon_Xamzid2,
    s3: atPulumiAwsLib.Anon_BucketConfigurationId,
    userIdentity: atPulumiAwsLib.Anon_PrincipalIdString
  ): BucketRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("awsRegion")(awsRegion)
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("eventSource")(eventSource)
    __obj.updateDynamic("eventTime")(eventTime)
    __obj.updateDynamic("eventVersion")(eventVersion)
    __obj.updateDynamic("requestParameters")(requestParameters)
    __obj.updateDynamic("responseElements")(responseElements)
    __obj.updateDynamic("s3")(s3)
    __obj.updateDynamic("userIdentity")(userIdentity)
    __obj.asInstanceOf[BucketRecord]
  }
}

