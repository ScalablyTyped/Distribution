package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends js.Object {
  
  // configuration for ingestion from  a dynamodb table
  var dynamodb: js.UndefOr[SourceDynamoDb] = js.native
  
  // file upload details
  var file_upload: js.UndefOr[SourceFileUpload] = js.native
  
  // format parameters for data from this source
  var format_params: js.UndefOr[FormatParams] = js.native
  
  // configuration for ingestion from GCS
  var gcs: js.UndefOr[SourceGcs] = js.native
  
  // name of integration to use
  var integration_name: String = js.native
  
  // configuration for ingestion from kinesis stream
  var kinesis: js.UndefOr[SourceKinesis] = js.native
  
  // configuration for ingestion from Redshift
  var redshift: js.UndefOr[SourceRedshift] = js.native
  
  // configuration for ingestion from S3
  var s3: js.UndefOr[SourceS3] = js.native
  
  // the ingest status of this source
  var status: js.UndefOr[Status] = js.native
}
object Source {
  
  @scala.inline
  def apply(integration_name: String): Source = {
    val __obj = js.Dynamic.literal(integration_name = integration_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntegration_name(value: String): Self = this.set("integration_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodb(value: SourceDynamoDb): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    
    @scala.inline
    def setFile_upload(value: SourceFileUpload): Self = this.set("file_upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_upload: Self = this.set("file_upload", js.undefined)
    
    @scala.inline
    def setFormat_params(value: FormatParams): Self = this.set("format_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_params: Self = this.set("format_params", js.undefined)
    
    @scala.inline
    def setGcs(value: SourceGcs): Self = this.set("gcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcs: Self = this.set("gcs", js.undefined)
    
    @scala.inline
    def setKinesis(value: SourceKinesis): Self = this.set("kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesis: Self = this.set("kinesis", js.undefined)
    
    @scala.inline
    def setRedshift(value: SourceRedshift): Self = this.set("redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshift: Self = this.set("redshift", js.undefined)
    
    @scala.inline
    def setS3(value: SourceS3): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
