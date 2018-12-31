package typings
package semanticDashUiDashProgressLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  var settings: ProgressSettings = js.native
  def apply(): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get normalized value`,
    value: scala.Double
  ): scala.Double = js.native
  /**
    * Returns percent as last specified
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get percent`): scala.Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get text`,
    text: java.lang.String
  ): java.lang.String = js.native
  /**
    * Returns total
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get total`): scala.Double = js.native
  /**
    * Returns current progress value
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get value`): scala.Double = js.native
  /**
    * Returns whether progress is in active state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is active`): scala.Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is complete`): scala.Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is error`): scala.Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is success`): scala.Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is warning`): scala.Boolean = js.native
  /**
    * Removes progress to active state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove active`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Removes progress to error state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove error`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Removes progress to success state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove success`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Removes progress to warning state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove warning`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress to active state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set active`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set bar label`,
    text: java.lang.String
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Changes progress animation speed
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set duration`,
    value: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress to error state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set error`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set label`,
    text: java.lang.String
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set percent`,
    percent: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set progress`,
    value: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress to success state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set success`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Set total to a new value
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set total`,
    total: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Sets progress to warning state
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set warning`): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`update progress`,
    value: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.complete): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.decrement): semanticDashUiDashProgressLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.decrement,
    decrementValue: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.destroy): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.increment): semanticDashUiDashProgressLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.increment,
    incrementValue: scala.Double
  ): semanticDashUiDashProgressLib.JQuery = js.native
  /**
    * Resets progress to zero
    */
  def apply(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.reset): semanticDashUiDashProgressLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.setting,
    value: ProgressSettings
  ): semanticDashUiDashProgressLib.JQuery = js.native
  def apply(settings: ProgressSettings): semanticDashUiDashProgressLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  ): semanticDashUiDashProgressLib.JQuery = js.native
}

