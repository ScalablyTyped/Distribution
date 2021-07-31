package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.mediaconvert.QueueReservationPlanSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("@pulumi/aws/mediaconvert/queue", "Queue")
  @js.native
  class Queue protected () extends CustomResource {
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
    
    /**
      * The Arn of the queue
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the queue
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A unique identifier describing the queue
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
      */
    val pricingPlan: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A detail pricing plan of the  reserved queue. See below.
      */
    val reservationPlanSettings: Output_[QueueReservationPlanSettings] = js.native
    
    /**
      * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
      */
    val status: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Queue {
    
    @JSImport("@pulumi/aws/mediaconvert/queue", "Queue")
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
    @scala.inline
    def get(name: String, id: Input[ID]): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Queue]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Queue]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueueState): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Queue]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Queue]
    
    /**
      * Returns true if the given object is an instance of Queue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediaconvert/queue.Queue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/mediaconvert/queue.Queue */ Boolean]
  }
  
  trait QueueArgs extends StObject {
    
    /**
      * A description of the queue
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique identifier describing the queue
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
      */
    val pricingPlan: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A detail pricing plan of the  reserved queue. See below.
      */
    val reservationPlanSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.mediaconvert.QueueReservationPlanSettings]] = js.undefined
    
    /**
      * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object QueueArgs {
    
    @scala.inline
    def apply(): QueueArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueArgs]
    }
    
    @scala.inline
    implicit class QueueArgsMutableBuilder[Self <: QueueArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPricingPlan(value: Input[String]): Self = StObject.set(x, "pricingPlan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPricingPlanUndefined: Self = StObject.set(x, "pricingPlan", js.undefined)
      
      @scala.inline
      def setReservationPlanSettings(value: Input[typings.pulumiAws.inputMod.mediaconvert.QueueReservationPlanSettings]): Self = StObject.set(x, "reservationPlanSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservationPlanSettingsUndefined: Self = StObject.set(x, "reservationPlanSettings", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait QueueState extends StObject {
    
    /**
      * The Arn of the queue
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the queue
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique identifier describing the queue
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
      */
    val pricingPlan: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A detail pricing plan of the  reserved queue. See below.
      */
    val reservationPlanSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.mediaconvert.QueueReservationPlanSettings]] = js.undefined
    
    /**
      * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object QueueState {
    
    @scala.inline
    def apply(): QueueState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueState]
    }
    
    @scala.inline
    implicit class QueueStateMutableBuilder[Self <: QueueState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPricingPlan(value: Input[String]): Self = StObject.set(x, "pricingPlan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPricingPlanUndefined: Self = StObject.set(x, "pricingPlan", js.undefined)
      
      @scala.inline
      def setReservationPlanSettings(value: Input[typings.pulumiAws.inputMod.mediaconvert.QueueReservationPlanSettings]): Self = StObject.set(x, "reservationPlanSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservationPlanSettingsUndefined: Self = StObject.set(x, "reservationPlanSettings", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
