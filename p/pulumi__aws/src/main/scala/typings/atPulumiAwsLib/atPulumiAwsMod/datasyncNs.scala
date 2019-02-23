package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "datasync")
@js.native
object datasyncNs extends js.Object {
  @js.native
  class Agent protected ()
    extends atPulumiAwsLib.datasyncMod.Agent {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncAgentMod.AgentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncAgentMod.AgentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EfsLocation protected ()
    extends atPulumiAwsLib.datasyncMod.EfsLocation {
    /**
      * Create a EfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncEfsLocationMod.EfsLocationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncEfsLocationMod.EfsLocationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NfsLocation protected ()
    extends atPulumiAwsLib.datasyncMod.NfsLocation {
    /**
      * Create a NfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncNfsLocationMod.NfsLocationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncNfsLocationMod.NfsLocationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class S3Location protected ()
    extends atPulumiAwsLib.datasyncMod.S3Location {
    /**
      * Create a S3Location resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncS3LocationMod.S3LocationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncS3LocationMod.S3LocationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Task protected ()
    extends atPulumiAwsLib.datasyncMod.Task {
    /**
      * Create a Task resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncTaskMod.TaskArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.datasyncTaskMod.TaskArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncAgentMod.Agent = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncAgentMod.AgentState
    ): atPulumiAwsLib.datasyncAgentMod.Agent = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncAgentMod.AgentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.datasyncAgentMod.Agent = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncEfsLocationMod.EfsLocation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncEfsLocationMod.EfsLocationState
    ): atPulumiAwsLib.datasyncEfsLocationMod.EfsLocation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncEfsLocationMod.EfsLocationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.datasyncEfsLocationMod.EfsLocation = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncNfsLocationMod.NfsLocation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncNfsLocationMod.NfsLocationState
    ): atPulumiAwsLib.datasyncNfsLocationMod.NfsLocation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncNfsLocationMod.NfsLocationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.datasyncNfsLocationMod.NfsLocation = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncS3LocationMod.S3Location = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncS3LocationMod.S3LocationState
    ): atPulumiAwsLib.datasyncS3LocationMod.S3Location = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncS3LocationMod.S3LocationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.datasyncS3LocationMod.S3Location = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncTaskMod.Task = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncTaskMod.TaskState
    ): atPulumiAwsLib.datasyncTaskMod.Task = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.datasyncTaskMod.TaskState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.datasyncTaskMod.Task = js.native
  }
  
}

