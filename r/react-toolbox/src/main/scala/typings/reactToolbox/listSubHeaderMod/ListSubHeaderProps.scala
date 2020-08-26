package typings.reactToolbox.listSubHeaderMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubHeaderProps extends Props {
  /**
    * Text that will be displayed.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ListSubHeaderTheme] = js.native
}

object ListSubHeaderProps {
  @scala.inline
  def apply(): ListSubHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubHeaderProps]
  }
  @scala.inline
  implicit class ListSubHeaderPropsOps[Self <: ListSubHeaderProps] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setTheme(value: ListSubHeaderTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

