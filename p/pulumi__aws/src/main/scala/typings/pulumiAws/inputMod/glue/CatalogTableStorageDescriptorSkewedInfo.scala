package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTableStorageDescriptorSkewedInfo extends js.Object {
  
  /**
    * A list of names of columns that contain skewed values.
    */
  var skewedColumnNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var skewedColumnValueLocationMaps: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map of skewed values to the columns that contain them.
    */
  var skewedColumnValues: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object CatalogTableStorageDescriptorSkewedInfo {
  
  @scala.inline
  def apply(): CatalogTableStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSkewedInfo]
  }
  
  @scala.inline
  implicit class CatalogTableStorageDescriptorSkewedInfoOps[Self <: CatalogTableStorageDescriptorSkewedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSkewedColumnNamesVarargs(value: Input[String]*): Self = this.set("skewedColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setSkewedColumnNames(value: Input[js.Array[Input[String]]]): Self = this.set("skewedColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewedColumnNames: Self = this.set("skewedColumnNames", js.undefined)
    
    @scala.inline
    def setSkewedColumnValueLocationMaps(value: Input[StringDictionary[Input[String]]]): Self = this.set("skewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewedColumnValueLocationMaps: Self = this.set("skewedColumnValueLocationMaps", js.undefined)
    
    @scala.inline
    def setSkewedColumnValuesVarargs(value: Input[String]*): Self = this.set("skewedColumnValues", js.Array(value :_*))
    
    @scala.inline
    def setSkewedColumnValues(value: Input[js.Array[Input[String]]]): Self = this.set("skewedColumnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewedColumnValues: Self = this.set("skewedColumnValues", js.undefined)
  }
}
