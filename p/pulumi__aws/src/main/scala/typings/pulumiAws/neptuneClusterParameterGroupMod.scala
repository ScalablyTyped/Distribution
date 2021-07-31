package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.neptune.ClusterParameterGroupParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptuneClusterParameterGroupMod {
  
  @JSImport("@pulumi/aws/neptune/clusterParameterGroup", "ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected () extends CustomResource {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterParameterGroupArgs) = this()
    def this(name: String, args: ClusterParameterGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the neptune cluster parameter group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The family of the neptune cluster parameter group.
      */
    val family: Output_[String] = js.native
    
    /**
      * The name of the neptune parameter.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[String] = js.native
    
    /**
      * A list of neptune parameters to apply.
      */
    val parameters: Output_[js.UndefOr[js.Array[ClusterParameterGroupParameter]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ClusterParameterGroup {
    
    @JSImport("@pulumi/aws/neptune/clusterParameterGroup", "ClusterParameterGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterParameterGroup]
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterParameterGroup.ClusterParameterGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/neptune/clusterParameterGroup.ClusterParameterGroup */ Boolean]
  }
  
  trait ClusterParameterGroupArgs extends StObject {
    
    /**
      * The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The family of the neptune cluster parameter group.
      */
    val family: Input[String]
    
    /**
      * The name of the neptune parameter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of neptune parameters to apply.
      */
    val parameters: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.neptune.ClusterParameterGroupParameter]]
        ]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterParameterGroupArgs {
    
    @scala.inline
    def apply(family: Input[String]): ClusterParameterGroupArgs = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupArgs]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupArgsMutableBuilder[Self <: ClusterParameterGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.neptune.ClusterParameterGroupParameter]]
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.neptune.ClusterParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterParameterGroupState extends StObject {
    
    /**
      * The ARN of the neptune cluster parameter group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The family of the neptune cluster parameter group.
      */
    val family: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the neptune parameter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of neptune parameters to apply.
      */
    val parameters: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.neptune.ClusterParameterGroupParameter]]
        ]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterParameterGroupState {
    
    @scala.inline
    def apply(): ClusterParameterGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterParameterGroupState]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupStateMutableBuilder[Self <: ClusterParameterGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.neptune.ClusterParameterGroupParameter]]
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typings.pulumiAws.inputMod.neptune.ClusterParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
