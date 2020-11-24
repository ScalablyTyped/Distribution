package typings.reactAriaModal.mod

import typings.react.mod.CSSProperties
import typings.reactAriaModal.reactAriaModalBooleans.`false`
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaModalProps extends js.Object {
  
  /**
    * If true, the modal will receive a role of alertdialog,
    * instead of its default dialog.
    */
  var alert: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide your main application node here (which the modal should
    * render outside of), and when the modal is open this application
    * node will receive the attribute `aria-hidden="true"`.
    * This can help screen readers understand what's going on.
    */
  var applicationNode: js.UndefOr[Node | Element] = js.native
  
  /**
    * Apply a class to the dialog in order to custom-style it.
    *
    * Be aware that, _by default_, this module does apply various
    * inline styles to the dialog element in order position it.
    * To disable _all inline styles_, see `includeDefaultStyles`.
    */
  var dialogClass: js.UndefOr[String] = js.native
  
  /**
    * Choose your own id attribute for the dialog element.
    *
    * Default: `react-aria-modal-dialog`.
    */
  var dialogId: js.UndefOr[String] = js.native
  
  /**
    * Customize properties of the style prop that is passed to the dialog.
    */
  var dialogStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * By default, the Escape key exits the modal. Pass `false`, and it won't.
    */
  var escapeExits: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. However, if `focusDialog` is true, the dialog itself
    * will receive initial focus — and that focus will be hidden.
    * (This is essentially what Bootstrap does with their modal.)
    */
  var focusDialog: js.UndefOr[Boolean] = js.native
  
  /**
    * Customize properties of the focusTrapOptions prop that is passed to the modal dialog's focus trap.
    * For example, you can use this prop if you need better control of where focus is returned.
    */
  var focusTrapOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * If true, the modal dialog's focus trap will be paused.
    * You won't typically need to use this prop. It used to be that the typical reason for pausing a focus trap was to enable nested focus traps;
    * but as of focus-trap v4, the pausing and unpausing of hierachical traps is handled automatically.
    */
  var focusTrapPaused: js.UndefOr[Boolean] = js.native
  
  /**
    * Same as `applicationNode`, but a function that returns the node
    * instead of the node itself. This can be useful or necessary in
    * a variety of situations, one of which is server-side React
    * rendering. The function will not be called until after the
    * component mounts, so it is safe to use browser globals
    * and refer to DOM nodes within it (e.g. `document.getElementById(..)`),
    * without ruining your server-side rendering.
    */
  var getApplicationNode: js.UndefOr[js.Function0[Node | Element]] = js.native
  
  /**
    * By default, styles are applied inline to the dialog and underlay
    * portions of the component. However, you can disable all inline
    * styles by setting `includeDefaultStyles` to false. If set, you
    * must specify all styles externally, including positioning.
    * This is helpful if your project uses external CSS assets.
    *
    * _Note_: underlayStyle and dialogStyle can still be set inline,
    * but these will be the only styles applied.
    */
  var includeDefaultStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. If, instead, you want to identify a specific element
    * that should receive initial focus, pass a selector string to this
    * prop. (That selector is passed to `document.querySelector()` to find
    * the DOM node.)
    */
  var initialFocus: js.UndefOr[String] = js.native
  
  /**
    * By default, the modal is active when mounted, deactivated when unmounted.
    * However, you can also control its active/inactive state by changing
    * its mounted property instead.
    */
  var mounted: js.UndefOr[Boolean] = js.native
  
  /**
    * This function is called in the modal's `componentDidMount()` lifecycle method.
    * You can use it to do whatever diverse and sundry things you feel like
    * doing after the modal activates.
    */
  var onEnter: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * This function needs to handles the state change of exiting (or deactivating) the modal.
    * Maybe it's just a wrapper around `setState()`; or maybe you use some more involved
    * Flux-inspired state management — whatever the case, this module leaves the state
    * management up to you instead of making assumptions.
    * That also makes it easier to create your own "close modal" buttons; because you
    * have the function that closes the modal right there, written by you, at your disposal.
    */
  var onExit: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * If true, the modal dialog will prevent any scrolling behind the modal window.
    */
  var scrollDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The `id` of the element that should be used as the modal's accessible
    * title. This value is passed to the modal's `aria-labelledby` attribute.
    * You must use either `titleId` or `titleText`, but not both.
    */
  var titleId: js.UndefOr[String] = js.native
  
  /**
    * A string to use as the modal's accessible title. This value is passed
    * to the modal's `aria-label` attribute. You must use either `titleId` or
    * `titleText`, but not both.
    */
  var titleText: js.UndefOr[String] = js.native
  
  /**
    * Apply a class to the underlay in order to custom-style it.
    * This module does apply various inline styles, though, so be aware that
    * overriding some styles might be difficult. If, for example, you want
    * to change the underlay's color, you should probably use the
    * `underlayColor` prop instead of a class.
    * If you would rather control all CSS, see `includeDefaultStyles`.
    */
  var underlayClass: js.UndefOr[String] = js.native
  
  /**
    * By default, a click on the underlay will exit the modal.
    * Pass `false`, and clicking on the underlay will do nothing.
    */
  var underlayClickExits: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want to change the underlay's color, you can
    * do that with this prop. If `false`, no background color will be
    * applied with inline styles. Presumably you will apply then
    * yourself via an `underlayClass`.
    *
    * Default: rgba(0,0,0,0.5)
    */
  var underlayColor: js.UndefOr[String | `false`] = js.native
  
  /**
    * Customize properties of the `style` prop that is passed to the underlay.
    * The best way to add some vertical displacement to the dialog is to add
    * top & bottom padding to the underlay.
    * This is illustrated in the demo examples.
    */
  var underlayStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * If `true`, the modal's contents will be vertically (as well as horizontally) centered.
    */
  var verticallyCenter: js.UndefOr[Boolean] = js.native
}
object AriaModalProps {
  
