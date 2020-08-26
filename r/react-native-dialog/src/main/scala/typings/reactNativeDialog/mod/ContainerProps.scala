package typings.reactNativeDialog.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProps extends js.Object {
  var blurComponentIOS: js.UndefOr[ReactNode] = js.native
  var buttonSeparatorStyle: js.UndefOr[ViewStyle] = js.native
  var children: js.Array[ReactNode] = js.native
  var contentStyle: js.UndefOr[ViewStyle] = js.native
  var footerStyle: js.UndefOr[ViewStyle] = js.native
  var headerStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * default: false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ContainerProps {
  @scala.inline
  def apply(children: js.Array[ReactNode]): ContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
  @scala.inline
  implicit class ContainerPropsOps[Self <: ContainerProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurComponentIOS(value: ReactNode): Self = this.set("blurComponentIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurComponentIOS: Self = this.set("blurComponentIOS", js.undefined)
    @scala.inline
    def setButtonSeparatorStyle(value: ViewStyle): Self = this.set("buttonSeparatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonSeparatorStyle: Self = this.set("buttonSeparatorStyle", js.undefined)
    @scala.inline
    def setContentStyle(value: ViewStyle): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setFooterStyle(value: ViewStyle): Self = this.set("footerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterStyle: Self = this.set("footerStyle", js.undefined)
    @scala.inline
    def setHeaderStyle(value: ViewStyle): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

