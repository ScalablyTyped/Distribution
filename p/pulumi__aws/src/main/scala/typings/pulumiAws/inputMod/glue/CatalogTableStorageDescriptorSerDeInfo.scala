package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTableStorageDescriptorSerDeInfo extends StObject {
  
  /**
    * Name of the SerDe.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var serializationLibrary: js.UndefOr[Input[String]] = js.undefined
}
object CatalogTableStorageDescriptorSerDeInfo {
  
  inline def apply(): CatalogTableStorageDescriptorSerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSerDeInfo]
  }
  
  extension [Self <: CatalogTableStorageDescriptorSerDeInfo](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSerializationLibrary(value: Input[String]): Self = StObject.set(x, "serializationLibrary", value.asInstanceOf[js.Any])
    
    inline def setSerializationLibraryUndefined: Self = StObject.set(x, "serializationLibrary", js.undefined)
  }
}
