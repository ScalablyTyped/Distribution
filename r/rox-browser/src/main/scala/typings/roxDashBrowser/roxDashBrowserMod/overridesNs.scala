package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-browser", "overrides")
@js.native
object overridesNs extends js.Object {
  /**
    * Clears all override values
    */
  def clearAllOverrides(): Unit = js.native
  /**
    * Clears the override value from the flag (and the disk).
    *
    * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-clearoverride-
    */
  def clearOverride(nameSpacedFlagName: String): Unit = js.native
  def getOriginalValue(nameSpacedFlagName: String): String = js.native
  /**
    * full flag name including namespace
    *
    * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-hasoverride-
    */
  def hasOverride(nameSpacedFlagName: String): Boolean = js.native
  /**
    * Sets an override value on a specific flag, this function accepts two parameters flag name (
    * full flag name including namespace) and desired value (from type String).
    * This function also saves the override value on the local device disk,
    * so it is "remembered" for the next the SDK is loaded to production.
    *
    * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-setoverride-
    *
    * Note that for boolean flag we still give the value as a string.
    */
  def setOverride(nameSpacedFlagName: String, value: String): Unit = js.native
}

