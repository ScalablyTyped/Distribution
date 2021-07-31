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

object internetGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/internetGateway", "InternetGateway")
  @js.native
  class InternetGateway protected () extends CustomResource {
    /**
      * Create a InternetGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: InternetGatewayArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: InternetGatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Internet Gateway.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ID of the AWS account that owns the internet gateway.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object InternetGateway {
    
    @JSImport("@pulumi/aws/ec2/internetGateway", "InternetGateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InternetGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): InternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[InternetGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): InternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InternetGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: InternetGatewayState): InternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[InternetGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: InternetGatewayState, opts: CustomResourceOptions): InternetGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InternetGateway]
    
    /**
      * Returns true if the given object is an instance of InternetGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/internetGateway.InternetGateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/internetGateway.InternetGateway */ Boolean]
  }
  
  trait InternetGatewayArgs extends StObject {
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object InternetGatewayArgs {
    
    @scala.inline
    def apply(): InternetGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternetGatewayArgs]
    }
    
    @scala.inline
    implicit class InternetGatewayArgsMutableBuilder[Self <: InternetGatewayArgs] (val x: Self) extends AnyVal {
      
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
  
  trait InternetGatewayState extends StObject {
    
    /**
      * The ARN of the Internet Gateway.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the internet gateway.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID to create in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object InternetGatewayState {
    
    @scala.inline
    def apply(): InternetGatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternetGatewayState]
    }
    
    @scala.inline
    implicit class InternetGatewayStateMutableBuilder[Self <: InternetGatewayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
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
