package typings.pulumiAws.getRegionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionArgs extends js.Object {
  /**
    * The EC2 endpoint of the region to select.
    */
  val endpoint: js.UndefOr[String] = js.native
  /**
    * The full name of the region to select.
    */
  val name: js.UndefOr[String] = js.native
}

object GetRegionArgs {
  @scala.inline
  def apply(endpoint: String = null, name: String = null): GetRegionArgs = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionArgs]
  }
}

