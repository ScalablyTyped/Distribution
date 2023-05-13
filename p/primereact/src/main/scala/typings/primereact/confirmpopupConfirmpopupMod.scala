package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.buttonButtonMod.ButtonPassThroughOptions
import typings.primereact.primereactStrings.self
import typings.react.mod.CSSProperties
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
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ConfirmPopupProps, context: Any) = this()
    
    /**
      * Used to call/update the component manually
      * @param {ConfirmPopupProps} props - All component props
      */
    def confirm(): Unit = js.native
    def confirm(props: ConfirmPopupProps): Unit = js.native
  }
  
  inline def confirmPopup(props: ConfirmPopupProps): ConfirmPopupReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmPopup")(props.asInstanceOf[js.Any]).asInstanceOf[ConfirmPopupReturn]
  
  /**
    * Custom confirm popup options
    */
  trait ConfirmPopupOptions
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
      * Style class of the component.
      */
    var className: String
    
    /**
      * Default element created by the component.
      */
    var element: ReactNode
    
    /**
      * All component props
      * @type {ConfirmPopupProps}
      */
    var props: ConfirmPopupProps
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPopupOptions] (val x: Self) extends AnyVal {
      
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
  
  trait ConfirmPopupPassThroughMethodOptions extends StObject {
    
    var props: ConfirmPopupProps
    
    var state: ConfirmPopupState
  }
  object ConfirmPopupPassThroughMethodOptions {
    
    inline def apply(props: ConfirmPopupProps, state: ConfirmPopupState): ConfirmPopupPassThroughMethodOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmPopupPassThroughMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPopupPassThroughMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setProps(value: ConfirmPopupProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setState(value: ConfirmPopupState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfirmPopupPassThroughOptions extends StObject {
    
    /**
      * Uses to pass attributes to the Button component.
      * @see {@link ButtonPassThroughOptions}
      */
    var acceptButton: js.UndefOr[ButtonPassThroughOptions] = js.undefined
    
    /**
      * Uses to pass attributes to the content's DOM element.
      */
    var content: js.UndefOr[ConfirmPopupPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the footer's DOM element.
      */
    var footer: js.UndefOr[ConfirmPopupPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the icon's DOM element.
      */
    var icon: js.UndefOr[
        ConfirmPopupPassThroughType[SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]]
      ] = js.undefined
    
    /**
      * Uses to pass attributes to the message's DOM element.
      */
    var message: js.UndefOr[ConfirmPopupPassThroughType[HTMLAttributes[HTMLSpanElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the Button component.
      * @see {@link ButtonPassThroughOptions}
      */
    var rejectButton: js.UndefOr[ButtonPassThroughOptions] = js.undefined
    
    /**
      * Uses to pass attributes to the root's DOM element.
      */
    var root: js.UndefOr[ConfirmPopupPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
  }
  object ConfirmPopupPassThroughOptions {
    
    inline def apply(): ConfirmPopupPassThroughOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmPopupPassThroughOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPopupPassThroughOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptButton(value: ButtonPassThroughOptions): Self = StObject.set(x, "acceptButton", value.asInstanceOf[js.Any])
      
      inline def setAcceptButtonUndefined: Self = StObject.set(x, "acceptButton", js.undefined)
      
      inline def setContent(value: ConfirmPopupPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFooter(value: ConfirmPopupPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setIcon(value: ConfirmPopupPassThroughType[SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ConfirmPopupPassThroughType[HTMLAttributes[HTMLSpanElement]]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRejectButton(value: ButtonPassThroughOptions): Self = StObject.set(x, "rejectButton", value.asInstanceOf[js.Any])
      
      inline def setRejectButtonUndefined: Self = StObject.set(x, "rejectButton", js.undefined)
      
      inline def setRoot(value: ConfirmPopupPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type ConfirmPopupPassThroughType[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PassThroughType<T, ConfirmPopupPassThroughMethodOptions> */ Any
  
  trait ConfirmPopupProps extends StObject {
    
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ] = js.undefined
    
    /**
      * Label of the accept button.
      * @defaultValue Yes
      */
    var acceptLabel: js.UndefOr[String] = js.undefined
    
    /**
      * DOM element instance where the overlay panel should be mounted. Valid values are any DOM Element and 'self'. The self value is used to render a component where it is located.
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
      * Enables to hide the popup when outside is clicked.
      * @defaultValue true
      */
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Footer content of the confirm popup.
      */
    var footer: js.UndefOr[ReactNode | (js.Function1[/* options */ ConfirmPopupOptions, ReactNode])] = js.undefined
    
    /**
      * Icon to display next to the message.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ] = js.undefined
    
    /**
      * Message of the confirmation.
      */
    var message: js.UndefOr[ReactNode | (js.Function1[/* options */ ConfirmPopupOptions, ReactNode])] = js.undefined
    
    /**
      * Callback to invoke when confirm popup is hidden.
      */
    var onHide: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.undefined
    
    /**
      * Callback to invoke when overlay panel becomes visible.
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Uses to pass attributes to DOM elements inside the component.
      * @type {ConfirmPopupPassThroughOptions}
      */
    var pt: js.UndefOr[ConfirmPopupPassThroughOptions] = js.undefined
    
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ] = js.undefined
    
    /**
      * Label of the reject button.
      * @defaultValue No
      */
    var rejectLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Unique tag key used to separate the confirmPopup components in the page.
      */
    var tagKey: js.UndefOr[String] = js.undefined
    
    /**
      * Target element to align the popup.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The properties of CSSTransition can be customized, except for "nodeRef" and "in" properties.
      */
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    /**
      * Specifies the visibility of the confirm popup.
      * @defaultValue false
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ConfirmPopupProps {
    
    inline def apply(): ConfirmPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmPopupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPopupProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setAppendTo(value: self | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setFooter(value: ReactNode | (js.Function1[/* options */ ConfirmPopupOptions, ReactNode])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* options */ ConfirmPopupOptions => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ReactNode | (js.Function1[/* options */ ConfirmPopupOptions, ReactNode])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* options */ ConfirmPopupOptions => ReactNode): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnHide(value: /* result */ String => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPt(value: ConfirmPopupPassThroughOptions): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
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
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
  
  /**
    * Object returned by the {@link confirmPopup} method.
    */
  trait ConfirmPopupReturn extends StObject {
    
    /**
      * Used to hide the popup.
      */
    def hide(): Unit
    
    /**
      * Used to show the popup.
      */
    def show(): Unit
  }
  object ConfirmPopupReturn {
    
    inline def apply(hide: () => Unit, show: () => Unit): ConfirmPopupReturn = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ConfirmPopupReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPopupReturn] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ConfirmPopupState extends StObject {
    
    /**
      * Current reshow state as a boolean.
      * @defaultValue false
      */
    var reshow: Boolean
    
    /**
      * Current visible state as a boolean.
      * @defaultValue false
      */
    var visible: Boolean
  }
  object ConfirmPopupState {
    
    inline def apply(reshow: Boolean, visible: Boolean): ConfirmPopupState = {
      val __obj = js.Dynamic.literal(reshow = reshow.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmPopupState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmPopupState] (val x: Self) extends AnyVal {
      
      inline def setReshow(value: Boolean): Self = StObject.set(x, "reshow", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
