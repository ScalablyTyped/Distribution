package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.self
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmdialogConfirmdialogMod {
  
  @JSImport("primereact/confirmdialog/confirmdialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("primereact/confirmdialog/confirmdialog", "ConfirmDialog")
  @js.native
  open class ConfirmDialog_ protected () extends Component[ConfirmDialogProps, Any, Any] {
    def this(props: ConfirmDialogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ConfirmDialogProps, context: Any) = this()
    
    def confirm(): Unit = js.native
    def confirm(props: ConfirmDialogProps): Unit = js.native
  }
  
  inline def confirmDialog(props: ConfirmDialogProps): ConfirmDialogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmDialog")(props.asInstanceOf[js.Any]).asInstanceOf[ConfirmDialogReturn]
  
  type ConfirmDialogAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  trait ConfirmDialogOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def accept(): Unit
    
    var acceptClassName: String
    
    var acceptLabel: String
    
    var element: ReactNode
    
    var props: ConfirmDialogProps
    
    def reject(): Unit
    
    var rejectClassName: String
    
    var rejectLabel: String
  }
  object ConfirmDialogOptions {
    
    inline def apply(
      accept: () => Unit,
      acceptClassName: String,
      acceptLabel: String,
      props: ConfirmDialogProps,
      reject: () => Unit,
      rejectClassName: String,
      rejectLabel: String
    ): ConfirmDialogOptions = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), acceptClassName = acceptClassName.asInstanceOf[js.Any], acceptLabel = acceptLabel.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), rejectClassName = rejectClassName.asInstanceOf[js.Any], rejectLabel = rejectLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogOptions]
    }
    
    extension [Self <: ConfirmDialogOptions](x: Self) {
      
      inline def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
      
      inline def setAcceptClassName(value: String): Self = StObject.set(x, "acceptClassName", value.asInstanceOf[js.Any])
      
      inline def setAcceptLabel(value: String): Self = StObject.set(x, "acceptLabel", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setProps(value: ConfirmDialogProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setRejectClassName(value: String): Self = StObject.set(x, "rejectClassName", value.asInstanceOf[js.Any])
      
      inline def setRejectLabel(value: String): Self = StObject.set(x, "rejectLabel", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialogProps * / any, 'onHide' | 'footer'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialogProps * / any[P]} */ trait ConfirmDialogProps extends StObject {
    
    var accept: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var acceptClassName: js.UndefOr[String] = js.undefined
    
    var acceptIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ] = js.undefined
    
    var acceptLabel: js.UndefOr[String] = js.undefined
    
    var appendTo: js.UndefOr[ConfirmDialogAppendToType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[ConfirmDialogTemplateType] = js.undefined
    
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ] = js.undefined
    
    var message: js.UndefOr[ConfirmDialogTemplateType] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.undefined
    
    var reject: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var rejectClassName: js.UndefOr[String] = js.undefined
    
    var rejectIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ] = js.undefined
    
    var rejectLabel: js.UndefOr[String] = js.undefined
    
    var tagKey: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ConfirmDialogProps {
    
    inline def apply(): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    extension [Self <: ConfirmDialogProps](x: Self) {
      
      inline def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
      
      inline def setAcceptClassName(value: String): Self = StObject.set(x, "acceptClassName", value.asInstanceOf[js.Any])
      
      inline def setAcceptClassNameUndefined: Self = StObject.set(x, "acceptClassName", js.undefined)
      
      inline def setAcceptIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ): Self = StObject.set(x, "acceptIcon", value.asInstanceOf[js.Any])
      
      inline def setAcceptIconUndefined: Self = StObject.set(x, "acceptIcon", js.undefined)
      
      inline def setAcceptLabel(value: String): Self = StObject.set(x, "acceptLabel", value.asInstanceOf[js.Any])
      
      inline def setAcceptLabelUndefined: Self = StObject.set(x, "acceptLabel", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAppendTo(value: ConfirmDialogAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFooter(value: ConfirmDialogTemplateType): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* options */ ConfirmDialogOptions => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ConfirmDialogTemplateType): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* options */ ConfirmDialogOptions => ReactNode): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnHide(value: /* result */ String => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setRejectClassName(value: String): Self = StObject.set(x, "rejectClassName", value.asInstanceOf[js.Any])
      
      inline def setRejectClassNameUndefined: Self = StObject.set(x, "rejectClassName", js.undefined)
      
      inline def setRejectIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ): Self = StObject.set(x, "rejectIcon", value.asInstanceOf[js.Any])
      
      inline def setRejectIconUndefined: Self = StObject.set(x, "rejectIcon", js.undefined)
      
      inline def setRejectLabel(value: String): Self = StObject.set(x, "rejectLabel", value.asInstanceOf[js.Any])
      
      inline def setRejectLabelUndefined: Self = StObject.set(x, "rejectLabel", js.undefined)
      
      inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      inline def setTagKey(value: String): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
      
      inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ConfirmDialogReturn extends StObject {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object ConfirmDialogReturn {
    
    inline def apply(hide: () => Unit, show: () => Unit): ConfirmDialogReturn = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ConfirmDialogReturn]
    }
    
    extension [Self <: ConfirmDialogReturn](x: Self) {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  type ConfirmDialogTemplateType = ReactNode | (js.Function1[/* options */ ConfirmDialogOptions, ReactNode])
}
