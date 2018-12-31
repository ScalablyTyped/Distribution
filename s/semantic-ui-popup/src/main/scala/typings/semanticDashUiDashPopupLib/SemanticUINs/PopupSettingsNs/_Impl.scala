package typings
package semanticDashUiDashPopupLib.SemanticUINs.PopupSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * When using on: 'hover' whether touchstart events should be added to allow the popup to be triggered
    */
  var addTouchEvents: scala.Boolean
  /**
    * When the popup surpasses the boundary of this element, it will attempt to find another display position.
    */
  var boundary: java.lang.String | semanticDashUiDashPopupLib.JQuery
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashPopupLib.SemanticUINs.PopupNs.ClassNameSettings
  /**
    * When using on: 'click' specifies whether clicking the page should close the popup
    *
    * @default true
    */
  var closable: scala.Boolean
  /**
    * Content to display
    */
  var content: java.lang.String
  /**
    * Selector or jquery object specifying where the popup should be created.
    *
    * @default 'body'
    */
  var context: java.lang.String | semanticDashUiDashPopupLib.JQuery
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Delay in milliseconds before showing or hiding a popup on hover or focus
    */
  var delay: semanticDashUiDashPopupLib.SemanticUINs.PopupNs.DelaySettings
  /**
    * Offset for distance of popup from element
    *
    * @default 0
    */
  var distanceAway: scala.Double
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashPopupLib.SemanticUINs.PopupNs.ErrorSettings
  /**
    * Whether all other popups should be hidden when this popup is opened
    *
    * @default false
    */
  var exclusive: scala.Boolean
  /**
    * Whether popup should hide on scroll or touchmove, auto only hides for popups without on: 'click'.
    * Set this to false to prevent mobile browsers from closing popups when you tap inside input fields.
    *
    * @default 'auto'
    */
  var hideOnScroll: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.auto | semanticDashUiDashPopupLib.semanticDashUiDashPopupLibNumbers.`false`
  /**
    * Whether popup should not close on hover (useful for popup navigation menus)
    *
    * @default false
    */
  var hoverable: scala.Boolean
  /**
    * HTML content to display instead of preformatted title and content
    */
  var html: java.lang.String | semanticDashUiDashPopupLib.JQuery
  /**
    * If a popup is inline it will be created next to current element, allowing for local css rules to apply.
    * It will not be removed from the DOM after being hidden.
    * Otherwise popups will appended to body and removed after being hidden.
    *
    * @default false
    */
  var `inline`: scala.Boolean
  /**
    * Number of pixels that a popup is allowed to appear outside the boundaries of its context.
    * This allows for permissible rounding errors when an element is against the edge of its context.
    *
    * @default 2
    */
  var jitter: scala.Double
  /**
    * When set to false, a popup will not appear and produce an error message if it cannot entirely fit on page.
    * Setting this to a position like, right center forces the popup to use this position as a last resort even if it is partially offstage.
    * Setting this to true will use the last attempted position.
    *
    * @default false
    */
  var lastResort: scala.Boolean | java.lang.String
  /**
    * Number of iterations before giving up search for popup position when a popup cannot fit on screen
    *
    * @default 10
    */
  var maxSearchDepth: scala.Double
  /**
    * HTML Data attributes used to store data
    */
  var metadata: semanticDashUiDashPopupLib.SemanticUINs.PopupNs.MetadataSettings
  /**
    * Whether to move popup to same offset container as target element when popup already exists on the page.
    * Using a popup inside of an element without overflow:visible, like a sidebar, may require you to set this to false
    *
    * @default true
    */
  var movePopup: scala.Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  /**
    * Whether popup should attach mutationObservers to automatically run destroy when the element is removed from the page's DOM.
    *
    * @default true
    */
  var observeChanges: scala.Boolean
  /**
    * Offset in pixels from calculated position
    *
    * @default 0
    */
  var offset: scala.Double
  /**
    * Event used to trigger popup. Can be either focus, click, hover, or manual. Manual popups must be triggered with $('.element').popup('show');
    *
    * @default 'hover'
    */
  var on: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.focus | semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.click | semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.hover | semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.manual
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // region Popup Settings
  /**
    * Can specify a DOM element that should be used as the popup. This is useful for including a pre-formatted popup.
    *
    * @default false
    */
  var popup: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibNumbers.`false` | java.lang.String | semanticDashUiDashPopupLib.JQuery
  /**
    * Position that the popup should appear
    *
    * @default 'top left'
    */
  var position: java.lang.String
  /**
    * Can be set to adjacent or opposite to prefer adjacent or opposite position if popup cannot fit on screen
    *
    * @default 'adjacent'
    */
  var prefer: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.adjacent | semanticDashUiDashPopupLib.semanticDashUiDashPopupLibStrings.opposite
  /**
    * Whether popup contents should be preserved in the page after being hidden, allowing it to re-appear slightly faster on subsequent loads.
    *
    * @default false
    */
  var preserve: scala.Boolean
  /**
    * Will automatically hide a popup on scroll event in this context
    */
  var scrollContext: java.lang.String | semanticDashUiDashPopupLib.JQuery
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: semanticDashUiDashPopupLib.SemanticUINs.PopupNs.SelectorSettings
  /**
    * Whether popup should set fluid popup variation width on load to avoid width: 100% including padding
    *
    * @default true
    */
  var setFluidWidth: scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * If a selector or jQuery object is specified this allows the popup to be positioned relative to that element.
    *
    * @default false
    */
  var target: semanticDashUiDashPopupLib.semanticDashUiDashPopupLibNumbers.`false` | java.lang.String | semanticDashUiDashPopupLib.JQuery
  /**
    * Title to display alongside content
    */
  var title: java.lang.String
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'slide down'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: java.lang.String
  // endregion
  // region Content Settings
  /**
    * Popup variation to use, can use multiple variations with a space delimiter
    */
  var variation: java.lang.String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  // endregion
  // region Callbacks
  /**
    * Callback on popup element creation, with created popup
    */
  def onCreate(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): scala.Unit
  /**
    * Callback after popup is hidden
    */
  def onHidden(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): scala.Unit
  /**
    * Callback before popup is hidden. Returning false from this callback will cancel the popup from hiding.
    */
  def onHide(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): semanticDashUiDashPopupLib.semanticDashUiDashPopupLibNumbers.`false` | scala.Unit
  /**
    * Callback immediately before Popup is removed from DOM
    */
  def onRemove(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): scala.Unit
  /**
    * Callback before popup is shown. Returning false from this callback will cancel the popup from showing.
    */
  def onShow(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): semanticDashUiDashPopupLib.semanticDashUiDashPopupLibNumbers.`false` | scala.Unit
  /**
    * Callback after popup cannot be placed on screen
    */
  def onUnplaceable(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): scala.Unit
  /**
    * Callback after popup is shown
    */
  def onVisible(`this`: semanticDashUiDashPopupLib.JQuery, $module: semanticDashUiDashPopupLib.JQuery): scala.Unit
}

