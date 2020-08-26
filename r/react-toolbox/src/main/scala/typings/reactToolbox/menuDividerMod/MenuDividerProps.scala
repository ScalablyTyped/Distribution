package typings.reactToolbox.menuDividerMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuDividerProps extends Props {
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuDividerTheme] = js.native
}

object MenuDividerProps {
  @scala.inline
  def apply(): MenuDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuDividerProps]
  }
  @scala.inline
  implicit class MenuDividerPropsOps[Self <: MenuDividerProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: MenuDividerTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

