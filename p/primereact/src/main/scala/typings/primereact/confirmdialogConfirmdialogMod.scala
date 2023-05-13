package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.buttonButtonMod.ButtonPassThroughOptions
import typings.primereact.primereactStrings.self
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.SVGProps
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
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
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ConfirmDialogProps, context: Any) = this()
    
    /**
      * Used to call/update the component manually
      * @param {ConfirmDialogProps} props - All component props
      */
    def confirm(): Unit = js.native
    def confirm(props: ConfirmDialogProps): Unit = js.native
  }
  
  inline def confirmDialog(props: ConfirmDialogProps): ConfirmDialogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmDialog")(props.asInstanceOf[js.Any]).asInstanceOf[ConfirmDialogReturn]
  
  /**
    * Custom confirm dialog options
    */
  trait ConfirmDialogOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Callback to execute when action is confirmed.
      */
    def accept(): Unit
    
    /**
      * Style class of the accept button.
      */
    var acceptClassName: String
    
    /**
      * Label of the accept button.
      * @defaultValue Yes
      */
    var acceptLabel: String
    
    /**
      * Default element created by the component.
      */
    var element: ReactNode
    
    /**
      * All component props
      * @type {ConfirmDialogProps}
      */
    var props: ConfirmDialogProps
    
    /**
      * Callback to execute when action is rejected.
      */
    def reject(): Unit
    
    /**
      * Style class of the reject button.
      */
    var rejectClassName: String
    
    /**
      * Label of the reject button.
      * @defaultValue No
      */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogOptions] (val x: Self) extends AnyVal {
      
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
  
  trait ConfirmDialogPassThroughOptions extends StObject {
    
    /**
      * Uses to pass attributes to the Button component.
      * @see {@link ButtonPassThroughOptions}
      */
    var acceptButton: js.UndefOr[ButtonPassThroughOptions] = js.undefined
    
    /**
      * Uses to pass attributes to the close button's component.
      */
    var closeButton: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the close button icon's component.
      */
    var closeButtonIcon: js.UndefOr[
        ConfirmDialogPassThroughType[SVGProps[SVGSVGElement] | (HTMLAttributes[HTMLSpanElement | SVGSVGElement])]
      ] = js.undefined
    
    /**
      * Uses to pass attributes to the content's DOM element.
      */
    var content: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the footer's DOM element.
      */
    var footer: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the header's DOM element.
      */
    var header: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the header icons' DOM element.
      */
    var headerIcons: js.UndefOr[
        ConfirmDialogPassThroughType[SVGProps[SVGSVGElement] | (HTMLAttributes[HTMLSpanElement | SVGSVGElement])]
      ] = js.undefined
    
    /**
      * Uses to pass attributes to the header title's DOM element.
      */
    var headerTitle: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the icon's DOM element.
      */
    var icon: js.UndefOr[
        ConfirmDialogPassThroughType[SVGProps[SVGSVGElement] | (HTMLAttributes[HTMLSpanElement | SVGSVGElement])]
      ] = js.undefined
    
    /**
      * Uses to pass attributes to the message's DOM element.
      */
    var message: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the Button component.
      * @see {@link ButtonPassThroughOptions}
      */
    var rejectButton: js.UndefOr[ButtonPassThroughOptions] = js.undefined
    
    /**
      * Uses to pass attributes to the root's DOM element.
      */
    var root: js.UndefOr[ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
  }
  object ConfirmDialogPassThroughOptions {
    
    inline def apply(): ConfirmDialogPassThroughOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmDialogPassThroughOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogPassThroughOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptButton(value: ButtonPassThroughOptions): Self = StObject.set(x, "acceptButton", value.asInstanceOf[js.Any])
      
      inline def setAcceptButtonUndefined: Self = StObject.set(x, "acceptButton", js.undefined)
      
      inline def setCloseButton(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonIcon(
        value: ConfirmDialogPassThroughType[SVGProps[SVGSVGElement] | (HTMLAttributes[HTMLSpanElement | SVGSVGElement])]
      ): Self = StObject.set(x, "closeButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonIconUndefined: Self = StObject.set(x, "closeButtonIcon", js.undefined)
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setContent(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFooter(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderIcons(
        value: ConfirmDialogPassThroughType[SVGProps[SVGSVGElement] | (HTMLAttributes[HTMLSpanElement | SVGSVGElement])]
      ): Self = StObject.set(x, "headerIcons", value.asInstanceOf[js.Any])
      
      inline def setHeaderIconsUndefined: Self = StObject.set(x, "headerIcons", js.undefined)
      
      inline def setHeaderTitle(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcon(
        value: ConfirmDialogPassThroughType[SVGProps[SVGSVGElement] | (HTMLAttributes[HTMLSpanElement | SVGSVGElement])]
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRejectButton(value: ButtonPassThroughOptions): Self = StObject.set(x, "rejectButton", value.asInstanceOf[js.Any])
      
      inline def setRejectButtonUndefined: Self = StObject.set(x, "rejectButton", js.undefined)
      
      inline def setRoot(value: ConfirmDialogPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type ConfirmDialogPassThroughType[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PassThroughType<T, ConfirmDialogThroughMethodOptions> */ Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialogProps * / any, 'onHide' | 'footer' | 'pt'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DialogProps * / any[P]} */ trait ConfirmDialogProps extends StObject {
    
    /**
      * Callback to execute when action is confirmed.
      */
    var accept: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Style class of the accept button.
      */
    var acceptClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Icon of the accept button.
      */
    var acceptIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ] = js.undefined
    
    /**
      * Label of the accept button.
      * @defaultValue Yes
      */
    var acceptLabel: js.UndefOr[String] = js.undefined
    
    /**
      * DOM element instance where the overlay panel should be mounted. Valid values are any DOM Element and "self". The "self" value is used to render a component where it is located.
      * @defaultValue document.body
      */
    var appendTo: js.UndefOr[self | HTMLElement | Null] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Footer content of the confirm dialog.
      */
    var footer: js.UndefOr[ReactNode | (js.Function1[/* options */ ConfirmDialogOptions, ReactNode])] = js.undefined
    
    /**
      * Icon to display next to the message.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ] = js.undefined
    
    /**
      * Message of the confirmation.
      */
    var message: js.UndefOr[ReactNode | (js.Function1[/* options */ ConfirmDialogOptions, ReactNode])] = js.undefined
    
    /**
      * Callback to invoke when confirm dialog is hidden.
      */
    var onHide: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.undefined
    
    /**
      * Uses to pass attributes to DOM elements inside the component.
      * @type {ConfirmDialogPassThroughOptions}
      */
    var pt: js.UndefOr[ConfirmDialogPassThroughOptions] = js.undefined
    
    /**
      * Callback to execute when action is rejected.
      */
    var reject: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Style class of the reject button.
      */
    var rejectClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Icon of the reject button.
      */
    var rejectIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ] = js.undefined
    
    /**
      * Label of the reject button.
      * @defaultValue No
      */
    var rejectLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Unique tag key used to separate the confirmDialog components in the page.
      */
    var tagKey: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the visibility of the confirm dialog.
      * @defaultValue false
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ConfirmDialogProps {
    
    inline def apply(): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setAppendTo(value: self | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFooter(value: ReactNode | (js.Function1[/* options */ ConfirmDialogOptions, ReactNode])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* options */ ConfirmDialogOptions => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmDialogProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ReactNode | (js.Function1[/* options */ ConfirmDialogOptions, ReactNode])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* options */ ConfirmDialogOptions => ReactNode): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnHide(value: /* result */ String => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setPt(value: ConfirmDialogPassThroughOptions): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
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
  
  /**
    * Object returned by the {@link confirmDialog} method.
    */
  trait ConfirmDialogReturn extends StObject {
    
    /**
      * Used to hide the dialog.
      */
    def hide(): Unit
    
    /**
      * Used to show the dialog.
      */
    def show(): Unit
  }
  object ConfirmDialogReturn {
    
    inline def apply(hide: () => Unit, show: () => Unit): ConfirmDialogReturn = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ConfirmDialogReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogReturn] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ConfirmDialogState extends StObject {
    
    /**
      * Current confirmation message.
      */
    var confirmation: Any
    
    /**
      * Current visible state as a boolean.
      * @defaultValue false
      */
    var visible: Boolean
  }
  object ConfirmDialogState {
    
    inline def apply(confirmation: Any, visible: Boolean): ConfirmDialogState = {
      val __obj = js.Dynamic.literal(confirmation = confirmation.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogState] (val x: Self) extends AnyVal {
      
      inline def setConfirmation(value: Any): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfirmDialogThroughMethodOptions extends StObject {
    
    var props: ConfirmDialogProps
    
    var state: ConfirmDialogState
  }
  object ConfirmDialogThroughMethodOptions {
    
    inline def apply(props: ConfirmDialogProps, state: ConfirmDialogState): ConfirmDialogThroughMethodOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogThroughMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmDialogThroughMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setProps(value: ConfirmDialogProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setState(value: ConfirmDialogState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
