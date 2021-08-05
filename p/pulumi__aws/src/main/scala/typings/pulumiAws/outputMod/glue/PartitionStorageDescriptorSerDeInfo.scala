package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionStorageDescriptorSerDeInfo extends StObject {
  
  /**
    * Name of the SerDe.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var serializationLibrary: js.UndefOr[String] = js.undefined
}
object PartitionStorageDescriptorSerDeInfo {
  
  inline def apply(): PartitionStorageDescriptorSerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionStorageDescriptorSerDeInfo]
  }
  
  extension [Self <: PartitionStorageDescriptorSerDeInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSerializationLibrary(value: String): Self = StObject.set(x, "serializationLibrary", value.asInstanceOf[js.Any])
    
    inline def setSerializationLibraryUndefined: Self = StObject.set(x, "serializationLibrary", js.undefined)
  }
}
