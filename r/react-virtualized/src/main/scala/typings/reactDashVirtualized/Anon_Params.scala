package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsMasonryMod.resetParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  def reset(params: resetParams): Unit
}

object Anon_Params {
  @scala.inline
  def apply(reset: resetParams => Unit): Anon_Params = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset))
  
    __obj.asInstanceOf[Anon_Params]
  }
}

