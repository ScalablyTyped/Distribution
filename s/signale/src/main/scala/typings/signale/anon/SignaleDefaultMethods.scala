package typings.signale.anon

import typings.signale.mod.DefaultMethods
import typings.signale.mod.LoggerFunc
import typings.signale.mod.Signale
import typings.signale.mod.SignaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined signale.signale.Signale<signale.signale.DefaultMethods> */
@js.native
trait SignaleDefaultMethods extends js.Object {
  @JSName("await")
  var await_Original: LoggerFunc = js.native
  @JSName("complete")
  var complete_Original: LoggerFunc = js.native
  @JSName("debug")
  var debug_Original: LoggerFunc = js.native
  @JSName("error")
  var error_Original: LoggerFunc = js.native
  @JSName("fatal")
  var fatal_Original: LoggerFunc = js.native
  @JSName("fav")
  var fav_Original: LoggerFunc = js.native
  @JSName("info")
  var info_Original: LoggerFunc = js.native
  @JSName("log")
  var log_Original: LoggerFunc = js.native
  @JSName("note")
  var note_Original: LoggerFunc = js.native
  @JSName("pause")
  var pause_Original: LoggerFunc = js.native
  @JSName("pending")
  var pending_Original: LoggerFunc = js.native
  @JSName("star")
  var star_Original: LoggerFunc = js.native
  @JSName("start")
  var start_Original: LoggerFunc = js.native
  @JSName("success")
  var success_Original: LoggerFunc = js.native
  @JSName("warn")
  var warn_Original: LoggerFunc = js.native
  @JSName("watch")
  var watch_Original: LoggerFunc = js.native
  /**
    * Adds new secrets/sensitive-information to the targeted Signale instance.
    *
    * @param secrets Array holding the secrets/sensitive-information to be filtered out.
    */
  def addSecrets(secrets: js.Array[Double | String]): Unit = js.native
  def await(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def await(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Removes all secrets/sensitive-information from the targeted Signale instance.
    */
  def clearSecrets(): Unit = js.native
  def complete(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def complete(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Sets the configuration of an instance overriding any existing global or local configuration.
    *
    * @param configObj Can hold any of the documented options.
    */
  def config(configObj: SignaleConfig): Signale[DefaultMethods] = js.native
  def debug(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def debug(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Disables the logging functionality of all loggers belonging to a specific instance.
    */
  def disable(): Unit = js.native
  /**
    * Enables the logging functionality of all loggers belonging to a specific instance.
    */
  def enable(): Unit = js.native
  def error(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def error(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def fatal(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def fatal(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def fav(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def fav(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def info(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def info(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Checks whether the logging functionality of a specific instance is enabled.
    *
    * @returns a boolean that describes whether or not the logger is enabled.
    */
  def isEnabled(): Boolean = js.native
  def log(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def log(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def note(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def note(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def pause(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def pause(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def pending(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def pending(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Defines the scope name of the logger.
    *
    * @param name Can be one or more comma delimited strings.
    */
  def scope(name: String*): Signale[DefaultMethods] = js.native
  def star(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def star(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def start(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def start(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def success(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def success(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Sets a timers and accepts an optional label. If none provided the timer will receive a unique label automatically.
    *
    * @param label Label corresponding to the timer. Each timer must have its own unique label.
    * @returns a string corresponding to the timer label.
    */
  def time(): String = js.native
  def time(label: String): String = js.native
  /**
    * Deactivates the timer to which the given label corresponds. If no label
    * is provided the most recent timer, that was created without providing a
    * label, will be deactivated.
    *
    * @param label Label corresponding to the timer, each timer has its own unique label.
    * @param span Total running time.
    */
  def timeEnd(): Label = js.native
  def timeEnd(label: js.UndefOr[scala.Nothing], span: Double): Label = js.native
  def timeEnd(label: String): Label = js.native
  def timeEnd(label: String, span: Double): Label = js.native
  /** Clears the scope name of the logger. */
  def unscope(): Unit = js.native
  def warn(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def warn(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def watch(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
  def watch(message: js.Any, optionalArgs: js.Any*): Unit = js.native
}

