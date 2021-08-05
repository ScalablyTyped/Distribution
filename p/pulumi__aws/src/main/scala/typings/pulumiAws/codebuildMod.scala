package typings.pulumiAws

import typings.pulumiAws.projectMod.ProjectArgs
import typings.pulumiAws.projectMod.ProjectState
import typings.pulumiAws.reportGroupMod.ReportGroupArgs
import typings.pulumiAws.reportGroupMod.ReportGroupState
import typings.pulumiAws.sourceCredentialMod.SourceCredentialArgs
import typings.pulumiAws.sourceCredentialMod.SourceCredentialState
import typings.pulumiAws.webhookMod.WebhookArgs
import typings.pulumiAws.webhookMod.WebhookState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codebuildMod {
  
  @JSImport("@pulumi/aws/codebuild", "Project")
  @js.native
  class Project protected ()
    extends typings.pulumiAws.projectMod.Project {
    /**
      * Create a Project resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProjectArgs) = this()
    def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Project {
    
    @JSImport("@pulumi/aws/codebuild", "Project")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.projectMod.Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.projectMod.Project]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.projectMod.Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.projectMod.Project]
    inline def get(name: String, id: Input[ID], state: ProjectState): typings.pulumiAws.projectMod.Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.projectMod.Project]
    inline def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): typings.pulumiAws.projectMod.Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.projectMod.Project]
    
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/project.Project */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codebuild", "ReportGroup")
  @js.native
  class ReportGroup protected ()
    extends typings.pulumiAws.reportGroupMod.ReportGroup {
    /**
      * Create a ReportGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReportGroupArgs) = this()
    def this(name: String, args: ReportGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReportGroup {
    
    @JSImport("@pulumi/aws/codebuild", "ReportGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReportGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.reportGroupMod.ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportGroupMod.ReportGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.reportGroupMod.ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportGroupMod.ReportGroup]
    inline def get(name: String, id: Input[ID], state: ReportGroupState): typings.pulumiAws.reportGroupMod.ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportGroupMod.ReportGroup]
    inline def get(name: String, id: Input[ID], state: ReportGroupState, opts: CustomResourceOptions): typings.pulumiAws.reportGroupMod.ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportGroupMod.ReportGroup]
    
    /**
      * Returns true if the given object is an instance of ReportGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codebuild", "SourceCredential")
  @js.native
  class SourceCredential protected ()
    extends typings.pulumiAws.sourceCredentialMod.SourceCredential {
    /**
      * Create a SourceCredential resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SourceCredentialArgs) = this()
    def this(name: String, args: SourceCredentialArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SourceCredential {
    
    @JSImport("@pulumi/aws/codebuild", "SourceCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SourceCredential resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.sourceCredentialMod.SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sourceCredentialMod.SourceCredential]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.sourceCredentialMod.SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sourceCredentialMod.SourceCredential]
    inline def get(name: String, id: Input[ID], state: SourceCredentialState): typings.pulumiAws.sourceCredentialMod.SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sourceCredentialMod.SourceCredential]
    inline def get(name: String, id: Input[ID], state: SourceCredentialState, opts: CustomResourceOptions): typings.pulumiAws.sourceCredentialMod.SourceCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.sourceCredentialMod.SourceCredential]
    
    /**
      * Returns true if the given object is an instance of SourceCredential.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/sourceCredential.SourceCredential */ Boolean]
  }
  
  @JSImport("@pulumi/aws/codebuild", "Webhook")
  @js.native
  class Webhook protected ()
    extends typings.pulumiAws.webhookMod.Webhook {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Webhook {
    
    @JSImport("@pulumi/aws/codebuild", "Webhook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.webhookMod.Webhook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webhookMod.Webhook]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.webhookMod.Webhook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webhookMod.Webhook]
    inline def get(name: String, id: Input[ID], state: WebhookState): typings.pulumiAws.webhookMod.Webhook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webhookMod.Webhook]
    inline def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): typings.pulumiAws.webhookMod.Webhook = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webhookMod.Webhook]
    
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/webhook.Webhook */ Boolean]
  }
}
