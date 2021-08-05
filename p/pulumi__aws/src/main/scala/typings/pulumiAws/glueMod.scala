package typings.pulumiAws

import typings.pulumiAws.catalogDatabaseMod.CatalogDatabaseArgs
import typings.pulumiAws.catalogDatabaseMod.CatalogDatabaseState
import typings.pulumiAws.catalogTableMod.CatalogTableArgs
import typings.pulumiAws.catalogTableMod.CatalogTableState
import typings.pulumiAws.classifierMod.ClassifierArgs
import typings.pulumiAws.classifierMod.ClassifierState
import typings.pulumiAws.crawlerMod.CrawlerArgs
import typings.pulumiAws.crawlerMod.CrawlerState
import typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettingsArgs
import typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettingsState
import typings.pulumiAws.devEndpointMod.DevEndpointArgs
import typings.pulumiAws.devEndpointMod.DevEndpointState
import typings.pulumiAws.getScriptMod.GetScriptArgs
import typings.pulumiAws.getScriptMod.GetScriptResult
import typings.pulumiAws.glueConnectionMod.ConnectionArgs
import typings.pulumiAws.glueConnectionMod.ConnectionState
import typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfigurationArgs
import typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfigurationState
import typings.pulumiAws.glueTriggerMod.TriggerArgs
import typings.pulumiAws.glueTriggerMod.TriggerState
import typings.pulumiAws.jobMod.JobArgs
import typings.pulumiAws.jobMod.JobState
import typings.pulumiAws.mltransformMod.MLTransformArgs
import typings.pulumiAws.mltransformMod.MLTransformState
import typings.pulumiAws.partitionMod.PartitionArgs
import typings.pulumiAws.partitionMod.PartitionState
import typings.pulumiAws.resourcePolicyMod.ResourcePolicyArgs
import typings.pulumiAws.resourcePolicyMod.ResourcePolicyState
import typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunctionArgs
import typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunctionState
import typings.pulumiAws.workflowMod.WorkflowArgs
import typings.pulumiAws.workflowMod.WorkflowState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glueMod {
  
  @JSImport("@pulumi/aws/glue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/glue", "CatalogDatabase")
  @js.native
  class CatalogDatabase protected ()
    extends typings.pulumiAws.catalogDatabaseMod.CatalogDatabase {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CatalogDatabaseArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CatalogDatabase {
    
    @JSImport("@pulumi/aws/glue", "CatalogDatabase")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.catalogDatabaseMod.CatalogDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogDatabaseMod.CatalogDatabase]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.catalogDatabaseMod.CatalogDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogDatabaseMod.CatalogDatabase]
    inline def get(name: String, id: Input[ID], state: CatalogDatabaseState): typings.pulumiAws.catalogDatabaseMod.CatalogDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogDatabaseMod.CatalogDatabase]
    inline def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): typings.pulumiAws.catalogDatabaseMod.CatalogDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogDatabaseMod.CatalogDatabase]
    
    /**
      * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "CatalogTable")
  @js.native
  class CatalogTable protected ()
    extends typings.pulumiAws.catalogTableMod.CatalogTable {
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
  /* static members */
  object CatalogTable {
    
    @JSImport("@pulumi/aws/glue", "CatalogTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.catalogTableMod.CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogTableMod.CatalogTable]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.catalogTableMod.CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogTableMod.CatalogTable]
    inline def get(name: String, id: Input[ID], state: CatalogTableState): typings.pulumiAws.catalogTableMod.CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogTableMod.CatalogTable]
    inline def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): typings.pulumiAws.catalogTableMod.CatalogTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.catalogTableMod.CatalogTable]
    
    /**
      * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Classifier")
  @js.native
  class Classifier protected ()
    extends typings.pulumiAws.classifierMod.Classifier {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClassifierArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Classifier {
    
    @JSImport("@pulumi/aws/glue", "Classifier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.classifierMod.Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.classifierMod.Classifier]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.classifierMod.Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.classifierMod.Classifier]
    inline def get(name: String, id: Input[ID], state: ClassifierState): typings.pulumiAws.classifierMod.Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.classifierMod.Classifier]
    inline def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): typings.pulumiAws.classifierMod.Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.classifierMod.Classifier]
    
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Connection")
  @js.native
  class Connection protected ()
    extends typings.pulumiAws.glueConnectionMod.Connection {
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
  /* static members */
  object Connection {
    
    @JSImport("@pulumi/aws/glue", "Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.glueConnectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueConnectionMod.Connection]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.glueConnectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueConnectionMod.Connection]
    inline def get(name: String, id: Input[ID], state: ConnectionState): typings.pulumiAws.glueConnectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueConnectionMod.Connection]
    inline def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typings.pulumiAws.glueConnectionMod.Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueConnectionMod.Connection]
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Crawler")
  @js.native
  class Crawler protected ()
    extends typings.pulumiAws.crawlerMod.Crawler {
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
  /* static members */
  object Crawler {
    
    @JSImport("@pulumi/aws/glue", "Crawler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Crawler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.crawlerMod.Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.crawlerMod.Crawler]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.crawlerMod.Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.crawlerMod.Crawler]
    inline def get(name: String, id: Input[ID], state: CrawlerState): typings.pulumiAws.crawlerMod.Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.crawlerMod.Crawler]
    inline def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): typings.pulumiAws.crawlerMod.Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.crawlerMod.Crawler]
    
    /**
      * Returns true if the given object is an instance of Crawler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings")
  @js.native
  class DataCatalogEncryptionSettings protected ()
    extends typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings {
    /**
      * Create a DataCatalogEncryptionSettings resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataCatalogEncryptionSettingsArgs) = this()
    def this(name: String, args: DataCatalogEncryptionSettingsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DataCatalogEncryptionSettings {
    
    @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DataCatalogEncryptionSettings resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings]
    inline def get(name: String, id: Input[ID], state: DataCatalogEncryptionSettingsState): typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings]
    inline def get(
      name: String,
      id: Input[ID],
      state: DataCatalogEncryptionSettingsState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings]
    
    /**
      * Returns true if the given object is an instance of DataCatalogEncryptionSettings.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/dataCatalogEncryptionSettings.DataCatalogEncryptionSettings */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/dataCatalogEncryptionSettings.DataCatalogEncryptionSettings */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "DevEndpoint")
  @js.native
  class DevEndpoint protected ()
    extends typings.pulumiAws.devEndpointMod.DevEndpoint {
    /**
      * Create a DevEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DevEndpointArgs) = this()
    def this(name: String, args: DevEndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DevEndpoint {
    
    @JSImport("@pulumi/aws/glue", "DevEndpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DevEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.devEndpointMod.DevEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.devEndpointMod.DevEndpoint]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.devEndpointMod.DevEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.devEndpointMod.DevEndpoint]
    inline def get(name: String, id: Input[ID], state: DevEndpointState): typings.pulumiAws.devEndpointMod.DevEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.devEndpointMod.DevEndpoint]
    inline def get(name: String, id: Input[ID], state: DevEndpointState, opts: CustomResourceOptions): typings.pulumiAws.devEndpointMod.DevEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.devEndpointMod.DevEndpoint]
    
    /**
      * Returns true if the given object is an instance of DevEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/devEndpoint.DevEndpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/devEndpoint.DevEndpoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Job")
  @js.native
  class Job protected ()
    extends typings.pulumiAws.jobMod.Job {
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
  /* static members */
  object Job {
    
    @JSImport("@pulumi/aws/glue", "Job")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.jobMod.Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobMod.Job]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.jobMod.Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobMod.Job]
    inline def get(name: String, id: Input[ID], state: JobState): typings.pulumiAws.jobMod.Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobMod.Job]
    inline def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): typings.pulumiAws.jobMod.Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobMod.Job]
    
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "MLTransform")
  @js.native
  class MLTransform protected ()
    extends typings.pulumiAws.mltransformMod.MLTransform {
    /**
      * Create a MLTransform resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MLTransformArgs) = this()
    def this(name: String, args: MLTransformArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MLTransform {
    
    @JSImport("@pulumi/aws/glue", "MLTransform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MLTransform resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.mltransformMod.MLTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mltransformMod.MLTransform]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.mltransformMod.MLTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mltransformMod.MLTransform]
    inline def get(name: String, id: Input[ID], state: MLTransformState): typings.pulumiAws.mltransformMod.MLTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mltransformMod.MLTransform]
    inline def get(name: String, id: Input[ID], state: MLTransformState, opts: CustomResourceOptions): typings.pulumiAws.mltransformMod.MLTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.mltransformMod.MLTransform]
    
    /**
      * Returns true if the given object is an instance of MLTransform.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/mltransform.MLTransform */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/mltransform.MLTransform */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Partition")
  @js.native
  class Partition protected ()
    extends typings.pulumiAws.partitionMod.Partition {
    /**
      * Create a Partition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PartitionArgs) = this()
    def this(name: String, args: PartitionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Partition {
    
    @JSImport("@pulumi/aws/glue", "Partition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Partition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.partitionMod.Partition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.partitionMod.Partition]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.partitionMod.Partition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.partitionMod.Partition]
    inline def get(name: String, id: Input[ID], state: PartitionState): typings.pulumiAws.partitionMod.Partition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.partitionMod.Partition]
    inline def get(name: String, id: Input[ID], state: PartitionState, opts: CustomResourceOptions): typings.pulumiAws.partitionMod.Partition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.partitionMod.Partition]
    
    /**
      * Returns true if the given object is an instance of Partition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/partition.Partition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/partition.Partition */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "ResourcePolicy")
  @js.native
  class ResourcePolicy protected ()
    extends typings.pulumiAws.resourcePolicyMod.ResourcePolicy {
    /**
      * Create a ResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourcePolicyArgs) = this()
    def this(name: String, args: ResourcePolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourcePolicy {
    
    @JSImport("@pulumi/aws/glue", "ResourcePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.resourcePolicyMod.ResourcePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourcePolicyMod.ResourcePolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resourcePolicyMod.ResourcePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourcePolicyMod.ResourcePolicy]
    inline def get(name: String, id: Input[ID], state: ResourcePolicyState): typings.pulumiAws.resourcePolicyMod.ResourcePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourcePolicyMod.ResourcePolicy]
    inline def get(name: String, id: Input[ID], state: ResourcePolicyState, opts: CustomResourceOptions): typings.pulumiAws.resourcePolicyMod.ResourcePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourcePolicyMod.ResourcePolicy]
    
    /**
      * Returns true if the given object is an instance of ResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/resourcePolicy.ResourcePolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/resourcePolicy.ResourcePolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "SecurityConfiguration")
  @js.native
  class SecurityConfiguration protected ()
    extends typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration {
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
  /* static members */
  object SecurityConfiguration {
    
    @JSImport("@pulumi/aws/glue", "SecurityConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: SecurityConfigurationState): typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration]
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Trigger")
  @js.native
  class Trigger protected ()
    extends typings.pulumiAws.glueTriggerMod.Trigger {
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
  /* static members */
  object Trigger {
    
    @JSImport("@pulumi/aws/glue", "Trigger")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.glueTriggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueTriggerMod.Trigger]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.glueTriggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueTriggerMod.Trigger]
    inline def get(name: String, id: Input[ID], state: TriggerState): typings.pulumiAws.glueTriggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueTriggerMod.Trigger]
    inline def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typings.pulumiAws.glueTriggerMod.Trigger = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.glueTriggerMod.Trigger]
    
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "UserDefinedFunction")
  @js.native
  class UserDefinedFunction protected ()
    extends typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction {
    /**
      * Create a UserDefinedFunction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserDefinedFunctionArgs) = this()
    def this(name: String, args: UserDefinedFunctionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object UserDefinedFunction {
    
    @JSImport("@pulumi/aws/glue", "UserDefinedFunction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserDefinedFunction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction]
    inline def get(name: String, id: Input[ID], state: UserDefinedFunctionState): typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction]
    inline def get(name: String, id: Input[ID], state: UserDefinedFunctionState, opts: CustomResourceOptions): typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userDefinedFunctionMod.UserDefinedFunction]
    
    /**
      * Returns true if the given object is an instance of UserDefinedFunction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/userDefinedFunction.UserDefinedFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/userDefinedFunction.UserDefinedFunction */ Boolean]
  }
  
  @JSImport("@pulumi/aws/glue", "Workflow")
  @js.native
  class Workflow protected ()
    extends typings.pulumiAws.workflowMod.Workflow {
    /**
      * Create a Workflow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkflowArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: WorkflowArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Workflow {
    
    @JSImport("@pulumi/aws/glue", "Workflow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Workflow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.workflowMod.Workflow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workflowMod.Workflow]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.workflowMod.Workflow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workflowMod.Workflow]
    inline def get(name: String, id: Input[ID], state: WorkflowState): typings.pulumiAws.workflowMod.Workflow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workflowMod.Workflow]
    inline def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): typings.pulumiAws.workflowMod.Workflow = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.workflowMod.Workflow]
    
    /**
      * Returns true if the given object is an instance of Workflow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean]
  }
  
  inline def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScript")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptResult]]
  inline def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScript")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptResult]]
}
