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
    val __obj = js.Dynamic.literal(integration_name = integration_name)
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb)
    if (file_upload != null) __obj.updateDynamic("file_upload")(file_upload)
    if (format_params != null) __obj.updateDynamic("format_params")(format_params)
    if (gcs != null) __obj.updateDynamic("gcs")(gcs)
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis)
    if (redshift != null) __obj.updateDynamic("redshift")(redshift)
    if (s3 != null) __obj.updateDynamic("s3")(s3)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Source]
  }
}

