package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostInstanceTypeMod {
  
  @JSImport("@pulumi/aws/outposts/getOutpostInstanceType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs): js.Promise[GetOutpostInstanceTypeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostInstanceTypeResult]]
  inline def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceType")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostInstanceTypeResult]]
  
  trait GetOutpostInstanceTypeArgs extends StObject {
    
    /**
      * Outpost Amazon Resource Name (ARN).
      */
    val arn: String
    
    /**
      * Desired instance type. Conflicts with `preferredInstanceTypes`.
      */
    val instanceType: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instanceType`.
      */
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetOutpostInstanceTypeArgs {
    
    inline def apply(arn: String): GetOutpostInstanceTypeArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypeArgs]
    }
    
    extension [Self <: GetOutpostInstanceTypeArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      inline def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
  
  trait GetOutpostInstanceTypeResult extends StObject {
    
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instanceType: String
    
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetOutpostInstanceTypeResult {
    
    inline def apply(arn: String, id: String, instanceType: String): GetOutpostInstanceTypeResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypeResult]
    }
    
    extension [Self <: GetOutpostInstanceTypeResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      inline def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
}
