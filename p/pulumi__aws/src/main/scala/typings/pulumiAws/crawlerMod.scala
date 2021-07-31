package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.CrawlerCatalogTarget
import typings.pulumiAws.outputMod.glue.CrawlerDynamodbTarget
import typings.pulumiAws.outputMod.glue.CrawlerJdbcTarget
import typings.pulumiAws.outputMod.glue.CrawlerMongodbTarget
import typings.pulumiAws.outputMod.glue.CrawlerS3Target
import typings.pulumiAws.outputMod.glue.CrawlerSchemaChangePolicy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crawlerMod {
  
  @JSImport("@pulumi/aws/glue/crawler", "Crawler")
  @js.native
  class Crawler protected () extends CustomResource {
    /**
      * Create a Crawler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CrawlerArgs) = this()
    def this(name: String, args: CrawlerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the crawler
      */
    val arn: Output_[String] = js.native
    
    val catalogTargets: Output_[js.UndefOr[js.Array[CrawlerCatalogTarget]]] = js.native
    
    /**
      * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
      */
    val classifiers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * JSON string of configuration information.
      */
    val configuration: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Glue database where results are written.
      */
    val databaseName: Output_[String] = js.native
    
    /**
      * Description of the crawler.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of nested DynamoDB target arguments. See below.
      */
    val dynamodbTargets: Output_[js.UndefOr[js.Array[CrawlerDynamodbTarget]]] = js.native
    
    /**
      * List of nested JBDC target arguments. See below.
      */
    val jdbcTargets: Output_[js.UndefOr[js.Array[CrawlerJdbcTarget]]] = js.native
    
    /**
      * List nested MongoDB target arguments. See below.
      */
    val mongodbTargets: Output_[js.UndefOr[js.Array[CrawlerMongodbTarget]]] = js.native
    
    /**
      * Name of the crawler.
      */
    val name: Output_[String] = js.native
    
    /**
      * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
      */
    val role: Output_[String] = js.native
    
    /**
      * List nested Amazon S3 target arguments. See below.
      */
    val s3Targets: Output_[js.UndefOr[js.Array[CrawlerS3Target]]] = js.native
    
    /**
      * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
      */
    val schedule: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Policy for the crawler's update and deletion behavior.
      */
    val schemaChangePolicy: Output_[js.UndefOr[CrawlerSchemaChangePolicy]] = js.native
    
    /**
      * The name of Security Configuration to be used by the crawler
      */
    val securityConfiguration: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The table prefix used for catalog tables that are created.
      */
    val tablePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Crawler {
    
    @JSImport("@pulumi/aws/glue/crawler", "Crawler")
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
    @scala.inline
    def get(name: String, id: Input[ID]): Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Crawler]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Crawler]
    @scala.inline
    def get(name: String, id: Input[ID], state: CrawlerState): Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Crawler]
    @scala.inline
    def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): Crawler = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Crawler]
    
    /**
      * Returns true if the given object is an instance of Crawler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean]
  }
  
  trait CrawlerArgs extends StObject {
    
    val catalogTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget]]]] = js.undefined
    
    /**
      * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
      */
    val classifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * JSON string of configuration information.
      */
    val configuration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Glue database where results are written.
      */
    val databaseName: Input[String]
    
    /**
      * Description of the crawler.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of nested DynamoDB target arguments. See below.
      */
    val dynamodbTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget]]]] = js.undefined
    
    /**
      * List of nested JBDC target arguments. See below.
      */
    val jdbcTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget]]]] = js.undefined
    
    /**
      * List nested MongoDB target arguments. See below.
      */
    val mongodbTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerMongodbTarget]]]] = js.undefined
    
    /**
      * Name of the crawler.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
      */
    val role: Input[String]
    
    /**
      * List nested Amazon S3 target arguments. See below.
      */
    val s3Targets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerS3Target]]]] = js.undefined
    
    /**
      * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
      */
    val schedule: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Policy for the crawler's update and deletion behavior.
      */
    val schemaChangePolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.CrawlerSchemaChangePolicy]] = js.undefined
    
    /**
      * The name of Security Configuration to be used by the crawler
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The table prefix used for catalog tables that are created.
      */
    val tablePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object CrawlerArgs {
    
    @scala.inline
    def apply(databaseName: Input[String], role: Input[String]): CrawlerArgs = {
      val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrawlerArgs]
    }
    
    @scala.inline
    implicit class CrawlerArgsMutableBuilder[Self <: CrawlerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget]]]): Self = StObject.set(x, "catalogTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogTargetsUndefined: Self = StObject.set(x, "catalogTargets", js.undefined)
      
      @scala.inline
      def setCatalogTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget]*): Self = StObject.set(x, "catalogTargets", js.Array(value :_*))
      
      @scala.inline
      def setClassifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "classifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassifiersUndefined: Self = StObject.set(x, "classifiers", js.undefined)
      
      @scala.inline
      def setClassifiersVarargs(value: Input[String]*): Self = StObject.set(x, "classifiers", js.Array(value :_*))
      
      @scala.inline
      def setConfiguration(value: Input[String]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDynamodbTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget]]]): Self = StObject.set(x, "dynamodbTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbTargetsUndefined: Self = StObject.set(x, "dynamodbTargets", js.undefined)
      
      @scala.inline
      def setDynamodbTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget]*): Self = StObject.set(x, "dynamodbTargets", js.Array(value :_*))
      
      @scala.inline
      def setJdbcTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget]]]): Self = StObject.set(x, "jdbcTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJdbcTargetsUndefined: Self = StObject.set(x, "jdbcTargets", js.undefined)
      
      @scala.inline
      def setJdbcTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget]*): Self = StObject.set(x, "jdbcTargets", js.Array(value :_*))
      
      @scala.inline
      def setMongodbTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerMongodbTarget]]]): Self = StObject.set(x, "mongodbTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMongodbTargetsUndefined: Self = StObject.set(x, "mongodbTargets", js.undefined)
      
      @scala.inline
      def setMongodbTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerMongodbTarget]*): Self = StObject.set(x, "mongodbTargets", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Targets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerS3Target]]]): Self = StObject.set(x, "s3Targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3TargetsUndefined: Self = StObject.set(x, "s3Targets", js.undefined)
      
      @scala.inline
      def setS3TargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerS3Target]*): Self = StObject.set(x, "s3Targets", js.Array(value :_*))
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setSchemaChangePolicy(value: Input[typings.pulumiAws.inputMod.glue.CrawlerSchemaChangePolicy]): Self = StObject.set(x, "schemaChangePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaChangePolicyUndefined: Self = StObject.set(x, "schemaChangePolicy", js.undefined)
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setTablePrefix(value: Input[String]): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePrefixUndefined: Self = StObject.set(x, "tablePrefix", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait CrawlerState extends StObject {
    
    /**
      * The ARN of the crawler
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    val catalogTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget]]]] = js.undefined
    
    /**
      * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
      */
    val classifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * JSON string of configuration information.
      */
    val configuration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Glue database where results are written.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the crawler.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of nested DynamoDB target arguments. See below.
      */
    val dynamodbTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget]]]] = js.undefined
    
    /**
      * List of nested JBDC target arguments. See below.
      */
    val jdbcTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget]]]] = js.undefined
    
    /**
      * List nested MongoDB target arguments. See below.
      */
    val mongodbTargets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerMongodbTarget]]]] = js.undefined
    
    /**
      * Name of the crawler.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
      */
    val role: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List nested Amazon S3 target arguments. See below.
      */
    val s3Targets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerS3Target]]]] = js.undefined
    
    /**
      * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
      */
    val schedule: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Policy for the crawler's update and deletion behavior.
      */
    val schemaChangePolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.CrawlerSchemaChangePolicy]] = js.undefined
    
    /**
      * The name of Security Configuration to be used by the crawler
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The table prefix used for catalog tables that are created.
      */
    val tablePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object CrawlerState {
    
    @scala.inline
    def apply(): CrawlerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrawlerState]
    }
    
    @scala.inline
    implicit class CrawlerStateMutableBuilder[Self <: CrawlerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCatalogTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget]]]): Self = StObject.set(x, "catalogTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogTargetsUndefined: Self = StObject.set(x, "catalogTargets", js.undefined)
      
      @scala.inline
      def setCatalogTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget]*): Self = StObject.set(x, "catalogTargets", js.Array(value :_*))
      
      @scala.inline
      def setClassifiers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "classifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassifiersUndefined: Self = StObject.set(x, "classifiers", js.undefined)
      
      @scala.inline
      def setClassifiersVarargs(value: Input[String]*): Self = StObject.set(x, "classifiers", js.Array(value :_*))
      
      @scala.inline
      def setConfiguration(value: Input[String]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDynamodbTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget]]]): Self = StObject.set(x, "dynamodbTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbTargetsUndefined: Self = StObject.set(x, "dynamodbTargets", js.undefined)
      
      @scala.inline
      def setDynamodbTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget]*): Self = StObject.set(x, "dynamodbTargets", js.Array(value :_*))
      
      @scala.inline
      def setJdbcTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget]]]): Self = StObject.set(x, "jdbcTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJdbcTargetsUndefined: Self = StObject.set(x, "jdbcTargets", js.undefined)
      
      @scala.inline
      def setJdbcTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget]*): Self = StObject.set(x, "jdbcTargets", js.Array(value :_*))
      
      @scala.inline
      def setMongodbTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerMongodbTarget]]]): Self = StObject.set(x, "mongodbTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMongodbTargetsUndefined: Self = StObject.set(x, "mongodbTargets", js.undefined)
      
      @scala.inline
      def setMongodbTargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerMongodbTarget]*): Self = StObject.set(x, "mongodbTargets", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setS3Targets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.glue.CrawlerS3Target]]]): Self = StObject.set(x, "s3Targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3TargetsUndefined: Self = StObject.set(x, "s3Targets", js.undefined)
      
      @scala.inline
      def setS3TargetsVarargs(value: Input[typings.pulumiAws.inputMod.glue.CrawlerS3Target]*): Self = StObject.set(x, "s3Targets", js.Array(value :_*))
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setSchemaChangePolicy(value: Input[typings.pulumiAws.inputMod.glue.CrawlerSchemaChangePolicy]): Self = StObject.set(x, "schemaChangePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaChangePolicyUndefined: Self = StObject.set(x, "schemaChangePolicy", js.undefined)
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setTablePrefix(value: Input[String]): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablePrefixUndefined: Self = StObject.set(x, "tablePrefix", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
