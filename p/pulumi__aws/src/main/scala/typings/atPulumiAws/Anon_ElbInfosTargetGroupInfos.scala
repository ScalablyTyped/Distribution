package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElbInfosTargetGroupInfos extends js.Object {
  var elbInfos: js.UndefOr[Input[js.Array[Input[Anon_NameInput]]]] = js.undefined
  var targetGroupInfos: js.UndefOr[Input[js.Array[Input[Anon_NameInput]]]] = js.undefined
  var targetGroupPairInfo: js.UndefOr[Input[Anon_ProdTrafficRouteTargetGroups]] = js.undefined
}

object Anon_ElbInfosTargetGroupInfos {
  @scala.inline
  def apply(
    elbInfos: Input[js.Array[Input[Anon_NameInput]]] = null,
    targetGroupInfos: Input[js.Array[Input[Anon_NameInput]]] = null,
    targetGroupPairInfo: Input[Anon_ProdTrafficRouteTargetGroups] = null
  ): Anon_ElbInfosTargetGroupInfos = {
    val __obj = js.Dynamic.literal()
    if (elbInfos != null) __obj.updateDynamic("elbInfos")(elbInfos.asInstanceOf[js.Any])
    if (targetGroupInfos != null) __obj.updateDynamic("targetGroupInfos")(targetGroupInfos.asInstanceOf[js.Any])
    if (targetGroupPairInfo != null) __obj.updateDynamic("targetGroupPairInfo")(targetGroupPairInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ElbInfosTargetGroupInfos]
  }
}

