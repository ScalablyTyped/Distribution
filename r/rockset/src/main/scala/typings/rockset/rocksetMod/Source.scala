package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  // configuration for ingestion from  a dynamodb table
  var dynamodb: js.UndefOr[SourceDynamoDb] = js.undefined
  // file upload details
  var file_upload: js.UndefOr[SourceFileUpload] = js.undefined
  // format parameters for data from this source
  var format_params: js.UndefOr[FormatParams] = js.undefined
  // configuration for ingestion from GCS
  var gcs: js.UndefOr[SourceGcs] = js.undefined
  // name of integration to use
  var integration_name: String
  // configuration for ingestion from kinesis stream
  var kinesis: js.UndefOr[SourceKinesis] = js.undefined
  // configuration for ingestion from Redshift
  var redshift: js.UndefOr[SourceRedshift] = js.undefined
  // configuration for ingestion from S3
  var s3: js.UndefOr[SourceS3] = js.undefined
  // the ingest status of this source
  var status: js.UndefOr[Status] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    integration_name: String,
    dynamodb: SourceDynamoDb = null,
    file_upload: SourceFileUpload = null,
    format_params: FormatParams = null,
    gcs: SourceGcs = null,
    kinesis: SourceKinesis = null,
    redshift: SourceRedshift = null,
    s3: SourceS3 = null,
    status: Status = null
  ): Source = {
    val __obj = js.Dynamic.literal(integration_name = integration_name.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (file_upload != null) __obj.updateDynamic("file_upload")(file_upload.asInstanceOf[js.Any])
    if (format_params != null) __obj.updateDynamic("format_params")(format_params.asInstanceOf[js.Any])
    if (gcs != null) __obj.updateDynamic("gcs")(gcs.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (redshift != null) __obj.updateDynamic("redshift")(redshift.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

