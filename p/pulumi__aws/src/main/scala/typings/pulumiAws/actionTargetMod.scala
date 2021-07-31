package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionTargetMod {
  
  @JSImport("@pulumi/aws/securityhub/actionTarget", "ActionTarget")
  @js.native
  class ActionTarget protected () extends CustomResource {
    /**
      * Create a ActionTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActionTargetArgs) = this()
    def this(name: String, args: ActionTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the Security Hub custom action target.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the custom action target.
      */
    val description: Output_[String] = js.native
    
    /**
      * The ID for the custom action target.
      */
    val identifier: Output_[String] = js.native
    
    /**
      * The description for the custom action target.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object ActionTarget {
    
    @JSImport("@pulumi/aws/securityhub/actionTarget", "ActionTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ActionTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ActionTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ActionTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ActionTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ActionTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: ActionTargetState): ActionTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ActionTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: ActionTargetState, opts: CustomResourceOptions): ActionTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ActionTarget]
    
    /**
      * Returns true if the given object is an instance of ActionTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/actionTarget.ActionTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/securityhub/actionTarget.ActionTarget */ Boolean]
  }
  
  trait ActionTargetArgs extends StObject {
    
    /**
      * The name of the custom action target.
      */
    val description: Input[String]
    
    /**
      * The ID for the custom action target.
      */
    val identifier: Input[String]
    
    /**
      * The description for the custom action target.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ActionTargetArgs {
    
    @scala.inline
    def apply(description: Input[String], identifier: Input[String]): ActionTargetArgs = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionTargetArgs]
    }
    
    @scala.inline
    implicit class ActionTargetArgsMutableBuilder[Self <: ActionTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ActionTargetState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the Security Hub custom action target.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the custom action target.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID for the custom action target.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description for the custom action target.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ActionTargetState {
    
    @scala.inline
    def apply(): ActionTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionTargetState]
    }
    
    @scala.inline
    implicit class ActionTargetStateMutableBuilder[Self <: ActionTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
