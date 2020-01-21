package typings.roxReactNative.mod

import typings.roxReactNative.roxReactNativeStrings.`false`
import typings.roxReactNative.roxReactNativeStrings.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-react-native", "overrides")
@js.native
object overrides extends js.Object {
  /**
    * Clears the override value from the flag (and the disk).
    *
    * https://support.rollout.io/docs/reactnative#section--rox-overrides-clearoverride-
    */
  def clearOverride(nameSpacedFlagName: String): Unit = js.native
  def getOriginalValue(nameSpacedFlagName: String): String = js.native
  /**
    * full flag name including namespace
    *
    * https://support.rollout.io/docs/reactnative#section--rox-overrides-hasoverride-
    */
  def hasOverride(nameSpacedFlagName: String): Boolean = js.native
  /**
    * Sets an override value on a specific flag, this function accepts two parameters flag name (
    * full flag name including namespace) and desired value (from type String).
    * This function also saves the override value on the local device disk,
    * so it is "remembered" for the next the SDK is loaded to production.
    *
    * https://support.rollout.io/docs/reactnative#section--rox-overrides-setoverride-
    *
    * Note that for boolean flag we still give the value as a string.
    */
  def setOverride(nameSpacedFlagName: String, value: String): Unit = js.native
  @JSName("setOverride")
  def setOverride_false(nameSpacedFlagName: String, value: `false`): Unit = js.native
  @JSName("setOverride")
  def setOverride_true(nameSpacedFlagName: String, value: `true`): Unit = js.native
}

