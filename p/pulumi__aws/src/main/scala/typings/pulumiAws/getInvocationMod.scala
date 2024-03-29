package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInvocationMod {
  
  @JSImport("@pulumi/aws/lambda/getInvocation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInvocation(args: GetInvocationArgs): js.Promise[GetInvocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInvocation")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInvocationResult]]
  inline def getInvocation(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInvocation")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInvocationResult]]
  
  trait GetInvocationArgs extends StObject {
    
    /**
      * The name of the lambda function.
      */
    val functionName: String
    
    /**
      * A string in JSON format that is passed as payload to the lambda function.
      */
    val input: String
    
    /**
      * The qualifier (a.k.a version) of the lambda function. Defaults
      * to `$LATEST`.
      */
    val qualifier: js.UndefOr[String] = js.undefined
  }
  object GetInvocationArgs {
    
    inline def apply(functionName: String, input: String): GetInvocationArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInvocationArgs]
    }
    
    extension [Self <: GetInvocationArgs](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
  
  trait GetInvocationResult extends StObject {
    
    val functionName: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val input: String
    
    val qualifier: js.UndefOr[String] = js.undefined
    
    /**
      * String result of the lambda function invocation.
      */
    val result: String
  }
  object GetInvocationResult {
    
    inline def apply(functionName: String, id: String, input: String, result: String): GetInvocationResult = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInvocationResult]
    }
    
    extension [Self <: GetInvocationResult](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
