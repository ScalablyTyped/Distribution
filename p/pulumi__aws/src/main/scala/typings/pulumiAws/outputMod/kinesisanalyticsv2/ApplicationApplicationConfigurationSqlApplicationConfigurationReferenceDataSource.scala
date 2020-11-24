package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource extends js.Object {
  
  var referenceId: String = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var referenceSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema = js.native
  
  /**
    * Identifies the S3 bucket and object that contains the reference data.
    */
  var s3ReferenceDataSource: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource = js.native
  
  /**
    * The name of the in-application table to create.
    */
  var tableName: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource {
  
  @scala.inline
  def apply(
    referenceId: String,
    referenceSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema,
    s3ReferenceDataSource: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource,
    tableName: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource = {
    val __obj = js.Dynamic.literal(referenceId = referenceId.asInstanceOf[js.Any], referenceSchema = referenceSchema.asInstanceOf[js.Any], s3ReferenceDataSource = s3ReferenceDataSource.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource] (val x: Self) extends AnyVal {
    
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
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceSchema(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema
    ): Self = this.set("referenceSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ReferenceDataSource(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource
    ): Self = this.set("s3ReferenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
  }
}
