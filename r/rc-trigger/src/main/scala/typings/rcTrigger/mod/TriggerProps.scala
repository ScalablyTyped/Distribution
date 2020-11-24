package typings.rcTrigger.mod

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.rcTrigger.interfaceMod.MobileConfig
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerProps extends js.Object {
  
  var action: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
  
  var afterPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var alignPoint: js.UndefOr[Boolean] = js.native
  
  var autoDestroy: js.UndefOr[Boolean] = js.native
  
  var blurDelay: js.UndefOr[Double] = js.native
  
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
  
  var children: ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultPopupVisible: js.UndefOr[Boolean] = js.native
  
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
  
  var focusDelay: js.UndefOr[Double] = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var getDocument: js.UndefOr[js.Function0[HTMLDocument]] = js.native
  
  var getPopupClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  
  /**
    * @private Get trigger DOM node.
    * Used for some component is function component which can not access by `findDOMNode`
    */
  var getTriggerDOMNode: js.UndefOr[js.Function1[/* node */ ReactInstance, HTMLElement]] = js.native
  
  var hideAction: js.UndefOr[js.Array[ActionType]] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Please us `maskMotion` instead. */
  var maskAnimation: js.UndefOr[String] = js.native
  
  var maskClosable: js.UndefOr[Boolean] = js.native
  
  /** Set mask motion. You can ref `rc-motion` for more info. */
  var maskMotion: js.UndefOr[CSSMotionProps] = js.native
  
  /** @deprecated Please us `maskMotion` instead. */
  var maskTransitionName: js.UndefOr[TransitionNameType] = js.native
  
  /** @private Bump fixed position at bottom in mobile.
    * This is internal usage currently, do not use in your prod */
  var mobile: js.UndefOr[MobileConfig] = js.native
  
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  
  var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
  
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  var popup: ReactNode | js.Function0[ReactNode] = js.native
  
  var popupAlign: js.UndefOr[AlignType] = js.native
  
  /** @deprecated Please us `popupMotion` instead. */
  var popupAnimation: js.UndefOr[AnimationType] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  /** Set popup motion. You can ref `rc-motion` for more info. */
  var popupMotion: js.UndefOr[CSSMotionProps] = js.native
  
  var popupPlacement: js.UndefOr[String] = js.native
  
  var popupStyle: js.UndefOr[CSSProperties] = js.native
  
  /** @deprecated Please us `popupMotion` instead. */
  var popupTransitionName: js.UndefOr[TransitionNameType] = js.native
  
  var popupVisible: js.UndefOr[Boolean] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var showAction: js.UndefOr[js.Array[ActionType]] = js.native
  
  var stretch: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object TriggerProps {
  
  @scala.inline
  def apply(children: ReactElement): TriggerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerProps]
  }
  
  @scala.inline
  implicit class TriggerPropsOps[Self <: TriggerProps] (val x: Self) extends AnyVal {
    
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
    def setActionVarargs(value: ActionType*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: ActionType | js.Array[ActionType]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAfterPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("afterPopupVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterPopupVisibleChange: Self = this.set("afterPopupVisibleChange", js.undefined)
    
    @scala.inline
    def setAlignPoint(value: Boolean): Self = this.set("alignPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignPoint: Self = this.set("alignPoint", js.undefined)
    
    @scala.inline
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDestroy: Self = this.set("autoDestroy", js.undefined)
    
    @scala.inline
    def setBlurDelay(value: Double): Self = this.set("blurDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurDelay: Self = this.set("blurDelay", js.undefined)
    
    @scala.inline
    def setBuiltinPlacements(value: BuildInPlacements): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultPopupVisible(value: Boolean): Self = this.set("defaultPopupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPopupVisible: Self = this.set("defaultPopupVisible", js.undefined)
    
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = this.set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyPopupOnHide: Self = this.set("destroyPopupOnHide", js.undefined)
    
    @scala.inline
    def setFocusDelay(value: Double): Self = this.set("focusDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusDelay: Self = this.set("focusDelay", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    
    @scala.inline
    def setGetDocument(value: () => HTMLDocument): Self = this.set("getDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDocument: Self = this.set("getDocument", js.undefined)
    
    @scala.inline
    def setGetPopupClassNameFromAlign(value: /* align */ AlignType => String): Self = this.set("getPopupClassNameFromAlign", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupClassNameFromAlign: Self = this.set("getPopupClassNameFromAlign", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setGetTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): Self = this.set("getTriggerDOMNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTriggerDOMNode: Self = this.set("getTriggerDOMNode", js.undefined)
    
    @scala.inline
    def setHideActionVarargs(value: ActionType*): Self = this.set("hideAction", js.Array(value :_*))
    
    @scala.inline
    def setHideAction(value: js.Array[ActionType]): Self = this.set("hideAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAction: Self = this.set("hideAction", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskAnimation(value: String): Self = this.set("maskAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskAnimation: Self = this.set("maskAnimation", js.undefined)
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    
    @scala.inline
    def setMaskMotion(value: CSSMotionProps): Self = this.set("maskMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskMotion: Self = this.set("maskMotion", js.undefined)
    
    @scala.inline
    def setMaskTransitionName(value: TransitionNameType): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    
    @scala.inline
    def setMobile(value: MobileConfig): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setMouseEnterDelay(value: Double): Self = this.set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseEnterDelay: Self = this.set("mouseEnterDelay", js.undefined)
    
    @scala.inline
    def setMouseLeaveDelay(value: Double): Self = this.set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseLeaveDelay: Self = this.set("mouseLeaveDelay", js.undefined)
    
    @scala.inline
    def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = this.set("onPopupAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPopupAlign: Self = this.set("onPopupAlign", js.undefined)
    
    @scala.inline
    def setOnPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onPopupVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPopupVisibleChange: Self = this.set("onPopupVisibleChange", js.undefined)
    
    @scala.inline
    def setPopupFunction0(value: () => ReactNode): Self = this.set("popup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopup(value: ReactNode | js.Function0[ReactNode]): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setPopupAlign(value: AlignType): Self = this.set("popupAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupAlign: Self = this.set("popupAlign", js.undefined)
    
    @scala.inline
    def setPopupAnimation(value: AnimationType): Self = this.set("popupAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupAnimation: Self = this.set("popupAnimation", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    
    @scala.inline
    def setPopupMotion(value: CSSMotionProps): Self = this.set("popupMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupMotion: Self = this.set("popupMotion", js.undefined)
    
    @scala.inline
    def setPopupPlacement(value: String): Self = this.set("popupPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupPlacement: Self = this.set("popupPlacement", js.undefined)
    
    @scala.inline
    def setPopupStyle(value: CSSProperties): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    
    @scala.inline
    def setPopupTransitionName(value: TransitionNameType): Self = this.set("popupTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupTransitionName: Self = this.set("popupTransitionName", js.undefined)
    
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setShowActionVarargs(value: ActionType*): Self = this.set("showAction", js.Array(value :_*))
    
    @scala.inline
    def setShowAction(value: js.Array[ActionType]): Self = this.set("showAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAction: Self = this.set("showAction", js.undefined)
    
    @scala.inline
    def setStretch(value: String): Self = this.set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
