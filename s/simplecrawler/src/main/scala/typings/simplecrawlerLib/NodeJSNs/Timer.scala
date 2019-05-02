package typings
package simplecrawlerLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def ref(): scala.Unit
  def unref(): scala.Unit
}

object Timer {
  @scala.inline
  def apply(ref: () => scala.Unit, unref: () => scala.Unit): Timer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timer]
  }
}

