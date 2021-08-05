package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotScheduleAssociationMod {
  
  @JSImport("@pulumi/aws/redshift/snapshotScheduleAssociation", "SnapshotScheduleAssociation")
  @js.native
  class SnapshotScheduleAssociation protected () extends CustomResource {
    /**
      * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
    def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The cluster identifier.
      */
    val clusterIdentifier: Output_[String] = js.native
    
    /**
      * The snapshot schedule identifier.
      */
    val scheduleIdentifier: Output_[String] = js.native
  }
  /* static members */
  object SnapshotScheduleAssociation {
    
    @JSImport("@pulumi/aws/redshift/snapshotScheduleAssociation", "SnapshotScheduleAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SnapshotScheduleAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotScheduleAssociation]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SnapshotScheduleAssociation]
    inline def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): SnapshotScheduleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotScheduleAssociation]
    
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean]
  }
  
  trait SnapshotScheduleAssociationArgs extends StObject {
    
    /**
      * The cluster identifier.
      */
    val clusterIdentifier: Input[String]
    
    /**
      * The snapshot schedule identifier.
      */
    val scheduleIdentifier: Input[String]
  }
  object SnapshotScheduleAssociationArgs {
    
    inline def apply(clusterIdentifier: Input[String], scheduleIdentifier: Input[String]): SnapshotScheduleAssociationArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], scheduleIdentifier = scheduleIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotScheduleAssociationArgs]
    }
    
    extension [Self <: SnapshotScheduleAssociationArgs](x: Self) {
      
      inline def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setScheduleIdentifier(value: Input[String]): Self = StObject.set(x, "scheduleIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait SnapshotScheduleAssociationState extends StObject {
    
    /**
      * The cluster identifier.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The snapshot schedule identifier.
      */
    val scheduleIdentifier: js.UndefOr[Input[String]] = js.undefined
  }
  object SnapshotScheduleAssociationState {
    
    inline def apply(): SnapshotScheduleAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotScheduleAssociationState]
    }
    
    extension [Self <: SnapshotScheduleAssociationState](x: Self) {
      
      inline def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      inline def setScheduleIdentifier(value: Input[String]): Self = StObject.set(x, "scheduleIdentifier", value.asInstanceOf[js.Any])
      
      inline def setScheduleIdentifierUndefined: Self = StObject.set(x, "scheduleIdentifier", js.undefined)
    }
  }
}
