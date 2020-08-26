package typings.reactEmailEditor.mod

import typings.reactEmailEditor.anon.Tools
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearanceConfig extends js.Object {
  val panels: js.UndefOr[Tools] = js.native
  val theme: js.UndefOr[ThemeColor] = js.native
}

object AppearanceConfig {
  @scala.inline
  def apply(): AppearanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppearanceConfig]
  }
  @scala.inline
  implicit class AppearanceConfigOps[Self <: AppearanceConfig] (val x: Self) extends AnyVal {
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
    def setPanels(value: Tools): Self = this.set("panels", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanels: Self = this.set("panels", js.undefined)
    @scala.inline
    def setTheme(value: ThemeColor): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

