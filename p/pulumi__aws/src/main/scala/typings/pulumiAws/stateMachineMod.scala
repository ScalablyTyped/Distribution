package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMachineMod {
  
  @JSImport("@pulumi/aws/sfn/stateMachine", "StateMachine")
  @js.native
  class StateMachine protected () extends CustomResource {
    /**
      * Create a StateMachine resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StateMachineArgs) = this()
    def this(name: String, args: StateMachineArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the state machine.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The date the state machine was created.
      */
    val creationDate: Output_[String] = js.native
    
    /**
      * The Amazon States Language definition of the state machine.
      */
    val definition: Output_[String] = js.native
    
    /**
      * The name of the state machine.
      */
    val name: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The current status of the state machine. Either "ACTIVE" or "DELETING".
      */
    val status: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object StateMachine {
    
    @JSImport("@pulumi/aws/sfn/stateMachine", "StateMachine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StateMachine resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[StateMachine]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StateMachine]
    @scala.inline
    def get(name: String, id: Input[ID], state: StateMachineState): StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[StateMachine]
    @scala.inline
    def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StateMachine]
    
    /**
      * Returns true if the given object is an instance of StateMachine.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean]
  }
  
  trait StateMachineArgs extends StObject {
    
    /**
      * The Amazon States Language definition of the state machine.
      */
    val definition: Input[String]
    
    /**
      * The name of the state machine.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
      */
    val roleArn: Input[String]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object StateMachineArgs {
    
    @scala.inline
    def apply(definition: Input[String], roleArn: Input[String]): StateMachineArgs = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateMachineArgs]
    }
    
    @scala.inline
    implicit class StateMachineArgsMutableBuilder[Self <: StateMachineArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefinition(value: Input[String]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait StateMachineState extends StObject {
    
    /**
      * The ARN of the state machine.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The date the state machine was created.
      */
    val creationDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon States Language definition of the state machine.
      */
    val definition: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the state machine.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The current status of the state machine. Either "ACTIVE" or "DELETING".
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object StateMachineState {
    
    @scala.inline
    def apply(): StateMachineState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateMachineState]
    }
    
    @scala.inline
    implicit class StateMachineStateMutableBuilder[Self <: StateMachineState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreationDate(value: Input[String]): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setDefinition(value: Input[String]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
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
