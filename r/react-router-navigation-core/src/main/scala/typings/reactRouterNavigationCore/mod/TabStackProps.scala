package typings.reactRouterNavigationCore.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStackProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode]] = js.native
  var forceSync: js.UndefOr[Boolean] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  def render(props: TabsRendererProps): ReactNode = js.native
}

object TabStackProps {
  @scala.inline
  def apply(render: TabsRendererProps => ReactNode): TabStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[TabStackProps]
  }
  @scala.inline
  implicit class TabStackPropsOps[Self <: TabStackProps] (val x: Self) extends AnyVal {
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
    def setRender(value: TabsRendererProps => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setForceSync(value: Boolean): Self = this.set("forceSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSync: Self = this.set("forceSync", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

