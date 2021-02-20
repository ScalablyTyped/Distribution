package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): QueuePolicy = js.native
    @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): QueuePolicy = js.native
    @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: QueuePolicyState): QueuePolicy = js.native
    @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: QueuePolicyState, opts: CustomResourceOptions): QueuePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of QueuePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean = js.native
  }
  
  @js.native
  trait QueuePolicyArgs extends StObject {
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: Input[String | PolicyDocument] = js.native
    
    /**
      * The URL of the SQS Queue to which to attach the policy
      */
    val queueUrl: Input[String] = js.native
  }
  object QueuePolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String | PolicyDocument], queueUrl: Input[String]): QueuePolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], queueUrl = queueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuePolicyArgs]
    }
    
    @scala.inline
    implicit class QueuePolicyArgsMutableBuilder[Self <: QueuePolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrl(value: Input[String]): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueuePolicyState extends StObject {
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
    
    /**
      * The URL of the SQS Queue to which to attach the policy
      */
    val queueUrl: js.UndefOr[Input[String]] = js.native
  }
  object QueuePolicyState {
    
    @scala.inline
    def apply(): QueuePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueuePolicyState]
    }
    
    @scala.inline
    implicit class QueuePolicyStateMutableBuilder[Self <: QueuePolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setQueueUrl(value: Input[String]): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUrlUndefined: Self = StObject.set(x, "queueUrl", js.undefined)
    }
  }
}
