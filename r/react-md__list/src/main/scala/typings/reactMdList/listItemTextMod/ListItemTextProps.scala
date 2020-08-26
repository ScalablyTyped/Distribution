package typings.reactMdList.listItemTextMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemTextProps extends js.Object {
  /**
    * The main text children to display. This will be stacked above the
    * `secondaryText` if it was provided.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * An optional `className` to apply to the `<span>` surrounding the `children`.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional secondary text to display that will be stacked below the
    * `children`. This also applies some styles to make the text less prominent
    * than the `children`.
    */
  var secondaryText: js.UndefOr[ReactNode] = js.native
  /**
    * An optional `className` to apply to the `<span>` surrounding the
    * `secondaryText` if it was provided.
    */
  var secondaryTextClassName: js.UndefOr[String] = js.native
}

object ListItemTextProps {
  @scala.inline
  def apply(): ListItemTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemTextProps]
  }
  @scala.inline
  implicit class ListItemTextPropsOps[Self <: ListItemTextProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setSecondaryText(value: ReactNode): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setSecondaryTextClassName(value: String): Self = this.set("secondaryTextClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryTextClassName: Self = this.set("secondaryTextClassName", js.undefined)
  }
  
}

