package typings.pulumiAws

import typings.pulumiAws.applicationMod.ApplicationArgs
import typings.pulumiAws.applicationMod.ApplicationState
import typings.pulumiAws.deploymentConfigMod.DeploymentConfigArgs
import typings.pulumiAws.deploymentConfigMod.DeploymentConfigState
import typings.pulumiAws.deploymentGroupMod.DeploymentGroupArgs
import typings.pulumiAws.deploymentGroupMod.DeploymentGroupState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codedeployMod {
  
  @JSImport("@pulumi/aws/codedeploy", "Application")
  @js.native
  class Application protected ()
    extends typings.pulumiAws.applicationMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Application {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codedeploy", "Application.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationMod.Application = js.native
    @JSImport("@pulumi/aws/codedeploy", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationMod.Application = js.native
    @JSImport("@pulumi/aws/codedeploy", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typings.pulumiAws.applicationMod.Application = js.native
    @JSImport("@pulumi/aws/codedeploy", "Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.pulumiAws.applicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codedeploy", "Application.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/application.Application */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/codedeploy", "DeploymentConfig")
  @js.native
  class DeploymentConfig protected ()
    extends typings.pulumiAws.deploymentConfigMod.DeploymentConfig {
    /**
      * Create a DeploymentConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentConfigArgs) = this()
    def this(name: String, args: DeploymentConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DeploymentConfig {
    
    /**
      * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codedeploy", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    @JSImport("@pulumi/aws/codedeploy", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    @JSImport("@pulumi/aws/codedeploy", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState): typings.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    @JSImport("@pulumi/aws/codedeploy", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): typings.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codedeploy", "DeploymentConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/codedeploy", "DeploymentGroup")
  @js.native
  class DeploymentGroup protected ()
    extends typings.pulumiAws.deploymentGroupMod.DeploymentGroup {
    /**
      * Create a DeploymentGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentGroupArgs) = this()
    def this(name: String, args: DeploymentGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DeploymentGroup {
    
    /**
      * Get an existing DeploymentGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codedeploy", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    @JSImport("@pulumi/aws/codedeploy", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    @JSImport("@pulumi/aws/codedeploy", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState): typings.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    @JSImport("@pulumi/aws/codedeploy", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): typings.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codedeploy", "DeploymentGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = js.native
  }
}
