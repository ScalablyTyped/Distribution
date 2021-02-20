package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subnetGroupMod {
  
  @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup")
  @js.native
  class SubnetGroup protected () extends CustomResource {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetGroupArgs) = this()
    def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A description of the subnet group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the subnet group.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of VPC subnet IDs for the subnet group.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * VPC ID of the subnet group.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object SubnetGroup {
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): SubnetGroup = js.native
    @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SubnetGroup = js.native
    @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): SubnetGroup = js.native
    @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @js.native
  trait SubnetGroupArgs extends StObject {
    
    /**
      * A description of the subnet group.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the subnet group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of VPC subnet IDs for the subnet group.
      */
    val subnetIds: Input[js.Array[Input[String]]] = js.native
  }
  object SubnetGroupArgs {
    
    @scala.inline
    def apply(subnetIds: Input[js.Array[Input[String]]]): SubnetGroupArgs = {
      val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubnetGroupArgs]
    }
    
    @scala.inline
    implicit class SubnetGroupArgsMutableBuilder[Self <: SubnetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SubnetGroupState extends StObject {
    
    /**
      * A description of the subnet group.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the subnet group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of VPC subnet IDs for the subnet group.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * VPC ID of the subnet group.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object SubnetGroupState {
    
    @scala.inline
    def apply(): SubnetGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubnetGroupState]
    }
    
    @scala.inline
    implicit class SubnetGroupStateMutableBuilder[Self <: SubnetGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
