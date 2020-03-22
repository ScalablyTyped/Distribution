package typings.signale

import typings.signale.mod.LoggerFunc
import typings.signale.mod.SignaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined signale.signale.Signale<signale.signale.DefaultMethods> */
@js.native
trait SignaleDefaultMethodsAwait extends js.Object {
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
  def await(): Unit = js.native
  def await(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def complete(): Unit = js.native
  def complete(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Sets the configuration of an instance overriding any existing global or local configuration.
    *
    * @param configObj Can hold any of the documented options.
    */
  def config(configObj: SignaleConfig): SignaleDefaultMethods = js.native
  def debug(): Unit = js.native
  def debug(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def error(): Unit = js.native
  def error(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def fatal(): Unit = js.native
  def fatal(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def fav(): Unit = js.native
  def fav(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def info(): Unit = js.native
  def info(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def note(): Unit = js.native
  def note(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def pause(): Unit = js.native
  def pause(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def pending(): Unit = js.native
  def pending(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  /**
    * Defines the scope name of the logger.
    *
    * @param name Can be one or more comma delimited strings.
    */
  def scope(name: String*): SignaleDefaultMethods = js.native
  def star(): Unit = js.native
  def star(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def start(): Unit = js.native
  def start(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def success(): Unit = js.native
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
  def timeEnd(): AnonLabel = js.native
  def timeEnd(label: String): AnonLabel = js.native
  def timeEnd(label: String, span: Double): AnonLabel = js.native
  /** Clears the scope name of the logger. */
  def unscope(): Unit = js.native
  def warn(): Unit = js.native
  def warn(message: js.Any, optionalArgs: js.Any*): Unit = js.native
  def watch(): Unit = js.native
  def watch(message: js.Any, optionalArgs: js.Any*): Unit = js.native
}

