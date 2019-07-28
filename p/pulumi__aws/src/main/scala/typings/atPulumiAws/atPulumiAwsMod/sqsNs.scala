package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.sqsGetQueueMod.GetQueueArgs
import typings.atPulumiAws.sqsGetQueueMod.GetQueueResult
import typings.atPulumiAws.sqsQueueMod.QueueArgs
import typings.atPulumiAws.sqsQueueMod.QueueState
import typings.atPulumiAws.sqsQueuePolicyMod.QueuePolicyArgs
import typings.atPulumiAws.sqsQueuePolicyMod.QueuePolicyState
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventHandler
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscriptionArgs
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs")
@js.native
object sqsNs extends js.Object {
  @js.native
  class Queue protected ()
    extends typings.atPulumiAws.sqsMod.Queue {
    /**
      * Create a Queue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: QueueArgs) = this()
    def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class QueueEventSubscription protected ()
    extends typings.atPulumiAws.sqsMod.QueueEventSubscription {
    def this(
      name: String,
      queue: typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue,
      handler: QueueEventHandler
    ) = this()
    def this(
      name: String,
      queue: typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      queue: typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @js.native
  class QueuePolicy protected ()
    extends typings.atPulumiAws.sqsMod.QueuePolicy {
    /**
      * Create a QueuePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: QueuePolicyArgs) = this()
    def this(name: String, args: QueuePolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getQueue(args: GetQueueArgs): js.Promise[GetQueueResult] with GetQueueResult = js.native
  def getQueue(args: GetQueueArgs, opts: InvokeOptions): js.Promise[GetQueueResult] with GetQueueResult = js.native
  /* static members */
  @js.native
  object Queue extends js.Object {
    /**
      * Get an existing Queue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
    def get(name: String, id: Input[ID], state: QueueState): typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
    def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
    /**
      * Returns true if the given object is an instance of Queue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/sqsMixins.@pulumi/aws/sqs/queue.Queue */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object QueuePolicy extends js.Object {
    /**
      * Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.sqsQueuePolicyMod.QueuePolicy = js.native
    def get(name: String, id: Input[ID], state: QueuePolicyState): typings.atPulumiAws.sqsQueuePolicyMod.QueuePolicy = js.native
    def get(name: String, id: Input[ID], state: QueuePolicyState, opts: CustomResourceOptions): typings.atPulumiAws.sqsQueuePolicyMod.QueuePolicy = js.native
    /**
      * Returns true if the given object is an instance of QueuePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean = js.native
  }
  
}

