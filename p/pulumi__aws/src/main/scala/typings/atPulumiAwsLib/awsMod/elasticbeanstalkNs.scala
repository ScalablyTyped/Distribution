package typings
package atPulumiAwsLib.awsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticbeanstalk")
@js.native
object elasticbeanstalkNs extends js.Object {
  @js.native
  class Application protected ()
    extends atPulumiAwsLib.elasticbeanstalkMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkApplicationMod.ApplicationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkApplicationMod.ApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ApplicationVersion protected ()
    extends atPulumiAwsLib.elasticbeanstalkMod.ApplicationVersion {
    /**
      * Create a ApplicationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfigurationTemplate protected ()
    extends atPulumiAwsLib.elasticbeanstalkMod.ConfigurationTemplate {
    /**
      * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Environment protected ()
    extends atPulumiAwsLib.elasticbeanstalkMod.Environment {
    /**
      * Create a Environment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkEnvironmentMod.EnvironmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkEnvironmentMod.EnvironmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getHostedZone(): js.Promise[atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod.GetHostedZoneResult] = js.native
  def getHostedZone(args: atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod.GetHostedZoneArgs): js.Promise[atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod.GetHostedZoneResult] = js.native
  def getHostedZone(
    args: atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod.GetHostedZoneArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod.GetHostedZoneResult] = js.native
  def getSolutionStack(args: atPulumiAwsLib.elasticbeanstalkGetSolutionStackMod.GetSolutionStackArgs): js.Promise[atPulumiAwsLib.elasticbeanstalkGetSolutionStackMod.GetSolutionStackResult] = js.native
  def getSolutionStack(
    args: atPulumiAwsLib.elasticbeanstalkGetSolutionStackMod.GetSolutionStackArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.elasticbeanstalkGetSolutionStackMod.GetSolutionStackResult] = js.native
  @js.native
  object Application extends js.Object {
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkApplicationMod.Application = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkApplicationMod.ApplicationState
    ): atPulumiAwsLib.elasticbeanstalkApplicationMod.Application = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkApplicationMod.ApplicationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticbeanstalkApplicationMod.Application = js.native
  }
  
  @js.native
  object ApplicationVersion extends js.Object {
    /**
      * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionState
    ): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
  }
  
  @js.native
  object ConfigurationTemplate extends js.Object {
    /**
      * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState
    ): atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
  }
  
  @js.native
  object Environment extends js.Object {
    /**
      * Get an existing Environment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkEnvironmentMod.Environment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkEnvironmentMod.EnvironmentState
    ): atPulumiAwsLib.elasticbeanstalkEnvironmentMod.Environment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticbeanstalkEnvironmentMod.EnvironmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticbeanstalkEnvironmentMod.Environment = js.native
  }
  
}

