package typings.rcTrigger.popupMod

import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.MotionType
import typings.rcTrigger.interfaceMod.Point
import typings.rcTrigger.interfaceMod.StretchType
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupProps extends js.Object {
  var align: js.UndefOr[AlignType] = js.native
  var animation: AnimationType = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
  var getClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.native
  var getRootDomNode: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  var maskAnimation: AnimationType = js.native
  var maskMotion: MotionType = js.native
  var maskTransitionName: TransitionNameType = js.native
  var motion: MotionType = js.native
  var onAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var point: js.UndefOr[Point] = js.native
  var prefixCls: String = js.native
  var stretch: js.UndefOr[StretchType] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var transitionName: TransitionNameType = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object PopupProps {
  @scala.inline
  def apply(
    animation: AnimationType,
    maskAnimation: AnimationType,
    maskMotion: MotionType,
    maskTransitionName: TransitionNameType,
    motion: MotionType,
    prefixCls: String,
    transitionName: TransitionNameType
  ): PopupProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], maskAnimation = maskAnimation.asInstanceOf[js.Any], maskMotion = maskMotion.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
  @scala.inline
  implicit class PopupPropsOps[Self <: PopupProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskAnimation(value: AnimationType): Self = this.set("maskAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskMotion(value: MotionType): Self = this.set("maskMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskTransitionName(value: TransitionNameType): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMotion(value: MotionType): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionName(value: TransitionNameType): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = this.set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyPopupOnHide: Self = this.set("destroyPopupOnHide", js.undefined)
    @scala.inline
    def setGetClassNameFromAlign(value: /* align */ AlignType => String): Self = this.set("getClassNameFromAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetClassNameFromAlign: Self = this.set("getClassNameFromAlign", js.undefined)
    @scala.inline
    def setGetRootDomNode(value: () => HTMLElement): Self = this.set("getRootDomNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootDomNode: Self = this.set("getRootDomNode", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setOnAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = this.set("onAlign", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAlign: Self = this.set("onAlign", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setStretch(value: StretchType): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

