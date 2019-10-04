package typings.atPulumiKubernetes.atPulumiKubernetesMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "batch")
@js.native
object batchNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    @js.native
    class Job protected ()
      extends typings.atPulumiKubernetes.batchMod.v1Ns.Job {
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
      extends typings.atPulumiKubernetes.batchMod.v1Ns.JobList {
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
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
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
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
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
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    @js.native
    class CronJob protected ()
      extends typings.atPulumiKubernetes.batchMod.v1beta1Ns.CronJob {
      /**
        * Create a batch.v1beta1.CronJob resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1beta1Ns.CronJob) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1beta1Ns.CronJob,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CronJobList protected ()
      extends typings.atPulumiKubernetes.batchMod.v1beta1Ns.CronJobList {
      /**
        * Create a batch.v1beta1.CronJobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1beta1Ns.CronJobList) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.batchNs.v1beta1Ns.CronJobList,
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
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.batchV1beta1CronJobMod.CronJob = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.batchV1beta1CronJobMod.CronJob = js.native
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/CronJob.CronJob */ Boolean = js.native
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
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.batchV1beta1CronJobListMod.CronJobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.batchV1beta1CronJobListMod.CronJobList = js.native
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/CronJobList.CronJobList */ Boolean = js.native
    }
    
  }
  
  @JSName("v2alpha1")
  @js.native
  object v2alpha1Ns extends js.Object {
    @js.native
    class CronJob protected ()
      extends typings.atPulumiKubernetes.batchMod.v2alpha1Ns.CronJob {
      /**
        * Create a batch.v2alpha1.CronJob resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v2alpha1Ns.CronJob) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.batchNs.v2alpha1Ns.CronJob,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CronJobList protected ()
      extends typings.atPulumiKubernetes.batchMod.v2alpha1Ns.CronJobList {
      /**
        * Create a batch.v2alpha1.CronJobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v2alpha1Ns.CronJobList) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.batchNs.v2alpha1Ns.CronJobList,
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
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.batchV2alpha1CronJobMod.CronJob = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.batchV2alpha1CronJobMod.CronJob = js.native
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
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.batchV2alpha1CronJobListMod.CronJobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.batchV2alpha1CronJobListMod.CronJobList = js.native
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJobList.CronJobList */ Boolean = js.native
    }
    
  }
  
}

