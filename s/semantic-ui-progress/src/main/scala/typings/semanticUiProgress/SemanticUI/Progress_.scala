package typings.semanticUiProgress.SemanticUI

import typings.semanticUiProgress.JQuery
import typings.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typings.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typings.semanticUiProgress.SemanticUI.Progress.TextSettings
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
import typings.semanticUiProgress.semanticUiProgressStrings.autoSuccess
import typings.semanticUiProgress.semanticUiProgressStrings.className
import typings.semanticUiProgress.semanticUiProgressStrings.complete
import typings.semanticUiProgress.semanticUiProgressStrings.debug
import typings.semanticUiProgress.semanticUiProgressStrings.decrement
import typings.semanticUiProgress.semanticUiProgressStrings.destroy
import typings.semanticUiProgress.semanticUiProgressStrings.error
import typings.semanticUiProgress.semanticUiProgressStrings.increment
import typings.semanticUiProgress.semanticUiProgressStrings.label
import typings.semanticUiProgress.semanticUiProgressStrings.limitValues
import typings.semanticUiProgress.semanticUiProgressStrings.metadata
import typings.semanticUiProgress.semanticUiProgressStrings.name
import typings.semanticUiProgress.semanticUiProgressStrings.namespace
import typings.semanticUiProgress.semanticUiProgressStrings.onActive
import typings.semanticUiProgress.semanticUiProgressStrings.onChange
import typings.semanticUiProgress.semanticUiProgressStrings.onError
import typings.semanticUiProgress.semanticUiProgressStrings.onSuccess
import typings.semanticUiProgress.semanticUiProgressStrings.onWarning
import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.performance
import typings.semanticUiProgress.semanticUiProgressStrings.precision
import typings.semanticUiProgress.semanticUiProgressStrings.random
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import typings.semanticUiProgress.semanticUiProgressStrings.regExp
import typings.semanticUiProgress.semanticUiProgressStrings.reset
import typings.semanticUiProgress.semanticUiProgressStrings.selector
import typings.semanticUiProgress.semanticUiProgressStrings.setting
import typings.semanticUiProgress.semanticUiProgressStrings.showActivity
import typings.semanticUiProgress.semanticUiProgressStrings.silent
import typings.semanticUiProgress.semanticUiProgressStrings.text
import typings.semanticUiProgress.semanticUiProgressStrings.total
import typings.semanticUiProgress.semanticUiProgressStrings.value
import typings.semanticUiProgress.semanticUiProgressStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress_ extends js.Object {
  
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
  def apply(behavior: setting, name: autoSuccess, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: autoSuccess, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: label, value: js.UndefOr[scala.Nothing]): percent | ratio = js.native
  def apply(behavior: setting, name: label, value: percent): JQuery = js.native
  def apply(behavior: setting, name: label, value: ratio): JQuery = js.native
  def apply(behavior: setting, name: limitValues, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: limitValues, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onActive, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onActive,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onError, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onError,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onSuccess, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onWarning, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
  def apply(
    behavior: setting,
    name: onWarning,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: precision, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: precision, value: Double): JQuery = js.native
  def apply(behavior: setting, name: random, value: RandomSettings): JQuery = js.native
  def apply(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: showActivity, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: showActivity, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: text, value: js.UndefOr[scala.Nothing]): TextSettings = js.native
  def apply(behavior: setting, name: total, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def apply(behavior: setting, name: total, value: Double): JQuery = js.native
  def apply(behavior: setting, name: total, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: value, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def apply(behavior: setting, name: value, value: Double): JQuery = js.native
  def apply(behavior: setting, name: value, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: ProgressSettings): JQuery = js.native
  def apply(settings: ProgressSettings): JQuery = js.native
  
  var settings: ProgressSettings = js.native
}
