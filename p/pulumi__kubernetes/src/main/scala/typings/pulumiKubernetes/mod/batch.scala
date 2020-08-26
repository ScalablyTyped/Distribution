package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.cronJobListMod.CronJobListArgs
import typings.pulumiKubernetes.cronJobMod.CronJobArgs
import typings.pulumiKubernetes.jobListMod.JobListArgs
import typings.pulumiKubernetes.jobMod.JobArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "batch")
@js.native
object batch extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class Job protected ()
      extends typings.pulumiKubernetes.batchMod.v1.Job {
      /**
        * Create a Job resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: JobArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class JobList protected ()
      extends typings.pulumiKubernetes.batchMod.v1.JobList {
      /**
        * Create a JobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: JobListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: JobListArgs, opts: CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object Job extends js.Object {
      /**
        * Get an existing Job resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.jobMod.Job = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.jobMod.Job = js.native
      /**
        * Returns true if the given object is an instance of Job.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/job.Job */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object JobList extends js.Object {
      /**
        * Get an existing JobList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.jobListMod.JobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.jobListMod.JobList = js.native
      /**
        * Returns true if the given object is an instance of JobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/jobList.JobList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class CronJob protected ()
      extends typings.pulumiKubernetes.batchMod.v1beta1.CronJob {
      /**
        * Create a CronJob resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CronJobArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: CronJobArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class CronJobList protected ()
      extends typings.pulumiKubernetes.batchMod.v1beta1.CronJobList {
      /**
        * Create a CronJobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CronJobListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: CronJobListArgs, opts: CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object CronJob extends js.Object {
      /**
        * Get an existing CronJob resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.cronJobMod.CronJob = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.cronJobMod.CronJob = js.native
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJob.CronJob */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CronJobList extends js.Object {
      /**
        * Get an existing CronJobList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.cronJobListMod.CronJobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.cronJobListMod.CronJobList = js.native
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJobList.CronJobList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v2alpha1 extends js.Object {
    @js.native
    class CronJob protected ()
      extends typings.pulumiKubernetes.batchMod.v2alpha1.CronJob {
      /**
        * Create a CronJob resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v2alpha1CronJobMod.CronJobArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v2alpha1CronJobMod.CronJobArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CronJobList protected ()
      extends typings.pulumiKubernetes.batchMod.v2alpha1.CronJobList {
      /**
        * Create a CronJobList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object CronJob extends js.Object {
      /**
        * Get an existing CronJob resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob = js.native
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/cronJob.CronJob */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CronJobList extends js.Object {
      /**
        * Get an existing CronJobList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = js.native
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/cronJobList.CronJobList */ Boolean = js.native
    }
    
  }
  
}

