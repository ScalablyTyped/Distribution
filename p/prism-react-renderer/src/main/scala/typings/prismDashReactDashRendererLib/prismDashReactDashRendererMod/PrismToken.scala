package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismToken extends js.Object {
  var content: (js.Array[PrismToken | java.lang.String]) | java.lang.String
  var `type`: java.lang.String
}

object PrismToken {
  @scala.inline
  def apply(content: (js.Array[PrismToken | java.lang.String]) | java.lang.String, `type`: java.lang.String): PrismToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PrismToken]
  }
}

