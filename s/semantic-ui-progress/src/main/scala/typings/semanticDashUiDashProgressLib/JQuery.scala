package typings
package semanticDashUiDashProgressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("progress")
  var progress_Original: semanticDashUiDashProgressLib.SemanticUINs.Progress = js.native
  def progress(): JQuery = js.native
  def progress(settings: semanticDashUiDashProgressLib.SemanticUINs.ProgressSettings): JQuery = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  @JSName("progress")
  def progress_complete(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.complete): JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_decrement(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.decrement): JQuery = js.native
  @JSName("progress")
  def progress_decrement(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.decrement,
    decrementValue: scala.Double
  ): JQuery = js.native
  @JSName("progress")
  def progress_destroy(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.destroy): JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  @JSName("progress")
  def progress_getnormalizedvalue(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get normalized value`,
    value: scala.Double
  ): scala.Double = js.native
  /**
    * Returns percent as last specified
    */
  @JSName("progress")
  def progress_getpercent(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get percent`): scala.Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  @JSName("progress")
  def progress_gettext(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get text`,
    text: java.lang.String
  ): java.lang.String = js.native
  /**
    * Returns total
    */
  @JSName("progress")
  def progress_gettotal(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get total`): scala.Double = js.native
  /**
    * Returns current progress value
    */
  @JSName("progress")
  def progress_getvalue(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`get value`): scala.Double = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_increment(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.increment): JQuery = js.native
  @JSName("progress")
  def progress_increment(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.increment,
    incrementValue: scala.Double
  ): JQuery = js.native
  /**
    * Returns whether progress is in active state
    */
  @JSName("progress")
  def progress_isactive(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is active`): scala.Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  @JSName("progress")
  def progress_iscomplete(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is complete`): scala.Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  @JSName("progress")
  def progress_iserror(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is error`): scala.Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  @JSName("progress")
  def progress_issuccess(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is success`): scala.Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  @JSName("progress")
  def progress_iswarning(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`is warning`): scala.Boolean = js.native
  /**
    * Removes progress to active state
    */
  @JSName("progress")
  def progress_removeactive(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove active`): JQuery = js.native
  /**
    * Removes progress to error state
    */
  @JSName("progress")
  def progress_removeerror(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove error`): JQuery = js.native
  /**
    * Removes progress to success state
    */
  @JSName("progress")
  def progress_removesuccess(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove success`): JQuery = js.native
  /**
    * Removes progress to warning state
    */
  @JSName("progress")
  def progress_removewarning(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`remove warning`): JQuery = js.native
  /**
    * Resets progress to zero
    */
  @JSName("progress")
  def progress_reset(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.reset): JQuery = js.native
  /**
    * Sets progress to active state
    */
  @JSName("progress")
  def progress_setactive(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set active`): JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  @JSName("progress")
  def progress_setbarlabel(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set bar label`,
    text: java.lang.String
  ): JQuery = js.native
  /**
    * Changes progress animation speed
    */
  @JSName("progress")
  def progress_setduration(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set duration`,
    value: scala.Double
  ): JQuery = js.native
  /**
    * Sets progress to error state
    */
  @JSName("progress")
  def progress_seterror(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set error`): JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  @JSName("progress")
  def progress_setlabel(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set label`,
    text: java.lang.String
  ): JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  @JSName("progress")
  def progress_setpercent(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set percent`,
    percent: scala.Double
  ): JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  @JSName("progress")
  def progress_setprogress(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set progress`,
    value: scala.Double
  ): JQuery = js.native
  /**
    * Sets progress to success state
    */
  @JSName("progress")
  def progress_setsuccess(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set success`): JQuery = js.native
  @JSName("progress")
  def progress_setting(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.setting,
    value: semanticDashUiDashProgressLib.SemanticUINs.ProgressSettings
  ): JQuery = js.native
  @JSName("progress")
  def progress_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any = js.native
  @JSName("progress")
  def progress_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Set total to a new value
    */
  @JSName("progress")
  def progress_settotal(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set total`,
    total: scala.Double
  ): JQuery = js.native
  /**
    * Sets progress to warning state
    */
  @JSName("progress")
  def progress_setwarning(behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`set warning`): JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  @JSName("progress")
  def progress_updateprogress(
    behavior: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibStrings.`update progress`,
    value: scala.Double
  ): JQuery = js.native
}

