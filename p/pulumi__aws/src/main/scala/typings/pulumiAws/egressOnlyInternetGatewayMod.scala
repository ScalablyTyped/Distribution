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

object egressOnlyInternetGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/egressOnlyInternetGateway", "EgressOnlyInternetGateway")
  @js.native
  class EgressOnlyInternetGateway protected () extends CustomResource {
    /**
      * Create a EgressOnlyInternetGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EgressOnlyInternetGatewayArgs) = this()
    def this(name: String, args: EgressOnlyInternetGatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object EgressOnlyInternetGateway {
    
    @JSImport("@pulumi/aws/ec2/egressOnlyInternetGateway", "EgressOnlyInternetGateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EgressOnlyInternetGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): EgressOnlyInternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EgressOnlyInternetGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EgressOnlyInternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EgressOnlyInternetGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: EgressOnlyInternetGatewayState): EgressOnlyInternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EgressOnlyInternetGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: EgressOnlyInternetGatewayState, opts: CustomResourceOptions): EgressOnlyInternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EgressOnlyInternetGateway]
    
    /**
      * Returns true if the given object is an instance of EgressOnlyInternetGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/egressOnlyInternetGateway.EgressOnlyInternetGateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/egressOnlyInternetGateway.EgressOnlyInternetGateway */ Boolean]
  }
  
  trait EgressOnlyInternetGatewayArgs extends StObject {
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: Input[String]
  }
  object EgressOnlyInternetGatewayArgs {
    
    @scala.inline
    def apply(vpcId: Input[String]): EgressOnlyInternetGatewayArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EgressOnlyInternetGatewayArgs]
    }
    
    @scala.inline
    implicit class EgressOnlyInternetGatewayArgsMutableBuilder[Self <: EgressOnlyInternetGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait EgressOnlyInternetGatewayState extends StObject {
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object EgressOnlyInternetGatewayState {
    
    @scala.inline
    def apply(): EgressOnlyInternetGatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EgressOnlyInternetGatewayState]
    }
    
    @scala.inline
    implicit class EgressOnlyInternetGatewayStateMutableBuilder[Self <: EgressOnlyInternetGatewayState] (val x: Self) extends AnyVal {
      
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
