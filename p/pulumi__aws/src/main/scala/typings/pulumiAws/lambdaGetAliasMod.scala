package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaGetAliasMod {
  
  @JSImport("@pulumi/aws/lambda/getAlias", "getAlias")
  @js.native
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = js.native
  @JSImport("@pulumi/aws/lambda/getAlias", "getAlias")
  @js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = js.native
  
  @js.native
  trait GetAliasArgs extends StObject {
    
    /**
      * Name of the aliased Lambda function.
      */
    val functionName: String = js.native
    
    /**
      * Name of the Lambda alias.
      */
    val name: String = js.native
  }
  object GetAliasArgs {
    
    @scala.inline
    def apply(functionName: String, name: String): GetAliasArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAliasArgs]
    }
    
    @scala.inline
    implicit class GetAliasArgsMutableBuilder[Self <: GetAliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAliasResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) identifying the Lambda function alias.
      */
    val arn: String = js.native
    
    /**
      * Description of alias.
      */
    val description: String = js.native
    
    val functionName: String = js.native
    
    /**
      * Lambda function version which the alias uses.
      */
    val functionVersion: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ARN to be used for invoking Lambda Function from API Gateway - to be used in aws_api_gateway_integration's `uri`.
      */
    val invokeArn: String = js.native
    
    val name: String = js.native
  }
  object GetAliasResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetAliasResultMutableBuilder[Self <: GetAliasResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeArn(value: String): Self = StObject.set(x, "invokeArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
