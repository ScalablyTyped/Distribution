package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInvocationMod {
  
  @JSImport("@pulumi/aws/lambda/getInvocation", "getInvocation")
  @js.native
  def getInvocation(args: GetInvocationArgs): js.Promise[GetInvocationResult] = js.native
  @JSImport("@pulumi/aws/lambda/getInvocation", "getInvocation")
  @js.native
  def getInvocation(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] = js.native
  
  @js.native
  trait GetInvocationArgs extends StObject {
    
    /**
      * The name of the lambda function.
      */
    val functionName: String = js.native
    
    /**
      * A string in JSON format that is passed as payload to the lambda function.
      */
    val input: String = js.native
    
    /**
      * The qualifier (a.k.a version) of the lambda function. Defaults
      * to `$LATEST`.
      */
    val qualifier: js.UndefOr[String] = js.native
  }
  object GetInvocationArgs {
    
    @scala.inline
    def apply(functionName: String, input: String): GetInvocationArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInvocationArgs]
    }
    
    @scala.inline
    implicit class GetInvocationArgsMutableBuilder[Self <: GetInvocationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
  
  @js.native
  trait GetInvocationResult extends StObject {
    
    val functionName: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val input: String = js.native
    
    val qualifier: js.UndefOr[String] = js.native
    
    /**
      * String result of the lambda function invocation.
      */
    val result: String = js.native
  }
  object GetInvocationResult {
    
    @scala.inline
    def apply(functionName: String, id: String, input: String, result: String): GetInvocationResult = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInvocationResult]
    }
    
    @scala.inline
    implicit class GetInvocationResultMutableBuilder[Self <: GetInvocationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
