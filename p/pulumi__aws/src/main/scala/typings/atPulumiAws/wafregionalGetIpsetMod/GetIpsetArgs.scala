package typings.atPulumiAws.wafregionalGetIpsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIpsetArgs extends js.Object {
  /**
    * The name of the WAF Regional IP set.
    */
  val name: String
}

object GetIpsetArgs {
  @scala.inline
  def apply(name: String): GetIpsetArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetIpsetArgs]
  }
}

