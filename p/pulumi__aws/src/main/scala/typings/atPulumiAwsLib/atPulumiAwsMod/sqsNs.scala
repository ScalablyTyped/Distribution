package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs")
@js.native
object sqsNs extends js.Object {
  @js.native
  class Queue protected ()
    extends atPulumiAwsLib.sqsMod.Queue {
    /**
      * Create a Queue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueueMod.QueueArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueueMod.QueueArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class QueueEventSubscription protected ()
    extends atPulumiAwsLib.sqsMod.QueueEventSubscription {
    def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler) = this()
    def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler, args: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscriptionArgs) = this()
    def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler, args: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class QueuePolicy protected ()
    extends atPulumiAwsLib.sqsMod.QueuePolicy {
    /**
      * Create a QueuePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getQueue(args: atPulumiAwsLib.sqsGetQueueMod.GetQueueArgs): js.Promise[atPulumiAwsLib.sqsGetQueueMod.GetQueueResult] = js.native
  def getQueue(args: atPulumiAwsLib.sqsGetQueueMod.GetQueueArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.sqsGetQueueMod.GetQueueResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.sqsQueueMod.QueueState
    ): atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.sqsQueueMod.QueueState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyState
    ): atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.sqsQueuePolicyMod.QueuePolicy = js.native
  }
  
}

