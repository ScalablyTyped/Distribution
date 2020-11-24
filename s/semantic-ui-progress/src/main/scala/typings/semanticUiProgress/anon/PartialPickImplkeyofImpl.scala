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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, keyof semantic-ui-progress.SemanticUI.ProgressSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  
  var autoSuccess: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var label: js.UndefOr[percent | ratio] = js.native
  
  var limitValues: js.UndefOr[Boolean] = js.native
  
  var metadata: js.UndefOr[MetadataSettings] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var onActive: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var onError: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var onSuccess: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]] = js.native
  
  var onWarning: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var random: js.UndefOr[RandomSettings] = js.native
  
  var regExp: js.UndefOr[RegExpSettings] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var showActivity: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[TextSettings] = js.native
  
  var total: js.UndefOr[`false` | Double] = js.native
  
  var value: js.UndefOr[`false` | Double] = js.native
  
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
    def setAutoSuccess(value: Boolean): Self = this.set("autoSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSuccess: Self = this.set("autoSuccess", js.undefined)
    
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
    def setLabel(value: percent | ratio): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLimitValues(value: Boolean): Self = this.set("limitValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitValues: Self = this.set("limitValues", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOnActive(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = this.set("onActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnActive: Self = this.set("onActive", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnError(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setOnWarning(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = this.set("onWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWarning: Self = this.set("onWarning", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRandom(value: RandomSettings): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setShowActivity(value: Boolean): Self = this.set("showActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowActivity: Self = this.set("showActivity", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setText(value: TextSettings): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTotal(value: `false` | Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    
    @scala.inline
    def setValue(value: `false` | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
