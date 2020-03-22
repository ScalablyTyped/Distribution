package typings.semanticUiRating

import typings.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typings.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typings.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typings.semanticUiRating.semanticUiRatingStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, keyof semantic-ui-rating.SemanticUI.RatingSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var clearable: js.UndefOr[auto | Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var fireOnInit: js.UndefOr[Boolean] = js.undefined
  var initialRating: js.UndefOr[Double] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onRate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    className: ClassNameSettings = null,
    clearable: auto | Boolean = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    fireOnInit: js.UndefOr[Boolean] = js.undefined,
    initialRating: Int | Double = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    onRate: js.ThisFunction1[/* this */ JQuery, /* value */ Double, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearable != null) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnInit)) __obj.updateDynamic("fireOnInit")(fireOnInit.asInstanceOf[js.Any])
    if (initialRating != null) __obj.updateDynamic("initialRating")(initialRating.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onRate != null) __obj.updateDynamic("onRate")(onRate.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

