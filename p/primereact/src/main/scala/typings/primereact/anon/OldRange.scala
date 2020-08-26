package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldRange extends js.Object {
  var oldRange: js.Any = js.native
  var range: js.Any = js.native
  var source: String = js.native
}

object OldRange {
  @scala.inline
  def apply(oldRange: js.Any, range: js.Any, source: String): OldRange = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldRange]
  }
  @scala.inline
  implicit class OldRangeOps[Self <: OldRange] (val x: Self) extends AnyVal {
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
    def setOldRange(value: js.Any): Self = this.set("oldRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: js.Any): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

