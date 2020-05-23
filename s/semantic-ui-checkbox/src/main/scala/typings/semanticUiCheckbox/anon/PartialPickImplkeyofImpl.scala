package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var beforeChecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.undefined
  var beforeDeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.undefined
  var beforeIndeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.undefined
  var beforeUnchecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var fireOnInit: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onChecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onDeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onDisable: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onDisabled: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onEnable: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onEnabled: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onIndeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var onUnchecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var uncheckable: js.UndefOr[auto | Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    beforeChecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = null,
    beforeDeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = null,
    beforeIndeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = null,
    beforeUnchecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = null,
    className: ClassNameSettings = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    fireOnInit: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    onChange: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onChecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onDeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onDisable: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onDisabled: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onEnable: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onEnabled: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onIndeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    onUnchecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    uncheckable: auto | Boolean = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (beforeChecked != null) __obj.updateDynamic("beforeChecked")(beforeChecked.asInstanceOf[js.Any])
    if (beforeDeterminate != null) __obj.updateDynamic("beforeDeterminate")(beforeDeterminate.asInstanceOf[js.Any])
    if (beforeIndeterminate != null) __obj.updateDynamic("beforeIndeterminate")(beforeIndeterminate.asInstanceOf[js.Any])
    if (beforeUnchecked != null) __obj.updateDynamic("beforeUnchecked")(beforeUnchecked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnInit)) __obj.updateDynamic("fireOnInit")(fireOnInit.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onChecked != null) __obj.updateDynamic("onChecked")(onChecked.asInstanceOf[js.Any])
    if (onDeterminate != null) __obj.updateDynamic("onDeterminate")(onDeterminate.asInstanceOf[js.Any])
    if (onDisable != null) __obj.updateDynamic("onDisable")(onDisable.asInstanceOf[js.Any])
    if (onDisabled != null) __obj.updateDynamic("onDisabled")(onDisabled.asInstanceOf[js.Any])
    if (onEnable != null) __obj.updateDynamic("onEnable")(onEnable.asInstanceOf[js.Any])
    if (onEnabled != null) __obj.updateDynamic("onEnabled")(onEnabled.asInstanceOf[js.Any])
    if (onIndeterminate != null) __obj.updateDynamic("onIndeterminate")(onIndeterminate.asInstanceOf[js.Any])
    if (onUnchecked != null) __obj.updateDynamic("onUnchecked")(onUnchecked.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (uncheckable != null) __obj.updateDynamic("uncheckable")(uncheckable.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

