package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.self
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmpopupConfirmpopupMod {
  
  @JSImport("primereact/confirmpopup/confirmpopup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("primereact/confirmpopup/confirmpopup", "ConfirmPopup")
  @js.native
  open class ConfirmPopup_ protected () extends Component[ConfirmPopupProps, Any, Any] {
    def this(props: ConfirmPopupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ConfirmPopupProps, context: Any) = this()
    
    def confirm(): Unit = js.native
    def confirm(props: ConfirmPopupProps): Unit = js.native
  }
  
  inline def confirmPopup(props: ConfirmPopupProps): ConfirmPopupReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmPopup")(props.asInstanceOf[js.Any]).asInstanceOf[ConfirmPopupReturn]
  
  type ConfirmPopupAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  trait ConfirmPopupOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def accept(): Unit
    
    var acceptClassName: String
    
    var acceptLabel: String
    
    var className: String
    
    var element: ReactNode
    
    var props: ConfirmPopupProps
    
    def reject(): Unit
    
    var rejectClassName: String
    
    var rejectLabel: String
  }
  object ConfirmPopupOptions {
    
    inline def apply(
      accept: () => Unit,
      acceptClassName: String,
      acceptLabel: String,
      className: String,
      props: ConfirmPopupProps,
      reject: () => Unit,
      rejectClassName: String,
      rejectLabel: String
    ): ConfirmPopupOptions = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), acceptClassName = acceptClassName.asInstanceOf[js.Any], acceptLabel = acceptLabel.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), rejectClassName = rejectClassName.asInstanceOf[js.Any], rejectLabel = rejectLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmPopupOptions]
    }
    
    extension [Self <: ConfirmPopupOptions](x: Self) {
      
      inline def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
      
      inline def setAcceptClassName(value: String): Self = StObject.set(x, "acceptClassName", value.asInstanceOf[js.Any])
      
      inline def setAcceptLabel(value: String): Self = StObject.set(x, "acceptLabel", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setProps(value: ConfirmPopupProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setRejectClassName(value: String): Self = StObject.set(x, "rejectClassName", value.asInstanceOf[js.Any])
      
      inline def setRejectLabel(value: String): Self = StObject.set(x, "rejectLabel", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfirmPopupProps extends StObject {
    
    var accept: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var acceptClassName: js.UndefOr[String] = js.undefined
    
    var acceptIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ] = js.undefined
    
    var acceptLabel: js.UndefOr[String] = js.undefined
    
    var appendTo: js.UndefOr[ConfirmPopupAppendToType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[ConfirmPopupTemplateType] = js.undefined
    
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ] = js.undefined
    
    var message: js.UndefOr[ConfirmPopupTemplateType] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var reject: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var rejectClassName: js.UndefOr[String] = js.undefined
    
    var rejectIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ] = js.undefined
    
    var rejectLabel: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tagKey: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ConfirmPopupProps {
    
    inline def apply(): ConfirmPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmPopupProps]
    }
    
    extension [Self <: ConfirmPopupProps](x: Self) {
      
      inline def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
      
      inline def setAcceptClassName(value: String): Self = StObject.set(x, "acceptClassName", value.asInstanceOf[js.Any])
      
      inline def setAcceptClassNameUndefined: Self = StObject.set(x, "acceptClassName", js.undefined)
      
      inline def setAcceptIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ): Self = StObject.set(x, "acceptIcon", value.asInstanceOf[js.Any])
      
      inline def setAcceptIconUndefined: Self = StObject.set(x, "acceptIcon", js.undefined)
      
      inline def setAcceptLabel(value: String): Self = StObject.set(x, "acceptLabel", value.asInstanceOf[js.Any])
      
      inline def setAcceptLabelUndefined: Self = StObject.set(x, "acceptLabel", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAppendTo(value: ConfirmPopupAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setFooter(value: ConfirmPopupTemplateType): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* options */ ConfirmPopupOptions => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ConfirmPopupTemplateType): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* options */ ConfirmPopupOptions => ReactNode): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnHide(value: /* result */ String => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setRejectClassName(value: String): Self = StObject.set(x, "rejectClassName", value.asInstanceOf[js.Any])
      
      inline def setRejectClassNameUndefined: Self = StObject.set(x, "rejectClassName", js.undefined)
      
      inline def setRejectIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ): Self = StObject.set(x, "rejectIcon", value.asInstanceOf[js.Any])
      
      inline def setRejectIconUndefined: Self = StObject.set(x, "rejectIcon", js.undefined)
      
      inline def setRejectLabel(value: String): Self = StObject.set(x, "rejectLabel", value.asInstanceOf[js.Any])
      
      inline def setRejectLabelUndefined: Self = StObject.set(x, "rejectLabel", js.undefined)
      
      inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTagKey(value: String): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
      
      inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ConfirmPopupReturn extends StObject {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object ConfirmPopupReturn {
    
    inline def apply(hide: () => Unit, show: () => Unit): ConfirmPopupReturn = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ConfirmPopupReturn]
    }
    
    extension [Self <: ConfirmPopupReturn](x: Self) {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  type ConfirmPopupTemplateType = ReactNode | (js.Function1[/* options */ ConfirmPopupOptions, ReactNode])
}
