package typings.reactHotkeys.mod

import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotKeysProps extends HotKeysEnabledProps {
  /**
    * The React component that should be used in the DOM to wrap the FocusTrap's
    * children and have the internal key listeners bound to
    */
  var component: js.UndefOr[ReactComponent] = js.native
  var innerRef: js.UndefOr[RefObject[HTMLElement]] = js.native
}

object HotKeysProps {
  @scala.inline
  def apply(): HotKeysProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysProps]
  }
  @scala.inline
  implicit class HotKeysPropsOps[Self <: HotKeysProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: ReactComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setInnerRef(value: RefObject[HTMLElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
  }
  
}

