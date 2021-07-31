package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.cronJobListMod.CronJobListArgs
import typings.pulumiKubernetes.cronJobMod.CronJobArgs
import typings.pulumiKubernetes.jobListMod.JobListArgs
import typings.pulumiKubernetes.jobMod.JobArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batch {
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "batch.v1.Job")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object Job {
      
      @JSImport("@pulumi/kubernetes", "batch.v1.Job")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing Job resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.jobMod.Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.jobMod.Job]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.jobMod.Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.jobMod.Job]
      
      /**
        * Returns true if the given object is an instance of Job.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/job.Job */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/job.Job */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "batch.v1.JobList")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: JobListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object JobList {
      
      @JSImport("@pulumi/kubernetes", "batch.v1.JobList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing JobList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.jobListMod.JobList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.jobListMod.JobList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.jobListMod.JobList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.jobListMod.JobList]
      
      /**
        * Returns true if the given object is an instance of JobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/jobList.JobList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/jobList.JobList */ Boolean]
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "batch.v1beta1.CronJob")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CronJobArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CronJob {
      
      @JSImport("@pulumi/kubernetes", "batch.v1beta1.CronJob")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CronJob resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.cronJobMod.CronJob = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.cronJobMod.CronJob]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.cronJobMod.CronJob = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.cronJobMod.CronJob]
      
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJob.CronJob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJob.CronJob */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "batch.v1beta1.CronJobList")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CronJobListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CronJobList {
      
      @JSImport("@pulumi/kubernetes", "batch.v1beta1.CronJobList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CronJobList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.cronJobListMod.CronJobList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.cronJobListMod.CronJobList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.cronJobListMod.CronJobList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.cronJobListMod.CronJobList]
      
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJobList.CronJobList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1beta1/cronJobList.CronJobList */ Boolean]
    }
  }
  
  object v2alpha1 {
    
    @JSImport("@pulumi/kubernetes", "batch.v2alpha1.CronJob")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v2alpha1CronJobMod.CronJobArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CronJob {
      
      @JSImport("@pulumi/kubernetes", "batch.v2alpha1.CronJob")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CronJob resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2alpha1CronJobMod.CronJob]
      
      /**
        * Returns true if the given object is an instance of CronJob.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/cronJob.CronJob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/cronJob.CronJob */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "batch.v2alpha1.CronJobList")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CronJobList {
      
      @JSImport("@pulumi/kubernetes", "batch.v2alpha1.CronJobList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CronJobList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v2alpha1CronJobListMod.CronJobList]
      
      /**
        * Returns true if the given object is an instance of CronJobList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/cronJobList.CronJobList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/cronJobList.CronJobList */ Boolean]
    }
  }
}
