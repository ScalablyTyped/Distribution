package typings.reactDashFrameDashComponent.reactDashFrameDashComponentMod

import typings.react.reactMod.IframeHTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameComponentProps extends IframeHTMLAttributes[HTMLIFrameElement] {
  @JSName("children")
  var children_FrameComponentProps: ReactNode
  var contentDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var contentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var head: js.UndefOr[ReactNode] = js.undefined
  var initialContent: js.UndefOr[String] = js.undefined
  var mountTarget: js.UndefOr[String] = js.undefined
}

object FrameComponentProps {
  @scala.inline
  def apply(
    children: ReactNode,
    IframeHTMLAttributes: IframeHTMLAttributes[HTMLIFrameElement] = null,
    contentDidMount: () => Unit = null,
    contentDidUpdate: () => Unit = null,
    head: ReactNode = null,
    initialContent: String = null,
    mountTarget: String = null
  ): FrameComponentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, IframeHTMLAttributes)
    if (contentDidMount != null) __obj.updateDynamic("contentDidMount")(js.Any.fromFunction0(contentDidMount))
    if (contentDidUpdate != null) __obj.updateDynamic("contentDidUpdate")(js.Any.fromFunction0(contentDidUpdate))
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent)
    if (mountTarget != null) __obj.updateDynamic("mountTarget")(mountTarget)
    __obj.asInstanceOf[FrameComponentProps]
  }
}

