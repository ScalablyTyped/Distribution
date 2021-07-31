package typings.pulumiAws

import typings.pulumiAws.inputMod.pricing.GetProductFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getProductMod {
  
  @JSImport("@pulumi/aws/pricing/getProduct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProduct")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetProductResult]]
  @scala.inline
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProduct")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetProductResult]]
  
  trait GetProductArgs extends StObject {
    
    /**
      * A list of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
      */
    val filters: js.Array[GetProductFilter]
    
    /**
      * The code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
      */
    val serviceCode: String
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
  
  trait GetProductResult extends StObject {
    
    val filters: js.Array[typings.pulumiAws.outputMod.pricing.GetProductFilter]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set to the product returned from the API.
      */
    val result: String
    
    val serviceCode: String
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
