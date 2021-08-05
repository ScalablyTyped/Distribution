package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostInstanceTypesMod {
  
  @JSImport("@pulumi/aws/outposts/getOutpostInstanceTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs): js.Promise[GetOutpostInstanceTypesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceTypes")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostInstanceTypesResult]]
  inline def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceTypes")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostInstanceTypesResult]]
  
  trait GetOutpostInstanceTypesArgs extends StObject {
    
    /**
      * Outpost Amazon Resource Name (ARN).
      */
    val arn: String
  }
  object GetOutpostInstanceTypesArgs {
    
    inline def apply(arn: String): GetOutpostInstanceTypesArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypesArgs]
    }
    
    extension [Self <: GetOutpostInstanceTypesArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOutpostInstanceTypesResult extends StObject {
    
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of instance types.
      */
    val instanceTypes: js.Array[String]
  }
  object GetOutpostInstanceTypesResult {
    
    inline def apply(arn: String, id: String, instanceTypes: js.Array[String]): GetOutpostInstanceTypesResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypesResult]
    }
    
    extension [Self <: GetOutpostInstanceTypesResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
    }
  }
}
