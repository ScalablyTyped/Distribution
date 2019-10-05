package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesS3 extends js.Object {
  var bucketArn: String
  var fileKey: String
  var roleArn: String
}

object AnalyticsApplicationReferenceDataSourcesS3 {
  @scala.inline
  def apply(bucketArn: String, fileKey: String, roleArn: String): AnalyticsApplicationReferenceDataSourcesS3 = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, fileKey = fileKey, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesS3]
  }
}

