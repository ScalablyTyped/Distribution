package typings
package reduxDashTestkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flush extends js.Object {
  def flush(): scala.Unit
  def reset(): scala.Unit
}

object Anon_Flush {
  @scala.inline
  def apply(flush: js.Function0[scala.Unit], reset: js.Function0[scala.Unit]): Anon_Flush = {
    val __obj = js.Dynamic.literal(flush = flush, reset = reset)
  
    __obj.asInstanceOf[Anon_Flush]
  }
}

