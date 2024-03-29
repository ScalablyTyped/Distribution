package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotCreateVolumePermissionMod {
  
  @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission")
  @js.native
  class SnapshotCreateVolumePermission protected () extends CustomResource {
    /**
      * Create a SnapshotCreateVolumePermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCreateVolumePermissionArgs) = this()
    def this(name: String, args: SnapshotCreateVolumePermissionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An AWS Account ID to add create volume permissions
      */
    val accountId: Output_[String] = js.native
    
    /**
      * A snapshot ID
      */
    val snapshotId: Output_[String] = js.native
  }
  /* static members */
  object SnapshotCreateVolumePermission {
    
    @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SnapshotCreateVolumePermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): SnapshotCreateVolumePermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SnapshotCreateVolumePermission]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SnapshotCreateVolumePermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotCreateVolumePermission]
    inline def get(name: String, id: Input[ID], state: SnapshotCreateVolumePermissionState): SnapshotCreateVolumePermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SnapshotCreateVolumePermission]
    inline def get(
      name: String,
      id: Input[ID],
      state: SnapshotCreateVolumePermissionState,
      opts: CustomResourceOptions
    ): SnapshotCreateVolumePermission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SnapshotCreateVolumePermission]
    
    /**
      * Returns true if the given object is an instance of SnapshotCreateVolumePermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/snapshotCreateVolumePermission.SnapshotCreateVolumePermission */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/snapshotCreateVolumePermission.SnapshotCreateVolumePermission */ Boolean]
  }
  
  trait SnapshotCreateVolumePermissionArgs extends StObject {
    
    /**
      * An AWS Account ID to add create volume permissions
      */
    val accountId: Input[String]
    
    /**
      * A snapshot ID
      */
    val snapshotId: Input[String]
  }
  object SnapshotCreateVolumePermissionArgs {
    
    inline def apply(accountId: Input[String], snapshotId: Input[String]): SnapshotCreateVolumePermissionArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotCreateVolumePermissionArgs]
    }
    
    extension [Self <: SnapshotCreateVolumePermissionArgs](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SnapshotCreateVolumePermissionState extends StObject {
    
    /**
      * An AWS Account ID to add create volume permissions
      */
    val accountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A snapshot ID
      */
    val snapshotId: js.UndefOr[Input[String]] = js.undefined
  }
  object SnapshotCreateVolumePermissionState {
    
    inline def apply(): SnapshotCreateVolumePermissionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotCreateVolumePermissionState]
    }
    
    extension [Self <: SnapshotCreateVolumePermissionState](x: Self) {
      
      inline def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    }
  }
}
