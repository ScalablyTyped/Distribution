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

object wafv2WebAclAssociationMod {
  
  @JSImport("@pulumi/aws/wafv2/webAclAssociation", "WebAclAssociation")
  @js.native
  class WebAclAssociation protected () extends CustomResource {
    /**
      * Create a WebAclAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclAssociationArgs) = this()
    def this(name: String, args: WebAclAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
      */
    val resourceArn: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
      */
    val webAclArn: Output_[String] = js.native
  }
  /* static members */
  object WebAclAssociation {
    
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafv2/webAclAssociation", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): WebAclAssociation = js.native
    @JSImport("@pulumi/aws/wafv2/webAclAssociation", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebAclAssociation = js.native
    @JSImport("@pulumi/aws/wafv2/webAclAssociation", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState): WebAclAssociation = js.native
    @JSImport("@pulumi/aws/wafv2/webAclAssociation", "WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): WebAclAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafv2/webAclAssociation", "WebAclAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclAssociation.WebAclAssociation */ Boolean = js.native
  }
  
  @js.native
  trait WebAclAssociationArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
      */
    val resourceArn: Input[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
      */
    val webAclArn: Input[String] = js.native
  }
  object WebAclAssociationArgs {
    
    @scala.inline
    def apply(resourceArn: Input[String], webAclArn: Input[String]): WebAclAssociationArgs = {
      val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], webAclArn = webAclArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAclAssociationArgs]
    }
    
    @scala.inline
    implicit class WebAclAssociationArgsMutableBuilder[Self <: WebAclAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAclArn(value: Input[String]): Self = StObject.set(x, "webAclArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebAclAssociationState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
      */
    val webAclArn: js.UndefOr[Input[String]] = js.native
  }
  object WebAclAssociationState {
    
    @scala.inline
    def apply(): WebAclAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebAclAssociationState]
    }
    
    @scala.inline
    implicit class WebAclAssociationStateMutableBuilder[Self <: WebAclAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
      
      @scala.inline
      def setWebAclArn(value: Input[String]): Self = StObject.set(x, "webAclArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAclArnUndefined: Self = StObject.set(x, "webAclArn", js.undefined)
    }
  }
}
