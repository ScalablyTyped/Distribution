package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.pinpointAdmChannelMod.AdmChannelArgs
import typings.atPulumiAws.pinpointAdmChannelMod.AdmChannelState
import typings.atPulumiAws.pinpointApnsChannelMod.ApnsChannelArgs
import typings.atPulumiAws.pinpointApnsChannelMod.ApnsChannelState
import typings.atPulumiAws.pinpointApnsSandboxChannelMod.ApnsSandboxChannelArgs
import typings.atPulumiAws.pinpointApnsSandboxChannelMod.ApnsSandboxChannelState
import typings.atPulumiAws.pinpointApnsVoipChannelMod.ApnsVoipChannelArgs
import typings.atPulumiAws.pinpointApnsVoipChannelMod.ApnsVoipChannelState
import typings.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs
import typings.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState
import typings.atPulumiAws.pinpointAppMod.AppArgs
import typings.atPulumiAws.pinpointAppMod.AppState
import typings.atPulumiAws.pinpointBaiduChannelMod.BaiduChannelArgs
import typings.atPulumiAws.pinpointBaiduChannelMod.BaiduChannelState
import typings.atPulumiAws.pinpointEmailChannelMod.EmailChannelArgs
import typings.atPulumiAws.pinpointEmailChannelMod.EmailChannelState
import typings.atPulumiAws.pinpointEventStreamMod.EventStreamArgs
import typings.atPulumiAws.pinpointEventStreamMod.EventStreamState
import typings.atPulumiAws.pinpointGcmChannelMod.GcmChannelArgs
import typings.atPulumiAws.pinpointGcmChannelMod.GcmChannelState
import typings.atPulumiAws.pinpointSmsChannelMod.SmsChannelArgs
import typings.atPulumiAws.pinpointSmsChannelMod.SmsChannelState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint")
@js.native
object pinpointNs extends js.Object {
  @js.native
  class AdmChannel protected ()
    extends typings.atPulumiAws.pinpointMod.AdmChannel {
    /**
      * Create a AdmChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AdmChannelArgs) = this()
    def this(name: String, args: AdmChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApnsChannel protected ()
    extends typings.atPulumiAws.pinpointMod.ApnsChannel {
    /**
      * Create a ApnsChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsChannelArgs) = this()
    def this(name: String, args: ApnsChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApnsSandboxChannel protected ()
    extends typings.atPulumiAws.pinpointMod.ApnsSandboxChannel {
    /**
      * Create a ApnsSandboxChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsSandboxChannelArgs) = this()
    def this(name: String, args: ApnsSandboxChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApnsVoipChannel protected ()
    extends typings.atPulumiAws.pinpointMod.ApnsVoipChannel {
    /**
      * Create a ApnsVoipChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsVoipChannelArgs) = this()
    def this(name: String, args: ApnsVoipChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApnsVoipSandboxChannel protected ()
    extends typings.atPulumiAws.pinpointMod.ApnsVoipSandboxChannel {
    /**
      * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApnsVoipSandboxChannelArgs) = this()
    def this(name: String, args: ApnsVoipSandboxChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class App protected ()
    extends typings.atPulumiAws.pinpointMod.App {
    /**
      * Create a App resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AppArgs) = this()
    def this(name: String, args: AppArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class BaiduChannel protected ()
    extends typings.atPulumiAws.pinpointMod.BaiduChannel {
    /**
      * Create a BaiduChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BaiduChannelArgs) = this()
    def this(name: String, args: BaiduChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EmailChannel protected ()
    extends typings.atPulumiAws.pinpointMod.EmailChannel {
    /**
      * Create a EmailChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EmailChannelArgs) = this()
    def this(name: String, args: EmailChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventStream protected ()
    extends typings.atPulumiAws.pinpointMod.EventStream {
    /**
      * Create a EventStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventStreamArgs) = this()
    def this(name: String, args: EventStreamArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GcmChannel protected ()
    extends typings.atPulumiAws.pinpointMod.GcmChannel {
    /**
      * Create a GcmChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GcmChannelArgs) = this()
    def this(name: String, args: GcmChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SmsChannel protected ()
    extends typings.atPulumiAws.pinpointMod.SmsChannel {
    /**
      * Create a SmsChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmsChannelArgs) = this()
    def this(name: String, args: SmsChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object AdmChannel extends js.Object {
    /**
      * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointAdmChannelMod.AdmChannel = js.native
    def get(name: String, id: Input[ID], state: AdmChannelState): typings.atPulumiAws.pinpointAdmChannelMod.AdmChannel = js.native
    def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointAdmChannelMod.AdmChannel = js.native
    /**
      * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ApnsChannel extends js.Object {
    /**
      * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointApnsChannelMod.ApnsChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsChannelState): typings.atPulumiAws.pinpointApnsChannelMod.ApnsChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointApnsChannelMod.ApnsChannel = js.native
    /**
      * Returns true if the given object is an instance of ApnsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsChannel.ApnsChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ApnsSandboxChannel extends js.Object {
    /**
      * Get an existing ApnsSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsSandboxChannelState): typings.atPulumiAws.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsSandboxChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
    /**
      * Returns true if the given object is an instance of ApnsSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsSandboxChannel.ApnsSandboxChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ApnsVoipChannel extends js.Object {
    /**
      * Get an existing ApnsVoipChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointApnsVoipChannelMod.ApnsVoipChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsVoipChannelState): typings.atPulumiAws.pinpointApnsVoipChannelMod.ApnsVoipChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsVoipChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointApnsVoipChannelMod.ApnsVoipChannel = js.native
    /**
      * Returns true if the given object is an instance of ApnsVoipChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipChannel.ApnsVoipChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ApnsVoipSandboxChannel extends js.Object {
    /**
      * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): typings.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
    /**
      * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object App extends js.Object {
    /**
      * Get an existing App resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointAppMod.App = js.native
    def get(name: String, id: Input[ID], state: AppState): typings.atPulumiAws.pinpointAppMod.App = js.native
    def get(name: String, id: Input[ID], state: AppState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointAppMod.App = js.native
    /**
      * Returns true if the given object is an instance of App.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/app.App */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BaiduChannel extends js.Object {
    /**
      * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointBaiduChannelMod.BaiduChannel = js.native
    def get(name: String, id: Input[ID], state: BaiduChannelState): typings.atPulumiAws.pinpointBaiduChannelMod.BaiduChannel = js.native
    def get(name: String, id: Input[ID], state: BaiduChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointBaiduChannelMod.BaiduChannel = js.native
    /**
      * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EmailChannel extends js.Object {
    /**
      * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointEmailChannelMod.EmailChannel = js.native
    def get(name: String, id: Input[ID], state: EmailChannelState): typings.atPulumiAws.pinpointEmailChannelMod.EmailChannel = js.native
    def get(name: String, id: Input[ID], state: EmailChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointEmailChannelMod.EmailChannel = js.native
    /**
      * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventStream extends js.Object {
    /**
      * Get an existing EventStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointEventStreamMod.EventStream = js.native
    def get(name: String, id: Input[ID], state: EventStreamState): typings.atPulumiAws.pinpointEventStreamMod.EventStream = js.native
    def get(name: String, id: Input[ID], state: EventStreamState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointEventStreamMod.EventStream = js.native
    /**
      * Returns true if the given object is an instance of EventStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/eventStream.EventStream */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GcmChannel extends js.Object {
    /**
      * Get an existing GcmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointGcmChannelMod.GcmChannel = js.native
    def get(name: String, id: Input[ID], state: GcmChannelState): typings.atPulumiAws.pinpointGcmChannelMod.GcmChannel = js.native
    def get(name: String, id: Input[ID], state: GcmChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointGcmChannelMod.GcmChannel = js.native
    /**
      * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SmsChannel extends js.Object {
    /**
      * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointSmsChannelMod.SmsChannel = js.native
    def get(name: String, id: Input[ID], state: SmsChannelState): typings.atPulumiAws.pinpointSmsChannelMod.SmsChannel = js.native
    def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointSmsChannelMod.SmsChannel = js.native
    /**
      * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = js.native
  }
  
}

