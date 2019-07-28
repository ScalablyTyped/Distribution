package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BranchesCustomData extends js.Object {
  var branches: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var customData: js.UndefOr[Input[String]] = js.undefined
  var destinationArn: Input[String]
  var events: Input[js.Array[Input[String]]]
  var name: Input[String]
}

object Anon_BranchesCustomData {
  @scala.inline
  def apply(
    destinationArn: Input[String],
    events: Input[js.Array[Input[String]]],
    name: Input[String],
    branches: Input[js.Array[Input[String]]] = null,
    customData: Input[String] = null
  ): Anon_BranchesCustomData = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BranchesCustomData]
  }
}

