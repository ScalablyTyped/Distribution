package typings.pulumiAws.phpAppLayerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.opsworks.PhpAppLayerEbsVolume
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhpAppLayerState extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the layer.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: js.UndefOr[Input[Boolean]] = js.native
  val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: js.UndefOr[Input[String]] = js.native
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.native
  /**
    * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: js.UndefOr[Input[js.Array[Input[PhpAppLayerEbsVolume]]]] = js.native
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * A human-readable name for the layer.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.native
}

object PhpAppLayerState {
  @scala.inline
  def apply(): PhpAppLayerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhpAppLayerState]
  }
  @scala.inline
  implicit class PhpAppLayerStateOps[Self <: PhpAppLayerState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAutoAssignElasticIps(value: Input[Boolean]): Self = this.set("autoAssignElasticIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAssignElasticIps: Self = this.set("autoAssignElasticIps", js.undefined)
    @scala.inline
    def setAutoAssignPublicIps(value: Input[Boolean]): Self = this.set("autoAssignPublicIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAssignPublicIps: Self = this.set("autoAssignPublicIps", js.undefined)
    @scala.inline
    def setAutoHealing(value: Input[Boolean]): Self = this.set("autoHealing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHealing: Self = this.set("autoHealing", js.undefined)
    @scala.inline
    def setCustomConfigureRecipesVarargs(value: Input[String]*): Self = this.set("customConfigureRecipes", js.Array(value :_*))
    @scala.inline
    def setCustomConfigureRecipes(value: Input[js.Array[Input[String]]]): Self = this.set("customConfigureRecipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomConfigureRecipes: Self = this.set("customConfigureRecipes", js.undefined)
    @scala.inline
    def setCustomDeployRecipesVarargs(value: Input[String]*): Self = this.set("customDeployRecipes", js.Array(value :_*))
    @scala.inline
    def setCustomDeployRecipes(value: Input[js.Array[Input[String]]]): Self = this.set("customDeployRecipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDeployRecipes: Self = this.set("customDeployRecipes", js.undefined)
    @scala.inline
    def setCustomInstanceProfileArn(value: Input[String]): Self = this.set("customInstanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomInstanceProfileArn: Self = this.set("customInstanceProfileArn", js.undefined)
    @scala.inline
    def setCustomJson(value: Input[String]): Self = this.set("customJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomJson: Self = this.set("customJson", js.undefined)
    @scala.inline
    def setCustomSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("customSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setCustomSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("customSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSecurityGroupIds: Self = this.set("customSecurityGroupIds", js.undefined)
    @scala.inline
    def setCustomSetupRecipesVarargs(value: Input[String]*): Self = this.set("customSetupRecipes", js.Array(value :_*))
    @scala.inline
    def setCustomSetupRecipes(value: Input[js.Array[Input[String]]]): Self = this.set("customSetupRecipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSetupRecipes: Self = this.set("customSetupRecipes", js.undefined)
    @scala.inline
    def setCustomShutdownRecipesVarargs(value: Input[String]*): Self = this.set("customShutdownRecipes", js.Array(value :_*))
    @scala.inline
    def setCustomShutdownRecipes(value: Input[js.Array[Input[String]]]): Self = this.set("customShutdownRecipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomShutdownRecipes: Self = this.set("customShutdownRecipes", js.undefined)
    @scala.inline
    def setCustomUndeployRecipesVarargs(value: Input[String]*): Self = this.set("customUndeployRecipes", js.Array(value :_*))
    @scala.inline
    def setCustomUndeployRecipes(value: Input[js.Array[Input[String]]]): Self = this.set("customUndeployRecipes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomUndeployRecipes: Self = this.set("customUndeployRecipes", js.undefined)
    @scala.inline
    def setDrainElbOnShutdown(value: Input[Boolean]): Self = this.set("drainElbOnShutdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrainElbOnShutdown: Self = this.set("drainElbOnShutdown", js.undefined)
    @scala.inline
    def setEbsVolumesVarargs(value: Input[PhpAppLayerEbsVolume]*): Self = this.set("ebsVolumes", js.Array(value :_*))
    @scala.inline
    def setEbsVolumes(value: Input[js.Array[Input[PhpAppLayerEbsVolume]]]): Self = this.set("ebsVolumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsVolumes: Self = this.set("ebsVolumes", js.undefined)
    @scala.inline
    def setElasticLoadBalancer(value: Input[String]): Self = this.set("elasticLoadBalancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticLoadBalancer: Self = this.set("elasticLoadBalancer", js.undefined)
    @scala.inline
    def setInstallUpdatesOnBoot(value: Input[Boolean]): Self = this.set("installUpdatesOnBoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallUpdatesOnBoot: Self = this.set("installUpdatesOnBoot", js.undefined)
    @scala.inline
    def setInstanceShutdownTimeout(value: Input[Double]): Self = this.set("instanceShutdownTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceShutdownTimeout: Self = this.set("instanceShutdownTimeout", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStackId(value: Input[String]): Self = this.set("stackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
    @scala.inline
    def setSystemPackagesVarargs(value: Input[String]*): Self = this.set("systemPackages", js.Array(value :_*))
    @scala.inline
    def setSystemPackages(value: Input[js.Array[Input[String]]]): Self = this.set("systemPackages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemPackages: Self = this.set("systemPackages", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUseEbsOptimizedInstances(value: Input[Boolean]): Self = this.set("useEbsOptimizedInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEbsOptimizedInstances: Self = this.set("useEbsOptimizedInstances", js.undefined)
  }
  
}

