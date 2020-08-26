package typings.reactToolbox.chipChipMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChipProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, the chip will be rendered with a delete icon.
    * @default false
    */
  var deletable: js.UndefOr[Boolean] = js.native
  /**
    * Callback to be invoked when the delete icon is clicked.
    */
  var onDeleteClick: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ChipTheme] = js.native
}

object ChipProps {
  @scala.inline
  def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  @scala.inline
  implicit class ChipPropsOps[Self <: ChipProps] (val x: Self) extends AnyVal {
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
    def setDeletable(value: Boolean): Self = this.set("deletable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletable: Self = this.set("deletable", js.undefined)
    @scala.inline
    def setOnDeleteClick(value: js.Function): Self = this.set("onDeleteClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDeleteClick: Self = this.set("onDeleteClick", js.undefined)
    @scala.inline
    def setTheme(value: ChipTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

