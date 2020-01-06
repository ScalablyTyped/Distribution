package typings.atPulumiAws.eksFargateProfileMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.eks.FargateProfileSelector
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfileState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the EKS Fargate Profile.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the EKS Fargate Profile.
    */
  val fargateProfileName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
    */
  val podExecutionRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
    */
  val selectors: js.UndefOr[Input[js.Array[Input[FargateProfileSelector]]]] = js.native
  /**
    * Status of the EKS Fargate Profile.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object FargateProfileState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    clusterName: Input[String] = null,
    fargateProfileName: Input[String] = null,
    podExecutionRoleArn: Input[String] = null,
    selectors: Input[js.Array[Input[FargateProfileSelector]]] = null,
    status: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): FargateProfileState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (fargateProfileName != null) __obj.updateDynamic("fargateProfileName")(fargateProfileName.asInstanceOf[js.Any])
    if (podExecutionRoleArn != null) __obj.updateDynamic("podExecutionRoleArn")(podExecutionRoleArn.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FargateProfileState]
  }
}

