package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabaseArgs
import typings.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabaseState
import typings.atPulumiAws.glueCatalogTableMod.CatalogTableArgs
import typings.atPulumiAws.glueCatalogTableMod.CatalogTableState
import typings.atPulumiAws.glueClassifierMod.ClassifierArgs
import typings.atPulumiAws.glueClassifierMod.ClassifierState
import typings.atPulumiAws.glueConnectionMod.ConnectionArgs
import typings.atPulumiAws.glueConnectionMod.ConnectionState
import typings.atPulumiAws.glueCrawlerMod.CrawlerArgs
import typings.atPulumiAws.glueCrawlerMod.CrawlerState
import typings.atPulumiAws.glueGetScriptMod.GetScriptArgs
import typings.atPulumiAws.glueGetScriptMod.GetScriptResult
import typings.atPulumiAws.glueJobMod.JobArgs
import typings.atPulumiAws.glueJobMod.JobState
import typings.atPulumiAws.glueSecurityConfigurationMod.SecurityConfigurationArgs
import typings.atPulumiAws.glueSecurityConfigurationMod.SecurityConfigurationState
import typings.atPulumiAws.glueTriggerMod.TriggerArgs
import typings.atPulumiAws.glueTriggerMod.TriggerState
import typings.atPulumiAws.glueWorkflowMod.WorkflowArgs
import typings.atPulumiAws.glueWorkflowMod.WorkflowState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "glue")
@js.native
object glue extends js.Object {
  @js.native
  class CatalogDatabase protected ()
    extends typings.atPulumiAws.glueMod.CatalogDatabase {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CatalogDatabaseArgs) = this()
    def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CatalogTable protected ()
    extends typings.atPulumiAws.glueMod.CatalogTable {
    /**
      * Create a CatalogTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CatalogTableArgs) = this()
    def this(name: String, args: CatalogTableArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Classifier protected ()
    extends typings.atPulumiAws.glueMod.Classifier {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClassifierArgs) = this()
    def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Connection protected ()
    extends typings.atPulumiAws.glueMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Crawler protected ()
    extends typings.atPulumiAws.glueMod.Crawler {
    /**
      * Create a Crawler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CrawlerArgs) = this()
    def this(name: String, args: CrawlerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Job protected ()
    extends typings.atPulumiAws.glueMod.Job {
    /**
      * Create a Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobArgs) = this()
    def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityConfiguration protected ()
    extends typings.atPulumiAws.glueMod.SecurityConfiguration {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityConfigurationArgs) = this()
    def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Trigger protected ()
    extends typings.atPulumiAws.glueMod.Trigger {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Workflow protected ()
    extends typings.atPulumiAws.glueMod.Workflow {
    /**
      * Create a Workflow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkflowArgs) = this()
    def this(name: String, args: WorkflowArgs, opts: CustomResourceOptions) = this()
  }
  
  def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] with GetScriptResult = js.native
  def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] with GetScriptResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabase = js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState): typings.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabase = js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): typings.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabase = js.native
    /**
      * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueCatalogTableMod.CatalogTable = js.native
    def get(name: String, id: Input[ID], state: CatalogTableState): typings.atPulumiAws.glueCatalogTableMod.CatalogTable = js.native
    def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): typings.atPulumiAws.glueCatalogTableMod.CatalogTable = js.native
    /**
      * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueClassifierMod.Classifier = js.native
    def get(name: String, id: Input[ID], state: ClassifierState): typings.atPulumiAws.glueClassifierMod.Classifier = js.native
    def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): typings.atPulumiAws.glueClassifierMod.Classifier = js.native
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState): typings.atPulumiAws.glueConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typings.atPulumiAws.glueConnectionMod.Connection = js.native
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueCrawlerMod.Crawler = js.native
    def get(name: String, id: Input[ID], state: CrawlerState): typings.atPulumiAws.glueCrawlerMod.Crawler = js.native
    def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): typings.atPulumiAws.glueCrawlerMod.Crawler = js.native
    /**
      * Returns true if the given object is an instance of Crawler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueJobMod.Job = js.native
    def get(name: String, id: Input[ID], state: JobState): typings.atPulumiAws.glueJobMod.Job = js.native
    def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): typings.atPulumiAws.glueJobMod.Job = js.native
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typings.atPulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState): typings.atPulumiAws.glueTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typings.atPulumiAws.glueTriggerMod.Trigger = js.native
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Workflow extends js.Object {
    /**
      * Get an existing Workflow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.glueWorkflowMod.Workflow = js.native
    def get(name: String, id: Input[ID], state: WorkflowState): typings.atPulumiAws.glueWorkflowMod.Workflow = js.native
    def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): typings.atPulumiAws.glueWorkflowMod.Workflow = js.native
    /**
      * Returns true if the given object is an instance of Workflow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = js.native
  }
  
}

