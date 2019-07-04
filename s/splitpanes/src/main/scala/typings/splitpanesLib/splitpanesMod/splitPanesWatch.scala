package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesWatch extends js.Object {
  def defaultPercent(`val`: js.Any): scala.Unit
}

object splitPanesWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => scala.Unit): splitPanesWatch = {
    val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
  
    __obj.asInstanceOf[splitPanesWatch]
  }
}

