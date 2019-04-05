package typings
package quickDashLruLib.quickDashLruMod.QuickLRUNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The maximum number of items before evicting the least recently used items.
  		*/
  val maxSize: scala.Double
}

object Options {
  @scala.inline
  def apply(maxSize: scala.Double): Options = {
    val __obj = js.Dynamic.literal(maxSize = maxSize)
  
    __obj.asInstanceOf[Options]
  }
}

