package typings.pulumiAws

import typings.pulumiAws.inputMod.ec2.GetSpotPriceFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSpotPriceMod {
  
  @JSImport("@pulumi/aws/ec2/getSpotPrice", "getSpotPrice")
  @js.native
  def getSpotPrice(): js.Promise[GetSpotPriceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSpotPrice", "getSpotPrice")
  @js.native
  def getSpotPrice(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSpotPriceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSpotPrice", "getSpotPrice")
  @js.native
  def getSpotPrice(args: GetSpotPriceArgs): js.Promise[GetSpotPriceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSpotPrice", "getSpotPrice")
  @js.native
  def getSpotPrice(args: GetSpotPriceArgs, opts: InvokeOptions): js.Promise[GetSpotPriceResult] = js.native
  
  @js.native
  trait GetSpotPriceArgs extends StObject {
    
    /**
      * The availability zone in which to query Spot price information.
      */
    val availabilityZone: js.UndefOr[String] = js.native
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetSpotPriceFilter]] = js.native
    
    /**
      * The type of instance for which to query Spot Price information.
      */
    val instanceType: js.UndefOr[String] = js.native
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
  
  @js.native
  trait GetSpotPriceResult extends StObject {
    
    val availabilityZone: js.UndefOr[String] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSpotPriceFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val instanceType: js.UndefOr[String] = js.native
    
    /**
      * The most recent Spot Price value for the given instance type and AZ.
      */
    val spotPrice: String = js.native
    
    /**
      * The timestamp at which the Spot Price value was published.
      */
    val spotPriceTimestamp: String = js.native
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
