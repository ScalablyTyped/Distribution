package typings.pulumiAws

import typings.pulumiAws.agentMod.AgentArgs
import typings.pulumiAws.agentMod.AgentState
import typings.pulumiAws.efsLocationMod.EfsLocationArgs
import typings.pulumiAws.efsLocationMod.EfsLocationState
import typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindowsArgs
import typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindowsState
import typings.pulumiAws.locationSmbMod.LocationSmbArgs
import typings.pulumiAws.locationSmbMod.LocationSmbState
import typings.pulumiAws.nfsLocationMod.NfsLocationArgs
import typings.pulumiAws.nfsLocationMod.NfsLocationState
import typings.pulumiAws.s3locationMod.S3LocationArgs
import typings.pulumiAws.s3locationMod.S3LocationState
import typings.pulumiAws.taskMod.TaskArgs
import typings.pulumiAws.taskMod.TaskState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasyncMod {
  
  @JSImport("@pulumi/aws/datasync", "Agent")
  @js.native
  class Agent protected ()
    extends typings.pulumiAws.agentMod.Agent {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AgentArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Agent {
    
    @JSImport("@pulumi/aws/datasync", "Agent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Agent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.agentMod.Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.agentMod.Agent]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.agentMod.Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.agentMod.Agent]
    @scala.inline
    def get(name: String, id: Input[ID], state: AgentState): typings.pulumiAws.agentMod.Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.agentMod.Agent]
    @scala.inline
    def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): typings.pulumiAws.agentMod.Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.agentMod.Agent]
    
    /**
      * Returns true if the given object is an instance of Agent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean]
  }
  
  @JSImport("@pulumi/aws/datasync", "EfsLocation")
  @js.native
  class EfsLocation protected ()
    extends typings.pulumiAws.efsLocationMod.EfsLocation {
    /**
      * Create a EfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EfsLocationArgs) = this()
    def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EfsLocation {
    
    @JSImport("@pulumi/aws/datasync", "EfsLocation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.efsLocationMod.EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.efsLocationMod.EfsLocation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.efsLocationMod.EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.efsLocationMod.EfsLocation]
    @scala.inline
    def get(name: String, id: Input[ID], state: EfsLocationState): typings.pulumiAws.efsLocationMod.EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.efsLocationMod.EfsLocation]
    @scala.inline
    def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): typings.pulumiAws.efsLocationMod.EfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.efsLocationMod.EfsLocation]
    
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/datasync", "LocationFsxWindows")
  @js.native
  class LocationFsxWindows protected ()
    extends typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows {
    /**
      * Create a LocationFsxWindows resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationFsxWindowsArgs) = this()
    def this(name: String, args: LocationFsxWindowsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LocationFsxWindows {
    
    @JSImport("@pulumi/aws/datasync", "LocationFsxWindows")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LocationFsxWindows resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocationFsxWindowsState): typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocationFsxWindowsState, opts: CustomResourceOptions): typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationFsxWindowsMod.LocationFsxWindows]
    
    /**
      * Returns true if the given object is an instance of LocationFsxWindows.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationFsxWindows.LocationFsxWindows */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/locationFsxWindows.LocationFsxWindows */ Boolean]
  }
  
  @JSImport("@pulumi/aws/datasync", "LocationSmb")
  @js.native
  class LocationSmb protected ()
    extends typings.pulumiAws.locationSmbMod.LocationSmb {
    /**
      * Create a LocationSmb resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationSmbArgs) = this()
    def this(name: String, args: LocationSmbArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LocationSmb {
    
    @JSImport("@pulumi/aws/datasync", "LocationSmb")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LocationSmb resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.locationSmbMod.LocationSmb = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationSmbMod.LocationSmb]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.locationSmbMod.LocationSmb = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationSmbMod.LocationSmb]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocationSmbState): typings.pulumiAws.locationSmbMod.LocationSmb = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationSmbMod.LocationSmb]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocationSmbState, opts: CustomResourceOptions): typings.pulumiAws.locationSmbMod.LocationSmb = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.locationSmbMod.LocationSmb]
    
    /**
      * Returns true if the given object is an instance of LocationSmb.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean]
  }
  
  @JSImport("@pulumi/aws/datasync", "NfsLocation")
  @js.native
  class NfsLocation protected ()
    extends typings.pulumiAws.nfsLocationMod.NfsLocation {
    /**
      * Create a NfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsLocationArgs) = this()
    def this(name: String, args: NfsLocationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NfsLocation {
    
    @JSImport("@pulumi/aws/datasync", "NfsLocation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.nfsLocationMod.NfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsLocationMod.NfsLocation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.nfsLocationMod.NfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsLocationMod.NfsLocation]
    @scala.inline
    def get(name: String, id: Input[ID], state: NfsLocationState): typings.pulumiAws.nfsLocationMod.NfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsLocationMod.NfsLocation]
    @scala.inline
    def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): typings.pulumiAws.nfsLocationMod.NfsLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.nfsLocationMod.NfsLocation]
    
    /**
      * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/datasync", "S3Location")
  @js.native
  class S3Location protected ()
    extends typings.pulumiAws.s3locationMod.S3Location {
    /**
      * Create a S3Location resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3LocationArgs) = this()
    def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object S3Location {
    
    @JSImport("@pulumi/aws/datasync", "S3Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3locationMod.S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3locationMod.S3Location]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.s3locationMod.S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3locationMod.S3Location]
    @scala.inline
    def get(name: String, id: Input[ID], state: S3LocationState): typings.pulumiAws.s3locationMod.S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3locationMod.S3Location]
    @scala.inline
    def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): typings.pulumiAws.s3locationMod.S3Location = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3locationMod.S3Location]
    
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean]
  }
  
  @JSImport("@pulumi/aws/datasync", "Task")
  @js.native
  class Task protected ()
    extends typings.pulumiAws.taskMod.Task {
    /**
      * Create a Task resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskArgs) = this()
    def this(name: String, args: TaskArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Task {
    
    @JSImport("@pulumi/aws/datasync", "Task")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Task resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.taskMod.Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.taskMod.Task]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.taskMod.Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.taskMod.Task]
    @scala.inline
    def get(name: String, id: Input[ID], state: TaskState): typings.pulumiAws.taskMod.Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.taskMod.Task]
    @scala.inline
    def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): typings.pulumiAws.taskMod.Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.taskMod.Task]
    
    /**
      * Returns true if the given object is an instance of Task.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean]
  }
}
