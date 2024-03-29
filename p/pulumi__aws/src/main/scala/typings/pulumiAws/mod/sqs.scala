package typings.pulumiAws.mod

import typings.pulumiAws.getQueueMod.GetQueueArgs
import typings.pulumiAws.getQueueMod.GetQueueResult
import typings.pulumiAws.queuePolicyMod.QueuePolicyArgs
import typings.pulumiAws.queuePolicyMod.QueuePolicyState
import typings.pulumiAws.sqsMixinsMod.QueueEventHandler
import typings.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typings.pulumiAws.sqsQueueMod.QueueArgs
import typings.pulumiAws.sqsQueueMod.QueueState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqs {
  
  @JSImport("@pulumi/aws", "sqs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "sqs.Queue")
  @js.native
  class Queue protected ()
    extends typings.pulumiAws.sqsMod.Queue {
    /**
      * Create a Queue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: QueueArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Queue {
    
    @JSImport("@pulumi/aws", "sqs.Queue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Queue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.sqsQueueMod.Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sqsQueueMod.Queue]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.sqsQueueMod.Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sqsQueueMod.Queue]
    inline def get(name: String, id: Input[ID], state: QueueState): typings.pulumiAws.sqsQueueMod.Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sqsQueueMod.Queue]
    inline def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): typings.pulumiAws.sqsQueueMod.Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sqsQueueMod.Queue]
    
    /**
      * Returns true if the given object is an instance of Queue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queue.Queue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sqs/queue.Queue */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "sqs.QueueEventSubscription")
  @js.native
  class QueueEventSubscription protected ()
    extends typings.pulumiAws.sqsMod.QueueEventSubscription {
    def this(name: String, queue: typings.pulumiAws.sqsQueueMod.Queue, handler: QueueEventHandler) = this()
    def this(
      name: String,
      queue: typings.pulumiAws.sqsQueueMod.Queue,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      queue: typings.pulumiAws.sqsQueueMod.Queue,
      handler: QueueEventHandler,
      args: Unit,
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      queue: typings.pulumiAws.sqsQueueMod.Queue,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws", "sqs.QueuePolicy")
  @js.native
  class QueuePolicy protected ()
    extends typings.pulumiAws.sqsMod.QueuePolicy {
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
  /* static members */
  object QueuePolicy {
    
    @JSImport("@pulumi/aws", "sqs.QueuePolicy")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.queuePolicyMod.QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queuePolicyMod.QueuePolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.queuePolicyMod.QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queuePolicyMod.QueuePolicy]
    inline def get(name: String, id: Input[ID], state: QueuePolicyState): typings.pulumiAws.queuePolicyMod.QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queuePolicyMod.QueuePolicy]
    inline def get(name: String, id: Input[ID], state: QueuePolicyState, opts: CustomResourceOptions): typings.pulumiAws.queuePolicyMod.QueuePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queuePolicyMod.QueuePolicy]
    
    /**
      * Returns true if the given object is an instance of QueuePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean]
  }
  
  inline def getQueue(args: GetQueueArgs): js.Promise[GetQueueResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueue")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetQueueResult]]
  inline def getQueue(args: GetQueueArgs, opts: InvokeOptions): js.Promise[GetQueueResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueue")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetQueueResult]]
  
  /* augmented module */
  object pulumiAwsSqsQueueAugmentingMod {
    
    @js.native
    trait Queue extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Queue to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: QueueEventHandler): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
      def onEvent(name: String, handler: QueueEventHandler, args: Unit, opts: ComponentResourceOptions): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
      def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
      def onEvent(
        name: String,
        handler: QueueEventHandler,
        args: QueueEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
    }
  }
}
