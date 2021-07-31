package typings.rcNotification

import typings.rcNotification.noticeMod.DivProps
import typings.rcNotification.notificationMod.HolderReadyCallback
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
    
    @scala.inline
    def apply(duration: Double, onClose: () => Unit): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    }
  }
  
  trait HolderCallback extends StObject {
    
    var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
    
    var notice: NoticeContentuserPassKeyK
  }
  object HolderCallback {
    
    @scala.inline
    def apply(notice: NoticeContentuserPassKeyK): HolderCallback = {
      val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolderCallback]
    }
    
    @scala.inline
    implicit class HolderCallbackMutableBuilder[Self <: HolderCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = StObject.set(x, "holderCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHolderCallbackUndefined: Self = StObject.set(x, "holderCallback", js.undefined)
      
      @scala.inline
      def setNotice(value: NoticeContentuserPassKeyK): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: String
    
    var top: Double
  }
  object Left {
    
    @scala.inline
    def apply(left: String, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
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
  }
  object NoticeContentuserPassKeyK {
    
    @scala.inline
    def apply(): NoticeContentuserPassKeyK = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeContentuserPassKeyK]
    }
    
    @scala.inline
    implicit class NoticeContentuserPassKeyKMutableBuilder[Self <: NoticeContentuserPassKeyK] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
      
      @scala.inline
      def setUserPassKey(value: Key): Self = StObject.set(x, "userPassKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPassKeyUndefined: Self = StObject.set(x, "userPassKey", js.undefined)
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
  }
  object NoticePropskeyKey {
    
    @scala.inline
    def apply(key: Key, noticeKey: Key, prefixCls: String): NoticePropskeyKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticePropskeyKey]
    }
    
    @scala.inline
    implicit class NoticePropskeyKeyMutableBuilder[Self <: NoticePropskeyKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeKey(value: Key): Self = StObject.set(x, "noticeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
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
  }
  object NoticePropskeyReactText {
    
    @scala.inline
    def apply(key: ReactText, noticeKey: Key, prefixCls: String): NoticePropskeyReactText = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticePropskeyReactText]
    }
    
    @scala.inline
    implicit class NoticePropskeyReactTextMutableBuilder[Self <: NoticePropskeyReactText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setHolder(value: HTMLDivElement): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
      
      @scala.inline
      def setKey(value: ReactText): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeKey(value: Key): Self = StObject.set(x, "noticeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUpdateMark(value: String): Self = StObject.set(x, "updateMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMarkUndefined: Self = StObject.set(x, "updateMark", js.undefined)
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
    
    @scala.inline
    def apply(): NotificationPropsgetConta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationPropsgetConta]
    }
    
    @scala.inline
    implicit class NotificationPropsgetContaMutableBuilder[Self <: NotificationPropsgetConta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String | js.Object): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
    
    var props: NoticePropskeyReactText
  }
  object Props {
    
    @scala.inline
    def apply(props: NoticePropskeyReactText): Props = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = StObject.set(x, "holderCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHolderCallbackUndefined: Self = StObject.set(x, "holderCallback", js.undefined)
      
      @scala.inline
      def setProps(value: NoticePropskeyReactText): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
