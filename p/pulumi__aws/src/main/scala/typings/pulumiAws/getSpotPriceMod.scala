package typings.pulumiAws

import typings.pulumiAws.inputMod.ec2.GetSpotPriceFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSpotPriceMod {
  
  @JSImport("@pulumi/aws/ec2/getSpotPrice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSpotPrice(): js.Promise[GetSpotPriceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")().asInstanceOf[js.Promise[GetSpotPriceResult]]
  @scala.inline
  def getSpotPrice(args: Unit, opts: InvokeOptions): js.Promise[GetSpotPriceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSpotPriceResult]]
  @scala.inline
  def getSpotPrice(args: GetSpotPriceArgs): js.Promise[GetSpotPriceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSpotPriceResult]]
  @scala.inline
  def getSpotPrice(args: GetSpotPriceArgs, opts: InvokeOptions): js.Promise[GetSpotPriceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSpotPriceResult]]
  
  trait GetSpotPriceArgs extends StObject {
    
    /**
      * The availability zone in which to query Spot price information.
      */
    val availabilityZone: js.UndefOr[String] = js.undefined
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetSpotPriceFilter]] = js.undefined
    
    /**
      * The type of instance for which to query Spot Price information.
      */
    val instanceType: js.UndefOr[String] = js.undefined
  }
  object GetSpotPriceArgs {
    
    @scala.inline
    def apply(): GetSpotPriceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSpotPriceArgs]
    }
    
    @scala.inline
    implicit class GetSpotPriceArgsMutableBuilder[Self <: GetSpotPriceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetSpotPriceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSpotPriceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    }
  }
  
  trait GetSpotPriceResult extends StObject {
    
    val availabilityZone: js.UndefOr[String] = js.undefined
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSpotPriceFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instanceType: js.UndefOr[String] = js.undefined
    
    /**
      * The most recent Spot Price value for the given instance type and AZ.
      */
    val spotPrice: String
    
    /**
      * The timestamp at which the Spot Price value was published.
      */
    val spotPriceTimestamp: String
  }
  object GetSpotPriceResult {
    
    @scala.inline
    def apply(id: String, spotPrice: String, spotPriceTimestamp: String): GetSpotPriceResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], spotPrice = spotPrice.asInstanceOf[js.Any], spotPriceTimestamp = spotPriceTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSpotPriceResult]
    }
    
    @scala.inline
    implicit class GetSpotPriceResultMutableBuilder[Self <: GetSpotPriceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetSpotPriceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetSpotPriceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setSpotPrice(value: String): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotPriceTimestamp(value: String): Self = StObject.set(x, "spotPriceTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
