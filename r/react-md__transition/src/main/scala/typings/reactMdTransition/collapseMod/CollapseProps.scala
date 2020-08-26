package typings.reactMdTransition.collapseMod

import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.reactMdTransition.typesMod.EnterHandler
import typings.reactMdTransition.typesMod.ExitHandler
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @react-md/transition.@react-md/transition/types/types.CollapseOptions<std.HTMLElement> */
@js.native
trait CollapseProps extends js.Object {
  var appear: js.UndefOr[Boolean] = js.native
  /**
    * The child element to trigger an animation for. This child **must**
    * either be an HTMLElement or a component that:
    *
    * - forwards the ref to a DOM element
    * - applies the `style`, `className`, and `hidden` attributes correctly.
    */
  var children: ReactElement = js.native
  /**
    * An optional className to merge with the current collapse transition
    * className.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Boolean if the the child is currently collapsed.
    */
  var collapsed: Boolean = js.native
  var enter: js.UndefOr[Boolean] = js.native
  var exit: js.UndefOr[Boolean] = js.native
  /**
    * The minimum height that the collapsed element can be which defaults to `0`.
    * This can either be a number of pixels or a string CSS height value.
    *
    * Setting this value to any non-zero value will allow for the element to
    * shrink to the defined min-height, and then expand to the full height once
    * no longer collapsed.
    *
    * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
    * are all set to `0` (default), the child will be removed from the DOM while
    * collapsed.
    */
  var minHeight: js.UndefOr[Double | String] = js.native
  /**
    * The minimum padding-bottom that the collapsed element can be which defaults
    * to `0`. This can either be a number of pixels or a string CSS
    * `padding-bottom` value.
    *
    * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
    * are all set to `0` (default), the child will be removed from the DOM while
    * collapsed.
    */
  var minPaddingBottom: js.UndefOr[Double | String] = js.native
  /**
    * The minimum padding-top that the collapsed element can be which defaults to
    * `0`. This can either be a number of pixels or a string CSS `padding-top`
    * value.
    *
    * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
    * are all set to `0` (default), the child will be removed from the DOM while
    * collapsed.
    */
  var minPaddingTop: js.UndefOr[Double | String] = js.native
  var onEnter: js.UndefOr[EnterHandler[HTMLElement]] = js.native
  var onEntered: js.UndefOr[EnterHandler[HTMLElement]] = js.native
  var onEntering: js.UndefOr[EnterHandler[HTMLElement]] = js.native
  var onExit: js.UndefOr[ExitHandler[HTMLElement]] = js.native
  var onExited: js.UndefOr[ExitHandler[HTMLElement]] = js.native
  var onExiting: js.UndefOr[ExitHandler[HTMLElement]] = js.native
  var ref: js.UndefOr[Ref[HTMLElement]] = js.native
  var temporary: js.UndefOr[Boolean] = js.native
  /**
    * The timeout for the collapse transition. This will default to 250ms enter
    * and 200ms exit.
    */
  var timeout: js.UndefOr[TransitionTimeout] = js.native
}

object CollapseProps {
  @scala.inline
  def apply(children: ReactElement, collapsed: Boolean): CollapseProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEnter(value: Boolean): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: Boolean): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinPaddingBottom(value: Double | String): Self = this.set("minPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPaddingBottom: Self = this.set("minPaddingBottom", js.undefined)
    @scala.inline
    def setMinPaddingTop(value: Double | String): Self = this.set("minPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPaddingTop: Self = this.set("minPaddingTop", js.undefined)
    @scala.inline
    def setOnEnter(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = this.set("onEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = this.set("onEntered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): Self = this.set("onEntering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: HTMLElement => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: HTMLElement => Unit): Self = this.set("onExited", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: HTMLElement => Unit): Self = this.set("onExiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[HTMLElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
    @scala.inline
    def setTimeout(value: TransitionTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

