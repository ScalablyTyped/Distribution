package typings.atPulumiKubernetes.batchMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  class Job protected ()
    extends typings.atPulumiKubernetes.batchV1Mod.Job {
    /**
      * Create a batch.v1.Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1Ns.Job) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1Ns.Job,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class JobList protected ()
    extends typings.atPulumiKubernetes.batchV1Mod.JobList {
    /**
      * Create a batch.v1.JobList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1Ns.JobList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1Ns.JobList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object Job extends js.Object {
    /**
      * Get the state of an existing `Job` resource, as identified by `id`.
      * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
      * Kubernetes convention) the ID becomes default/<name>.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.batchV1JobMod.Job = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.batchV1JobMod.Job = js.native
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/Job.Job */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobList extends js.Object {
    /**
      * Get the state of an existing `JobList` resource, as identified by `id`.
      * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
      * Kubernetes convention) the ID becomes default/<name>.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form
      *  <namespace>/<name> or <name>.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.batchV1JobListMod.JobList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.batchV1JobListMod.JobList = js.native
    /**
      * Returns true if the given object is an instance of JobList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/JobList.JobList */ Boolean = js.native
  }
  
}

