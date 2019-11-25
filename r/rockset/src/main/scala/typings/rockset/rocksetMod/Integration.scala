package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Integration extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  // email of user who created the integration
  var created_by: String
  // longer explanation for the integration
  var description: js.UndefOr[String] = js.undefined
  // Amazon DynamoDB details, must have one of aws_access_key or aws_role
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.undefined
  // GCS details
  var gcs: js.UndefOr[GcsIntegration] = js.undefined
  // Amazon Kinesis details, must have one of aws_access_key or aws_role
  var kinesis: js.UndefOr[KinesisIntegration] = js.undefined
  // descriptive label and unique identifier
  var name: String
  // Amazon Redshift details
  var redshift: js.UndefOr[RedshiftIntegration] = js.undefined
  // Amazon S3 details, must have one of aws_access_key or aws_role
  var s3: js.UndefOr[S3Integration] = js.undefined
}

object Integration {
  @scala.inline
  def apply(
    created_by: String,
    name: String,
    created_at: String = null,
    description: String = null,
    dynamodb: DynamodbIntegration = null,
    gcs: GcsIntegration = null,
    kinesis: KinesisIntegration = null,
    redshift: RedshiftIntegration = null,
    s3: S3Integration = null
  ): Integration = {
    val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (gcs != null) __obj.updateDynamic("gcs")(gcs.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (redshift != null) __obj.updateDynamic("redshift")(redshift.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integration]
  }
}

