package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadFlowLocation extends js.Object {
  /**
    * An integer representing the temporal order in which execution reached this location.
    */
  var executionOrder: js.UndefOr[scala.Double] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which this location was executed.
    */
  var executionTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most
    * to least important is "essential", "important", "unimportant". Default: "important".
    */
  var importance: js.UndefOr[sarifLib.sarifMod.ThreadFlowLocationNs.importance] = js.undefined
  /**
    * The index within the run threadFlowLocations array.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * A set of distinct strings that categorize the thread flow location. Well-known kinds include acquire, release,
    * enter, exit, call, return, branch, implicit, false, true, caution, danger, unknown, unreachable, taint,
    * function, handler, lock, memory, resource, and scope.
    */
  var kinds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The code location.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the module that contains the code that is executing.
    */
  var module: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An integer representing a containment hierarchy within the thread flow.
    */
  var nestingLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the threadflow location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The call stack leading to this location.
    */
  var stack: js.UndefOr[Stack] = js.undefined
  /**
    * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents
    * the variable or expression value. For an annotation of kind 'continuation', for example, this dictionary might
    * hold the current assumed values of a set of global variables.
    */
  var state: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object ThreadFlowLocation {
  @scala.inline
  def apply(
    executionOrder: scala.Int | scala.Double = null,
    executionTimeUtc: java.lang.String = null,
    importance: sarifLib.sarifMod.ThreadFlowLocationNs.importance = null,
    index: scala.Int | scala.Double = null,
    kinds: js.Array[java.lang.String] = null,
    location: Location = null,
    module: java.lang.String = null,
    nestingLevel: scala.Int | scala.Double = null,
    properties: PropertyBag = null,
    stack: Stack = null,
    state: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ThreadFlowLocation = {
    val __obj = js.Dynamic.literal()
    if (executionOrder != null) __obj.updateDynamic("executionOrder")(executionOrder.asInstanceOf[js.Any])
    if (executionTimeUtc != null) __obj.updateDynamic("executionTimeUtc")(executionTimeUtc)
    if (importance != null) __obj.updateDynamic("importance")(importance)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kinds != null) __obj.updateDynamic("kinds")(kinds)
    if (location != null) __obj.updateDynamic("location")(location)
    if (module != null) __obj.updateDynamic("module")(module)
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ThreadFlowLocation]
  }
}

