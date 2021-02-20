package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecs.ClusterDefaultCapacityProviderStrategy
import typings.pulumiAws.outputMod.ecs.ClusterSetting
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecsClusterMod {
  
  @JSImport("@pulumi/aws/ecs/cluster", "Cluster")
  @js.native
  class Cluster protected () extends CustomResource {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster
      */
    val arn: Output_[String] = js.native
    
    /**
      * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
      */
    val capacityProviders: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
      */
    val defaultCapacityProviderStrategies: Output_[js.UndefOr[js.Array[ClusterDefaultCapacityProviderStrategy]]] = js.native
    
    /**
      * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
      */
    val name: Output_[String] = js.native
    
    /**
      * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
      */
    val settings: Output_[js.Array[ClusterSetting]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ecs/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): Cluster = js.native
    @JSImport("@pulumi/aws/ecs/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Cluster = js.native
    @JSImport("@pulumi/aws/ecs/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
    @JSImport("@pulumi/aws/ecs/cluster", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ecs/cluster", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/cluster.Cluster */ Boolean = js.native
  }
  
  @js.native
  trait ClusterArgs extends StObject {
    
    /**
      * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
      */
    val capacityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
      */
    val defaultCapacityProviderStrategies: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy]]
        ]
      ] = js.native
    
    /**
      * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
      */
    val settings: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterSetting]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(): ClusterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacityProviders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
      
      @scala.inline
      def setCapacityProvidersVarargs(value: Input[String]*): Self = StObject.set(x, "capacityProviders", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCapacityProviderStrategies(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy]]
            ]
      ): Self = StObject.set(x, "defaultCapacityProviderStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCapacityProviderStrategiesUndefined: Self = StObject.set(x, "defaultCapacityProviderStrategies", js.undefined)
      
      @scala.inline
      def setDefaultCapacityProviderStrategiesVarargs(value: Input[typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy]*): Self = StObject.set(x, "defaultCapacityProviderStrategies", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSettings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterSetting]]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: Input[typings.pulumiAws.inputMod.ecs.ClusterSetting]*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClusterState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
      */
    val capacityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
      */
    val defaultCapacityProviderStrategies: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy]]
        ]
      ] = js.native
    
    /**
      * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
      */
    val settings: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterSetting]]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClusterState {
    
    @scala.inline
    def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    @scala.inline
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCapacityProviders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
      
      @scala.inline
      def setCapacityProvidersVarargs(value: Input[String]*): Self = StObject.set(x, "capacityProviders", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCapacityProviderStrategies(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy]]
            ]
      ): Self = StObject.set(x, "defaultCapacityProviderStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCapacityProviderStrategiesUndefined: Self = StObject.set(x, "defaultCapacityProviderStrategies", js.undefined)
      
      @scala.inline
      def setDefaultCapacityProviderStrategiesVarargs(value: Input[typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy]*): Self = StObject.set(x, "defaultCapacityProviderStrategies", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSettings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ecs.ClusterSetting]]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: Input[typings.pulumiAws.inputMod.ecs.ClusterSetting]*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
