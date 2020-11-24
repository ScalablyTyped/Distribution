package typings.pulumiAws.getProductMod

import typings.pulumiAws.outputMod.pricing.GetProductFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProductResult extends js.Object {
  
  val filters: js.Array[GetProductFilter] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Set to the product returned from the API.
    */
  val result: String = js.native
  
  val serviceCode: String = js.native
}
object GetProductResult {
  
  @scala.inline
  def apply(filters: js.Array[GetProductFilter], id: String, result: String, serviceCode: String): GetProductResult = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductResult]
  }
  
  @scala.inline
  implicit class GetProductResultOps[Self <: GetProductResult] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetProductFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetProductFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCode(value: String): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
  }
}
