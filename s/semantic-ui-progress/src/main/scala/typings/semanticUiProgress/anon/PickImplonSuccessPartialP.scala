package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typings.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typings.semanticUiProgress.SemanticUI.Progress.TextSettings
import typings.semanticUiProgress.SemanticUI.ProgressSettings.Param
import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'onSuccess'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, keyof semantic-ui-progress.SemanticUI.ProgressSettings._Impl>> */
trait PickImplonSuccessPartialP
  extends StObject
     with Param {
  
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
  
  def onSuccess(total: Double): Unit
  @JSName("onSuccess")
  var onSuccess_Original: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
  
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
object PickImplonSuccessPartialP {
  
  inline def apply(onSuccess: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]): PickImplonSuccessPartialP = {
    val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonSuccessPartialP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplonSuccessPartialP] (val x: Self) extends AnyVal {
    
    inline def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
    
    inline def setAutoSuccessUndefined: Self = StObject.set(x, "autoSuccess", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLabel(value: percent | ratio): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLimitValues(value: Boolean): Self = StObject.set(x, "limitValues", value.asInstanceOf[js.Any])
    
    inline def setLimitValuesUndefined: Self = StObject.set(x, "limitValues", js.undefined)
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnActive(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
    
    inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    inline def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnError(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    inline def setOnWarning(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
    
    inline def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRandom(value: RandomSettings): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setShowActivity(value: Boolean): Self = StObject.set(x, "showActivity", value.asInstanceOf[js.Any])
    
    inline def setShowActivityUndefined: Self = StObject.set(x, "showActivity", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTotal(value: `false` | Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setValue(value: `false` | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
