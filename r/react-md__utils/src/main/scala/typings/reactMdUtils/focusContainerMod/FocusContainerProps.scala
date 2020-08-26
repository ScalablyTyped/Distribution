package typings.reactMdUtils.focusContainerMod

import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusContainerProps
  extends HTMLAttributes[HTMLElement]
     with FocusContainerOptionsProps {
  /**
    * The component to render the focus container as. This should really not be
    * used as it is more for internal usage. The only base requirements for this
    * prop is that it must either be a element string (`"div"`, `"span"`, etc) or
    * a custom component that has forwarded the ref to the DOM node.
    */
  var component: js.UndefOr[ElementType[_]] = js.native
}

object FocusContainerProps {
  @scala.inline
  def apply(): FocusContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusContainerProps]
  }
  @scala.inline
  implicit class FocusContainerPropsOps[Self <: FocusContainerProps] (val x: Self) extends AnyVal {
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
  }
  
}

