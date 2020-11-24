package typings.signale.mod

import typings.signale.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignaleBase[TTypes /* <: String */] extends js.Object {
  
  /**
    * Adds new secrets/sensitive-information to the targeted Signale instance.
    *
    * @param secrets Array holding the secrets/sensitive-information to be filtered out.
    */
  def addSecrets(secrets: js.Array[Double | String]): Unit = js.native
  
  /**
    * Removes all secrets/sensitive-information from the targeted Signale instance.
    */
  def clearSecrets(): Unit = js.native
  
  /**
    * Sets the configuration of an instance overriding any existing global or local configuration.
    *
    * @param configObj Can hold any of the documented options.
    */
  def config(configObj: SignaleConfig): Signale[TTypes] = js.native
  
  /**
    * Disables the logging functionality of all loggers belonging to a specific instance.
    */
  def disable(): Unit = js.native
  
  /**
    * Enables the logging functionality of all loggers belonging to a specific instance.
    */
  def enable(): Unit = js.native
  
  /**
    * Checks whether the logging functionality of a specific instance is enabled.
    *
    * @returns a boolean that describes whether or not the logger is enabled.
    */
  def isEnabled(): Boolean = js.native
  
  /**
    * Defines the scope name of the logger.
    *
    * @param name Can be one or more comma delimited strings.
    */
  def scope(name: String*): Signale[TTypes] = js.native
  
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
}
