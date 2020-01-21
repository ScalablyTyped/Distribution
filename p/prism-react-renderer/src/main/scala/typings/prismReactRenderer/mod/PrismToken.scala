package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismToken extends js.Object {
  var content: (js.Array[PrismToken | String]) | String
  var `type`: String
}

object PrismToken {
  @scala.inline
  def apply(content: (js.Array[PrismToken | String]) | String, `type`: String): PrismToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismToken]
  }
}

