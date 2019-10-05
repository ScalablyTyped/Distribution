package typings.semanticDashUiDashProgress.SemanticUI

import typings.semanticDashUiDashProgress.JQuery
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`get normalized value`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`get percent`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`get text`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`get total`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`get value`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`is active`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`is complete`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`is error`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`is success`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`is warning`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`remove active`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`remove error`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`remove success`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`remove warning`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set active`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set bar label`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set duration`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set error`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set label`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set percent`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set progress`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set success`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set total`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`set warning`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.`update progress`
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.complete
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.decrement
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.destroy
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.increment
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.reset
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Progress")
@js.native
trait Progress_ extends js.Object {
  var settings: ProgressSettings = js.native
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
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

