package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.reactOnsenuiStrings.collapse
import typings.reactOnsenui.reactOnsenuiStrings.default
import typings.reactOnsenui.reactOnsenuiStrings.landscape
import typings.reactOnsenui.reactOnsenuiStrings.left
import typings.reactOnsenui.reactOnsenuiStrings.overlay
import typings.reactOnsenui.reactOnsenuiStrings.portrait
import typings.reactOnsenui.reactOnsenuiStrings.right
import typings.reactOnsenui.reactOnsenuiStrings.split
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  side :'left' | 'right' | undefined,   collapse :'portrait' | 'landscape' | boolean | undefined,   isOpen :boolean | undefined,   onOpen :(e : std.Event | undefined): void | undefined,   onPreOpen :(e : std.Event | undefined): void | undefined,   onPreClose :(e : std.Event | undefined): void | undefined,   onModeChange :(e : std.Event | undefined): void | undefined,   onClose :(e : std.Event | undefined): void | undefined,   swipeable :boolean | undefined,   swipeTargetWidth :number | undefined,   width :number | undefined,   animation :'overlay' | 'default' | undefined,   animationOptions :react-onsenui.react-onsenui.AnimationOptions | undefined,   openThreshold :number | undefined,   mode :'collapse' | 'split' | undefined} */
@js.native
trait HTMLAttributesidclassNameAnimation extends js.Object {
  var animation: js.UndefOr[overlay | default] = js.native
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var className: js.UndefOr[String] = js.native
  var collapse: js.UndefOr[portrait | landscape | Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[collapse | split] = js.native
  var onClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  var onModeChange: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  var onPreClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  var onPreOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  var openThreshold: js.UndefOr[Double] = js.native
  var side: js.UndefOr[left | right] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swipeTargetWidth: js.UndefOr[Double] = js.native
  var swipeable: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object HTMLAttributesidclassNameAnimation {
  @scala.inline
  def apply(): HTMLAttributesidclassNameAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameAnimation]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameAnimationOps[Self <: HTMLAttributesidclassNameAnimation] (val x: Self) extends AnyVal {
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
    def setAnimation(value: overlay | default): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationOptions(value: AnimationOptions): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOptions: Self = this.set("animationOptions", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollapse(value: portrait | landscape | Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setMode(value: collapse | split): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnClose(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnModeChange(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onModeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnModeChange: Self = this.set("onModeChange", js.undefined)
    @scala.inline
    def setOnOpen(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnPreClose(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onPreClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPreClose: Self = this.set("onPreClose", js.undefined)
    @scala.inline
    def setOnPreOpen(value: /* e */ js.UndefOr[Event] => Unit): Self = this.set("onPreOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPreOpen: Self = this.set("onPreOpen", js.undefined)
    @scala.inline
    def setOpenThreshold(value: Double): Self = this.set("openThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenThreshold: Self = this.set("openThreshold", js.undefined)
    @scala.inline
    def setSide(value: left | right): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSwipeTargetWidth(value: Double): Self = this.set("swipeTargetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeTargetWidth: Self = this.set("swipeTargetWidth", js.undefined)
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

