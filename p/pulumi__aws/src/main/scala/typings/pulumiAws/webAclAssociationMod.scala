package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webAclAssociationMod {
  
  @JSImport("@pulumi/aws/wafregional/webAclAssociation", "WebAclAssociation")
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
      * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
      */
    val resourceArn: Output_[String] = js.native
    
    /**
      * The ID of the WAF Regional WebACL to create an association.
      */
    val webAclId: Output_[String] = js.native
  }
  /* static members */
  object WebAclAssociation {
    
    @JSImport("@pulumi/aws/wafregional/webAclAssociation", "WebAclAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[WebAclAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WebAclAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclAssociationState): WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[WebAclAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WebAclAssociation]
    
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAclAssociation.WebAclAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafregional/webAclAssociation.WebAclAssociation */ Boolean]
  }
  
  trait WebAclAssociationArgs extends StObject {
    
    /**
      * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
      */
    val resourceArn: Input[String]
    
    /**
      * The ID of the WAF Regional WebACL to create an association.
      */
    val webAclId: Input[String]
  }
  object WebAclAssociationArgs {
    
    @scala.inline
    def apply(resourceArn: Input[String], webAclId: Input[String]): WebAclAssociationArgs = {
      val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], webAclId = webAclId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAclAssociationArgs]
    }
    
    @scala.inline
    implicit class WebAclAssociationArgsMutableBuilder[Self <: WebAclAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAclId(value: Input[String]): Self = StObject.set(x, "webAclId", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAclAssociationState extends StObject {
    
    /**
      * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the WAF Regional WebACL to create an association.
      */
    val webAclId: js.UndefOr[Input[String]] = js.undefined
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
      def setWebAclId(value: Input[String]): Self = StObject.set(x, "webAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAclIdUndefined: Self = StObject.set(x, "webAclId", js.undefined)
    }
  }
}
