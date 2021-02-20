package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema extends StObject {
  
  /**
    * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
    */
  var recordColumns: Input[
    js.Array[
      Input[
        ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
      ]
    ]
  ] = js.native
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
    */
  var recordEncoding: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var recordFormat: Input[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
  ] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema {
  
  @scala.inline
  def apply(
    recordColumns: Input[
      js.Array[
        Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
        ]
      ]
    ],
    recordFormat: Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
    ]
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumns(
      value: Input[
          js.Array[
            Input[
              ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
            ]
          ]
        ]
    ): Self = StObject.set(x, "recordColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordColumnsVarargs(
      value: (Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
        ])*
    ): Self = StObject.set(x, "recordColumns", js.Array(value :_*))
    
    @scala.inline
    def setRecordEncoding(value: Input[String]): Self = StObject.set(x, "recordEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordEncodingUndefined: Self = StObject.set(x, "recordEncoding", js.undefined)
    
    @scala.inline
    def setRecordFormat(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
        ]
    ): Self = StObject.set(x, "recordFormat", value.asInstanceOf[js.Any])
  }
}
