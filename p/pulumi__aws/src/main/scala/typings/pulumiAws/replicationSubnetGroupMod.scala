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

object replicationSubnetGroupMod {
  
  @JSImport("@pulumi/aws/dms/replicationSubnetGroup", "ReplicationSubnetGroup")
  @js.native
  class ReplicationSubnetGroup protected () extends CustomResource {
    /**
      * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationSubnetGroupArgs) = this()
    def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
    
    val replicationSubnetGroupArn: Output_[String] = js.native
    
    /**
      * The description for the subnet group.
      */
    val replicationSubnetGroupDescription: Output_[String] = js.native
    
    /**
      * The name for the replication subnet group. This value is stored as a lowercase string.
      */
    val replicationSubnetGroupId: Output_[String] = js.native
    
    /**
      * A list of the EC2 subnet IDs for the subnet group.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the VPC the subnet group is in.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object ReplicationSubnetGroup {
    
    @JSImport("@pulumi/aws/dms/replicationSubnetGroup", "ReplicationSubnetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ReplicationSubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReplicationSubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReplicationSubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReplicationSubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): ReplicationSubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReplicationSubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): ReplicationSubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReplicationSubnetGroup]
    
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean]
  }
  
  trait ReplicationSubnetGroupArgs extends StObject {
    
    /**
      * The description for the subnet group.
      */
    val replicationSubnetGroupDescription: Input[String]
    
    /**
      * The name for the replication subnet group. This value is stored as a lowercase string.
      */
    val replicationSubnetGroupId: Input[String]
    
    /**
      * A list of the EC2 subnet IDs for the subnet group.
      */
    val subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ReplicationSubnetGroupArgs {
    
    @scala.inline
    def apply(
      replicationSubnetGroupDescription: Input[String],
      replicationSubnetGroupId: Input[String],
      subnetIds: Input[js.Array[Input[String]]]
    ): ReplicationSubnetGroupArgs = {
      val __obj = js.Dynamic.literal(replicationSubnetGroupDescription = replicationSubnetGroupDescription.asInstanceOf[js.Any], replicationSubnetGroupId = replicationSubnetGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationSubnetGroupArgs]
    }
    
    @scala.inline
    implicit class ReplicationSubnetGroupArgsMutableBuilder[Self <: ReplicationSubnetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicationSubnetGroupDescription(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupId(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ReplicationSubnetGroupState extends StObject {
    
    val replicationSubnetGroupArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description for the subnet group.
      */
    val replicationSubnetGroupDescription: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for the replication subnet group. This value is stored as a lowercase string.
      */
    val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of the EC2 subnet IDs for the subnet group.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the VPC the subnet group is in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object ReplicationSubnetGroupState {
    
    @scala.inline
    def apply(): ReplicationSubnetGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationSubnetGroupState]
    }
    
    @scala.inline
    implicit class ReplicationSubnetGroupStateMutableBuilder[Self <: ReplicationSubnetGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicationSubnetGroupArn(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupArnUndefined: Self = StObject.set(x, "replicationSubnetGroupArn", js.undefined)
      
      @scala.inline
      def setReplicationSubnetGroupDescription(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupDescriptionUndefined: Self = StObject.set(x, "replicationSubnetGroupDescription", js.undefined)
      
      @scala.inline
      def setReplicationSubnetGroupId(value: Input[String]): Self = StObject.set(x, "replicationSubnetGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSubnetGroupIdUndefined: Self = StObject.set(x, "replicationSubnetGroupId", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
