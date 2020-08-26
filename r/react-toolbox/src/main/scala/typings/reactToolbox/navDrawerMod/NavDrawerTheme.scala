package typings.reactToolbox.navDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavDrawerTheme extends js.Object {
  /**
    * Added to the root class when it is clipped.
    */
  var clipped: js.UndefOr[String] = js.native
  /**
    * Added to the root class when it is pinned.
    */
  var pinned: js.UndefOr[String] = js.native
}

object NavDrawerTheme {
  @scala.inline
  def apply(): NavDrawerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavDrawerTheme]
  }
  @scala.inline
  implicit class NavDrawerThemeOps[Self <: NavDrawerTheme] (val x: Self) extends AnyVal {
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
    def setClipped(value: String): Self = this.set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    @scala.inline
    def setPinned(value: String): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
  }
  
}

