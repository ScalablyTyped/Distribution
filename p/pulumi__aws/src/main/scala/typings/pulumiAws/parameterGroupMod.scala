package typings.pulumiAws

import typings.pulumiAws.outputMod.dax.ParameterGroupParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterGroupMod {
  
  @JSImport("@pulumi/aws/dax/parameterGroup", "ParameterGroup")
  @js.native
  class ParameterGroup protected () extends CustomResource {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A description of the parameter group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the parameter group.
      */
    val name: Output_[String] = js.native
    
    /**
      * The parameters of the parameter group.
      */
    val parameters: Output_[js.Array[ParameterGroupParameter]] = js.native
  }
  /* static members */
  object ParameterGroup {
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dax/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): ParameterGroup = js.native
    @JSImport("@pulumi/aws/dax/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ParameterGroup = js.native
    @JSImport("@pulumi/aws/dax/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): ParameterGroup = js.native
    @JSImport("@pulumi/aws/dax/parameterGroup", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dax/parameterGroup", "ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @js.native
  trait ParameterGroupArgs extends StObject {
    
    /**
      * A description of the parameter group.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the parameter group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The parameters of the parameter group.
      */
    val parameters: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dax.ParameterGroupParameter]]]] = js.native
  }
  object ParameterGroupArgs {
    
    @scala.inline
    def apply(): ParameterGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterGroupArgs]
    }
    
    @scala.inline
    implicit class ParameterGroupArgsMutableBuilder[Self <: ParameterGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dax.ParameterGroupParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.dax.ParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ParameterGroupState extends StObject {
    
    /**
      * A description of the parameter group.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the parameter group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The parameters of the parameter group.
      */
    val parameters: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dax.ParameterGroupParameter]]]] = js.native
  }
  object ParameterGroupState {
    
    @scala.inline
    def apply(): ParameterGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterGroupState]
    }
    
    @scala.inline
    implicit class ParameterGroupStateMutableBuilder[Self <: ParameterGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dax.ParameterGroupParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.dax.ParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
}
