package typings.reduxLocalstorageDebounce.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebounceOptions
  extends /* key */ StringDictionary[js.Any] {
  var maxWait: js.UndefOr[Double] = js.native
}

object DebounceOptions {
  @scala.inline
  def apply(): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceOptions]
  }
  @scala.inline
  implicit class DebounceOptionsOps[Self <: DebounceOptions] (val x: Self) extends AnyVal {
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
    def setMaxWait(value: Double): Self = this.set("maxWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWait: Self = this.set("maxWait", js.undefined)
  }
  
}

