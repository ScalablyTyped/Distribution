package typings.reactAriaModal.mod

import typings.react.mod.CSSProperties
import typings.reactAriaModal.reactAriaModalBooleans.`false`
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaModalProps extends js.Object {
  /**
    * If true, the modal will receive a role of alertdialog,
    * instead of its default dialog.
    */
  var alert: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide your main application node here (which the modal should
    * render outside of), and when the modal is open this application
    * node will receive the attribute `aria-hidden="true"`.
    * This can help screen readers understand what's going on.
    */
  var applicationNode: js.UndefOr[Node | Element] = js.undefined
  /**
    * Apply a class to the dialog in order to custom-style it.
    *
    * Be aware that, _by default_, this module does apply various
    * inline styles to the dialog element in order position it.
    * To disable _all inline styles_, see `includeDefaultStyles`.
    */
  var dialogClass: js.UndefOr[String] = js.undefined
  /**
    * Choose your own id attribute for the dialog element.
    *
    * Default: `react-aria-modal-dialog`.
    */
  var dialogId: js.UndefOr[String] = js.undefined
  /**
    * Customize properties of the style prop that is passed to the dialog.
    */
  var dialogStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * By default, the Escape key exits the modal. Pass `false`, and it won't.
    */
  var escapeExits: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. However, if `focusDialog` is true, the dialog itself
    * will receive initial focus — and that focus will be hidden.
    * (This is essentially what Bootstrap does with their modal.)
    */
  var focusDialog: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize properties of the focusTrapOptions prop that is passed to the modal dialog's focus trap.
    * For example, you can use this prop if you need better control of where focus is returned.
    */
  var focusTrapOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * If true, the modal dialog's focus trap will be paused.
    * You won't typically need to use this prop. It used to be that the typical reason for pausing a focus trap was to enable nested focus traps;
    * but as of focus-trap v4, the pausing and unpausing of hierachical traps is handled automatically.
    */
  var focusTrapPaused: js.UndefOr[Boolean] = js.undefined
  /**
    * Same as `applicationNode`, but a function that returns the node
    * instead of the node itself. This can be useful or necessary in
    * a variety of situations, one of which is server-side React
    * rendering. The function will not be called until after the
    * component mounts, so it is safe to use browser globals
    * and refer to DOM nodes within it (e.g. `document.getElementById(..)`),
    * without ruining your server-side rendering.
    */
  var getApplicationNode: js.UndefOr[js.Function0[Node | Element]] = js.undefined
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
  var includeDefaultStyles: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. If, instead, you want to identify a specific element
    * that should receive initial focus, pass a selector string to this
    * prop. (That selector is passed to `document.querySelector()` to find
    * the DOM node.)
    */
  var initialFocus: js.UndefOr[String] = js.undefined
  /**
    * By default, the modal is active when mounted, deactivated when unmounted.
    * However, you can also control its active/inactive state by changing
    * its mounted property instead.
    */
  var mounted: js.UndefOr[Boolean] = js.undefined
  /**
    * This function is called in the modal's `componentDidMount()` lifecycle method.
    * You can use it to do whatever diverse and sundry things you feel like
    * doing after the modal activates.
    */
  var onEnter: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * This function needs to handles the state change of exiting (or deactivating) the modal.
    * Maybe it's just a wrapper around `setState()`; or maybe you use some more involved
    * Flux-inspired state management — whatever the case, this module leaves the state
    * management up to you instead of making assumptions.
    * That also makes it easier to create your own "close modal" buttons; because you
    * have the function that closes the modal right there, written by you, at your disposal.
    */
  var onExit: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * If true, the modal dialog will prevent any scrolling behind the modal window.
    */
  var scrollDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The `id` of the element that should be used as the modal's accessible
    * title. This value is passed to the modal's `aria-labelledby` attribute.
    * You must use either `titleId` or `titleText`, but not both.
    */
  var titleId: js.UndefOr[String] = js.undefined
  /**
    * A string to use as the modal's accessible title. This value is passed
    * to the modal's `aria-label` attribute. You must use either `titleId` or
    * `titleText`, but not both.
    */
  var titleText: js.UndefOr[String] = js.undefined
  /**
    * Apply a class to the underlay in order to custom-style it.
    * This module does apply various inline styles, though, so be aware that
    * overriding some styles might be difficult. If, for example, you want
    * to change the underlay's color, you should probably use the
    * `underlayColor` prop instead of a class.
    * If you would rather control all CSS, see `includeDefaultStyles`.
    */
  var underlayClass: js.UndefOr[String] = js.undefined
  /**
    * By default, a click on the underlay will exit the modal.
    * Pass `false`, and clicking on the underlay will do nothing.
    */
  var underlayClickExits: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to change the underlay's color, you can
    * do that with this prop. If `false`, no background color will be
    * applied with inline styles. Presumably you will apply then
    * yourself via an `underlayClass`.
    *
    * Default: rgba(0,0,0,0.5)
    */
  var underlayColor: js.UndefOr[String | `false`] = js.undefined
  /**
    * Customize properties of the `style` prop that is passed to the underlay.
    * The best way to add some vertical displacement to the dialog is to add
    * top & bottom padding to the underlay.
    * This is illustrated in the demo examples.
    */
  var underlayStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * If `true`, the modal's contents will be vertically (as well as horizontally) centered.
    */
  var verticallyCenter: js.UndefOr[Boolean] = js.undefined
}

