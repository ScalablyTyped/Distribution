package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema extends StObject {
  
  /**
    * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
    */
  var recordColumns: js.Array[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
  ]
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
    */
  var recordEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var recordFormat: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema {
  
  inline def apply(
    recordColumns: js.Array[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
    ],
    recordFormat: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema](x: Self) {
    
    inline def setRecordColumns(
      value: js.Array[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn
        ]
    ): Self = StObject.set(x, "recordColumns", value.asInstanceOf[js.Any])
    
    inline def setRecordColumnsVarargs(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn*): Self = StObject.set(x, "recordColumns", js.Array(value :_*))
    
    inline def setRecordEncoding(value: String): Self = StObject.set(x, "recordEncoding", value.asInstanceOf[js.Any])
    
    inline def setRecordEncodingUndefined: Self = StObject.set(x, "recordEncoding", js.undefined)
    
    inline def setRecordFormat(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormat): Self = StObject.set(x, "recordFormat", value.asInstanceOf[js.Any])
  }
}
