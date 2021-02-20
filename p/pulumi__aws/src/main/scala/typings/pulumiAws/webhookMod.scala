package typings.pulumiAws

import typings.pulumiAws.outputMod.codebuild.WebhookFilterGroup
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhookMod {
  
  @JSImport("@pulumi/aws/codebuild/webhook", "Webhook")
  @js.native
  class Webhook protected () extends CustomResource {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
      */
    val branchFilter: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Information about the webhook's trigger. Filter group blocks are documented below.
      */
    val filterGroups: Output_[js.UndefOr[js.Array[WebhookFilterGroup]]] = js.native
    
    /**
      * The CodeBuild endpoint where webhook events are sent.
      */
    val payloadUrl: Output_[String] = js.native
    
    /**
      * The name of the build project.
      */
    val projectName: Output_[String] = js.native
    
    /**
      * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
      */
    val secret: Output_[String] = js.native
    
    /**
      * The URL to the webhook.
      */
    val url: Output_[String] = js.native
  }
  /* static members */
  object Webhook {
    
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codebuild/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID]): Webhook = js.native
    @JSImport("@pulumi/aws/codebuild/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Webhook = js.native
    @JSImport("@pulumi/aws/codebuild/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebhookState): Webhook = js.native
    @JSImport("@pulumi/aws/codebuild/webhook", "Webhook.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): Webhook = js.native
    
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codebuild/webhook", "Webhook.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean = js.native
  }
  
  @js.native
  trait WebhookArgs extends StObject {
    
    /**
      * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
      */
    val branchFilter: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the webhook's trigger. Filter group blocks are documented below.
      */
    val filterGroups: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup]]]] = js.native
    
    /**
      * The name of the build project.
      */
    val projectName: Input[String] = js.native
  }
  object WebhookArgs {
    
    @scala.inline
    def apply(projectName: Input[String]): WebhookArgs = {
      val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookArgs]
    }
    
    @scala.inline
    implicit class WebhookArgsMutableBuilder[Self <: WebhookArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranchFilter(value: Input[String]): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchFilterUndefined: Self = StObject.set(x, "branchFilter", js.undefined)
      
      @scala.inline
      def setFilterGroups(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup]]]): Self = StObject.set(x, "filterGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterGroupsUndefined: Self = StObject.set(x, "filterGroups", js.undefined)
      
      @scala.inline
      def setFilterGroupsVarargs(value: Input[typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup]*): Self = StObject.set(x, "filterGroups", js.Array(value :_*))
      
      @scala.inline
      def setProjectName(value: Input[String]): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebhookState extends StObject {
    
    /**
      * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filterGroup` over `branchFilter`.
      */
    val branchFilter: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the webhook's trigger. Filter group blocks are documented below.
      */
    val filterGroups: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup]]]] = js.native
    
    /**
      * The CodeBuild endpoint where webhook events are sent.
      */
    val payloadUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the build project.
      */
    val projectName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
      */
    val secret: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URL to the webhook.
      */
    val url: js.UndefOr[Input[String]] = js.native
  }
  object WebhookState {
    
    @scala.inline
    def apply(): WebhookState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookState]
    }
    
    @scala.inline
    implicit class WebhookStateMutableBuilder[Self <: WebhookState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranchFilter(value: Input[String]): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchFilterUndefined: Self = StObject.set(x, "branchFilter", js.undefined)
      
      @scala.inline
      def setFilterGroups(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup]]]): Self = StObject.set(x, "filterGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterGroupsUndefined: Self = StObject.set(x, "filterGroups", js.undefined)
      
      @scala.inline
      def setFilterGroupsVarargs(value: Input[typings.pulumiAws.inputMod.codebuild.WebhookFilterGroup]*): Self = StObject.set(x, "filterGroups", js.Array(value :_*))
      
      @scala.inline
      def setPayloadUrl(value: Input[String]): Self = StObject.set(x, "payloadUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUrlUndefined: Self = StObject.set(x, "payloadUrl", js.undefined)
      
      @scala.inline
      def setProjectName(value: Input[String]): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
      
      @scala.inline
      def setSecret(value: Input[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
