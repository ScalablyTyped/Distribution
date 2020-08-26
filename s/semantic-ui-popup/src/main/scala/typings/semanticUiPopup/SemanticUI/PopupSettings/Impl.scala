package typings.semanticUiPopup.SemanticUI.PopupSettings

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.auto
import typings.semanticUiPopup.semanticUiPopupStrings.click
import typings.semanticUiPopup.semanticUiPopupStrings.focus
import typings.semanticUiPopup.semanticUiPopupStrings.hover
import typings.semanticUiPopup.semanticUiPopupStrings.manual
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * When using on: 'hover' whether touchstart events should be added to allow the popup to be triggered
    */
  var addTouchEvents: Boolean = js.native
  /**
    * When the popup surpasses the boundary of this element, it will attempt to find another display position.
    */
  var boundary: String | JQuery = js.native
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * When using on: 'click' specifies whether clicking the page should close the popup
    *
    * @default true
    */
  var closable: Boolean = js.native
  /**
    * Content to display
    */
  var content: String = js.native
  /**
    * Selector or jquery object specifying where the popup should be created.
    *
    * @default 'body'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Delay in milliseconds before showing or hiding a popup on hover or focus
    */
  var delay: DelaySettings = js.native
  /**
    * Offset for distance of popup from element
    *
    * @default 0
    */
  var distanceAway: Double = js.native
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether all other popups should be hidden when this popup is opened
    *
    * @default false
    */
  var exclusive: Boolean = js.native
  /**
    * Whether popup should hide on scroll or touchmove, auto only hides for popups without on: 'click'.
    * Set this to false to prevent mobile browsers from closing popups when you tap inside input fields.
    *
    * @default 'auto'
    */
  var hideOnScroll: auto | `false` = js.native
  /**
    * Whether popup should not close on hover (useful for popup navigation menus)
    *
    * @default false
    */
  var hoverable: Boolean = js.native
  /**
    * HTML content to display instead of preformatted title and content
    */
  var html: String | JQuery = js.native
  /**
    * If a popup is inline it will be created next to current element, allowing for local css rules to apply.
    * It will not be removed from the DOM after being hidden.
    * Otherwise popups will appended to body and removed after being hidden.
    *
    * @default false
    */
  var `inline`: Boolean = js.native
  /**
    * Number of pixels that a popup is allowed to appear outside the boundaries of its context.
    * This allows for permissible rounding errors when an element is against the edge of its context.
    *
    * @default 2
    */
  var jitter: Double = js.native
  /**
    * When set to false, a popup will not appear and produce an error message if it cannot entirely fit on page.
    * Setting this to a position like, right center forces the popup to use this position as a last resort even if it is partially offstage.
    * Setting this to true will use the last attempted position.
    *
    * @default false
    */
  var lastResort: Boolean | String = js.native
  /**
    * Number of iterations before giving up search for popup position when a popup cannot fit on screen
    *
    * @default 10
    */
  var maxSearchDepth: Double = js.native
  /**
    * HTML Data attributes used to store data
    */
  var metadata: MetadataSettings = js.native
  /**
    * Whether to move popup to same offset container as target element when popup already exists on the page.
    * Using a popup inside of an element without overflow:visible, like a sidebar, may require you to set this to false
    *
    * @default true
    */
  var movePopup: Boolean = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Whether popup should attach mutationObservers to automatically run destroy when the element is removed from the page's DOM.
    *
    * @default true
    */
  var observeChanges: Boolean = js.native
  /**
    * Offset in pixels from calculated position
    *
    * @default 0
    */
  var offset: Double = js.native
  /**
    * Event used to trigger popup. Can be either focus, click, hover, or manual. Manual popups must be triggered with $('.element').popup('show');
    *
    * @default 'hover'
    */
  var on: focus | click | hover | manual = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // region Popup Settings
  /**
    * Can specify a DOM element that should be used as the popup. This is useful for including a pre-formatted popup.
    *
    * @default false
    */
  var popup: `false` | String | JQuery = js.native
  /**
    * Position that the popup should appear
    *
    * @default 'top left'
    */
  var position: String = js.native
  /**
    * Can be set to adjacent or opposite to prefer adjacent or opposite position if popup cannot fit on screen
    *
    * @default 'adjacent'
    */
  var prefer: adjacent | opposite = js.native
  /**
    * Whether popup contents should be preserved in the page after being hidden, allowing it to re-appear slightly faster on subsequent loads.
    *
    * @default false
    */
  var preserve: Boolean = js.native
  /**
    * Will automatically hide a popup on scroll event in this context
    */
  var scrollContext: String | JQuery = js.native
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: SelectorSettings = js.native
  /**
    * Whether popup should set fluid popup variation width on load to avoid width: 100% including padding
    *
    * @default true
    */
  var setFluidWidth: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * If a selector or jQuery object is specified this allows the popup to be positioned relative to that element.
    *
    * @default false
    */
  var target: `false` | String | JQuery = js.native
  /**
    * Title to display alongside content
    */
  var title: String = js.native
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'slide down'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  // endregion
  // region Content Settings
  /**
    * Popup variation to use, can use multiple variations with a space delimiter
    */
  var variation: String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on popup element creation, with created popup
    */
  def onCreate($module: JQuery): Unit = js.native
  /**
    * Callback after popup is hidden
    */
  def onHidden($module: JQuery): Unit = js.native
  /**
    * Callback before popup is hidden. Returning false from this callback will cancel the popup from hiding.
    */
  def onHide($module: JQuery): `false` | Unit = js.native
  /**
    * Callback immediately before Popup is removed from DOM
    */
  def onRemove($module: JQuery): Unit = js.native
  /**
    * Callback before popup is shown. Returning false from this callback will cancel the popup from showing.
    */
  def onShow($module: JQuery): `false` | Unit = js.native
  /**
    * Callback after popup cannot be placed on screen
    */
  def onUnplaceable($module: JQuery): Unit = js.native
  /**
    * Callback after popup is shown
    */
  def onVisible($module: JQuery): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    addTouchEvents: Boolean,
    boundary: String | JQuery,
    className: ClassNameSettings,
    closable: Boolean,
    content: String,
    context: String | JQuery,
    debug: Boolean,
    delay: DelaySettings,
    distanceAway: Double,
    duration: Double,
    error: ErrorSettings,
    exclusive: Boolean,
    hideOnScroll: auto | `false`,
    hoverable: Boolean,
    html: String | JQuery,
    `inline`: Boolean,
    jitter: Double,
    lastResort: Boolean | String,
    maxSearchDepth: Double,
    metadata: MetadataSettings,
    movePopup: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    on: focus | click | hover | manual,
    onCreate: JQuery => Unit,
    onHidden: JQuery => Unit,
    onHide: JQuery => `false` | Unit,
    onRemove: JQuery => Unit,
    onShow: JQuery => `false` | Unit,
    onUnplaceable: JQuery => Unit,
    onVisible: JQuery => Unit,
    performance: Boolean,
    popup: `false` | String | JQuery,
    position: String,
    prefer: adjacent | opposite,
    preserve: Boolean,
    scrollContext: String | JQuery,
    selector: SelectorSettings,
    setFluidWidth: Boolean,
    silent: Boolean,
    target: `false` | String | JQuery,
    title: String,
    transition: String,
    variation: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], distanceAway = distanceAway.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], hideOnScroll = hideOnScroll.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], lastResort = lastResort.asInstanceOf[js.Any], maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], movePopup = movePopup.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1(onCreate), onHidden = js.Any.fromFunction1(onHidden), onHide = js.Any.fromFunction1(onHide), onRemove = js.Any.fromFunction1(onRemove), onShow = js.Any.fromFunction1(onShow), onUnplaceable = js.Any.fromFunction1(onUnplaceable), onVisible = js.Any.fromFunction1(onVisible), performance = performance.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prefer = prefer.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], setFluidWidth = setFluidWidth.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setAddTouchEvents(value: Boolean): Self = this.set("addTouchEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundary(value: String | JQuery): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: DelaySettings): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceAway(value: Double): Self = this.set("distanceAway", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideOnScroll(value: auto | `false`): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String | JQuery): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastResort(value: Boolean | String): Self = this.set("lastResort", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSearchDepth(value: Double): Self = this.set("maxSearchDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovePopup(value: Boolean): Self = this.set("movePopup", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: focus | click | hover | manual): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCreate(value: JQuery => Unit): Self = this.set("onCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHidden(value: JQuery => Unit): Self = this.set("onHidden", js.Any.fromFunction1(value))
    @scala.inline
    def setOnHide(value: JQuery => `false` | Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRemove(value: JQuery => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnShow(value: JQuery => `false` | Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUnplaceable(value: JQuery => Unit): Self = this.set("onUnplaceable", js.Any.fromFunction1(value))
    @scala.inline
    def setOnVisible(value: JQuery => Unit): Self = this.set("onVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopup(value: `false` | String | JQuery): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefer(value: adjacent | opposite): Self = this.set("prefer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollContext(value: String | JQuery): Self = this.set("scrollContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFluidWidth(value: Boolean): Self = this.set("setFluidWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: `false` | String | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariation(value: String): Self = this.set("variation", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

