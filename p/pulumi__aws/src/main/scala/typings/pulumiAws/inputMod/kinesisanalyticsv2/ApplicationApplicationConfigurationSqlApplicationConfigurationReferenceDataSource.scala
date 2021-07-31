package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource extends StObject {
  
  var referenceId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var referenceSchema: Input[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema
  ]
  
  /**
    * Identifies the S3 bucket and object that contains the reference data.
    */
  var s3ReferenceDataSource: Input[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource
  ]
  
  /**
    * The name of the in-application table to create.
    */
  var tableName: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource {
  
  @scala.inline
  def apply(
    referenceSchema: Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema
    ],
    s3ReferenceDataSource: Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource
    ],
    tableName: Input[String]
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource = {
    val __obj = js.Dynamic.literal(referenceSchema = referenceSchema.asInstanceOf[js.Any], s3ReferenceDataSource = s3ReferenceDataSource.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceId(value: Input[String]): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
    
    @scala.inline
    def setReferenceSchema(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema
        ]
    ): Self = StObject.set(x, "referenceSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ReferenceDataSource(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource
        ]
    ): Self = StObject.set(x, "s3ReferenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
