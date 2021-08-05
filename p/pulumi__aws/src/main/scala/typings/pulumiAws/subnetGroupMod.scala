package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/dax/subnetGroup", "SubnetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SubnetGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SubnetGroup]
    inline def get(name: String, id: Input[ID], state: SubnetGroupState): SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SubnetGroup]
    inline def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SubnetGroup]
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/subnetGroup.SubnetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dax/subnetGroup.SubnetGroup */ Boolean]
  }
  
  trait SubnetGroupArgs extends StObject {
    
    /**
      * A description of the subnet group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the subnet group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of VPC subnet IDs for the subnet group.
      */
    val subnetIds: Input[js.Array[Input[String]]]
  }
  object SubnetGroupArgs {
    
    inline def apply(subnetIds: Input[js.Array[Input[String]]]): SubnetGroupArgs = {
      val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubnetGroupArgs]
    }
    
    extension [Self <: SubnetGroupArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    }
  }
  
  trait SubnetGroupState extends StObject {
    
    /**
      * A description of the subnet group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the subnet group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of VPC subnet IDs for the subnet group.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * VPC ID of the subnet group.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object SubnetGroupState {
    
    inline def apply(): SubnetGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubnetGroupState]
    }
    
    extension [Self <: SubnetGroupState](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
