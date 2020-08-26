package typings.protonNative.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Group can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.native
  /**
    * Whether the Group is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether there is a margin inside the group.
    */
  var margined: js.UndefOr[Boolean] = js.native
  /**
    * The name of the group.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Whether the Grid can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object GroupProps {
  @scala.inline
  def apply(): GroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupProps]
  }
  @scala.inline
  implicit class GroupPropsOps[Self <: GroupProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: Element): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMargined(value: Boolean): Self = this.set("margined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargined: Self = this.set("margined", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

