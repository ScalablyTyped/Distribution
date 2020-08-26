package typings.reactToolbox.listItemContentMod

import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.auto
import typings.reactToolbox.reactToolboxStrings.large
import typings.reactToolbox.reactToolboxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemContentProps extends js.Object {
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[ReactNode] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[String] = js.native
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemContentTheme] = js.native
  /**
    * List item content type.
    */
  var `type`: js.UndefOr[auto | normal | large] = js.native
}

object ListItemContentProps {
  @scala.inline
  def apply(): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemContentProps]
  }
  @scala.inline
  implicit class ListItemContentPropsOps[Self <: ListItemContentProps] (val x: Self) extends AnyVal {
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
    def setCaption(value: ReactNode): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setLegend(value: String): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setTheme(value: ListItemContentTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: auto | normal | large): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

