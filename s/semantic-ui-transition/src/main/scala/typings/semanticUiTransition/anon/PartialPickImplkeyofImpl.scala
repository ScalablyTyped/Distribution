package typings.semanticUiTransition.anon

import typings.semanticUiTransition.JQuery
import typings.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typings.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typings.semanticUiTransition.semanticUiTransitionStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, keyof semantic-ui-transition.SemanticUI.TransitionSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var allowRepeats: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var displayType: js.UndefOr[`false` | String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onComplete: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onStart: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var queue: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[auto | Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var useFailSafe: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    allowRepeats: js.UndefOr[Boolean] = js.undefined,
    animation: String = null,
    className: ClassNameSettings = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    displayType: `false` | String = null,
    duration: js.UndefOr[Double] = js.undefined,
    error: ErrorSettings = null,
    interval: js.UndefOr[Double] = js.undefined,
    name: String = null,
    namespace: String = null,
    onComplete: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onHide: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onShow: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onStart: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    queue: js.UndefOr[Boolean] = js.undefined,
    reverse: auto | Boolean = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    useFailSafe: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRepeats)) __obj.updateDynamic("allowRepeats")(allowRepeats.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFailSafe)) __obj.updateDynamic("useFailSafe")(useFailSafe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

