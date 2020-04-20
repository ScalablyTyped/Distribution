package typings.pulumiAws.wafGetIpsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIpsetArgs extends js.Object {
  /**
    * The name of the WAF IP set.
    */
  val name: String = js.native
}

object GetIpsetArgs {
  @scala.inline
  def apply(name: String): GetIpsetArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpsetArgs]
  }
}

