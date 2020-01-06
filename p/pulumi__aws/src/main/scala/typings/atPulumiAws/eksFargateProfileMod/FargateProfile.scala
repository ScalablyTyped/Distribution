package typings.atPulumiAws.eksFargateProfileMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.eks.FargateProfileSelector
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile")
@js.native
class FargateProfile protected () extends CustomResource {
  /**
    * Create a FargateProfile resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FargateProfileArgs) = this()
  def this(name: String, args: FargateProfileArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the EKS Fargate Profile.
    */
  val arn: Output[String] = js.native
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: Output[String] = js.native
  /**
    * Name of the EKS Fargate Profile.
    */
  val fargateProfileName: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
    */
  val podExecutionRoleArn: Output[String] = js.native
  /**
    * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
    */
  val selectors: Output[js.Array[FargateProfileSelector]] = js.native
  /**
    * Status of the EKS Fargate Profile.
    */
  val status: Output[String] = js.native
  /**
    * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/eks/fargateProfile", "FargateProfile")
@js.native
object FargateProfile extends js.Object {
  /**
    * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): FargateProfile = js.native
  def get(name: String, id: Input[ID], state: FargateProfileState): FargateProfile = js.native
  def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): FargateProfile = js.native
  /**
    * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = js.native
}

