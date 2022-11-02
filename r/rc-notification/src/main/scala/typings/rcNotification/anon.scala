package typings.rcNotification

import typings.rcNotification.esNoticeMod.DivProps
import typings.rcNotification.esNotificationMod.HolderReadyCallback
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Duration extends StObject {
    
    var duration: Double
    
    def onClose(): Unit
  }
  object Duration {
    
    inline def apply(duration: Double, onClose: () => Unit): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    }
  }
  
  trait HolderCallback extends StObject {
    
    var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
    
    var props: NoticePropskeyReactText
  }
  object HolderCallback {
    
    inline def apply(props: NoticePropskeyReactText): HolderCallback = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolderCallback]
    }
    
    extension [Self <: HolderCallback](x: Self) {
      
      inline def setHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = StObject.set(x, "holderCallback", js.Any.fromFunction2(value))
      
      inline def setHolderCallbackUndefined: Self = StObject.set(x, "holderCallback", js.undefined)
      
      inline def setProps(value: NoticePropskeyReactText): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: String
    
    var top: Double
  }
  object Left {
    
    inline def apply(left: String, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Notice extends StObject {
    
    var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
    
    var notice: NoticeContentuserPassKeyK
  }
  object Notice {
    
    inline def apply(notice: NoticeContentuserPassKeyK): Notice = {
      val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notice]
    }
    
    extension [Self <: Notice](x: Self) {
      
      inline def setHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = StObject.set(x, "holderCallback", js.Any.fromFunction2(value))
      
      inline def setHolderCallbackUndefined: Self = StObject.set(x, "holderCallback", js.undefined)
      
      inline def setNotice(value: NoticeContentuserPassKeyK): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-notification.rc-notification/es/Notification.NoticeContent & {  userPassKey :react.react.Key | undefined} */
  trait NoticeContentuserPassKeyK extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var holder: js.UndefOr[HTMLDivElement] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[DivProps] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var updateMark: js.UndefOr[String] = js.undefined
    
    var userPassKey: js.UndefOr[Key] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object NoticeContentuserPassKeyK {
    
    inline def apply(): NoticeContentuserPassKeyK = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeContentuserPassKeyK]
    }
    
    extension [Self <: NoticeContentuserPassKeyK](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      inline def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
      
      inline def setUserPassKey(value: Key): Self = StObject.set(x, "userPassKey", value.asInstanceOf[js.Any])
      
      inline def setUserPassKeyUndefined: Self = StObject.set(x, "userPassKey", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Inlined rc-notification.rc-notification/es/Notice.NoticeProps & {  key :react.react.Key} */
  trait NoticePropskeyKey extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    /** @private Only for internal usage. We don't promise that we will refactor this */
    var holder: js.UndefOr[HTMLDivElement] = js.undefined
    
    var key: Key
    
    /** Mark as final key since set maxCount may keep the key but user pass key is different */
    var noticeKey: Key
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.undefined
    
    var prefixCls: String
    
    var props: js.UndefOr[DivProps] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var updateMark: js.UndefOr[String] = js.undefined
    
    /** @private Provided by CSSMotionList */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object NoticePropskeyKey {
    
    inline def apply(key: Key, noticeKey: Key, prefixCls: String): NoticePropskeyKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticePropskeyKey]
    }
    
    extension [Self <: NoticePropskeyKey](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNoticeKey(value: Key): Self = StObject.set(x, "noticeKey", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      inline def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Inlined rc-notification.rc-notification/es/Notice.NoticeProps & {  key :react.react.ReactText} */
  trait NoticePropskeyReactText extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    /** @private Only for internal usage. We don't promise that we will refactor this */
    var holder: js.UndefOr[HTMLDivElement] = js.undefined
    
    var key: ReactText
    
    /** Mark as final key since set maxCount may keep the key but user pass key is different */
    var noticeKey: Key
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.undefined
    
    var prefixCls: String
    
    var props: js.UndefOr[DivProps] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var updateMark: js.UndefOr[String] = js.undefined
    
    /** @private Provided by CSSMotionList */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object NoticePropskeyReactText {
    
    inline def apply(key: ReactText, noticeKey: Key, prefixCls: String): NoticePropskeyReactText = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticePropskeyReactText]
    }
    
    extension [Self <: NoticePropskeyReactText](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      inline def setKey(value: ReactText): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNoticeKey(value: Key): Self = StObject.set(x, "noticeKey", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      inline def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Inlined rc-notification.rc-notification/es/Notification.NotificationProps & {  getContainer :(): std.HTMLElement | undefined} */
  trait NotificationPropsgetConta extends StObject {
    
    var animation: js.UndefOr[String | js.Object] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object NotificationPropsgetConta {
    
    inline def apply(): NotificationPropsgetConta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationPropsgetConta]
    }
    
    extension [Self <: NotificationPropsgetConta](x: Self) {
      
      inline def setAnimation(value: String | js.Object): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
}
