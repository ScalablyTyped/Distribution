package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionStorageDescriptorSkewedInfo extends StObject {
  
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
object PartitionStorageDescriptorSkewedInfo {
  
  @scala.inline
  def apply(): PartitionStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionStorageDescriptorSkewedInfo]
  }
  
  @scala.inline
  implicit class PartitionStorageDescriptorSkewedInfoMutableBuilder[Self <: PartitionStorageDescriptorSkewedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkewedColumnNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "skewedColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnNamesUndefined: Self = StObject.set(x, "skewedColumnNames", js.undefined)
    
    @scala.inline
    def setSkewedColumnNamesVarargs(value: Input[String]*): Self = StObject.set(x, "skewedColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setSkewedColumnValueLocationMaps(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "skewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnValueLocationMapsUndefined: Self = StObject.set(x, "skewedColumnValueLocationMaps", js.undefined)
    
    @scala.inline
    def setSkewedColumnValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "skewedColumnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnValuesUndefined: Self = StObject.set(x, "skewedColumnValues", js.undefined)
    
    @scala.inline
    def setSkewedColumnValuesVarargs(value: Input[String]*): Self = StObject.set(x, "skewedColumnValues", js.Array(value :_*))
  }
}