  @scala.inline
  def apply(): AriaModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaModalProps]
  }
  
  @scala.inline
  implicit class AriaModalPropsOps[Self <: AriaModalProps] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: Boolean): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setApplicationNode(value: Node | Element): Self = this.set("applicationNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationNode: Self = this.set("applicationNode", js.undefined)
    
    @scala.inline
    def setDialogClass(value: String): Self = this.set("dialogClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogClass: Self = this.set("dialogClass", js.undefined)
    
    @scala.inline
    def setDialogId(value: String): Self = this.set("dialogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogId: Self = this.set("dialogId", js.undefined)
    
    @scala.inline
    def setDialogStyle(value: CSSProperties): Self = this.set("dialogStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogStyle: Self = this.set("dialogStyle", js.undefined)
    
    @scala.inline
    def setEscapeExits(value: Boolean): Self = this.set("escapeExits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeExits: Self = this.set("escapeExits", js.undefined)
    
    @scala.inline
    def setFocusDialog(value: Boolean): Self = this.set("focusDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusDialog: Self = this.set("focusDialog", js.undefined)
    
    @scala.inline
    def setFocusTrapOptions(value: js.Object): Self = this.set("focusTrapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTrapOptions: Self = this.set("focusTrapOptions", js.undefined)
    
    @scala.inline
    def setFocusTrapPaused(value: Boolean): Self = this.set("focusTrapPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTrapPaused: Self = this.set("focusTrapPaused", js.undefined)
    
    @scala.inline
    def setGetApplicationNode(value: () => Node | Element): Self = this.set("getApplicationNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetApplicationNode: Self = this.set("getApplicationNode", js.undefined)
    
    @scala.inline
    def setIncludeDefaultStyles(value: Boolean): Self = this.set("includeDefaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDefaultStyles: Self = this.set("includeDefaultStyles", js.undefined)
    
    @scala.inline
    def setInitialFocus(value: String): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFocus: Self = this.set("initialFocus", js.undefined)
    
    @scala.inline
    def setMounted(value: Boolean): Self = this.set("mounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMounted: Self = this.set("mounted", js.undefined)
    
    @scala.inline
    def setOnEnter(value: () => _): Self = this.set("onEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnExit(value: () => _): Self = this.set("onExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setScrollDisabled(value: Boolean): Self = this.set("scrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDisabled: Self = this.set("scrollDisabled", js.undefined)
    
    @scala.inline
    def setTitleId(value: String): Self = this.set("titleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleId: Self = this.set("titleId", js.undefined)
    
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
    
    @scala.inline
    def setUnderlayClass(value: String): Self = this.set("underlayClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayClass: Self = this.set("underlayClass", js.undefined)
    
    @scala.inline
    def setUnderlayClickExits(value: Boolean): Self = this.set("underlayClickExits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayClickExits: Self = this.set("underlayClickExits", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: String | `false`): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    
    @scala.inline
    def setUnderlayStyle(value: CSSProperties): Self = this.set("underlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayStyle: Self = this.set("underlayStyle", js.undefined)
    
    @scala.inline
    def setVerticallyCenter(value: Boolean): Self = this.set("verticallyCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticallyCenter: Self = this.set("verticallyCenter", js.undefined)
  }
}
