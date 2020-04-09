package typings.reactBootstrapTable2Toolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnExport extends js.Object {
  def onExport(): Unit
}

object AnonOnExport {
  @scala.inline
  def apply(onExport: () => Unit): AnonOnExport = {
    val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
  
    __obj.asInstanceOf[AnonOnExport]
  }
}

