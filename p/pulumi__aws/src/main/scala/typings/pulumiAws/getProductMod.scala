package typings.pulumiAws

import typings.pulumiAws.inputMod.pricing.GetProductFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getProductMod {
  
  @JSImport("@pulumi/aws/pricing/getProduct", "getProduct")
  @js.native
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = js.native
  @JSImport("@pulumi/aws/pricing/getProduct", "getProduct")
  @js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = js.native
  
  @js.native
  trait GetProductArgs extends StObject {
    
    /**
      * A list of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
      */
    val filters: js.Array[GetProductFilter] = js.native
    
    /**
      * The code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
      */
    val serviceCode: String = js.native
  }
  object GetProductArgs {
    
    @scala.inline
    def apply(filters: js.Array[GetProductFilter], serviceCode: String): GetProductArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProductArgs]
    }
    
    @scala.inline
    implicit class GetProductArgsMutableBuilder[Self <: GetProductArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetProductFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: GetProductFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetProductResult extends StObject {
    
    val filters: js.Array[typings.pulumiAws.outputMod.pricing.GetProductFilter] = js.native
    
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
    def apply(
      filters: js.Array[typings.pulumiAws.outputMod.pricing.GetProductFilter],
      id: String,
      result: String,
      serviceCode: String
    ): GetProductResult = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProductResult]
    }
    
    @scala.inline
    implicit class GetProductResultMutableBuilder[Self <: GetProductResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.pricing.GetProductFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.pricing.GetProductFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    }
  }
}
