package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing SnapshotCreateVolumePermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission.get")
    @js.native
    def get(name: String, id: Input[ID]): SnapshotCreateVolumePermission = js.native
    @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotCreateVolumePermission = js.native
    @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCreateVolumePermissionState): SnapshotCreateVolumePermission = js.native
    @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: SnapshotCreateVolumePermissionState,
      opts: CustomResourceOptions
    ): SnapshotCreateVolumePermission = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCreateVolumePermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/snapshotCreateVolumePermission.SnapshotCreateVolumePermission */ Boolean = js.native
  }
  
  @js.native
  trait SnapshotCreateVolumePermissionArgs extends StObject {
    
    /**
      * An AWS Account ID to add create volume permissions
      */
    val accountId: Input[String] = js.native
    
    /**
      * A snapshot ID
      */
    val snapshotId: Input[String] = js.native
  }
  object SnapshotCreateVolumePermissionArgs {
    
    @scala.inline
    def apply(accountId: Input[String], snapshotId: Input[String]): SnapshotCreateVolumePermissionArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotCreateVolumePermissionArgs]
    }
    
    @scala.inline
    implicit class SnapshotCreateVolumePermissionArgsMutableBuilder[Self <: SnapshotCreateVolumePermissionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SnapshotCreateVolumePermissionState extends StObject {
    
    /**
      * An AWS Account ID to add create volume permissions
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A snapshot ID
      */
    val snapshotId: js.UndefOr[Input[String]] = js.native
  }
  object SnapshotCreateVolumePermissionState {
    
    @scala.inline
    def apply(): SnapshotCreateVolumePermissionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotCreateVolumePermissionState]
    }
    
    @scala.inline
    implicit class SnapshotCreateVolumePermissionStateMutableBuilder[Self <: SnapshotCreateVolumePermissionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setSnapshotId(value: Input[String]): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    }
  }
}
