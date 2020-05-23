package typings.reactBootstrapTable2Toolkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnExport extends js.Object {
  def onExport(): Unit
}

object OnExport {
  @scala.inline
  def apply(onExport: () => Unit): OnExport = {
    val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
    __obj.asInstanceOf[OnExport]
  }
}

