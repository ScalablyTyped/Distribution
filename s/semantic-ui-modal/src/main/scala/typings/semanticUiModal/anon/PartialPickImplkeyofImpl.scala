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
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var closable: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[String | JQuery] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var detachable: js.UndefOr[Boolean] = js.native
  var dimmerSettings: js.UndefOr[DimmerSettings] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onApprove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]] = js.native
  var onDeny: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]] = js.native
  var onHidden: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onHide: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]] = js.native
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var queue: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var transition: js.UndefOr[String] = js.native
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
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDetachable(value: Boolean): Self = this.set("detachable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetachable: Self = this.set("detachable", js.undefined)
    @scala.inline
    def setDimmerSettings(value: DimmerSettings): Self = this.set("dimmerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimmerSettings: Self = this.set("dimmerSettings", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShortcuts: Self = this.set("keyboardShortcuts", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveChanges: Self = this.set("observeChanges", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnApprove(value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): Self = this.set("onApprove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnApprove: Self = this.set("onApprove", js.undefined)
    @scala.inline
    def setOnDeny(value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): Self = this.set("onDeny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDeny: Self = this.set("onDeny", js.undefined)
    @scala.inline
    def setOnHidden(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    @scala.inline
    def setOnHide(value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnVisible: Self = this.set("onVisible", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setQueue(value: Boolean): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

