package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type :'cancel'} */
@js.native
trait Cancel
  extends AsyncAction[js.Any] {
  var meta: Dictmeta = js.native
  var `type`: String with cancel = js.native
}

object Cancel {
  @scala.inline
  def apply(meta: Dictmeta, `type`: String with cancel): Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
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
    def setMeta(value: Dictmeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String with cancel): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

