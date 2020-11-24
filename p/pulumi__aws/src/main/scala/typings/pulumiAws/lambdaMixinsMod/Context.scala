package typings.pulumiAws.lambdaMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /**
    * AWS request ID associated with the request. This is the ID returned to the client that called
    * the invoke method.
    *
    * If AWS Lambda retries the invocation (for example, in a situation where the Lambda function
    * that is processing Kinesis records throws an exception), the request ID remains the same.
    */
  val awsRequestId: String = js.native
  
  /**
    * The default value is true. This property is useful only to modify the default behavior of the
    * callback. By default, the callback will wait until the event loop is empty before freezing
    * the process and returning the results to the caller. You can set this property to false to
    * request AWS Lambda to freeze the process soon after the callback is called, even if there are
    * events in the event loop. AWS Lambda will freeze the process, any state data and the events
    * in the event loop (any remaining events in the event loop processed when the Lambda function
    * is called next and if AWS Lambda chooses to use the frozen process).
    */
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  
  /**
    * Information about the client application and device when invoked through the AWS Mobile SDK.
    * It can be null.
    */
  val clientContext: js.Any = js.native
  
  /**
    * Name of the Lambda function that is executing.
    */
  val functionName: String = js.native
  
  /**
    * The Lambda function version that is executing. If an alias is used to invoke the function,
    * then function_version will be the version the alias points to.
    */
  val functionVersion: String = js.native
  
  /**
    * Returns the approximate remaining execution time (before timeout occurs) of the Lambda
    * function that is currently executing. The timeout is one of the Lambda function
    * configuration. When the timeout reaches, AWS Lambda terminates your Lambda function.
    *
    * You can use this method to check the remaining time during your function execution and take
    * appropriate corrective action at run time.
    */
  def getRemainingTimeInMillis(): String = js.native
  
  /**
    * Information about the Amazon Cognito identity provider when invoked through the AWS Mobile
    * SDK. It can be null.
    */
  val identity: js.Any = js.native
  
  /**
    * The ARN used to invoke this function. It can be a function ARN or an alias ARN. An
    * unqualified ARN executes the $LATEST version and aliases execute the function version it is
    * pointing to.
    */
  val invokedFunctionArn: String = js.native
  
  /**
    * The name of the CloudWatch log group where you can find logs written by your Lambda function.
    */
  val logGroupName: String = js.native
  
  /**
    * The name of the CloudWatch log group where you can find logs written by your Lambda function.
    * The log stream may or may not change for each invocation of the Lambda function.
    *
    * The value is null if your Lambda function is unable to create a log stream, which can happen
    * if the execution role that grants necessary permissions to the Lambda function does not
    * include permissions for the CloudWatch actions.
    */
  val logStreamName: String = js.native
  
  /**
    * Memory limit, in MB, you configured for the Lambda function. You set the memory limit at the
    * time you create a Lambda function and you can change it later.
    */
  val memoryLimitInMB: String = js.native
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
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsRequestId(value: String): Self = this.set("awsRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = this.set("callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientContext(value: js.Any): Self = this.set("clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRemainingTimeInMillis(value: () => String): Self = this.set("getRemainingTimeInMillis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdentity(value: js.Any): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokedFunctionArn(value: String): Self = this.set("invokedFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupName(value: String): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamName(value: String): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryLimitInMB(value: String): Self = this.set("memoryLimitInMB", value.asInstanceOf[js.Any])
  }
}
