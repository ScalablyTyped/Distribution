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
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var beforeChecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var beforeDeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var beforeIndeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var beforeUnchecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var fireOnInit: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onChecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onDeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onDisable: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onDisabled: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onEnable: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onEnabled: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onIndeterminate: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var onUnchecked: js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var uncheckable: js.UndefOr[auto | Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
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
    def setBeforeChecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = this.set("beforeChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeChecked: Self = this.set("beforeChecked", js.undefined)
    @scala.inline
    def setBeforeDeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = this.set("beforeDeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeDeterminate: Self = this.set("beforeDeterminate", js.undefined)
    @scala.inline
    def setBeforeIndeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = this.set("beforeIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeIndeterminate: Self = this.set("beforeIndeterminate", js.undefined)
    @scala.inline
    def setBeforeUnchecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): Self = this.set("beforeUnchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeUnchecked: Self = this.set("beforeUnchecked", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFireOnInit(value: Boolean): Self = this.set("fireOnInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireOnInit: Self = this.set("fireOnInit", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOnChange(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChecked: Self = this.set("onChecked", js.undefined)
    @scala.inline
    def setOnDeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onDeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDeterminate: Self = this.set("onDeterminate", js.undefined)
    @scala.inline
    def setOnDisable(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDisable: Self = this.set("onDisable", js.undefined)
    @scala.inline
    def setOnDisabled(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDisabled: Self = this.set("onDisabled", js.undefined)
    @scala.inline
    def setOnEnable(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnable: Self = this.set("onEnable", js.undefined)
    @scala.inline
    def setOnEnabled(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnabled: Self = this.set("onEnabled", js.undefined)
    @scala.inline
    def setOnIndeterminate(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnIndeterminate: Self = this.set("onIndeterminate", js.undefined)
    @scala.inline
    def setOnUnchecked(value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): Self = this.set("onUnchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnchecked: Self = this.set("onUnchecked", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setUncheckable(value: auto | Boolean): Self = this.set("uncheckable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckable: Self = this.set("uncheckable", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

