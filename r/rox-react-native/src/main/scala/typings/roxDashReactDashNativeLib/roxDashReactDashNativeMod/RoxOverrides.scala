package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoxOverrides extends js.Object {
  /**
    * Clears the override value from the flag (and the disk).
    *
    * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-clearoverride-
    */
  def clearOverride(nameSpacedFlagName: java.lang.String): scala.Unit = js.native
  def getOriginalValue(nameSpacedFlagName: java.lang.String): java.lang.String = js.native
  /**
    * full flag name including namespace
    *
    * https://support.rollout.io/docs/javascript-browser-api#section--rox-overrides-hasoverride-
    */
  def hasOverride(nameSpacedFlagName: java.lang.String): scala.Boolean = js.native
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
  def setOverride(nameSpacedFlagName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  @JSName("setOverride")
  def setOverride_false(
    nameSpacedFlagName: java.lang.String,
    value: roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.`false`
  ): scala.Unit = js.native
  @JSName("setOverride")
  def setOverride_true(
    nameSpacedFlagName: java.lang.String,
    value: roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.`true`
  ): scala.Unit = js.native
}

