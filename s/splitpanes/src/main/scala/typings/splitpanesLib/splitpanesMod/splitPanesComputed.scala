package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesComputed extends js.Object {
  def defaultWidth(): scala.Double
}

object splitPanesComputed {
  @scala.inline
  def apply(defaultWidth: () => scala.Double): splitPanesComputed = {
    val __obj = js.Dynamic.literal(defaultWidth = js.Any.fromFunction0(defaultWidth))
  
    __obj.asInstanceOf[splitPanesComputed]
  }
}

