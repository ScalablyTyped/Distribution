package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.DefaultRouteTableRoute
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2/defaultRouteTable", "DefaultRouteTable")
  @js.native
  class DefaultRouteTable protected () extends CustomResource {
    /**
      * Create a DefaultRouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultRouteTableArgs) = this()
    def this(name: String, args: DefaultRouteTableArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the Default Routing Table.
      */
    val defaultRouteTableId: Output_[String] = js.native
    
    /**
      * The ID of the AWS account that owns the route table
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of virtual gateways for propagation.
      */
    val propagatingVgws: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A list of route objects. Their keys are documented below.
      */
    val routes: Output_[js.Array[DefaultRouteTableRoute]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object DefaultRouteTable {
    
    @JSImport("@pulumi/aws/ec2/defaultRouteTable", "DefaultRouteTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultRouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): DefaultRouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultRouteTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultRouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultRouteTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: DefaultRouteTableState): DefaultRouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultRouteTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: DefaultRouteTableState, opts: CustomResourceOptions): DefaultRouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultRouteTable]
    
    /**
      * Returns true if the given object is an instance of DefaultRouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultRouteTable.DefaultRouteTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultRouteTable.DefaultRouteTable */ Boolean]
  }
  
  trait DefaultRouteTableArgs extends StObject {
    
    /**
      * The ID of the Default Routing Table.
      */
    val defaultRouteTableId: Input[String]
    
    /**
      * A list of virtual gateways for propagation.
      */
    val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of route objects. Their keys are documented below.
      */
    val routes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute]]]] = js.undefined
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultRouteTableArgs {
    
    @scala.inline
    def apply(defaultRouteTableId: Input[String]): DefaultRouteTableArgs = {
      val __obj = js.Dynamic.literal(defaultRouteTableId = defaultRouteTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultRouteTableArgs]
    }
    
    @scala.inline
    implicit class DefaultRouteTableArgsMutableBuilder[Self <: DefaultRouteTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultRouteTableId(value: Input[String]): Self = StObject.set(x, "defaultRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagatingVgws(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "propagatingVgws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagatingVgwsUndefined: Self = StObject.set(x, "propagatingVgws", js.undefined)
      
      @scala.inline
      def setPropagatingVgwsVarargs(value: Input[String]*): Self = StObject.set(x, "propagatingVgws", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DefaultRouteTableState extends StObject {
    
    /**
      * The ID of the Default Routing Table.
      */
    val defaultRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the route table
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of virtual gateways for propagation.
      */
    val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A list of route objects. Their keys are documented below.
      */
    val routes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute]]]] = js.undefined
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object DefaultRouteTableState {
    
    @scala.inline
    def apply(): DefaultRouteTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRouteTableState]
    }
    
    @scala.inline
    implicit class DefaultRouteTableStateMutableBuilder[Self <: DefaultRouteTableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultRouteTableId(value: Input[String]): Self = StObject.set(x, "defaultRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteTableIdUndefined: Self = StObject.set(x, "defaultRouteTableId", js.undefined)
      
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
      def setRoutes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultRouteTableRoute]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
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
