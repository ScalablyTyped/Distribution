package typings.semanticUiModal.anon

import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import typings.semanticUiModal.JQuery
import typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typings.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typings.semanticUiModal.semanticUiModalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, keyof semantic-ui-modal.SemanticUI.ModalSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[String | JQuery] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var detachable: js.UndefOr[Boolean] = js.undefined
  var dimmerSettings: js.UndefOr[DimmerSettings] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onApprove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]] = js.undefined
  var onDeny: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]] = js.undefined
  var onHidden: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var queue: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    context: String | JQuery = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    detachable: js.UndefOr[Boolean] = js.undefined,
    dimmerSettings: DimmerSettings = null,
    duration: js.UndefOr[Double] = js.undefined,
    error: ErrorSettings = null,
    keyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onApprove: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = null,
    onDeny: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = null,
    onHidden: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onHide: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = null,
    onShow: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onVisible: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    queue: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    transition: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detachable)) __obj.updateDynamic("detachable")(detachable.get.asInstanceOf[js.Any])
    if (dimmerSettings != null) __obj.updateDynamic("dimmerSettings")(dimmerSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onApprove != null) __obj.updateDynamic("onApprove")(onApprove.asInstanceOf[js.Any])
    if (onDeny != null) __obj.updateDynamic("onDeny")(onDeny.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(onHidden.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onVisible != null) __obj.updateDynamic("onVisible")(onVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

