package typings.pulumiAws

import typings.pulumiAws.outputMod.cloudwatch.EventTargetBatchTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetEcsTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetInputTransformer
import typings.pulumiAws.outputMod.cloudwatch.EventTargetKinesisTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetRunCommandTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetSqsTarget
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTargetMod {
  
  @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget")
  @js.native
  class EventTarget protected () extends CustomResource {
    /**
      * Create a EventTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventTargetArgs) = this()
    def this(name: String, args: EventTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) associated of the target.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
      */
    val batchTarget: Output_[js.UndefOr[EventTargetBatchTarget]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
      */
    val ecsTarget: Output_[js.UndefOr[EventTargetEcsTarget]] = js.native
    
    /**
      * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Valid JSON text passed to the target. Conflicts with `inputPath` and `inputTransformer`.
      */
    val input: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `inputTransformer`.
      */
    val inputPath: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
      */
    val inputTransformer: Output_[js.UndefOr[EventTargetInputTransformer]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
      */
    val kinesisTarget: Output_[js.UndefOr[EventTargetKinesisTarget]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
      */
    val roleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the rule you want to add targets to.
      */
    val rule: Output_[String] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
      */
    val runCommandTargets: Output_[js.UndefOr[js.Array[EventTargetRunCommandTarget]]] = js.native
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
      */
    val sqsTarget: Output_[js.UndefOr[EventTargetSqsTarget]] = js.native
    
    /**
      * The unique target assignment ID.  If missing, will generate a random, unique id.
      */
    val targetId: Output_[String] = js.native
  }
  /* static members */
  object EventTarget {
    
    @JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EventTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EventTarget]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EventTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventTarget]
    inline def get(name: String, id: Input[ID], state: EventTargetState): EventTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EventTarget]
    inline def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): EventTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventTarget]
    
    /**
      * Returns true if the given object is an instance of EventTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean]
  }
  
  trait EventTargetArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated of the target.
      */
    val arn: Input[String]
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
      */
    val batchTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
      */
    val ecsTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]] = js.undefined
    
    /**
      * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Valid JSON text passed to the target. Conflicts with `inputPath` and `inputTransformer`.
      */
    val input: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `inputTransformer`.
      */
    val inputPath: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
      */
    val inputTransformer: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
      */
    val kinesisTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the rule you want to add targets to.
      */
    val rule: Input[String]
    
    /**
      * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
      */
    val runCommandTargets: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
        ]
      ] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
      */
    val sqsTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]] = js.undefined
    
    /**
      * The unique target assignment ID.  If missing, will generate a random, unique id.
      */
    val targetId: js.UndefOr[Input[String]] = js.undefined
  }
  object EventTargetArgs {
    
    inline def apply(arn: Input[String], rule: Input[String]): EventTargetArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTargetArgs]
    }
    
    extension [Self <: EventTargetArgs](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setBatchTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]): Self = StObject.set(x, "batchTarget", value.asInstanceOf[js.Any])
      
      inline def setBatchTargetUndefined: Self = StObject.set(x, "batchTarget", js.undefined)
      
      inline def setEcsTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]): Self = StObject.set(x, "ecsTarget", value.asInstanceOf[js.Any])
      
      inline def setEcsTargetUndefined: Self = StObject.set(x, "ecsTarget", js.undefined)
      
      inline def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      inline def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      inline def setInput(value: Input[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputPath(value: Input[String]): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
      
      inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
      
      inline def setInputTransformer(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
      
      inline def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setKinesisTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]): Self = StObject.set(x, "kinesisTarget", value.asInstanceOf[js.Any])
      
      inline def setKinesisTargetUndefined: Self = StObject.set(x, "kinesisTarget", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRunCommandTargets(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
            ]
      ): Self = StObject.set(x, "runCommandTargets", value.asInstanceOf[js.Any])
      
      inline def setRunCommandTargetsUndefined: Self = StObject.set(x, "runCommandTargets", js.undefined)
      
      inline def setRunCommandTargetsVarargs(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]*): Self = StObject.set(x, "runCommandTargets", js.Array(value :_*))
      
      inline def setSqsTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]): Self = StObject.set(x, "sqsTarget", value.asInstanceOf[js.Any])
      
      inline def setSqsTargetUndefined: Self = StObject.set(x, "sqsTarget", js.undefined)
      
      inline def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
  
  trait EventTargetState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) associated of the target.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
      */
    val batchTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
      */
    val ecsTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]] = js.undefined
    
    /**
      * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Valid JSON text passed to the target. Conflicts with `inputPath` and `inputTransformer`.
      */
    val input: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `inputTransformer`.
      */
    val inputPath: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `inputPath`.
      */
    val inputTransformer: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
      */
    val kinesisTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the rule you want to add targets to.
      */
    val rule: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
      */
    val runCommandTargets: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
        ]
      ] = js.undefined
    
    /**
      * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
      */
    val sqsTarget: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]] = js.undefined
    
    /**
      * The unique target assignment ID.  If missing, will generate a random, unique id.
      */
    val targetId: js.UndefOr[Input[String]] = js.undefined
  }
  object EventTargetState {
    
    inline def apply(): EventTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTargetState]
    }
    
    extension [Self <: EventTargetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBatchTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget]): Self = StObject.set(x, "batchTarget", value.asInstanceOf[js.Any])
      
      inline def setBatchTargetUndefined: Self = StObject.set(x, "batchTarget", js.undefined)
      
      inline def setEcsTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget]): Self = StObject.set(x, "ecsTarget", value.asInstanceOf[js.Any])
      
      inline def setEcsTargetUndefined: Self = StObject.set(x, "ecsTarget", js.undefined)
      
      inline def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      inline def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      inline def setInput(value: Input[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputPath(value: Input[String]): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
      
      inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
      
      inline def setInputTransformer(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer]): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
      
      inline def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setKinesisTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget]): Self = StObject.set(x, "kinesisTarget", value.asInstanceOf[js.Any])
      
      inline def setKinesisTargetUndefined: Self = StObject.set(x, "kinesisTarget", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setRunCommandTargets(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]]
            ]
      ): Self = StObject.set(x, "runCommandTargets", value.asInstanceOf[js.Any])
      
      inline def setRunCommandTargetsUndefined: Self = StObject.set(x, "runCommandTargets", js.undefined)
      
      inline def setRunCommandTargetsVarargs(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget]*): Self = StObject.set(x, "runCommandTargets", js.Array(value :_*))
      
      inline def setSqsTarget(value: Input[typings.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget]): Self = StObject.set(x, "sqsTarget", value.asInstanceOf[js.Any])
      
      inline def setSqsTargetUndefined: Self = StObject.set(x, "sqsTarget", js.undefined)
      
      inline def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
}
