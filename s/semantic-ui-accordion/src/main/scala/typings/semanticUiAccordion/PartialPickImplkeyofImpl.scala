package typings.semanticUiAccordion

import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, keyof semantic-ui-accordion.SemanticUI.AccordionSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var animateChildren: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var closeNested: js.UndefOr[Boolean] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  var on: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onClosing: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onOpening: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    animateChildren: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    closeNested: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: String = null,
    error: ErrorSettings = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    on: String = null,
    onChange: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onClose: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onClosing: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onOpen: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onOpening: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateChildren)) __obj.updateDynamic("animateChildren")(animateChildren.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeNested)) __obj.updateDynamic("closeNested")(closeNested.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onClosing != null) __obj.updateDynamic("onClosing")(onClosing.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (onOpening != null) __obj.updateDynamic("onOpening")(onOpening.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

