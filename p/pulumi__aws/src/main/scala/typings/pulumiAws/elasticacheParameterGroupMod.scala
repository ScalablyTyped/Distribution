package typings.pulumiAws

import typings.pulumiAws.outputMod.elasticache.ParameterGroupParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticacheParameterGroupMod {
  
  @JSImport("@pulumi/aws/elasticache/parameterGroup", "ParameterGroup")
  @js.native
  class ParameterGroup protected () extends CustomResource {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of the ElastiCache parameter group. Defaults to "Managed by Pulumi".
      */
    val description: Output_[String] = js.native
    
    /**
      * The family of the ElastiCache parameter group.
      */
    val family: Output_[String] = js.native
    
    /**
      * The name of the ElastiCache parameter.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of ElastiCache parameters to apply.
      */
    val parameters: Output_[js.UndefOr[js.Array[ParameterGroupParameter]]] = js.native
  }
  /* static members */
  object ParameterGroup {
    
    @JSImport("@pulumi/aws/elasticache/parameterGroup", "ParameterGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ParameterGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParameterGroup]
    inline def get(name: String, id: Input[ID], state: ParameterGroupState): ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ParameterGroup]
    inline def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): ParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParameterGroup]
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/parameterGroup.ParameterGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticache/parameterGroup.ParameterGroup */ Boolean]
  }
  
  trait ParameterGroupArgs extends StObject {
    
    /**
      * The description of the ElastiCache parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The family of the ElastiCache parameter group.
      */
    val family: Input[String]
    
    /**
      * The name of the ElastiCache parameter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of ElastiCache parameters to apply.
      */
    val parameters: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.elasticache.ParameterGroupParameter]]]
      ] = js.undefined
  }
  object ParameterGroupArgs {
    
    inline def apply(family: Input[String]): ParameterGroupArgs = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupArgs]
    }
    
    extension [Self <: ParameterGroupArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elasticache.ParameterGroupParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.elasticache.ParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
  
  trait ParameterGroupState extends StObject {
    
    /**
      * The description of the ElastiCache parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The family of the ElastiCache parameter group.
      */
    val family: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the ElastiCache parameter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of ElastiCache parameters to apply.
      */
    val parameters: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.elasticache.ParameterGroupParameter]]]
      ] = js.undefined
  }
  object ParameterGroupState {
    
    inline def apply(): ParameterGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParameterGroupState]
    }
    
    extension [Self <: ParameterGroupState](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParameters(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elasticache.ParameterGroupParameter]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.elasticache.ParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
}
