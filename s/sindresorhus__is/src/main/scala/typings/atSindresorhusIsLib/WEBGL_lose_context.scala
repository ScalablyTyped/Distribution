package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_lose_context extends js.Object {
  def loseContext(): scala.Unit
  def restoreContext(): scala.Unit
}

object WEBGL_lose_context {
  @scala.inline
  def apply(loseContext: js.Function0[scala.Unit], restoreContext: js.Function0[scala.Unit]): WEBGL_lose_context = {
    val __obj = js.Dynamic.literal(loseContext = loseContext, restoreContext = restoreContext)
  
    __obj.asInstanceOf[WEBGL_lose_context]
  }
}

