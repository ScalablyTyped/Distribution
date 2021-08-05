package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTableStorageDescriptorSkewedInfo extends StObject {
  
  /**
    * A list of names of columns that contain skewed values.
    */
  var skewedColumnNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var skewedColumnValueLocationMaps: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * A map of skewed values to the columns that contain them.
    */
  var skewedColumnValues: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object CatalogTableStorageDescriptorSkewedInfo {
  
  inline def apply(): CatalogTableStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSkewedInfo]
  }
  
  extension [Self <: CatalogTableStorageDescriptorSkewedInfo](x: Self) {
    
    inline def setSkewedColumnNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "skewedColumnNames", value.asInstanceOf[js.Any])
    
    inline def setSkewedColumnNamesUndefined: Self = StObject.set(x, "skewedColumnNames", js.undefined)
    
    inline def setSkewedColumnNamesVarargs(value: Input[String]*): Self = StObject.set(x, "skewedColumnNames", js.Array(value :_*))
    
    inline def setSkewedColumnValueLocationMaps(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "skewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    
    inline def setSkewedColumnValueLocationMapsUndefined: Self = StObject.set(x, "skewedColumnValueLocationMaps", js.undefined)
    
    inline def setSkewedColumnValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "skewedColumnValues", value.asInstanceOf[js.Any])
    
    inline def setSkewedColumnValuesUndefined: Self = StObject.set(x, "skewedColumnValues", js.undefined)
    
    inline def setSkewedColumnValuesVarargs(value: Input[String]*): Self = StObject.set(x, "skewedColumnValues", js.Array(value :_*))
  }
}
