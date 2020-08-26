package typings.pulumiKubernetes.v1SelfSubjectRulesReviewMod

import typings.pulumiKubernetes.outputMod.authorization.v1.SelfSubjectRulesReviewSpec
import typings.pulumiKubernetes.outputMod.authorization.v1.SubjectRulesReviewStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization/v1/selfSubjectRulesReview", "SelfSubjectRulesReview")
@js.native
class SelfSubjectRulesReview protected () extends CustomResource {
  /**
    * Create a SelfSubjectRulesReview resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SelfSubjectRulesReviewArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SelfSubjectRulesReviewArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[authorizationDotk8sDotioSlashv1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.SelfSubjectRulesReview] = js.native
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * Spec holds information about the request being evaluated.
    */
  val spec: Output_[SelfSubjectRulesReviewSpec] = js.native
  /**
    * Status is filled in by the server and indicates the set of actions a user can perform.
    */
  val status: Output_[SubjectRulesReviewStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/authorization/v1/selfSubjectRulesReview", "SelfSubjectRulesReview")
@js.native
object SelfSubjectRulesReview extends js.Object {
  /**
    * Get an existing SelfSubjectRulesReview resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SelfSubjectRulesReview = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): SelfSubjectRulesReview = js.native
  /**
    * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/selfSubjectRulesReview.SelfSubjectRulesReview */ Boolean = js.native
}

