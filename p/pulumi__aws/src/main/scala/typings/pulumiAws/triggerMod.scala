package typings.pulumiAws

import typings.pulumiAws.outputMod.codecommit.TriggerTrigger
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerMod {
  
  @JSImport("@pulumi/aws/codecommit/trigger", "Trigger")
  @js.native
  class Trigger protected () extends CustomResource {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
    
    val configurationId: Output_[String] = js.native
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: Output_[String] = js.native
    
    val triggers: Output_[js.Array[TriggerTrigger]] = js.native
  }
  /* static members */
  object Trigger {
    
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codecommit/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID]): Trigger = js.native
    @JSImport("@pulumi/aws/codecommit/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Trigger = js.native
    @JSImport("@pulumi/aws/codecommit/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: TriggerState): Trigger = js.native
    @JSImport("@pulumi/aws/codecommit/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): Trigger = js.native
    
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codecommit/trigger", "Trigger.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = js.native
  }
  
  @js.native
  trait TriggerArgs extends StObject {
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: Input[String] = js.native
    
    val triggers: Input[js.Array[Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]]] = js.native
  }
  object TriggerArgs {
    
    @scala.inline
    def apply(
      repositoryName: Input[String],
      triggers: Input[js.Array[Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]]]
    ): TriggerArgs = {
      val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerArgs]
    }
    
    @scala.inline
    implicit class TriggerArgsMutableBuilder[Self <: TriggerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryName(value: Input[String]): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersVarargs(value: Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TriggerState extends StObject {
    
    val configurationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the repository. This needs to be less than 100 characters.
      */
    val repositoryName: js.UndefOr[Input[String]] = js.native
    
    val triggers: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]]]] = js.native
  }
  object TriggerState {
    
    @scala.inline
    def apply(): TriggerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerState]
    }
    
    @scala.inline
    implicit class TriggerStateMutableBuilder[Self <: TriggerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigurationId(value: Input[String]): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
      
      @scala.inline
      def setRepositoryName(value: Input[String]): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
      
      @scala.inline
      def setTriggers(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
      
      @scala.inline
      def setTriggersVarargs(value: Input[typings.pulumiAws.inputMod.codecommit.TriggerTrigger]*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    }
  }
}
