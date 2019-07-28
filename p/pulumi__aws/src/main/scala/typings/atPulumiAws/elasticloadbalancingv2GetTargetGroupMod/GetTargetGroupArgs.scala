package typings.atPulumiAws.elasticloadbalancingv2GetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupArgs extends js.Object {
  /**
    * The full ARN of the target group.
    */
  val arn: js.UndefOr[String] = js.undefined
  /**
    * The unique name of the target group.
    */
  val name: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetTargetGroupArgs {
  @scala.inline
  def apply(arn: String = null, name: String = null, tags: StringDictionary[js.Any] = null): GetTargetGroupArgs = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetTargetGroupArgs]
  }
}

