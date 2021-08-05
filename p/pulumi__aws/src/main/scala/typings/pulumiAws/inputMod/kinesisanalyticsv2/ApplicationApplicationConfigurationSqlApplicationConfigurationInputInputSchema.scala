package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  ]
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
    */
  var recordEncoding: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var recordFormat: Input[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
  ]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema {
  
  inline def apply(
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
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema](x: Self) {
    
    inline def setRecordColumns(
      value: Input[
          js.Array[
            Input[
              ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
            ]
          ]
        ]
    ): Self = StObject.set(x, "recordColumns", value.asInstanceOf[js.Any])
    
    inline def setRecordColumnsVarargs(
      value: (Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
        ])*
    ): Self = StObject.set(x, "recordColumns", js.Array(value :_*))
    
    inline def setRecordEncoding(value: Input[String]): Self = StObject.set(x, "recordEncoding", value.asInstanceOf[js.Any])
    
    inline def setRecordEncodingUndefined: Self = StObject.set(x, "recordEncoding", js.undefined)
    
    inline def setRecordFormat(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
        ]
    ): Self = StObject.set(x, "recordFormat", value.asInstanceOf[js.Any])
  }
}
