package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogTableStorageDescriptorSkewedInfo extends StObject {
  
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
object CatalogTableStorageDescriptorSkewedInfo {
  
  @scala.inline
  def apply(): CatalogTableStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSkewedInfo]
  }
  
  @scala.inline
  implicit class CatalogTableStorageDescriptorSkewedInfoMutableBuilder[Self <: CatalogTableStorageDescriptorSkewedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkewedColumnNames(value: js.Array[String]): Self = StObject.set(x, "skewedColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnNamesUndefined: Self = StObject.set(x, "skewedColumnNames", js.undefined)
    
    @scala.inline
    def setSkewedColumnNamesVarargs(value: String*): Self = StObject.set(x, "skewedColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setSkewedColumnValueLocationMaps(value: StringDictionary[String]): Self = StObject.set(x, "skewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnValueLocationMapsUndefined: Self = StObject.set(x, "skewedColumnValueLocationMaps", js.undefined)
    
    @scala.inline
    def setSkewedColumnValues(value: js.Array[String]): Self = StObject.set(x, "skewedColumnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnValuesUndefined: Self = StObject.set(x, "skewedColumnValues", js.undefined)
    
    @scala.inline
    def setSkewedColumnValuesVarargs(value: String*): Self = StObject.set(x, "skewedColumnValues", js.Array(value :_*))
  }
}
