package typings.semanticUiProgress.SemanticUI

import typings.semanticUiProgress.JQuery
import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings.Param
import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import typings.semanticUiProgress.semanticUiProgressStrings.`get normalized value`
import typings.semanticUiProgress.semanticUiProgressStrings.`get percent`
import typings.semanticUiProgress.semanticUiProgressStrings.`get text`
import typings.semanticUiProgress.semanticUiProgressStrings.`get total`
import typings.semanticUiProgress.semanticUiProgressStrings.`get value`
import typings.semanticUiProgress.semanticUiProgressStrings.`is active`
import typings.semanticUiProgress.semanticUiProgressStrings.`is complete`
import typings.semanticUiProgress.semanticUiProgressStrings.`is error`
import typings.semanticUiProgress.semanticUiProgressStrings.`is success`
import typings.semanticUiProgress.semanticUiProgressStrings.`is warning`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove active`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove error`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove success`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove warning`
import typings.semanticUiProgress.semanticUiProgressStrings.`set active`
import typings.semanticUiProgress.semanticUiProgressStrings.`set bar label`
import typings.semanticUiProgress.semanticUiProgressStrings.`set duration`
import typings.semanticUiProgress.semanticUiProgressStrings.`set error`
import typings.semanticUiProgress.semanticUiProgressStrings.`set label`
import typings.semanticUiProgress.semanticUiProgressStrings.`set percent`
import typings.semanticUiProgress.semanticUiProgressStrings.`set progress`
import typings.semanticUiProgress.semanticUiProgressStrings.`set success`
import typings.semanticUiProgress.semanticUiProgressStrings.`set total`
import typings.semanticUiProgress.semanticUiProgressStrings.`set warning`
import typings.semanticUiProgress.semanticUiProgressStrings.`update progress`
import typings.semanticUiProgress.semanticUiProgressStrings.complete
import typings.semanticUiProgress.semanticUiProgressStrings.decrement
import typings.semanticUiProgress.semanticUiProgressStrings.destroy
import typings.semanticUiProgress.semanticUiProgressStrings.increment
import typings.semanticUiProgress.semanticUiProgressStrings.reset
import typings.semanticUiProgress.semanticUiProgressStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  def apply(behavior: `get normalized value`, value: Double): Double = js.native
  /**
    * Returns percent as last specified
    */
  def apply(behavior: `get percent`): Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  def apply(behavior: `get text`, text: String): String = js.native
  /**
    * Returns total
    */
  def apply(behavior: `get total`): Double = js.native
  /**
    * Returns current progress value
    */
  def apply(behavior: `get value`): Double = js.native
  /**
    * Returns whether progress is in active state
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  def apply(behavior: `is complete`): Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  def apply(behavior: `is error`): Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  def apply(behavior: `is success`): Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  def apply(behavior: `is warning`): Boolean = js.native
  /**
    * Removes progress to active state
    */
  def apply(behavior: `remove active`): JQuery = js.native
  /**
    * Removes progress to error state
    */
  def apply(behavior: `remove error`): JQuery = js.native
  /**
    * Removes progress to success state
    */
  def apply(behavior: `remove success`): JQuery = js.native
  /**
    * Removes progress to warning state
    */
  def apply(behavior: `remove warning`): JQuery = js.native
  /**
    * Sets progress to active state
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  def apply(behavior: `set bar label`, text: String): JQuery = js.native
  /**
    * Changes progress animation speed
    */
  def apply(behavior: `set duration`, value: Double): JQuery = js.native
  /**
    * Sets progress to error state
    */
  def apply(behavior: `set error`): JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  def apply(behavior: `set label`, text: String): JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  def apply(behavior: `set percent`, percent: Double): JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  def apply(behavior: `set progress`, value: Double): JQuery = js.native
  /**
    * Sets progress to success state
    */
  def apply(behavior: `set success`): JQuery = js.native
  /**
    * Set total to a new value
    */
  def apply(behavior: `set total`, total: Double): JQuery = js.native
  /**
    * Sets progress to warning state
    */
  def apply(behavior: `set warning`): JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  def apply(behavior: `update progress`, value: Double): JQuery = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  def apply(behavior: complete): JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  def apply(behavior: decrement): JQuery = js.native
  def apply(behavior: decrement, decrementValue: Double): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  def apply(behavior: increment): JQuery = js.native
  def apply(behavior: increment, incrementValue: Double): JQuery = js.native
  /**
    * Resets progress to zero
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, value: ProgressSettings): JQuery = js.native
  def apply(settings: ProgressSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-progress.SemanticUI.ProgressSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-progress.SemanticUI.ProgressSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any = js.native
  
  var settings: ProgressSettings = js.native
}
object Progress {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String
      
      /**
        * @default 'error'
        */
      var error: String
      
      /**
        * @default 'success'
        */
      var success: String
      
      /**
        * @default 'warning'
        */
      var warning: String
    }
    object Impl {
      
      inline def apply(active: String, error: String, success: String, warning: String): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiProgress.anon.PickImplactivePartialPickActive
      - typings.semanticUiProgress.anon.PickImplerrorPartialPickIError
      - typings.semanticUiProgress.anon.PickImplsuccessPartialPicActive
      - typings.semanticUiProgress.anon.PickImplwarningPartialPicActive
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPickActive(active: String): typings.semanticUiProgress.anon.PickImplactivePartialPickActive = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplactivePartialPickActive]
      }
      
      inline def PickImplerrorPartialPickIError(error: String): typings.semanticUiProgress.anon.PickImplerrorPartialPickIError = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplerrorPartialPickIError]
      }
      
      inline def PickImplsuccessPartialPicActive(success: String): typings.semanticUiProgress.anon.PickImplsuccessPartialPicActive = {
        val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplsuccessPartialPicActive]
      }
      
      inline def PickImplwarningPartialPicActive(warning: String): typings.semanticUiProgress.anon.PickImplwarningPartialPicActive = {
        val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplwarningPartialPicActive]
      }
    }
  }
  type ClassNameSettings = Param
  
  object ErrorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
      
      /**
        * @default 'Progress value is non numeric'
        */
      var nonNumeric: String
    }
    object Impl {
      
      inline def apply(method: String, nonNumeric: String): Impl = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], nonNumeric = nonNumeric.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setNonNumeric(value: String): Self = StObject.set(x, "nonNumeric", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiProgress.anon.PickImplmethodPartialPick
      - typings.semanticUiProgress.anon.PickImplnonNumericPartial
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplmethodPartialPick(method: String): typings.semanticUiProgress.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplnonNumericPartial(nonNumeric: String): typings.semanticUiProgress.anon.PickImplnonNumericPartial = {
        val __obj = js.Dynamic.literal(nonNumeric = nonNumeric.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplnonNumericPartial]
      }
    }
  }
  type ErrorSettings = typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings.Param
  
  object MetadataSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'percent'
        */
      var percent: String
      
      /**
        * @default 'total'
        */
      var total: String
      
      /**
        * @default 'value'
        */
      var value: String
    }
    object Impl {
      
      inline def apply(percent: String, total: String, value: String): Impl = {
        val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
        
        inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiProgress.anon.PickImplpercentPartialPicPercent
      - typings.semanticUiProgress.anon.PickImpltotalPartialPickIPercent
      - typings.semanticUiProgress.anon.PickImplvaluePartialPickIPercent
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplpercentPartialPicPercent(percent: String): typings.semanticUiProgress.anon.PickImplpercentPartialPicPercent = {
        val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplpercentPartialPicPercent]
      }
      
      inline def PickImpltotalPartialPickIPercent(total: String): typings.semanticUiProgress.anon.PickImpltotalPartialPickIPercent = {
        val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImpltotalPartialPickIPercent]
      }
      
      inline def PickImplvaluePartialPickIPercent(value: String): typings.semanticUiProgress.anon.PickImplvaluePartialPickIPercent = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplvaluePartialPickIPercent]
      }
    }
  }
  type MetadataSettings = typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings.Param
  
  object RandomSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 5
        */
      var max: Double
      
      /**
        * @default 2
        */
      var min: Double
    }
    object Impl {
      
      inline def apply(max: Double, min: Double): Impl = {
        val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiProgress.anon.PickImplminPartialPickImp
      - typings.semanticUiProgress.anon.PickImplmaxPartialPickImp
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplmaxPartialPickImp(max: Double): typings.semanticUiProgress.anon.PickImplmaxPartialPickImp = {
        val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplmaxPartialPickImp]
      }
      
      inline def PickImplminPartialPickImp(min: Double): typings.semanticUiProgress.anon.PickImplminPartialPickImp = {
        val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplminPartialPickImp]
      }
    }
  }
  type RandomSettings = typings.semanticUiProgress.SemanticUI.Progress.RandomSettings.Param
  
  /* Inlined semantic-ui-progress.SemanticUI.Progress.RegExpSettings.Param */
  trait RegExpSettings extends StObject {
    
    var variable: js.RegExp
  }
  object RegExpSettings {
    
    inline def apply(variable: js.RegExp): RegExpSettings = {
      val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExpSettings]
    }
    
    trait Impl extends StObject {
      
      /**
        * @default /\{\$*[A-z0-9]+\}/g
        */
      var variable: js.RegExp
    }
    object Impl {
      
      inline def apply(variable: js.RegExp): Impl = {
        val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setVariable(value: js.RegExp): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: RegExpSettings](x: Self) {
      
      inline def setVariable(value: js.RegExp): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
    
    /* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl, 'variable'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl>> */
    trait Param extends StObject {
      
      var variable: js.RegExp
    }
    object Param {
      
      inline def apply(variable: js.RegExp): typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings.Param = {
        val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings.Param]
      }
      
      extension [Self <: typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings.Param](x: Self) {
        
        inline def setVariable(value: js.RegExp): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object SelectorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '> .bar
        */
      var bar: String
      
      /**
        * @default '> .label'
        */
      var label: String
      
      /**
        * @default '.bar > .progress'
        */
      var progress: String
    }
    object Impl {
      
      inline def apply(bar: String, label: String, progress: String): Impl = {
        val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiProgress.anon.PickImplbarPartialPickImp
      - typings.semanticUiProgress.anon.PickImpllabelPartialPickIBar
      - typings.semanticUiProgress.anon.PickImplprogressPartialPi
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbarPartialPickImp(bar: String): typings.semanticUiProgress.anon.PickImplbarPartialPickImp = {
        val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplbarPartialPickImp]
      }
      
      inline def PickImpllabelPartialPickIBar(label: String): typings.semanticUiProgress.anon.PickImpllabelPartialPickIBar = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImpllabelPartialPickIBar]
      }
      
      inline def PickImplprogressPartialPi(progress: String): typings.semanticUiProgress.anon.PickImplprogressPartialPi = {
        val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplprogressPartialPi]
      }
    }
  }
  type SelectorSettings = typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings.Param
  
  object TextSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default false
        */
      var active: `false` | String
      
      /**
        * @default false
        */
      var error: `false` | String
      
      /**
        * @default '{percent}%'
        */
      var percent: `false` | String
      
      /**
        * @default '{value} of {total}'
        */
      var ratio: `false` | String
      
      /**
        * @default false
        */
      var success: `false` | String
      
      /**
        * @default false
        */
      var warning: `false` | String
    }
    object Impl {
      
      inline def apply(
        active: `false` | String,
        error: `false` | String,
        percent: `false` | String,
        ratio: `false` | String,
        success: `false` | String,
        warning: `false` | String
      ): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setActive(value: `false` | String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setError(value: `false` | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setPercent(value: `false` | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
        
        inline def setRatio(value: `false` | String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
        
        inline def setSuccess(value: `false` | String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        inline def setWarning(value: `false` | String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiProgress.anon.PickImplactivePartialPick
      - typings.semanticUiProgress.anon.PickImplerrorPartialPickIActive
      - typings.semanticUiProgress.anon.PickImplsuccessPartialPic
      - typings.semanticUiProgress.anon.PickImplwarningPartialPic
      - typings.semanticUiProgress.anon.PickImplpercentPartialPic
      - typings.semanticUiProgress.anon.PickImplratioPartialPickI
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: `false` | String): typings.semanticUiProgress.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplactivePartialPick]
      }
      
      inline def PickImplerrorPartialPickIActive(error: `false` | String): typings.semanticUiProgress.anon.PickImplerrorPartialPickIActive = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplerrorPartialPickIActive]
      }
      
      inline def PickImplpercentPartialPic(percent: `false` | String): typings.semanticUiProgress.anon.PickImplpercentPartialPic = {
        val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplpercentPartialPic]
      }
      
      inline def PickImplratioPartialPickI(ratio: `false` | String): typings.semanticUiProgress.anon.PickImplratioPartialPickI = {
        val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplratioPartialPickI]
      }
      
      inline def PickImplsuccessPartialPic(success: `false` | String): typings.semanticUiProgress.anon.PickImplsuccessPartialPic = {
        val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplsuccessPartialPic]
      }
      
      inline def PickImplwarningPartialPic(warning: `false` | String): typings.semanticUiProgress.anon.PickImplwarningPartialPic = {
        val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiProgress.anon.PickImplwarningPartialPic]
      }
    }
  }
  type TextSettings = typings.semanticUiProgress.SemanticUI.Progress.TextSettings.Param
}
