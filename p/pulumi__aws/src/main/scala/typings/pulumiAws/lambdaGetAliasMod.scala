package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaGetAliasMod {
  
  @JSImport("@pulumi/aws/lambda/getAlias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAliasResult]]
  inline def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAliasResult]]
  
  trait GetAliasArgs extends StObject {
    
    /**
      * Name of the aliased Lambda function.
      */
    val functionName: String
    
    /**
      * Name of the Lambda alias.
      */
    val name: String
  }
  object GetAliasArgs {
    
    inline def apply(functionName: String, name: String): GetAliasArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAliasArgs]
    }
    
    extension [Self <: GetAliasArgs](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAliasResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) identifying the Lambda function alias.
      */
    val arn: String
    
    /**
      * Description of alias.
      */
    val description: String
    
    val functionName: String
    
    /**
      * Lambda function version which the alias uses.
      */
    val functionVersion: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ARN to be used for invoking Lambda Function from API Gateway - to be used in aws_api_gateway_integration's `uri`.
      */
    val invokeArn: String
    
    val name: String
  }
  object GetAliasResult {
    
    inline def apply(
      arn: String,
      description: String,
      functionName: String,
      functionVersion: String,
      id: String,
      invokeArn: String,
      name: String
    ): GetAliasResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invokeArn = invokeArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAliasResult]
    }
    
    extension [Self <: GetAliasResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInvokeArn(value: String): Self = StObject.set(x, "invokeArn", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
