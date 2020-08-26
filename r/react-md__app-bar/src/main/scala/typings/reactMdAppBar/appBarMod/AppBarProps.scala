package typings.reactMdAppBar.appBarMod

import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBarProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The component for the `AppBar` to render as. This should normally either
    * just be the default `"header"` or a `"div"` component.
    *
    * It is generally recommended to not provide other React components for this
    * prop even though it is possible since it leads to bad practice and props
    * might not get passed as one would expect.
    */
  var component: js.UndefOr[ElementType[_]] = js.native
  /**
    * Boolean if the `AppBar` should be fixed to the top or bottom of the page.
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the fixed `AppBar` should gain elevation. This is recommended to
    * stay enabled unless you manually apply a border to help separate the
    * `AppBar` from other content.
    */
  var fixedElevation: js.UndefOr[Boolean] = js.native
  /**
    * The position within the page to "fix" the `AppBar` when the `fixed` prop is
    * enabled.
    */
  var fixedPosition: js.UndefOr[AppBarPosition] = js.native
  /**
    * Boolean if the content of the `AppBar` should be allowed to wrap. When this
    * is omitted, it will be considered true for `"none"`, `"prominent"` and
    * `"prominent-dense"` heights
    */
  var flexWrap: js.UndefOr[Boolean] = js.native
  /**
    * The height to use for the app bar. See the `AppBarHeight` type for more
    * information.
    */
  var height: js.UndefOr[AppBarHeight] = js.native
  /**
    * Boolean if the `AppBarNav`, `AppBarTitle`, and `AppBarActions` should
    * inherit the color that for the provided `theme`. If this value is
    * `undefined`, the color will only be inherited when the theme is set to
    * `primary` or `secondary`. However if this value is a boolean, it will be
    * used instead. So if you set this to `false` and set the `theme` to
    * `"primary"`, the defined primary text color will not be inherited.
    */
  var inheritColor: js.UndefOr[Boolean] = js.native
  /**
    * The theme to apply to the `AppBar`.
    */
  var theme: js.UndefOr[AppBarTheme] = js.native
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
    def setComponent(value: ElementType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFixedElevation(value: Boolean): Self = this.set("fixedElevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedElevation: Self = this.set("fixedElevation", js.undefined)
    @scala.inline
    def setFixedPosition(value: AppBarPosition): Self = this.set("fixedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPosition: Self = this.set("fixedPosition", js.undefined)
    @scala.inline
    def setFlexWrap(value: Boolean): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    @scala.inline
    def setHeight(value: AppBarHeight): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInheritColor(value: Boolean): Self = this.set("inheritColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInheritColor: Self = this.set("inheritColor", js.undefined)
    @scala.inline
    def setTheme(value: AppBarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

