package typings.pulumiKubernetes

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch/v2alpha1", JSImport.Namespace)
@js.native
object v2alpha1Mod extends js.Object {
  @js.native
  class CronJob protected ()
    extends typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob {
    /**
      * Create a batch.v2alpha1.CronJob resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.batch.v2alpha1.CronJob) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.batch.v2alpha1.CronJob,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class CronJobList protected ()
    extends typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList {
    /**
      * Create a batch.v2alpha1.CronJobList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.batch.v2alpha1.CronJobList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.batch.v2alpha1.CronJobList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object CronJob extends js.Object {
    /**
      * Get the state of an existing `CronJob` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob = js.native
    /**
      * Returns true if the given object is an instance of CronJob.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJob.CronJob */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CronJobList extends js.Object {
    /**
      * Get the state of an existing `CronJobList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = js.native
    /**
      * Returns true if the given object is an instance of CronJobList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJobList.CronJobList */ Boolean = js.native
  }
  
}

