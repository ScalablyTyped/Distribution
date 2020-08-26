package typings.semanticUiNag.SemanticUI.NagSettings

import typings.semanticUiNag.JQuery
import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typings.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typings.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typings.semanticUiNag.semanticUiNagBooleans.`false`
import typings.semanticUiNag.semanticUiNagStrings.cookie
import typings.semanticUiNag.semanticUiNagStrings.localstorage
import typings.semanticUiNag.semanticUiNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  var animation: AnimationSettings = js.native
  // endregion
  // region DOM Settings
  var className: ClassNameSettings = js.native
  /**
    * @default false
    */
  var context: `false` | String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * @default false
    */
  var detachable: Boolean = js.native
  /**
    * set to zero to require manually dismissal, otherwise hides on its own
    *
    * @default 0
    */
  var displayTime: Double = js.native
  /**
    * @default false
    */
  var domain: `false` | String = js.native
  /**
    * @default 'easeOutQuad'
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * @default 30
    */
  var expires: Double = js.native
  /**
    * @default 'nag'
    */
  var key: js.Any = js.native
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
    * @default '/'
    */
  var path: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // region Behavior
  /**
    * allows cookie to be overridden
    *
    * @default false
    */
  var persist: Boolean = js.native
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * @default 500
    */
  var speed: Double = js.native
  /**
    * type of storage to use
    *
    * @default 'cookie'
    */
  var storageMethod: cookie | localstorage | sessionstorage = js.native
  /**
    * @default 'dismiss'
    */
  var value: js.Any = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  def onHide(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    animation: AnimationSettings,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    debug: Boolean,
    detachable: Boolean,
    displayTime: Double,
    domain: `false` | String,
    easing: String,
    error: ErrorSettings,
    expires: Double,
    key: js.Any,
    name: String,
    namespace: String,
    onHide: () => Unit,
    path: String,
    performance: Boolean,
    persist: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    speed: Double,
    storageMethod: cookie | localstorage | sessionstorage,
    value: js.Any,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], displayTime = displayTime.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onHide = js.Any.fromFunction0(onHide), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], storageMethod = storageMethod.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
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
    def setAnimation(value: AnimationSettings): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: `false` | String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetachable(value: Boolean): Self = this.set("detachable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayTime(value: Double): Self = this.set("displayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: `false` | String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageMethod(value: cookie | localstorage | sessionstorage): Self = this.set("storageMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

