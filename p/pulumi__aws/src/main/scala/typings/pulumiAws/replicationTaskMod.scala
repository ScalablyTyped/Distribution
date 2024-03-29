package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replicationTaskMod {
  
  @JSImport("@pulumi/aws/dms/replicationTask", "ReplicationTask")
  @js.native
  class ReplicationTask protected () extends CustomResource {
    /**
      * Create a ReplicationTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationTaskArgs) = this()
    def this(name: String, args: ReplicationTaskArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
      */
    val cdcStartTime: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
      */
    val migrationType: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    val replicationInstanceArn: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the replication task.
      */
    val replicationTaskArn: Output_[String] = js.native
    
    /**
      * The replication task identifier.
      */
    val replicationTaskId: Output_[String] = js.native
    
    /**
      * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
      */
    val replicationTaskSettings: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
      */
    val sourceEndpointArn: Output_[String] = js.native
    
    /**
      * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
      */
    val tableMappings: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
      */
    val targetEndpointArn: Output_[String] = js.native
  }
  /* static members */
  object ReplicationTask {
    
    @JSImport("@pulumi/aws/dms/replicationTask", "ReplicationTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ReplicationTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReplicationTask]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReplicationTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReplicationTask]
    inline def get(name: String, id: Input[ID], state: ReplicationTaskState): ReplicationTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReplicationTask]
    inline def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): ReplicationTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReplicationTask]
    
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean]
  }
  
  trait ReplicationTaskArgs extends StObject {
    
    /**
      * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
      */
    val cdcStartTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
      */
    val migrationType: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    val replicationInstanceArn: Input[String]
    
    /**
      * The replication task identifier.
      */
    val replicationTaskId: Input[String]
    
    /**
      * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
      */
    val replicationTaskSettings: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
      */
    val sourceEndpointArn: Input[String]
    
    /**
      * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
      */
    val tableMappings: Input[String]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
      */
    val targetEndpointArn: Input[String]
  }
  object ReplicationTaskArgs {
    
    inline def apply(
      migrationType: Input[String],
      replicationInstanceArn: Input[String],
      replicationTaskId: Input[String],
      sourceEndpointArn: Input[String],
      tableMappings: Input[String],
      targetEndpointArn: Input[String]
    ): ReplicationTaskArgs = {
      val __obj = js.Dynamic.literal(migrationType = migrationType.asInstanceOf[js.Any], replicationInstanceArn = replicationInstanceArn.asInstanceOf[js.Any], replicationTaskId = replicationTaskId.asInstanceOf[js.Any], sourceEndpointArn = sourceEndpointArn.asInstanceOf[js.Any], tableMappings = tableMappings.asInstanceOf[js.Any], targetEndpointArn = targetEndpointArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationTaskArgs]
    }
    
    extension [Self <: ReplicationTaskArgs](x: Self) {
      
      inline def setCdcStartTime(value: Input[String]): Self = StObject.set(x, "cdcStartTime", value.asInstanceOf[js.Any])
      
      inline def setCdcStartTimeUndefined: Self = StObject.set(x, "cdcStartTime", js.undefined)
      
      inline def setMigrationType(value: Input[String]): Self = StObject.set(x, "migrationType", value.asInstanceOf[js.Any])
      
      inline def setReplicationInstanceArn(value: Input[String]): Self = StObject.set(x, "replicationInstanceArn", value.asInstanceOf[js.Any])
      
      inline def setReplicationTaskId(value: Input[String]): Self = StObject.set(x, "replicationTaskId", value.asInstanceOf[js.Any])
      
      inline def setReplicationTaskSettings(value: Input[String]): Self = StObject.set(x, "replicationTaskSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicationTaskSettingsUndefined: Self = StObject.set(x, "replicationTaskSettings", js.undefined)
      
      inline def setSourceEndpointArn(value: Input[String]): Self = StObject.set(x, "sourceEndpointArn", value.asInstanceOf[js.Any])
      
      inline def setTableMappings(value: Input[String]): Self = StObject.set(x, "tableMappings", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTargetEndpointArn(value: Input[String]): Self = StObject.set(x, "targetEndpointArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicationTaskState extends StObject {
    
    /**
      * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
      */
    val cdcStartTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
      */
    val migrationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    val replicationInstanceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the replication task.
      */
    val replicationTaskArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The replication task identifier.
      */
    val replicationTaskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
      */
    val replicationTaskSettings: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
      */
    val sourceEndpointArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
      */
    val tableMappings: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
      */
    val targetEndpointArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ReplicationTaskState {
    
    inline def apply(): ReplicationTaskState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationTaskState]
    }
    
    extension [Self <: ReplicationTaskState](x: Self) {
      
      inline def setCdcStartTime(value: Input[String]): Self = StObject.set(x, "cdcStartTime", value.asInstanceOf[js.Any])
      
      inline def setCdcStartTimeUndefined: Self = StObject.set(x, "cdcStartTime", js.undefined)
      
      inline def setMigrationType(value: Input[String]): Self = StObject.set(x, "migrationType", value.asInstanceOf[js.Any])
      
      inline def setMigrationTypeUndefined: Self = StObject.set(x, "migrationType", js.undefined)
      
      inline def setReplicationInstanceArn(value: Input[String]): Self = StObject.set(x, "replicationInstanceArn", value.asInstanceOf[js.Any])
      
      inline def setReplicationInstanceArnUndefined: Self = StObject.set(x, "replicationInstanceArn", js.undefined)
      
      inline def setReplicationTaskArn(value: Input[String]): Self = StObject.set(x, "replicationTaskArn", value.asInstanceOf[js.Any])
      
      inline def setReplicationTaskArnUndefined: Self = StObject.set(x, "replicationTaskArn", js.undefined)
      
      inline def setReplicationTaskId(value: Input[String]): Self = StObject.set(x, "replicationTaskId", value.asInstanceOf[js.Any])
      
      inline def setReplicationTaskIdUndefined: Self = StObject.set(x, "replicationTaskId", js.undefined)
      
      inline def setReplicationTaskSettings(value: Input[String]): Self = StObject.set(x, "replicationTaskSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicationTaskSettingsUndefined: Self = StObject.set(x, "replicationTaskSettings", js.undefined)
      
      inline def setSourceEndpointArn(value: Input[String]): Self = StObject.set(x, "sourceEndpointArn", value.asInstanceOf[js.Any])
      
      inline def setSourceEndpointArnUndefined: Self = StObject.set(x, "sourceEndpointArn", js.undefined)
      
      inline def setTableMappings(value: Input[String]): Self = StObject.set(x, "tableMappings", value.asInstanceOf[js.Any])
      
      inline def setTableMappingsUndefined: Self = StObject.set(x, "tableMappings", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTargetEndpointArn(value: Input[String]): Self = StObject.set(x, "targetEndpointArn", value.asInstanceOf[js.Any])
      
      inline def setTargetEndpointArnUndefined: Self = StObject.set(x, "targetEndpointArn", js.undefined)
    }
  }
}
