package typings.rcNotification

import typings.rcNotification.anon.Duration
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNoticeMod {
  
  @JSImport("rc-notification/es/Notice", JSImport.Default)
  @js.native
  open class default () extends Notice
  /* static members */
  object default {
    
    @JSImport("rc-notification/es/Notice", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-notification/es/Notice", "default.defaultProps")
    @js.native
    def defaultProps: Duration = js.native
    inline def defaultProps_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DivProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    var `data-testid`: js.UndefOr[String] = js.undefined
  }
  object DivProps {
    
    inline def apply(): DivProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DivProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DivProps] (val x: Self) extends AnyVal {
      
      inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
    }
  }
  
  @js.native
  trait Notice
    extends Component[NoticeProps, js.Object, Any] {
    
    def clearCloseTimer(): Unit = js.native
    
    def close(): Unit = js.native
    def close(e: MouseEvent[HTMLAnchorElement, NativeMouseEvent]): Unit = js.native
    
    var closeTimer: Double | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MNotice(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNotice(prevProps: NoticeProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNotice(): Unit = js.native
    
    def restartCloseTimer(): Unit = js.native
    
    def startCloseTimer(): Unit = js.native
  }
  
  trait NoticeProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    /** @private Only for internal usage. We don't promise that we will refactor this */
    var holder: js.UndefOr[HTMLDivElement] = js.undefined
    
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
  object NoticeProps {
    
    inline def apply(noticeKey: Key, prefixCls: String): NoticeProps = {
      val __obj = js.Dynamic.literal(noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoticeProps] (val x: Self) extends AnyVal {
      
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
}
