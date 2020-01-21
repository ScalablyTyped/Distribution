package typings.pulumiAws.applicationloadbalancingGetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTargetGroupArgs extends js.Object {
  /**
    * The full ARN of the target group.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The unique name of the target group.
    */
  val name: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetTargetGroupArgs {
  @scala.inline
  def apply(arn: String = null, name: String = null, tags: StringDictionary[js.Any] = null): GetTargetGroupArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupArgs]
  }
}

