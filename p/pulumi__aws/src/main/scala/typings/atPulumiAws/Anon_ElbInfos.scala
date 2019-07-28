package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElbInfos extends js.Object {
  var elbInfos: js.UndefOr[js.Array[Anon_NameString]] = js.undefined
  var targetGroupInfos: js.UndefOr[js.Array[Anon_NameString]] = js.undefined
  var targetGroupPairInfo: js.UndefOr[Anon_ProdTrafficRoute] = js.undefined
}

object Anon_ElbInfos {
  @scala.inline
  def apply(
    elbInfos: js.Array[Anon_NameString] = null,
    targetGroupInfos: js.Array[Anon_NameString] = null,
    targetGroupPairInfo: Anon_ProdTrafficRoute = null
  ): Anon_ElbInfos = {
    val __obj = js.Dynamic.literal()
    if (elbInfos != null) __obj.updateDynamic("elbInfos")(elbInfos)
    if (targetGroupInfos != null) __obj.updateDynamic("targetGroupInfos")(targetGroupInfos)
    if (targetGroupPairInfo != null) __obj.updateDynamic("targetGroupPairInfo")(targetGroupPairInfo)
    __obj.asInstanceOf[Anon_ElbInfos]
  }
}