object AriaModalProps {
  @scala.inline
  def apply(
    alert: js.UndefOr[Boolean] = js.undefined,
    applicationNode: Node | Element = null,
    dialogClass: String = null,
    dialogId: String = null,
    dialogStyle: CSSProperties = null,
    escapeExits: js.UndefOr[Boolean] = js.undefined,
    focusDialog: js.UndefOr[Boolean] = js.undefined,
    focusTrapOptions: js.Object = null,
    focusTrapPaused: js.UndefOr[Boolean] = js.undefined,
    getApplicationNode: () => Node | Element = null,
    includeDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    initialFocus: String = null,
    mounted: js.UndefOr[Boolean] = js.undefined,
    onEnter: () => _ = null,
    onExit: () => _ = null,
    scrollDisabled: js.UndefOr[Boolean] = js.undefined,
    titleId: String = null,
    titleText: String = null,
    underlayClass: String = null,
    underlayClickExits: js.UndefOr[Boolean] = js.undefined,
    underlayColor: String | `false` = null,
    underlayStyle: CSSProperties = null,
    verticallyCenter: js.UndefOr[Boolean] = js.undefined
  ): AriaModalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (applicationNode != null) __obj.updateDynamic("applicationNode")(applicationNode.asInstanceOf[js.Any])
    if (dialogClass != null) __obj.updateDynamic("dialogClass")(dialogClass.asInstanceOf[js.Any])
    if (dialogId != null) __obj.updateDynamic("dialogId")(dialogId.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeExits)) __obj.updateDynamic("escapeExits")(escapeExits.asInstanceOf[js.Any])
    if (!js.isUndefined(focusDialog)) __obj.updateDynamic("focusDialog")(focusDialog.asInstanceOf[js.Any])
    if (focusTrapOptions != null) __obj.updateDynamic("focusTrapOptions")(focusTrapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusTrapPaused)) __obj.updateDynamic("focusTrapPaused")(focusTrapPaused.asInstanceOf[js.Any])
    if (getApplicationNode != null) __obj.updateDynamic("getApplicationNode")(js.Any.fromFunction0(getApplicationNode))
    if (!js.isUndefined(includeDefaultStyles)) __obj.updateDynamic("includeDefaultStyles")(includeDefaultStyles.asInstanceOf[js.Any])
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(mounted)) __obj.updateDynamic("mounted")(mounted.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction0(onEnter))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction0(onExit))
    if (!js.isUndefined(scrollDisabled)) __obj.updateDynamic("scrollDisabled")(scrollDisabled.asInstanceOf[js.Any])
    if (titleId != null) __obj.updateDynamic("titleId")(titleId.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    if (underlayClass != null) __obj.updateDynamic("underlayClass")(underlayClass.asInstanceOf[js.Any])
    if (!js.isUndefined(underlayClickExits)) __obj.updateDynamic("underlayClickExits")(underlayClickExits.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (underlayStyle != null) __obj.updateDynamic("underlayStyle")(underlayStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(verticallyCenter)) __obj.updateDynamic("verticallyCenter")(verticallyCenter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaModalProps]
  }
}

