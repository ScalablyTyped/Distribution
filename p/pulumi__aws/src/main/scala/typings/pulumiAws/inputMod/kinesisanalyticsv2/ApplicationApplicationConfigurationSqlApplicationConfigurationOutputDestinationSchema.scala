package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema extends StObject {
  
  /**
    * Specifies the format of the records on the output stream. Valid values: `CSV`, `JSON`.
    */
  var recordFormatType: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema {
  
  inline def apply(recordFormatType: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema](x: Self) {
    
    inline def setRecordFormatType(value: Input[String]): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
  }
}
