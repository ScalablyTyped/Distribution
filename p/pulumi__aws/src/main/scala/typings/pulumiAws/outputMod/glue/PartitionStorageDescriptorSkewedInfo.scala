package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionStorageDescriptorSkewedInfo extends StObject {
  
  /**
    * A list of names of columns that contain skewed values.
    */
  var skewedColumnNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var skewedColumnValueLocationMaps: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A map of skewed values to the columns that contain them.
    */
  var skewedColumnValues: js.UndefOr[js.Array[String]] = js.undefined
}
object PartitionStorageDescriptorSkewedInfo {
  
  inline def apply(): PartitionStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionStorageDescriptorSkewedInfo]
  }
  
  extension [Self <: PartitionStorageDescriptorSkewedInfo](x: Self) {
    
    inline def setSkewedColumnNames(value: js.Array[String]): Self = StObject.set(x, "skewedColumnNames", value.asInstanceOf[js.Any])
    
    inline def setSkewedColumnNamesUndefined: Self = StObject.set(x, "skewedColumnNames", js.undefined)
    
    inline def setSkewedColumnNamesVarargs(value: String*): Self = StObject.set(x, "skewedColumnNames", js.Array(value :_*))
    
    inline def setSkewedColumnValueLocationMaps(value: StringDictionary[String]): Self = StObject.set(x, "skewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    
    inline def setSkewedColumnValueLocationMapsUndefined: Self = StObject.set(x, "skewedColumnValueLocationMaps", js.undefined)
    
    inline def setSkewedColumnValues(value: js.Array[String]): Self = StObject.set(x, "skewedColumnValues", value.asInstanceOf[js.Any])
    
    inline def setSkewedColumnValuesUndefined: Self = StObject.set(x, "skewedColumnValues", js.undefined)
    
    inline def setSkewedColumnValuesVarargs(value: String*): Self = StObject.set(x, "skewedColumnValues", js.Array(value :_*))
  }
}
