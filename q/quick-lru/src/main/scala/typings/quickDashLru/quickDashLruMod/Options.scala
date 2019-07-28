package typings.quickDashLru.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The maximum number of items before evicting the least recently used items.
  		*/
  val maxSize: Double
}

object Options {
  @scala.inline
  def apply(maxSize: Double): Options = {
    val __obj = js.Dynamic.literal(maxSize = maxSize)
  
    __obj.asInstanceOf[Options]
  }
}

