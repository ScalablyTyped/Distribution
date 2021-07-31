package typings.pulumiAws

import typings.pulumiAws.inputMod.ec2.GetInstanceTypeOfferingsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceTypeOfferingsMod {
  
  @JSImport("@pulumi/aws/ec2/getInstanceTypeOfferings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInstanceTypeOfferings(): js.Promise[GetInstanceTypeOfferingsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")().asInstanceOf[js.Promise[GetInstanceTypeOfferingsResult]]
  @scala.inline
  def getInstanceTypeOfferings(args: Unit, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceTypeOfferingsResult]]
  @scala.inline
  def getInstanceTypeOfferings(args: GetInstanceTypeOfferingsArgs): js.Promise[GetInstanceTypeOfferingsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstanceTypeOfferingsResult]]
  @scala.inline
  def getInstanceTypeOfferings(args: GetInstanceTypeOfferingsArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceTypeOfferingsResult]]
  
  trait GetInstanceTypeOfferingsArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingsFilter]] = js.undefined
    
    /**
      * Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
      */
    val locationType: js.UndefOr[String] = js.undefined
  }
  object GetInstanceTypeOfferingsArgs {
    
    @scala.inline
    def apply(): GetInstanceTypeOfferingsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceTypeOfferingsArgs]
    }
    
    @scala.inline
    implicit class GetInstanceTypeOfferingsArgsMutableBuilder[Self <: GetInstanceTypeOfferingsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetInstanceTypeOfferingsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetInstanceTypeOfferingsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    }
  }
  
  trait GetInstanceTypeOfferingsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of EC2 Instance Types.
      */
    val instanceTypes: js.Array[String]
    
    val locationType: js.UndefOr[String] = js.undefined
  }
  object GetInstanceTypeOfferingsResult {
    
    @scala.inline
    def apply(id: String, instanceTypes: js.Array[String]): GetInstanceTypeOfferingsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceTypeOfferingsResult]
    }
    
    @scala.inline
    implicit class GetInstanceTypeOfferingsResultMutableBuilder[Self <: GetInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      @scala.inline
      def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    }
  }
}
