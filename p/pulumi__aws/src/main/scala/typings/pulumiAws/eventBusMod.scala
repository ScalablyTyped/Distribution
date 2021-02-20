package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventBusMod {
  
  @JSImport("@pulumi/aws/cloudwatch/eventBus", "EventBus")
  @js.native
  class EventBus protected () extends CustomResource {
    /**
      * Create a EventBus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventBusArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventBusArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the event bus.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the new event bus. The names of custom event buses can't contain the / character. Please note that a partner event bus is not supported at the moment.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object EventBus {
    
    /**
      * Get an existing EventBus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventBus", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID]): EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventBus", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventBus", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventBusState): EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventBus", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventBusState, opts: CustomResourceOptions): EventBus = js.native
    
    /**
      * Returns true if the given object is an instance of EventBus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventBus", "EventBus.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventBus.EventBus */ Boolean = js.native
  }
  
  @js.native
  trait EventBusArgs extends StObject {
    
    /**
      * The name of the new event bus. The names of custom event buses can't contain the / character. Please note that a partner event bus is not supported at the moment.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EventBusArgs {
    
    @scala.inline
    def apply(): EventBusArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventBusArgs]
    }
    
    @scala.inline
    implicit class EventBusArgsMutableBuilder[Self <: EventBusArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait EventBusState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the event bus.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the new event bus. The names of custom event buses can't contain the / character. Please note that a partner event bus is not supported at the moment.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EventBusState {
    
    @scala.inline
    def apply(): EventBusState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventBusState]
    }
    
    @scala.inline
    implicit class EventBusStateMutableBuilder[Self <: EventBusState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
