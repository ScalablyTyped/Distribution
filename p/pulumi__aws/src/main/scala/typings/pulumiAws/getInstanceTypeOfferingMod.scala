package typings.pulumiAws

import typings.pulumiAws.inputMod.ec2.GetInstanceTypeOfferingFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceTypeOfferingMod {
  
  @JSImport("@pulumi/aws/ec2/getInstanceTypeOffering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstanceTypeOffering(): js.Promise[GetInstanceTypeOfferingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")().asInstanceOf[js.Promise[GetInstanceTypeOfferingResult]]
  inline def getInstanceTypeOffering(args: Unit, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceTypeOfferingResult]]
  inline def getInstanceTypeOffering(args: GetInstanceTypeOfferingArgs): js.Promise[GetInstanceTypeOfferingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstanceTypeOfferingResult]]
  inline def getInstanceTypeOffering(args: GetInstanceTypeOfferingArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceTypeOfferingResult]]
  
  trait GetInstanceTypeOfferingArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.undefined
    
    /**
      * Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
      */
    val locationType: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred EC2 Instance Types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetInstanceTypeOfferingArgs {
    
    inline def apply(): GetInstanceTypeOfferingArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceTypeOfferingArgs]
    }
    
    extension [Self <: GetInstanceTypeOfferingArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetInstanceTypeOfferingFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetInstanceTypeOfferingFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
      
      inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
      
      inline def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      inline def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
  
  trait GetInstanceTypeOfferingResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * EC2 Instance Type.
      */
    val instanceType: String
    
    val locationType: js.UndefOr[String] = js.undefined
    
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetInstanceTypeOfferingResult {
    
    inline def apply(id: String, instanceType: String): GetInstanceTypeOfferingResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceTypeOfferingResult]
    }
    
    extension [Self <: GetInstanceTypeOfferingResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
      
      inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
      
      inline def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      inline def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
}
