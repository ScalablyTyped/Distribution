package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn extends StObject {
  
  /**
    * The Mapping reference to the data element.
    */
  var mapping: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the column.
    */
  var name: String
  
  /**
    * The SQL Type of the column.
    */
  var sqlType: String
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn {
  
  inline def apply(name: String, sqlType: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn](x: Self) {
    
    inline def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSqlType(value: String): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
  }
}
