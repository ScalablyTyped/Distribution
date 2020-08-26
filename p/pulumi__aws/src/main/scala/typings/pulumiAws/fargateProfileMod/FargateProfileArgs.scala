package typings.pulumiAws.fargateProfileMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.eks.FargateProfileSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfileArgs extends js.Object {
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: Input[String] = js.native
  /**
    * Name of the EKS Fargate Profile.
    */
  val fargateProfileName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
    */
  val podExecutionRoleArn: Input[String] = js.native
  /**
    * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
    */
  val selectors: Input[js.Array[Input[FargateProfileSelector]]] = js.native
  /**
    * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object FargateProfileArgs {
  @scala.inline
  def apply(
    clusterName: Input[String],
    podExecutionRoleArn: Input[String],
    selectors: Input[js.Array[Input[FargateProfileSelector]]]
  ): FargateProfileArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], podExecutionRoleArn = podExecutionRoleArn.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FargateProfileArgs]
  }
  @scala.inline
  implicit class FargateProfileArgsOps[Self <: FargateProfileArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterName(value: Input[String]): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPodExecutionRoleArn(value: Input[String]): Self = this.set("podExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorsVarargs(value: Input[FargateProfileSelector]*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: Input[js.Array[Input[FargateProfileSelector]]]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFargateProfileName(value: Input[String]): Self = this.set("fargateProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFargateProfileName: Self = this.set("fargateProfileName", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

