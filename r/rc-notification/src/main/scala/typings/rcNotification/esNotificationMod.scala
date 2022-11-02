package typings.rcNotification

import typings.rcNotification.anon.HolderCallback
import typings.rcNotification.anon.Left
import typings.rcNotification.anon.Notice
import typings.rcNotification.anon.NoticePropskeyKey
import typings.rcNotification.anon.NotificationPropsgetConta
import typings.rcNotification.esNoticeMod.DivProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationMod {
  
  @JSImport("rc-notification/es/Notification", JSImport.Default)
  @js.native
  open class default () extends Notification
  object default {
    
    @JSImport("rc-notification/es/Notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps.animation")
      @js.native
      def animation: String = js.native
      inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-notification/es/Notification", "default.defaultProps.style")
      @js.native
      def style: Left = js.native
      inline def style_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-notification/es/Notification", "default.newInstance")
    @js.native
    def newInstance: js.Function2[
        /* properties */ NotificationPropsgetConta, 
        /* callback */ js.Function1[/* instance */ NotificationInstance, Unit], 
        Unit
      ] = js.native
    inline def newInstance_=(
      x: js.Function2[
          /* properties */ NotificationPropsgetConta, 
          /* callback */ js.Function1[/* instance */ NotificationInstance, Unit], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(x.asInstanceOf[js.Any])
  }
  
  type HolderReadyCallback = js.Function2[/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey, Unit]
  
  /* Inlined parent std.Omit<rc-notification.rc-notification/es/Notice.NoticeProps, 'prefixCls' | 'children' | 'noticeKey' | 'onClose'> */
  trait NoticeContent extends StObject {
    
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
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object NoticeContent {
    
    inline def apply(): NoticeContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeContent]
    }
    
    extension [Self <: NoticeContent](x: Self) {
      
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
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type NoticeFunc = js.Function1[/* noticeProps */ NoticeContent, Unit]
  
  @js.native
  trait Notification extends Component[NotificationProps, NotificationState, Any] {
    
    def add(originNotice: NoticeContent): Unit = js.native
    def add(originNotice: NoticeContent, holderCallback: HolderReadyCallback): Unit = js.native
    
    def getTransitionName(): String = js.native
    
    /**
      * @private Internal props do not call it directly.
      * We do not make this as private is caused TS will trade private as
      * different prop that between es and lib
      */
    var hookRefs: Map[Key, HTMLDivElement] = js.native
    
    var noticePropsMap: Record[Key, HolderCallback] = js.native
    
    def remove(removeKey: Key): Unit = js.native
  }
  
  trait NotificationInstance extends StObject {
    
    var component: Notification
    
    def destroy(): Unit
    
    var notice: NoticeFunc
    
    def removeNotice(key: Key): Unit
    
    def useNotification(): js.Tuple2[NoticeFunc, ReactElement]
  }
  object NotificationInstance {
    
    inline def apply(
      component: Notification,
      destroy: () => Unit,
      notice: /* noticeProps */ NoticeContent => Unit,
      removeNotice: Key => Unit,
      useNotification: () => js.Tuple2[NoticeFunc, ReactElement]
    ): NotificationInstance = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), notice = js.Any.fromFunction1(notice), removeNotice = js.Any.fromFunction1(removeNotice), useNotification = js.Any.fromFunction0(useNotification))
      __obj.asInstanceOf[NotificationInstance]
    }
    
    extension [Self <: NotificationInstance](x: Self) {
      
      inline def setComponent(value: Notification): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setNotice(value: /* noticeProps */ NoticeContent => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      inline def setRemoveNotice(value: Key => Unit): Self = StObject.set(x, "removeNotice", js.Any.fromFunction1(value))
      
      inline def setUseNotification(value: () => js.Tuple2[NoticeFunc, ReactElement]): Self = StObject.set(x, "useNotification", js.Any.fromFunction0(value))
    }
  }
  
  trait NotificationProps extends StObject {
    
    var animation: js.UndefOr[String | js.Object] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setAnimation(value: String | js.Object): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
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
  
  trait NotificationState extends StObject {
    
    var notices: js.Array[Notice]
  }
  object NotificationState {
    
    inline def apply(notices: js.Array[Notice]): NotificationState = {
      val __obj = js.Dynamic.literal(notices = notices.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationState]
    }
    
    extension [Self <: NotificationState](x: Self) {
      
      inline def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
      
      inline def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value*))
    }
  }
}
