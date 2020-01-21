package typings.pulumiKubernetes.inputMod.apiregistration.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceStatus contains derived information about an API server
  */
trait APIServiceStatus extends js.Object {
  /**
    * Current service state of apiService.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[APIServiceCondition]]]] = js.undefined
}

object APIServiceStatus {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[APIServiceCondition]]] = null): APIServiceStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIServiceStatus]
  }
}

