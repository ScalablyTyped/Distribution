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

object clusterEndpointMod {
  
  @JSImport("@pulumi/aws/rds/clusterEndpoint", "ClusterEndpoint")
  @js.native
  class ClusterEndpoint protected () extends CustomResource {
    /**
      * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterEndpointArgs) = this()
    def this(name: String, args: ClusterEndpointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of cluster
      */
    val arn: Output_[String] = js.native
    
    /**
      * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
      */
    val clusterEndpointIdentifier: Output_[String] = js.native
    
    /**
      * The cluster identifier.
      */
    val clusterIdentifier: Output_[String] = js.native
    
    /**
      * The type of the endpoint. One of: READER , ANY .
      */
    val customEndpointType: Output_[String] = js.native
    
    /**
      * A custom endpoint for the Aurora cluster
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
      */
    val excludedMembers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
      */
    val staticMembers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ClusterEndpoint {
    
    @JSImport("@pulumi/aws/rds/clusterEndpoint", "ClusterEndpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterEndpointState): ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClusterEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterEndpointState, opts: CustomResourceOptions): ClusterEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterEndpoint]
    
    /**
      * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean]
  }
  
  trait ClusterEndpointArgs extends StObject {
    
    /**
      * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
      */
    val clusterEndpointIdentifier: Input[String]
    
    /**
      * The cluster identifier.
      */
    val clusterIdentifier: Input[String]
    
    /**
      * The type of the endpoint. One of: READER , ANY .
      */
    val customEndpointType: Input[String]
    
    /**
      * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
      */
    val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
      */
    val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterEndpointArgs {
    
    @scala.inline
    def apply(
      clusterEndpointIdentifier: Input[String],
      clusterIdentifier: Input[String],
      customEndpointType: Input[String]
    ): ClusterEndpointArgs = {
      val __obj = js.Dynamic.literal(clusterEndpointIdentifier = clusterEndpointIdentifier.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], customEndpointType = customEndpointType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterEndpointArgs]
    }
    
    @scala.inline
    implicit class ClusterEndpointArgsMutableBuilder[Self <: ClusterEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterEndpointIdentifier(value: Input[String]): Self = StObject.set(x, "clusterEndpointIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomEndpointType(value: Input[String]): Self = StObject.set(x, "customEndpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedMembers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "excludedMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedMembersUndefined: Self = StObject.set(x, "excludedMembers", js.undefined)
      
      @scala.inline
      def setExcludedMembersVarargs(value: Input[String]*): Self = StObject.set(x, "excludedMembers", js.Array(value :_*))
      
      @scala.inline
      def setStaticMembers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "staticMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticMembersUndefined: Self = StObject.set(x, "staticMembers", js.undefined)
      
      @scala.inline
      def setStaticMembersVarargs(value: Input[String]*): Self = StObject.set(x, "staticMembers", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterEndpointState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of cluster
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
      */
    val clusterEndpointIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The cluster identifier.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the endpoint. One of: READER , ANY .
      */
    val customEndpointType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A custom endpoint for the Aurora cluster
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
      */
    val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
      */
    val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterEndpointState {
    
    @scala.inline
    def apply(): ClusterEndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterEndpointState]
    }
    
    @scala.inline
    implicit class ClusterEndpointStateMutableBuilder[Self <: ClusterEndpointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setClusterEndpointIdentifier(value: Input[String]): Self = StObject.set(x, "clusterEndpointIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterEndpointIdentifierUndefined: Self = StObject.set(x, "clusterEndpointIdentifier", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      @scala.inline
      def setCustomEndpointType(value: Input[String]): Self = StObject.set(x, "customEndpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomEndpointTypeUndefined: Self = StObject.set(x, "customEndpointType", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setExcludedMembers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "excludedMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedMembersUndefined: Self = StObject.set(x, "excludedMembers", js.undefined)
      
      @scala.inline
      def setExcludedMembersVarargs(value: Input[String]*): Self = StObject.set(x, "excludedMembers", js.Array(value :_*))
      
      @scala.inline
      def setStaticMembers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "staticMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticMembersUndefined: Self = StObject.set(x, "staticMembers", js.undefined)
      
      @scala.inline
      def setStaticMembersVarargs(value: Input[String]*): Self = StObject.set(x, "staticMembers", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
