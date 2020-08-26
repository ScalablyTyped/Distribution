package typings.qrcode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dark extends js.Object {
  /**
    * Color of dark module. Value must be in hex format (RGBA).
    * Note: dark color should always be darker than color.light.
    * Default: #000000ff
    */
  var dark: js.UndefOr[String] = js.native
  /**
    * Color of light module. Value must be in hex format (RGBA).
    * Default: #ffffffff
    */
  var light: js.UndefOr[String] = js.native
}

object Dark {
  @scala.inline
  def apply(): Dark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dark]
  }
  @scala.inline
  implicit class DarkOps[Self <: Dark] (val x: Self) extends AnyVal {
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
    def setDark(value: String): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setLight(value: String): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
  }
  
}

