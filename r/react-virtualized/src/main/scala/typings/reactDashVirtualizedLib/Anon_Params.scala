package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  def reset(params: reactDashVirtualizedLib.distEsMasonryMod.resetParams): scala.Unit
}

object Anon_Params {
  @scala.inline
  def apply(reset: reactDashVirtualizedLib.distEsMasonryMod.resetParams => scala.Unit): Anon_Params = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset))
  
    __obj.asInstanceOf[Anon_Params]
  }
}

