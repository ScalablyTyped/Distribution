package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queuePolicyMod {
  
  @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy")
  @js.native
  class QueuePolicy protected () extends CustomResource {
    /**
      * Create a QueuePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: QueuePolicyArgs) = this()
    def this(name: String, args: QueuePolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The URL of the SQS Queue to which to attach the policy
      */
    val queueUrl: Output_[String] = js.native
  }
  /* static members */
  object QueuePolicy {
    
    @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[QueuePolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[QueuePolicy]
    inline def get(name: String, id: Input[ID], state: QueuePolicyState): QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[QueuePolicy]
    inline def get(name: String, id: Input[ID], state: QueuePolicyState, opts: CustomResourceOptions): QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[QueuePolicy]
    
    /**
      * Returns true if the given object is an instance of QueuePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean]
  }
  
  trait QueuePolicyArgs extends StObject {
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: Input[String | PolicyDocument]
    
    /**
      * The URL of the SQS Queue to which to attach the policy
      */
    val queueUrl: Input[String]
  }
  object QueuePolicyArgs {
    
    inline def apply(policy: Input[String | PolicyDocument], queueUrl: Input[String]): QueuePolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuePolicyArgs]
    }
    
    extension [Self <: QueuePolicyArgs](x: Self) {
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setQueueUrl(value: Input[String]): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueuePolicyState extends StObject {
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * The URL of the SQS Queue to which to attach the policy
      */
    val queueUrl: js.UndefOr[Input[String]] = js.undefined
  }
  object QueuePolicyState {
    
    inline def apply(): QueuePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueuePolicyState]
    }
    
    extension [Self <: QueuePolicyState](x: Self) {
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setQueueUrl(value: Input[String]): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      inline def setQueueUrlUndefined: Self = StObject.set(x, "queueUrl", js.undefined)
    }
  }
}
