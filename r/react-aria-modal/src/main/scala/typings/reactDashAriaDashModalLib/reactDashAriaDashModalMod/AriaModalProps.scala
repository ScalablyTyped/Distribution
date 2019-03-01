package typings
package reactDashAriaDashModalLib.reactDashAriaDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaModalProps extends js.Object {
  /**
    * If true, the modal will receive a role of alertdialog,
    * instead of its default dialog.
    */
  var alert: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provide your main application node here (which the modal should
    * render outside of), and when the modal is open this application
    * node will receive the attribute `aria-hidden="true"`.
    * This can help screen readers understand what's going on.
    */
  var applicationNode: js.UndefOr[stdLib.Node | reactLib.Element] = js.undefined
  /**
    * Apply a class to the dialog in order to custom-style it.
    *
    * Be aware that, _by default_, this module does apply various
    * inline styles to the dialog element in order position it.
    * To disable _all inline styles_, see `includeDefaultStyles`.
    */
  var dialogClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Choose your own id attribute for the dialog element.
    *
    * Default: `react-aria-modal-dialog`.
    */
  var dialogId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customize properties of the style prop that is passed to the dialog.
    */
  var dialogStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * By default, the Escape key exits the modal. Pass `false`, and it won't.
    */
  var escapeExits: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. However, if `focusDialog` is true, the dialog itself
    * will receive initial focus — and that focus will be hidden.
    * (This is essentially what Bootstrap does with their modal.)
    */
  var focusDialog: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Same as `applicationNode`, but a function that returns the node
    * instead of the node itself. This can be useful or necessary in
    * a variety of situations, one of which is server-side React
    * rendering. The function will not be called until after the
    * component mounts, so it is safe to use browser globals
    * and refer to DOM nodes within it (e.g. `document.getElementById(..)`),
    * without ruining your server-side rendering.
    */
  var getApplicationNode: js.UndefOr[js.Function0[stdLib.Node | reactLib.Element]] = js.undefined
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
  var includeDefaultStyles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, when the modal activates its first focusable child will
    * receive focus. If, instead, you want to identify a specific element
    * that should receive initial focus, pass a selector string to this
    * prop. (That selector is passed to `document.querySelector()` to find
    * the DOM node.)
    */
  var initialFocus: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, the modal is active when mounted, deactivated when unmounted.
    * However, you can also control its active/inactive state by changing
    * its mounted property instead.
    */
  var mounted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This function is called in the modal's `componentDidMount()` lifecycle method.
    * You can use it to do whatever diverse and sundry things you feel like
    * doing after the modal activates.
    */
  var onEnter: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * The `id` of the element that should be used as the modal's accessible
    * title. This value is passed to the modal's `aria-labelledby` attribute.
    * You must use either `titleId` or `titleText`, but not both.
    */
  var titleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string to use as the modal's accessible title. This value is passed
    * to the modal's `aria-label` attribute. You must use either `titleId` or
    * `titleText`, but not both.
    */
  var titleText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Apply a class to the underlay in order to custom-style it.
    * This module does apply various inline styles, though, so be aware that
    * overriding some styles might be difficult. If, for example, you want
    * to change the underlay's color, you should probably use the
    * `underlayColor` prop instead of a class.
    * If you would rather control all CSS, see `includeDefaultStyles`.
    */
  var underlayClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, a click on the underlay will exit the modal.
    * Pass `false`, and clicking on the underlay will do nothing.
    */
  var underlayClickExits: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you want to change the underlay's color, you can
    * do that with this prop. If `false`, no background color will be
    * applied with inline styles. Presumably you will apply then
    * yourself via an `underlayClass`.
    *
    * Default: rgba(0,0,0,0.5)
    */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customize properties of the `style` prop that is passed to the underlay.
    * The best way to add some vertical displacement to the dialog is to add
    * top & bottom padding to the underlay.
    * This is illustrated in the demo examples.
    */
  var underlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * If `true`, the modal's contents will be vertically (as well as horizontally) centered.
    */
  var verticallyCenter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This function needs to handles the state change of exiting (or deactivating) the modal.
    * Maybe it's just a wrapper around `setState()`; or maybe you use some more involved
    * Flux-inspired state management — whatever the case, this module leaves the state
    * management up to you instead of making assumptions.
    * That also makes it easier to create your own "close modal" buttons; because you
    * have the function that closes the modal right there, written by you, at your disposal.
    */
  def onExit(): js.Any
}

object AriaModalProps {
  @scala.inline
  def apply(
    onExit: js.Function0[js.Any],
    alert: js.UndefOr[scala.Boolean] = js.undefined,
    applicationNode: stdLib.Node | reactLib.Element = null,
    dialogClass: java.lang.String = null,
    dialogId: java.lang.String = null,
    dialogStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    escapeExits: js.UndefOr[scala.Boolean] = js.undefined,
    focusDialog: js.UndefOr[scala.Boolean] = js.undefined,
    getApplicationNode: js.Function0[stdLib.Node | reactLib.Element] = null,
    includeDefaultStyles: js.UndefOr[scala.Boolean] = js.undefined,
    initialFocus: java.lang.String = null,
    mounted: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: js.Function0[_] = null,
    titleId: java.lang.String = null,
    titleText: java.lang.String = null,
    underlayClass: java.lang.String = null,
    underlayClickExits: js.UndefOr[scala.Boolean] = js.undefined,
    underlayColor: java.lang.String = null,
    underlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    verticallyCenter: js.UndefOr[scala.Boolean] = js.undefined
  ): AriaModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onExit")(onExit)
    if (!js.isUndefined(alert)) __obj.updateDynamic("alert")(alert)
    if (applicationNode != null) __obj.updateDynamic("applicationNode")(applicationNode.asInstanceOf[js.Any])
    if (dialogClass != null) __obj.updateDynamic("dialogClass")(dialogClass)
    if (dialogId != null) __obj.updateDynamic("dialogId")(dialogId)
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle)
    if (!js.isUndefined(escapeExits)) __obj.updateDynamic("escapeExits")(escapeExits)
    if (!js.isUndefined(focusDialog)) __obj.updateDynamic("focusDialog")(focusDialog)
    if (getApplicationNode != null) __obj.updateDynamic("getApplicationNode")(getApplicationNode)
    if (!js.isUndefined(includeDefaultStyles)) __obj.updateDynamic("includeDefaultStyles")(includeDefaultStyles)
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus)
    if (!js.isUndefined(mounted)) __obj.updateDynamic("mounted")(mounted)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (titleId != null) __obj.updateDynamic("titleId")(titleId)
    if (titleText != null) __obj.updateDynamic("titleText")(titleText)
    if (underlayClass != null) __obj.updateDynamic("underlayClass")(underlayClass)
    if (!js.isUndefined(underlayClickExits)) __obj.updateDynamic("underlayClickExits")(underlayClickExits)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    if (underlayStyle != null) __obj.updateDynamic("underlayStyle")(underlayStyle)
    if (!js.isUndefined(verticallyCenter)) __obj.updateDynamic("verticallyCenter")(verticallyCenter)
    __obj.asInstanceOf[AriaModalProps]
  }
}

