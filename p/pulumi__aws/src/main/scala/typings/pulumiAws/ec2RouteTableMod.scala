package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.RouteTableRoute
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2RouteTableMod {
  
  @JSImport("@pulumi/aws/ec2/routeTable", "RouteTable")
  @js.native
  class RouteTable protected () extends CustomResource {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableArgs) = this()
    def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the AWS account that owns the route table.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of virtual gateways for propagation.
      */
    val propagatingVgws: Output_[js.Array[String]] = js.native
    
    /**
      * A list of route objects. Their keys are documented below.
      */
    val routes: Output_[js.Array[RouteTableRoute]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object RouteTable {
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID]): RouteTable = js.native
    @JSImport("@pulumi/aws/ec2/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RouteTable = js.native
    @JSImport("@pulumi/aws/ec2/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState): RouteTable = js.native
    @JSImport("@pulumi/aws/ec2/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): RouteTable = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/routeTable", "RouteTable.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/routeTable.RouteTable */ Boolean = js.native
  }
  
  @js.native
  trait RouteTableArgs extends StObject {
    
    /**
      * A list of virtual gateways for propagation.
      */
    val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of route objects. Their keys are documented below.
      */
    val routes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.RouteTableRoute]]]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: Input[String] = js.native
  }
  object RouteTableArgs {
    
    @scala.inline
    def apply(vpcId: Input[String]): RouteTableArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteTableArgs]
    }
    
    @scala.inline
    implicit class RouteTableArgsMutableBuilder[Self <: RouteTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropagatingVgws(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "propagatingVgws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagatingVgwsUndefined: Self = StObject.set(x, "propagatingVgws", js.undefined)
      
      @scala.inline
      def setPropagatingVgwsVarargs(value: Input[String]*): Self = StObject.set(x, "propagatingVgws", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.RouteTableRoute]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.RouteTableRoute]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteTableState extends StObject {
    
    /**
      * The ID of the AWS account that owns the route table.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of virtual gateways for propagation.
      */
    val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of route objects. Their keys are documented below.
      */
    val routes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.RouteTableRoute]]]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object RouteTableState {
    
    @scala.inline
    def apply(): RouteTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteTableState]
    }
    
    @scala.inline
    implicit class RouteTableStateMutableBuilder[Self <: RouteTableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setPropagatingVgws(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "propagatingVgws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagatingVgwsUndefined: Self = StObject.set(x, "propagatingVgws", js.undefined)
      
      @scala.inline
      def setPropagatingVgwsVarargs(value: Input[String]*): Self = StObject.set(x, "propagatingVgws", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.RouteTableRoute]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.RouteTableRoute]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
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
