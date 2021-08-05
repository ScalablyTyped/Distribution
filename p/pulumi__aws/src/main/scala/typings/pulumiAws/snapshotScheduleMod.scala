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

object snapshotScheduleMod {
  
  @JSImport("@pulumi/aws/redshift/snapshotSchedule", "SnapshotSchedule")
  @js.native
  class SnapshotSchedule protected () extends CustomResource {
    /**
      * Create a SnapshotSchedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleArgs) = this()
    def this(name: String, args: SnapshotScheduleArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
      */
    val definitions: Output_[js.Array[String]] = js.native
    
    /**
      * The description of the snapshot schedule.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val identifier: Output_[String] = js.native
    
    /**
      * Creates a unique
      * identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object SnapshotSchedule {
    
    @JSImport("@pulumi/aws/redshift/snapshotSchedule", "SnapshotSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SnapshotSchedule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotSchedule]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleState): SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SnapshotSchedule]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): SnapshotSchedule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotSchedule]
    
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean]
  }
  
  trait SnapshotScheduleArgs extends StObject {
    
    /**
      * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
      */
    val definitions: Input[js.Array[Input[String]]]
    
    /**
      * The description of the snapshot schedule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique
      * identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SnapshotScheduleArgs {
    
    inline def apply(definitions: Input[js.Array[Input[String]]]): SnapshotScheduleArgs = {
      val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotScheduleArgs]
    }
    
    extension [Self <: SnapshotScheduleArgs](x: Self) {
      
      inline def setDefinitions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsVarargs(value: Input[String]*): Self = StObject.set(x, "definitions", js.Array(value :_*))
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait SnapshotScheduleState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
      */
    val definitions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The description of the snapshot schedule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique
      * identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object SnapshotScheduleState {
    
    inline def apply(): SnapshotScheduleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotScheduleState]
    }
    
    extension [Self <: SnapshotScheduleState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDefinitions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDefinitionsVarargs(value: Input[String]*): Self = StObject.set(x, "definitions", js.Array(value :_*))
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
