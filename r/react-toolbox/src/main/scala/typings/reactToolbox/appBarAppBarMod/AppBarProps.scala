package typings.reactToolbox.appBarAppBarMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBarProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Determine if the bar should have position fixed or relative.
    * @default false
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * If true, the AppBar doesn't show a shadow.
    * @default false
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * If it exists it is used as the AppBar left icon
    */
  var leftIcon: js.UndefOr[ReactNode] = js.native
  /**
    * Called when the left icon is clicked
    */
  var onLeftIconClick: js.UndefOr[js.Function] = js.native
  /**
    * Called when the righticon is clicked
    */
  var onRightIconClick: js.UndefOr[js.Function] = js.native
  /**
    * If it exists it is used as the AppBar right icon
    */
  var rightIcon: js.UndefOr[ReactNode] = js.native
  /**
    * Whether AppBar should be hidden during scroll.
    * @default false
    */
  var scrollHide: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[AppBarTheme] = js.native
  /**
    * If it exists it is used as the AppBar title
    */
  var title: js.UndefOr[String] = js.native
}

object AppBarProps {
  @scala.inline
  def apply(): AppBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarProps]
  }
  @scala.inline
  implicit class AppBarPropsOps[Self <: AppBarProps] (val x: Self) extends AnyVal {
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
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setLeftIcon(value: ReactNode): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setOnLeftIconClick(value: js.Function): Self = this.set("onLeftIconClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLeftIconClick: Self = this.set("onLeftIconClick", js.undefined)
    @scala.inline
    def setOnRightIconClick(value: js.Function): Self = this.set("onRightIconClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRightIconClick: Self = this.set("onRightIconClick", js.undefined)
    @scala.inline
    def setRightIcon(value: ReactNode): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setScrollHide(value: Boolean): Self = this.set("scrollHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHide: Self = this.set("scrollHide", js.undefined)
    @scala.inline
    def setTheme(value: AppBarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

