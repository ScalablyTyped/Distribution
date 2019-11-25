package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIntegrationRequest extends js.Object {
  // longer explanation for the integration
  var description: js.UndefOr[String] = js.undefined
  // Amazon DynamoDB details, must have one of aws_access_key or aws_role
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.undefined
  // GCS details
  var gcs: js.UndefOr[GcsIntegration] = js.undefined
  // Amazon Kinesis details, must have one of aws_access_key or aws_role
  var kinesis: js.UndefOr[KinesisIntegration] = js.undefined
  // descriptive label
  var name: String
  // Amazon Redshift details
  var redshift: js.UndefOr[RedshiftIntegration] = js.undefined
  // Amazon S3 details, must have one of aws_access_key or aws_role
  var s3: js.UndefOr[S3Integration] = js.undefined
}

object CreateIntegrationRequest {
  @scala.inline
  def apply(
    name: String,
    description: String = null,
    dynamodb: DynamodbIntegration = null,
    gcs: GcsIntegration = null,
    kinesis: KinesisIntegration = null,
    redshift: RedshiftIntegration = null,
    s3: S3Integration = null
  ): CreateIntegrationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (gcs != null) __obj.updateDynamic("gcs")(gcs.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (redshift != null) __obj.updateDynamic("redshift")(redshift.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationRequest]
  }
}

