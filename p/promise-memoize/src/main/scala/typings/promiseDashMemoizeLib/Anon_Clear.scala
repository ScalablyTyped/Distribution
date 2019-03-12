package typings
package promiseDashMemoizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(clear: () => scala.Unit): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

