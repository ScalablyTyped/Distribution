package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typings.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typings.semanticUiProgress.SemanticUI.Progress.TextSettings
import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, keyof semantic-ui-progress.SemanticUI.ProgressSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var autoSuccess: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var label: js.UndefOr[percent | ratio] = js.undefined
  var limitValues: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onActive: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ] = js.undefined
  var onError: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]] = js.undefined
  var onWarning: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var random: js.UndefOr[RandomSettings] = js.undefined
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var showActivity: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[TextSettings] = js.undefined
  var total: js.UndefOr[`false` | Double] = js.undefined
  var value: js.UndefOr[`false` | Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    autoSuccess: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    label: percent | ratio = null,
    limitValues: js.UndefOr[Boolean] = js.undefined,
    metadata: MetadataSettings = null,
    name: String = null,
    namespace: String = null,
    onActive: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = null,
    onChange: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit] = null,
    onError: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = null,
    onSuccess: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit] = null,
    onWarning: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    random: RandomSettings = null,
    regExp: RegExpSettings = null,
    selector: SelectorSettings = null,
    showActivity: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    text: TextSettings = null,
    total: `false` | Double = null,
    value: `false` | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSuccess)) __obj.updateDynamic("autoSuccess")(autoSuccess.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(limitValues)) __obj.updateDynamic("limitValues")(limitValues.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(onActive.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    if (onWarning != null) __obj.updateDynamic("onWarning")(onWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(showActivity)) __obj.updateDynamic("showActivity")(showActivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

