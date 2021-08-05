package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn extends StObject {
  
  /**
    * A reference to the data element in the streaming input or the reference data source.
    */
  var mapping: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the column that is created in the in-application input stream or reference table.
    */
  var name: Input[String]
  
  /**
    * The type of column created in the in-application input stream or reference table.
    */
  var sqlType: Input[String]
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn {
  
  inline def apply(name: Input[String], sqlType: Input[String]): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn](x: Self) {
    
    inline def setMapping(value: Input[String]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSqlType(value: Input[String]): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
  }
}
