package typings.pulumiAws

import typings.pulumiAws.anon.Code
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.lambdaFunctionMod.Function
import typings.pulumiAws.lambdaFunctionMod.FunctionArgs
import typings.pulumiAws.permissionMod.Permission
import typings.pulumiAws.utilsMod.Overwrite
import typings.pulumiPulumi.mod.ComponentResource
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaMixinsMod {
  
  @JSImport("@pulumi/aws/lambda/lambdaMixins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/lambda/lambdaMixins", "CallbackFunction")
  @js.native
  class CallbackFunction[E, R] protected () extends Function {
    def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
    def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
  }
  
  @JSImport("@pulumi/aws/lambda/lambdaMixins", "EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends ComponentResource[js.Any] {
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
    
    var func: Function = js.native
    
    var permission: Permission = js.native
  }
  
  @scala.inline
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R]): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctionFromEventHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Function]
  @scala.inline
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctionFromEventHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Function]
  
  @scala.inline
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventHandler")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean]
  
  type BaseCallbackFunctionArgs = Overwrite[FunctionArgs, Code]
  
  type Callback[E, R] = js.Function3[
    /* event */ E, 
    /* context */ Context, 
    /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit], 
    js.Promise[R] | Unit
  ]
  
  type CallbackFactory[E, R] = js.Function0[Callback[E, R]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @pulumi/aws.@pulumi/aws/utils.Diff<keyof @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, keyof @pulumi/aws.anon.Code> ]: @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs[P]} */ trait CallbackFunctionArgs[E, R]
    extends StObject
       with Code {
    
    /**
      * The Javascript callback to use as the entrypoint for the AWS Lambda out of.  Either
      * [callback] or [callbackFactory] must be provided.
      */
    var callback: js.UndefOr[Callback[E, R]] = js.undefined
    
    /**
      * The Javascript function instance that will be called to produce the callback function that is
      * the entrypoint for the AWS Lambda. Either [callback] or [callbackFactory] must be
      * provided.
      *
      * This form is useful when there is expensive initialization work that should only be executed
      * once.  The factory-function will be invoked once when the final AWS Lambda module is loaded.
      * It can run whatever code it needs, and will end by returning the actual function that Lambda
      * will call into each time the Lambda is invoked.
      */
    var callbackFactory: js.UndefOr[CallbackFactory[E, R]] = js.undefined
  }
  object CallbackFunctionArgs {
    
    @scala.inline
    def apply[E, R](): CallbackFunctionArgs[E, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackFunctionArgs[E, R]]
    }
    
    @scala.inline
    implicit class CallbackFunctionArgsMutableBuilder[Self <: CallbackFunctionArgs[?, ?], E, R] (val x: Self & (CallbackFunctionArgs[E, R])) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: (E, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit]) => js.Promise[R] | Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackFactory(value: () => Callback[E, R]): Self = StObject.set(x, "callbackFactory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackFactoryUndefined: Self = StObject.set(x, "callbackFactory", js.undefined)
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    /**
      * AWS request ID associated with the request. This is the ID returned to the client that called
      * the invoke method.
      *
      * If AWS Lambda retries the invocation (for example, in a situation where the Lambda function
      * that is processing Kinesis records throws an exception), the request ID remains the same.
      */
    val awsRequestId: String
    
    /**
      * The default value is true. This property is useful only to modify the default behavior of the
      * callback. By default, the callback will wait until the event loop is empty before freezing
      * the process and returning the results to the caller. You can set this property to false to
      * request AWS Lambda to freeze the process soon after the callback is called, even if there are
      * events in the event loop. AWS Lambda will freeze the process, any state data and the events
      * in the event loop (any remaining events in the event loop processed when the Lambda function
      * is called next and if AWS Lambda chooses to use the frozen process).
      */
    var callbackWaitsForEmptyEventLoop: Boolean
    
    /**
      * Information about the client application and device when invoked through the AWS Mobile SDK.
      * It can be null.
      */
    val clientContext: js.Any
    
    /**
      * Name of the Lambda function that is executing.
      */
    val functionName: String
    
    /**
      * The Lambda function version that is executing. If an alias is used to invoke the function,
      * then function_version will be the version the alias points to.
      */
    val functionVersion: String
    
    /**
      * Returns the approximate remaining execution time (before timeout occurs) of the Lambda
      * function that is currently executing. The timeout is one of the Lambda function
      * configuration. When the timeout reaches, AWS Lambda terminates your Lambda function.
      *
      * You can use this method to check the remaining time during your function execution and take
      * appropriate corrective action at run time.
      */
    def getRemainingTimeInMillis(): String
    
    /**
      * Information about the Amazon Cognito identity provider when invoked through the AWS Mobile
      * SDK. It can be null.
      */
    val identity: js.Any
    
    /**
      * The ARN used to invoke this function. It can be a function ARN or an alias ARN. An
      * unqualified ARN executes the $LATEST version and aliases execute the function version it is
      * pointing to.
      */
    val invokedFunctionArn: String
    
    /**
      * The name of the CloudWatch log group where you can find logs written by your Lambda function.
      */
    val logGroupName: String
    
    /**
      * The name of the CloudWatch log group where you can find logs written by your Lambda function.
      * The log stream may or may not change for each invocation of the Lambda function.
      *
      * The value is null if your Lambda function is unable to create a log stream, which can happen
      * if the execution role that grants necessary permissions to the Lambda function does not
      * include permissions for the CloudWatch actions.
      */
    val logStreamName: String
    
    /**
      * Memory limit, in MB, you configured for the Lambda function. You set the memory limit at the
      * time you create a Lambda function and you can change it later.
      */
    val memoryLimitInMB: String
  }
  object Context {
    
    @scala.inline
    def apply(
      awsRequestId: String,
      callbackWaitsForEmptyEventLoop: Boolean,
      clientContext: js.Any,
      functionName: String,
      functionVersion: String,
      getRemainingTimeInMillis: () => String,
      identity: js.Any,
      invokedFunctionArn: String,
      logGroupName: String,
      logStreamName: String,
      memoryLimitInMB: String
    ): Context = {
      val __obj = js.Dynamic.literal(awsRequestId = awsRequestId.asInstanceOf[js.Any], callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], clientContext = clientContext.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], getRemainingTimeInMillis = js.Any.fromFunction0(getRemainingTimeInMillis), identity = identity.asInstanceOf[js.Any], invokedFunctionArn = invokedFunctionArn.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any], memoryLimitInMB = memoryLimitInMB.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRequestId(value: String): Self = StObject.set(x, "awsRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientContext(value: js.Any): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRemainingTimeInMillis(value: () => String): Self = StObject.set(x, "getRemainingTimeInMillis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIdentity(value: js.Any): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokedFunctionArn(value: String): Self = StObject.set(x, "invokedFunctionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupName(value: String): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryLimitInMB(value: String): Self = StObject.set(x, "memoryLimitInMB", value.asInstanceOf[js.Any])
    }
  }
  
  type EventHandler[E, R] = (Callback[E, R]) | Function
  
  /* augmented module */
  object pulumiAwsLambdaFunctionAugmentingMod {
    
    @js.native
    trait Function extends StObject {
      
      /**
        * Actual Role instance value for this Function.  Will only be set if this function was
        * created from [createFunction]
        */
      var roleInstance: js.UndefOr[Role] = js.native
    }
  }
}
