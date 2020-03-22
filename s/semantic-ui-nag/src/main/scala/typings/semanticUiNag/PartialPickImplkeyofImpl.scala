package typings.semanticUiNag

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

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, keyof semantic-ui-nag.SemanticUI.NagSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var animation: js.UndefOr[AnimationSettings] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var context: js.UndefOr[`false` | String | JQuery] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var detachable: js.UndefOr[Boolean] = js.undefined
  var displayTime: js.UndefOr[Double] = js.undefined
  var domain: js.UndefOr[`false` | String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var storageMethod: js.UndefOr[cookie | localstorage | sessionstorage] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    animation: AnimationSettings = null,
    className: ClassNameSettings = null,
    context: `false` | String | JQuery = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    detachable: js.UndefOr[Boolean] = js.undefined,
    displayTime: Int | Double = null,
    domain: `false` | String = null,
    easing: String = null,
    error: ErrorSettings = null,
    expires: Int | Double = null,
    key: js.Any = null,
    name: String = null,
    namespace: String = null,
    onHide: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    path: String = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    persist: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    storageMethod: cookie | localstorage | sessionstorage = null,
    value: js.Any = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(detachable)) __obj.updateDynamic("detachable")(detachable.asInstanceOf[js.Any])
    if (displayTime != null) __obj.updateDynamic("displayTime")(displayTime.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (storageMethod != null) __obj.updateDynamic("storageMethod")(storageMethod.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

