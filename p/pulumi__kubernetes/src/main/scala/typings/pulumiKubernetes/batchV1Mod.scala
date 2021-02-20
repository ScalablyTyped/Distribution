package typings.pulumiKubernetes

import typings.pulumiKubernetes.jobListMod.JobListArgs
import typings.pulumiKubernetes.jobMod.JobArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchV1Mod {
  
  @JSImport("@pulumi/kubernetes/batch/v1", "Job")
  @js.native
  class Job protected ()
    extends typings.pulumiKubernetes.jobMod.Job {
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
  /* static members */
  object Job {
    
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/batch/v1", "Job.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.jobMod.Job = js.native
    @JSImport("@pulumi/kubernetes/batch/v1", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.jobMod.Job = js.native
    
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/batch/v1", "Job.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/job.Job */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/batch/v1", "JobList")
  @js.native
  class JobList protected ()
    extends typings.pulumiKubernetes.jobListMod.JobList {
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
  object JobList {
    
    /**
      * Get an existing JobList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/batch/v1", "JobList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.jobListMod.JobList = js.native
    @JSImport("@pulumi/kubernetes/batch/v1", "JobList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.jobListMod.JobList = js.native
    
    /**
      * Returns true if the given object is an instance of JobList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/batch/v1", "JobList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v1/jobList.JobList */ Boolean = js.native
  }
}
