package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambda {
  
  trait AliasRoutingConfig extends StObject {
    
    /**
      * A map that defines the proportion of events that should be sent to different versions of a lambda function.
      */
    var additionalVersionWeights: js.UndefOr[Input[StringDictionary[Input[Double]]]] = js.undefined
  }
  object AliasRoutingConfig {
    
    inline def apply(): AliasRoutingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasRoutingConfig]
    }
    
    extension [Self <: AliasRoutingConfig](x: Self) {
      
      inline def setAdditionalVersionWeights(value: Input[StringDictionary[Input[Double]]]): Self = StObject.set(x, "additionalVersionWeights", value.asInstanceOf[js.Any])
      
      inline def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "additionalVersionWeights", js.undefined)
    }
  }
  
  trait EventSourceMappingDestinationConfig extends StObject {
    
    /**
      * The destination configuration for failed invocations. Detailed below.
      */
    var onFailure: js.UndefOr[Input[EventSourceMappingDestinationConfigOnFailure]] = js.undefined
  }
  object EventSourceMappingDestinationConfig {
    
    inline def apply(): EventSourceMappingDestinationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSourceMappingDestinationConfig]
    }
    
    extension [Self <: EventSourceMappingDestinationConfig](x: Self) {
      
      inline def setOnFailure(value: Input[EventSourceMappingDestinationConfigOnFailure]): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    }
  }
  
  trait EventSourceMappingDestinationConfigOnFailure extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the destination resource.
      */
    var destinationArn: Input[String]
  }
  object EventSourceMappingDestinationConfigOnFailure {
    
    inline def apply(destinationArn: Input[String]): EventSourceMappingDestinationConfigOnFailure = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSourceMappingDestinationConfigOnFailure]
    }
    
    extension [Self <: EventSourceMappingDestinationConfigOnFailure](x: Self) {
      
      inline def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionDeadLetterConfig extends StObject {
    
    /**
      * The ARN of an SNS topic or SQS queue to notify when an invocation fails. If this
      * option is used, the function's IAM role must be granted suitable access to write to the target object,
      * which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on
      * which service is targeted.
      */
    var targetArn: Input[String]
  }
  object FunctionDeadLetterConfig {
    
    inline def apply(targetArn: Input[String]): FunctionDeadLetterConfig = {
      val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionDeadLetterConfig]
    }
    
    extension [Self <: FunctionDeadLetterConfig](x: Self) {
      
      inline def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionEnvironment extends StObject {
    
    /**
      * A map that defines environment variables for the Lambda function.
      */
    var variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FunctionEnvironment {
    
    inline def apply(): FunctionEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionEnvironment]
    }
    
    extension [Self <: FunctionEnvironment](x: Self) {
      
      inline def setVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait FunctionEventInvokeConfigDestinationConfig extends StObject {
    
    /**
      * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
      */
    var onFailure: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfigOnFailure]] = js.undefined
    
    /**
      * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
      */
    var onSuccess: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfigOnSuccess]] = js.undefined
  }
  object FunctionEventInvokeConfigDestinationConfig {
    
    inline def apply(): FunctionEventInvokeConfigDestinationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfig]
    }
    
    extension [Self <: FunctionEventInvokeConfigDestinationConfig](x: Self) {
      
      inline def setOnFailure(value: Input[FunctionEventInvokeConfigDestinationConfigOnFailure]): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setOnSuccess(value: Input[FunctionEventInvokeConfigDestinationConfigOnSuccess]): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  trait FunctionEventInvokeConfigDestinationConfigOnFailure extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
      */
    var destination: Input[String]
  }
  object FunctionEventInvokeConfigDestinationConfigOnFailure {
    
    inline def apply(destination: Input[String]): FunctionEventInvokeConfigDestinationConfigOnFailure = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfigOnFailure]
    }
    
    extension [Self <: FunctionEventInvokeConfigDestinationConfigOnFailure](x: Self) {
      
      inline def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionEventInvokeConfigDestinationConfigOnSuccess extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
      */
    var destination: Input[String]
  }
  object FunctionEventInvokeConfigDestinationConfigOnSuccess {
    
    inline def apply(destination: Input[String]): FunctionEventInvokeConfigDestinationConfigOnSuccess = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfigOnSuccess]
    }
    
    extension [Self <: FunctionEventInvokeConfigDestinationConfigOnSuccess](x: Self) {
      
      inline def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionFileSystemConfig extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
      */
    var arn: Input[String]
    
    /**
      * The path where the function can access the file system, starting with /mnt/.
      */
    var localMountPath: Input[String]
  }
  object FunctionFileSystemConfig {
    
    inline def apply(arn: Input[String], localMountPath: Input[String]): FunctionFileSystemConfig = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], localMountPath = localMountPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionFileSystemConfig]
    }
    
    extension [Self <: FunctionFileSystemConfig](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setLocalMountPath(value: Input[String]): Self = StObject.set(x, "localMountPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionTracingConfig extends StObject {
    
    /**
      * Can be either `PassThrough` or `Active`. If PassThrough, Lambda will only trace
      * the request from an upstream service if it contains a tracing header with
      * "sampled=1". If Active, Lambda will respect any tracing header it receives
      * from an upstream service. If no tracing header is received, Lambda will call
      * X-Ray for a tracing decision.
      */
    var mode: Input[String]
  }
  object FunctionTracingConfig {
    
    inline def apply(mode: Input[String]): FunctionTracingConfig = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionTracingConfig]
    }
    
    extension [Self <: FunctionTracingConfig](x: Self) {
      
      inline def setMode(value: Input[String]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionVpcConfig extends StObject {
    
    /**
      * A list of security group IDs associated with the Lambda function.
      */
    var securityGroupIds: Input[js.Array[Input[String]]]
    
    /**
      * A list of subnet IDs associated with the Lambda function.
      */
    var subnetIds: Input[js.Array[Input[String]]]
    
    var vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object FunctionVpcConfig {
    
    inline def apply(securityGroupIds: Input[js.Array[Input[String]]], subnetIds: Input[js.Array[Input[String]]]): FunctionVpcConfig = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionVpcConfig]
    }
    
    extension [Self <: FunctionVpcConfig](x: Self) {
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
