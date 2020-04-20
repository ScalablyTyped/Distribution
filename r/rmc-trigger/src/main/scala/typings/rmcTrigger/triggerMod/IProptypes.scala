package typings.rmcTrigger.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProptypes extends js.Object {
  var visible: Boolean
  def onClose(): Unit
  def onTargetClick(): Unit
}

object IProptypes {
  @scala.inline
  def apply(onClose: () => Unit, onTargetClick: () => Unit, visible: Boolean): IProptypes = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onTargetClick = js.Any.fromFunction0(onTargetClick), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProptypes]
  }
}

