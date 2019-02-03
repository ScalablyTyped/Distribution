package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "glue")
@js.native
object glueNs extends js.Object {
  @js.native
  class CatalogDatabase protected ()
    extends atPulumiAwsLib.glueMod.CatalogDatabase {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabaseArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabaseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CatalogTable protected ()
    extends atPulumiAwsLib.glueMod.CatalogTable {
    /**
      * Create a CatalogTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glueCatalogTableMod.CatalogTableArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueCatalogTableMod.CatalogTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Classifier protected ()
    extends atPulumiAwsLib.glueMod.Classifier {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueClassifierMod.ClassifierArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueClassifierMod.ClassifierArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Connection protected ()
    extends atPulumiAwsLib.glueMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glueConnectionMod.ConnectionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueConnectionMod.ConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Crawler protected ()
    extends atPulumiAwsLib.glueMod.Crawler {
    /**
      * Create a Crawler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glueCrawlerMod.CrawlerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueCrawlerMod.CrawlerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Job protected ()
    extends atPulumiAwsLib.glueMod.Job {
    /**
      * Create a Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glueJobMod.JobArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueJobMod.JobArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityConfiguration protected ()
    extends atPulumiAwsLib.glueMod.SecurityConfiguration {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfigurationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Trigger protected ()
    extends atPulumiAwsLib.glueMod.Trigger {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glueTriggerMod.TriggerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glueTriggerMod.TriggerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getScript(args: atPulumiAwsLib.glueGetScriptMod.GetScriptArgs): js.Promise[atPulumiAwsLib.glueGetScriptMod.GetScriptResult] = js.native
  def getScript(
    args: atPulumiAwsLib.glueGetScriptMod.GetScriptArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.glueGetScriptMod.GetScriptResult] = js.native
  /* static members */
  @js.native
  object CatalogDatabase extends js.Object {
    /**
      * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabase = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabaseState
    ): atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabase = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabaseState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueCatalogDatabaseMod.CatalogDatabase = js.native
  }
  
  /* static members */
  @js.native
  object CatalogTable extends js.Object {
    /**
      * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCatalogTableMod.CatalogTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueCatalogTableMod.CatalogTableState
    ): atPulumiAwsLib.glueCatalogTableMod.CatalogTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueCatalogTableMod.CatalogTableState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueCatalogTableMod.CatalogTable = js.native
  }
  
  /* static members */
  @js.native
  object Classifier extends js.Object {
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueClassifierMod.Classifier = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueClassifierMod.ClassifierState
    ): atPulumiAwsLib.glueClassifierMod.Classifier = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueClassifierMod.ClassifierState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueClassifierMod.Classifier = js.native
  }
  
  /* static members */
  @js.native
  object Connection extends js.Object {
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueConnectionMod.Connection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueConnectionMod.ConnectionState
    ): atPulumiAwsLib.glueConnectionMod.Connection = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueConnectionMod.ConnectionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueConnectionMod.Connection = js.native
  }
  
  /* static members */
  @js.native
  object Crawler extends js.Object {
    /**
      * Get an existing Crawler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueCrawlerMod.CrawlerState
    ): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueCrawlerMod.CrawlerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
  }
  
  /* static members */
  @js.native
  object Job extends js.Object {
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueJobMod.Job = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueJobMod.JobState
    ): atPulumiAwsLib.glueJobMod.Job = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueJobMod.JobState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueJobMod.Job = js.native
  }
  
  /* static members */
  @js.native
  object SecurityConfiguration extends js.Object {
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfigurationState
    ): atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfigurationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueSecurityConfigurationMod.SecurityConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object Trigger extends js.Object {
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueTriggerMod.Trigger = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueTriggerMod.TriggerState
    ): atPulumiAwsLib.glueTriggerMod.Trigger = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glueTriggerMod.TriggerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glueTriggerMod.Trigger = js.native
  }
  
}

