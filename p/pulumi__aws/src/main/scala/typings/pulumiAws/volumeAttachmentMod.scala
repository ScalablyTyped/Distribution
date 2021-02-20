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

object volumeAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment")
  @js.native
  class VolumeAttachment protected () extends CustomResource {
    /**
      * Create a VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VolumeAttachmentArgs) = this()
    def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The device name to expose to the instance (for
      * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
      */
    val deviceName: Output_[String] = js.native
    
    /**
      * Set to `true` if you want to force the
      * volume to detach. Useful if previous attempts failed, but use this option only
      * as a last resort, as this can result in **data loss**. See
      * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
      */
    val forceDetach: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * ID of the Instance to attach to
      */
    val instanceId: Output_[String] = js.native
    
    /**
      * Set this to true if you do not wish
      * to detach the volume from the instance to which it is attached at destroy
      * time, and instead just remove the attachment from this provider state. This is
      * useful when destroying an instance which has volumes created by some other
      * means attached.
      */
    val skipDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * ID of the Volume to be attached
      */
    val volumeId: Output_[String] = js.native
  }
  /* static members */
  object VolumeAttachment {
    
    /**
      * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): VolumeAttachment = js.native
    @JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VolumeAttachment = js.native
    @JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VolumeAttachmentState): VolumeAttachment = js.native
    @JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: VolumeAttachmentState, opts: CustomResourceOptions): VolumeAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/volumeAttachment", "VolumeAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/volumeAttachment.VolumeAttachment */ Boolean = js.native
  }
  
  @js.native
  trait VolumeAttachmentArgs extends StObject {
    
    /**
      * The device name to expose to the instance (for
      * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
      */
    val deviceName: Input[String] = js.native
    
    /**
      * Set to `true` if you want to force the
      * volume to detach. Useful if previous attempts failed, but use this option only
      * as a last resort, as this can result in **data loss**. See
      * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
      */
    val forceDetach: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * ID of the Instance to attach to
      */
    val instanceId: Input[String] = js.native
    
    /**
      * Set this to true if you do not wish
      * to detach the volume from the instance to which it is attached at destroy
      * time, and instead just remove the attachment from this provider state. This is
      * useful when destroying an instance which has volumes created by some other
      * means attached.
      */
    val skipDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * ID of the Volume to be attached
      */
    val volumeId: Input[String] = js.native
  }
  object VolumeAttachmentArgs {
    
    @scala.inline
    def apply(deviceName: Input[String], instanceId: Input[String], volumeId: Input[String]): VolumeAttachmentArgs = {
      val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeAttachmentArgs]
    }
    
    @scala.inline
    implicit class VolumeAttachmentArgsMutableBuilder[Self <: VolumeAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDetach(value: Input[Boolean]): Self = StObject.set(x, "forceDetach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDetachUndefined: Self = StObject.set(x, "forceDetach", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDestroy(value: Input[Boolean]): Self = StObject.set(x, "skipDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDestroyUndefined: Self = StObject.set(x, "skipDestroy", js.undefined)
      
      @scala.inline
      def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VolumeAttachmentState extends StObject {
    
    /**
      * The device name to expose to the instance (for
      * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
      */
    val deviceName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set to `true` if you want to force the
      * volume to detach. Useful if previous attempts failed, but use this option only
      * as a last resort, as this can result in **data loss**. See
      * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
      */
    val forceDetach: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * ID of the Instance to attach to
      */
    val instanceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set this to true if you do not wish
      * to detach the volume from the instance to which it is attached at destroy
      * time, and instead just remove the attachment from this provider state. This is
      * useful when destroying an instance which has volumes created by some other
      * means attached.
      */
    val skipDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * ID of the Volume to be attached
      */
    val volumeId: js.UndefOr[Input[String]] = js.native
  }
  object VolumeAttachmentState {
    
    @scala.inline
    def apply(): VolumeAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeAttachmentState]
    }
    
    @scala.inline
    implicit class VolumeAttachmentStateMutableBuilder[Self <: VolumeAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      @scala.inline
      def setForceDetach(value: Input[Boolean]): Self = StObject.set(x, "forceDetach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDetachUndefined: Self = StObject.set(x, "forceDetach", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setSkipDestroy(value: Input[Boolean]): Self = StObject.set(x, "skipDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDestroyUndefined: Self = StObject.set(x, "skipDestroy", js.undefined)
      
      @scala.inline
      def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
    }
  }
}
