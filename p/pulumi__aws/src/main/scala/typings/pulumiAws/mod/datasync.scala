package typings.pulumiAws.mod

import typings.pulumiAws.agentMod.AgentArgs
import typings.pulumiAws.agentMod.AgentState
import typings.pulumiAws.efsLocationMod.EfsLocationArgs
import typings.pulumiAws.efsLocationMod.EfsLocationState
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "datasync")
@js.native
object datasync extends js.Object {
  @js.native
  class Agent protected ()
    extends typings.pulumiAws.datasyncMod.Agent {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AgentArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EfsLocation protected ()
    extends typings.pulumiAws.datasyncMod.EfsLocation {
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
  
  @js.native
  class LocationSmb protected ()
    extends typings.pulumiAws.datasyncMod.LocationSmb {
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
  
  @js.native
  class NfsLocation protected ()
    extends typings.pulumiAws.datasyncMod.NfsLocation {
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
  
  @js.native
  class S3Location protected ()
    extends typings.pulumiAws.datasyncMod.S3Location {
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
  
  @js.native
  class Task protected ()
    extends typings.pulumiAws.datasyncMod.Task {
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
  @js.native
  object Agent extends js.Object {
    /**
      * Get an existing Agent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.agentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.agentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: AgentState): typings.pulumiAws.agentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): typings.pulumiAws.agentMod.Agent = js.native
    /**
      * Returns true if the given object is an instance of Agent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EfsLocation extends js.Object {
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.efsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.efsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: EfsLocationState): typings.pulumiAws.efsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): typings.pulumiAws.efsLocationMod.EfsLocation = js.native
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LocationSmb extends js.Object {
    /**
      * Get an existing LocationSmb resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.locationSmbMod.LocationSmb = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.locationSmbMod.LocationSmb = js.native
    def get(name: String, id: Input[ID], state: LocationSmbState): typings.pulumiAws.locationSmbMod.LocationSmb = js.native
    def get(name: String, id: Input[ID], state: LocationSmbState, opts: CustomResourceOptions): typings.pulumiAws.locationSmbMod.LocationSmb = js.native
    /**
      * Returns true if the given object is an instance of LocationSmb.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NfsLocation extends js.Object {
    /**
      * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.nfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.nfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: NfsLocationState): typings.pulumiAws.nfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): typings.pulumiAws.nfsLocationMod.NfsLocation = js.native
    /**
      * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object S3Location extends js.Object {
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3locationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.s3locationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: S3LocationState): typings.pulumiAws.s3locationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): typings.pulumiAws.s3locationMod.S3Location = js.native
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Task extends js.Object {
    /**
      * Get an existing Task resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.taskMod.Task = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.taskMod.Task = js.native
    def get(name: String, id: Input[ID], state: TaskState): typings.pulumiAws.taskMod.Task = js.native
    def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): typings.pulumiAws.taskMod.Task = js.native
    /**
      * Returns true if the given object is an instance of Task.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = js.native
  }
  
}

