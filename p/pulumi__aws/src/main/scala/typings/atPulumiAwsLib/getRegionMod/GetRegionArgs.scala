package typings
package atPulumiAwsLib.getRegionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionArgs extends js.Object {
  /**
    * The EC2 endpoint of the region to select.
    */
  val endpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The full name of the region to select.
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
}

object GetRegionArgs {
  @scala.inline
  def apply(endpoint: java.lang.String = null, name: java.lang.String = null): GetRegionArgs = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetRegionArgs]
  }
}

