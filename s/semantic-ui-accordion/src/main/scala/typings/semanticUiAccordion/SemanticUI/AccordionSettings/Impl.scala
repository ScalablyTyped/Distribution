package typings.semanticUiAccordion.SemanticUI.AccordionSettings

import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * Whether child content opacity should be animated (may cause performance issues with many child elements)
    *
    * @default true
    */
  var animateChildren: Boolean = js.native
  
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings = js.native
  
  /**
    * Close open nested accordion content when an element closes
    *
    * @default true
    */
  var closeNested: Boolean = js.native
  
  /**
    * Allow active sections to collapse
    *
    * @default true
    */
  var collapsible: Boolean = js.native
  
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  
  /**
    * Duration in ms of opening animation
    *
    * @default 500
    */
  var duration: Double = js.native
  
  /**
    * Easing of opening animation. EaseInOutQuint is included with accordion, for additional options you must include easing equations.
    *
    * @default 'easeInOutQuint'
    * @see {@link http://gsgd.co.uk/sandbox/jquery/easing/}
    */
  var easing: String = js.native
  
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  
  // region Behavior
  /**
    * Only allow one section open at a time
    *
    * @default true
    */
  var exclusive: Boolean = js.native
  
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
    * whether accordion should automatically refresh on DOM insertion
    *
    * @default true
    */
  var observeChanges: Boolean = js.native
  
  /**
    * Event on title that will cause accordion to open
    *
    * @default 'click'
    */
  var on: String = js.native
  
  /**
    * Callback on element open or close
    */
  def onChange(): Unit = js.native
  
  /**
    * Callback after element is closed
    */
  def onClose(): Unit = js.native
  
  /**
    * Callback before element closes
    */
  def onClosing(): Unit = js.native
  
  /**
    * Callback after element is open
    */
  def onOpen(): Unit = js.native
  
  // endregion
  // region Callbacks
  /**
    * Callback before element opens
    */
  def onOpening(): Unit = js.native
  
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  
  // endregion
  // region DOM Settings
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    animateChildren: Boolean,
    className: ClassNameSettings,
    closeNested: Boolean,
    collapsible: Boolean,
    debug: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    exclusive: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    on: String,
    onChange: () => Unit,
    onClose: () => Unit,
    onClosing: () => Unit,
    onOpen: () => Unit,
    onOpening: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeNested = closeNested.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), onClosing = js.Any.fromFunction0(onClosing), onOpen = js.Any.fromFunction0(onOpen), onOpening = js.Any.fromFunction0(onOpening), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
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
    def setAnimateChildren(value: Boolean): Self = this.set("animateChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseNested(value: Boolean): Self = this.set("closeNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClosing(value: () => Unit): Self = this.set("onClosing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpening(value: () => Unit): Self = this.set("onOpening", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
