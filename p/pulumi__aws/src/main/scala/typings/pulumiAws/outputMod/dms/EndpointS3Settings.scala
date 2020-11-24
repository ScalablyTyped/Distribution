package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointS3Settings extends js.Object {
  
  /**
    * S3 Bucket Object prefix.
    */
  var bucketFolder: js.UndefOr[String] = js.native
  
  /**
    * S3 Bucket name.
    */
  var bucketName: js.UndefOr[String] = js.native
  
  /**
    * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
    */
  var compressionType: js.UndefOr[String] = js.native
  
  /**
    * Delimiter used to separate columns in the source files. Defaults to `,`.
    */
  var csvDelimiter: js.UndefOr[String] = js.native
  
  /**
    * Delimiter used to separate rows in the source files. Defaults to `\n`.
    */
  var csvRowDelimiter: js.UndefOr[String] = js.native
  
  /**
    * JSON document that describes how AWS DMS should interpret the data.
    */
  var externalTableDefinition: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
    */
  var serviceAccessRoleArn: js.UndefOr[String] = js.native
}
object EndpointS3Settings {
  
  @scala.inline
  def apply(): EndpointS3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointS3Settings]
  }
  
  @scala.inline
  implicit class EndpointS3SettingsOps[Self <: EndpointS3Settings] (val x: Self) extends AnyVal {
    
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
    def setBucketFolder(value: String): Self = this.set("bucketFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketFolder: Self = this.set("bucketFolder", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    
    @scala.inline
    def setCompressionType(value: String): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionType: Self = this.set("compressionType", js.undefined)
    
    @scala.inline
    def setCsvDelimiter(value: String): Self = this.set("csvDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvDelimiter: Self = this.set("csvDelimiter", js.undefined)
    
    @scala.inline
    def setCsvRowDelimiter(value: String): Self = this.set("csvRowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvRowDelimiter: Self = this.set("csvRowDelimiter", js.undefined)
    
    @scala.inline
    def setExternalTableDefinition(value: String): Self = this.set("externalTableDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalTableDefinition: Self = this.set("externalTableDefinition", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("serviceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("serviceAccessRoleArn", js.undefined)
  }
}
