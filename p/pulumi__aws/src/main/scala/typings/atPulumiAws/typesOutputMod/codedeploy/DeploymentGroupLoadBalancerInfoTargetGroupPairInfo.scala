package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends js.Object {
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute] = js.undefined
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  @scala.inline
  def apply(
    prodTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute,
    targetGroups: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup],
    testTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute = null
  ): DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute, targetGroups = targetGroups)
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute)
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]
  }
}

