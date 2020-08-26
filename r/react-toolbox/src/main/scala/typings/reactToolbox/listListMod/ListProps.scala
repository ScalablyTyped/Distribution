package typings.reactToolbox.listListMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, each element in the list will have a ripple effect on click
    * @default false
    */
  var ripple: js.UndefOr[Boolean] = js.native
  /**
    * If true, the elements in the list will display a hover effect and a pointer cursor.
    * @default false
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ListTheme] = js.native
}

object ListProps {
  @scala.inline
  def apply(): ListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps]
  }
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
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
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setTheme(value: ListTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

