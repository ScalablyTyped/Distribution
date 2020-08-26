package typings.reactBootstrapTable2Toolkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnExport extends js.Object {
  def onExport(): Unit = js.native
}

object OnExport {
  @scala.inline
  def apply(onExport: () => Unit): OnExport = {
    val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
    __obj.asInstanceOf[OnExport]
  }
  @scala.inline
  implicit class OnExportOps[Self <: OnExport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnExport(value: () => Unit): Self = this.set("onExport", js.Any.fromFunction0(value))
  }
  
}

