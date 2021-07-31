package typings.pulumiAws.mod

import typings.pulumiAws.admChannelMod.AdmChannelArgs
import typings.pulumiAws.admChannelMod.AdmChannelState
import typings.pulumiAws.apnsChannelMod.ApnsChannelArgs
import typings.pulumiAws.apnsChannelMod.ApnsChannelState
import typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannelArgs
import typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannelState
import typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannelArgs
import typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannelState
import typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs
import typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState
import typings.pulumiAws.appMod.AppArgs
import typings.pulumiAws.appMod.AppState
import typings.pulumiAws.baiduChannelMod.BaiduChannelArgs
import typings.pulumiAws.baiduChannelMod.BaiduChannelState
import typings.pulumiAws.emailChannelMod.EmailChannelArgs
import typings.pulumiAws.emailChannelMod.EmailChannelState
import typings.pulumiAws.eventStreamMod.EventStreamArgs
import typings.pulumiAws.eventStreamMod.EventStreamState
import typings.pulumiAws.gcmChannelMod.GcmChannelArgs
import typings.pulumiAws.gcmChannelMod.GcmChannelState
import typings.pulumiAws.smsChannelMod.SmsChannelArgs
import typings.pulumiAws.smsChannelMod.SmsChannelState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinpoint {
  
  @JSImport("@pulumi/aws", "pinpoint.AdmChannel")
  @js.native
  class AdmChannel protected ()
    extends typings.pulumiAws.pinpointMod.AdmChannel {
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
  /* static members */
  object AdmChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.AdmChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.admChannelMod.AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.admChannelMod.AdmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.admChannelMod.AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.admChannelMod.AdmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: AdmChannelState): typings.pulumiAws.admChannelMod.AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.admChannelMod.AdmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): typings.pulumiAws.admChannelMod.AdmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.admChannelMod.AdmChannel]
    
    /**
      * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.ApnsChannel")
  @js.native
  class ApnsChannel protected ()
    extends typings.pulumiAws.pinpointMod.ApnsChannel {
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
  /* static members */
  object ApnsChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.ApnsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.apnsChannelMod.ApnsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsChannelMod.ApnsChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.apnsChannelMod.ApnsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsChannelMod.ApnsChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsChannelState): typings.pulumiAws.apnsChannelMod.ApnsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsChannelMod.ApnsChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsChannelState, opts: CustomResourceOptions): typings.pulumiAws.apnsChannelMod.ApnsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsChannelMod.ApnsChannel]
    
    /**
      * Returns true if the given object is an instance of ApnsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsChannel.ApnsChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/apnsChannel.ApnsChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.ApnsSandboxChannel")
  @js.native
  class ApnsSandboxChannel protected ()
    extends typings.pulumiAws.pinpointMod.ApnsSandboxChannel {
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
  /* static members */
  object ApnsSandboxChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.ApnsSandboxChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApnsSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsSandboxChannelState): typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsSandboxChannelState, opts: CustomResourceOptions): typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsSandboxChannelMod.ApnsSandboxChannel]
    
    /**
      * Returns true if the given object is an instance of ApnsSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsSandboxChannel.ApnsSandboxChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/apnsSandboxChannel.ApnsSandboxChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.ApnsVoipChannel")
  @js.native
  class ApnsVoipChannel protected ()
    extends typings.pulumiAws.pinpointMod.ApnsVoipChannel {
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
  /* static members */
  object ApnsVoipChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.ApnsVoipChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApnsVoipChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsVoipChannelState): typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsVoipChannelState, opts: CustomResourceOptions): typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipChannelMod.ApnsVoipChannel]
    
    /**
      * Returns true if the given object is an instance of ApnsVoipChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipChannel.ApnsVoipChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipChannel.ApnsVoipChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.ApnsVoipSandboxChannel")
  @js.native
  class ApnsVoipSandboxChannel protected ()
    extends typings.pulumiAws.pinpointMod.ApnsVoipSandboxChannel {
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
  /* static members */
  object ApnsVoipSandboxChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.ApnsVoipSandboxChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.apnsVoipSandboxChannelMod.ApnsVoipSandboxChannel]
    
    /**
      * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.App")
  @js.native
  class App protected ()
    extends typings.pulumiAws.pinpointMod.App {
    /**
      * Create a App resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AppArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AppArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object App {
    
    @JSImport("@pulumi/aws", "pinpoint.App")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing App resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.appMod.App = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appMod.App]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.appMod.App = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appMod.App]
    @scala.inline
    def get(name: String, id: Input[ID], state: AppState): typings.pulumiAws.appMod.App = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appMod.App]
    @scala.inline
    def get(name: String, id: Input[ID], state: AppState, opts: CustomResourceOptions): typings.pulumiAws.appMod.App = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appMod.App]
    
    /**
      * Returns true if the given object is an instance of App.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/app.App */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/app.App */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.BaiduChannel")
  @js.native
  class BaiduChannel protected ()
    extends typings.pulumiAws.pinpointMod.BaiduChannel {
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
  /* static members */
  object BaiduChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.BaiduChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.baiduChannelMod.BaiduChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.baiduChannelMod.BaiduChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.baiduChannelMod.BaiduChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.baiduChannelMod.BaiduChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: BaiduChannelState): typings.pulumiAws.baiduChannelMod.BaiduChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.baiduChannelMod.BaiduChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: BaiduChannelState, opts: CustomResourceOptions): typings.pulumiAws.baiduChannelMod.BaiduChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.baiduChannelMod.BaiduChannel]
    
    /**
      * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.EmailChannel")
  @js.native
  class EmailChannel protected ()
    extends typings.pulumiAws.pinpointMod.EmailChannel {
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
  /* static members */
  object EmailChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.EmailChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.emailChannelMod.EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailChannelMod.EmailChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.emailChannelMod.EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailChannelMod.EmailChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: EmailChannelState): typings.pulumiAws.emailChannelMod.EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailChannelMod.EmailChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: EmailChannelState, opts: CustomResourceOptions): typings.pulumiAws.emailChannelMod.EmailChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emailChannelMod.EmailChannel]
    
    /**
      * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.EventStream")
  @js.native
  class EventStream protected ()
    extends typings.pulumiAws.pinpointMod.EventStream {
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
  /* static members */
  object EventStream {
    
    @JSImport("@pulumi/aws", "pinpoint.EventStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventStreamMod.EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventStreamMod.EventStream]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.eventStreamMod.EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventStreamMod.EventStream]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventStreamState): typings.pulumiAws.eventStreamMod.EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventStreamMod.EventStream]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventStreamState, opts: CustomResourceOptions): typings.pulumiAws.eventStreamMod.EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.eventStreamMod.EventStream]
    
    /**
      * Returns true if the given object is an instance of EventStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/eventStream.EventStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/eventStream.EventStream */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.GcmChannel")
  @js.native
  class GcmChannel protected ()
    extends typings.pulumiAws.pinpointMod.GcmChannel {
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
  /* static members */
  object GcmChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.GcmChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GcmChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.gcmChannelMod.GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gcmChannelMod.GcmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.gcmChannelMod.GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gcmChannelMod.GcmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: GcmChannelState): typings.pulumiAws.gcmChannelMod.GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gcmChannelMod.GcmChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: GcmChannelState, opts: CustomResourceOptions): typings.pulumiAws.gcmChannelMod.GcmChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gcmChannelMod.GcmChannel]
    
    /**
      * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "pinpoint.SmsChannel")
  @js.native
  class SmsChannel protected ()
    extends typings.pulumiAws.pinpointMod.SmsChannel {
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
  object SmsChannel {
    
    @JSImport("@pulumi/aws", "pinpoint.SmsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.smsChannelMod.SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smsChannelMod.SmsChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.smsChannelMod.SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smsChannelMod.SmsChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: SmsChannelState): typings.pulumiAws.smsChannelMod.SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smsChannelMod.SmsChannel]
    @scala.inline
    def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): typings.pulumiAws.smsChannelMod.SmsChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.smsChannelMod.SmsChannel]
    
    /**
      * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean]
  }
}
