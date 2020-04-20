package typings.pulumiAws.getDistributionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionArgs extends js.Object {
  /**
    * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
    */
  val id: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetDistributionArgs {
  @scala.inline
  def apply(id: String, tags: StringDictionary[js.Any] = null): GetDistributionArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionArgs]
  }
}

