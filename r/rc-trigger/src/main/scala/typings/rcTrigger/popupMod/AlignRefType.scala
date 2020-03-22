package typings.rcTrigger.popupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignRefType extends js.Object {
  def forceAlign(): Unit
}

object AlignRefType {
  @scala.inline
  def apply(forceAlign: () => Unit): AlignRefType = {
    val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign))
  
    __obj.asInstanceOf[AlignRefType]
  }
}

