package typings.pulumiAws.getActivityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActivityArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the activity.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The name that identifies the activity.
    */
  val name: js.UndefOr[String] = js.native
}

object GetActivityArgs {
  @scala.inline
  def apply(arn: String = null, name: String = null): GetActivityArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActivityArgs]
  }
}

