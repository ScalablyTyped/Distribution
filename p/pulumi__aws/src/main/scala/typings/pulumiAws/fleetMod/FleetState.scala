package typings.pulumiAws.fleetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig
import typings.pulumiAws.inputMod.ec2.FleetOnDemandOptions
import typings.pulumiAws.inputMod.ec2.FleetSpotOptions
import typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetState extends js.Object {
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: js.UndefOr[Input[FleetLaunchTemplateConfig]] = js.native
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: js.UndefOr[Input[FleetOnDemandOptions]] = js.native
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: js.UndefOr[Input[FleetSpotOptions]] = js.native
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: js.UndefOr[Input[FleetTargetCapacitySpecification]] = js.native
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object FleetState {
  @scala.inline
  def apply(): FleetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetState]
  }
  @scala.inline
  implicit class FleetStateOps[Self <: FleetState] (val x: Self) extends AnyVal {
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
    def setExcessCapacityTerminationPolicy(value: Input[String]): Self = this.set("excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("excessCapacityTerminationPolicy", js.undefined)
    @scala.inline
    def setLaunchTemplateConfig(value: Input[FleetLaunchTemplateConfig]): Self = this.set("launchTemplateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateConfig: Self = this.set("launchTemplateConfig", js.undefined)
    @scala.inline
    def setOnDemandOptions(value: Input[FleetOnDemandOptions]): Self = this.set("onDemandOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandOptions: Self = this.set("onDemandOptions", js.undefined)
    @scala.inline
    def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = this.set("replaceUnhealthyInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceUnhealthyInstances: Self = this.set("replaceUnhealthyInstances", js.undefined)
    @scala.inline
    def setSpotOptions(value: Input[FleetSpotOptions]): Self = this.set("spotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotOptions: Self = this.set("spotOptions", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetCapacitySpecification(value: Input[FleetTargetCapacitySpecification]): Self = this.set("targetCapacitySpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCapacitySpecification: Self = this.set("targetCapacitySpecification", js.undefined)
    @scala.inline
    def setTerminateInstances(value: Input[Boolean]): Self = this.set("terminateInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateInstances: Self = this.set("terminateInstances", js.undefined)
    @scala.inline
    def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = this.set("terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateInstancesWithExpiration: Self = this.set("terminateInstancesWithExpiration", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

