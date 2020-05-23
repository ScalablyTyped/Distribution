package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.ThreadFlowLocation.importance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadFlowLocation_ extends js.Object {
  /**
    * An integer representing the temporal order in which execution reached this location.
    */
  var executionOrder: js.UndefOr[Double] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which this location was executed.
    */
  var executionTimeUtc: js.UndefOr[String] = js.undefined
  /**
    * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most
    * to least important is "essential", "important", "unimportant". Default: "important".
    */
  var importance: js.UndefOr[importance] = js.undefined
  /**
    * The index within the run threadFlowLocations array.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * A set of distinct strings that categorize the thread flow location. Well-known kinds include 'acquire',
    * 'release', 'enter', 'exit', 'call', 'return', 'branch', 'implicit', 'false', 'true', 'caution', 'danger',
    * 'unknown', 'unreachable', 'taint', 'function', 'handler', 'lock', 'memory', 'resource', 'scope' and 'value'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The code location.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the module that contains the code that is executing.
    */
  var module: js.UndefOr[String] = js.undefined
  /**
    * An integer representing a containment hierarchy within the thread flow.
    */
  var nestingLevel: js.UndefOr[Double] = js.undefined
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
  var state: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow
    * location.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.undefined
  /**
    * A web request associated with this thread flow location.
    */
  var webRequest: js.UndefOr[WebRequest] = js.undefined
  /**
    * A web response associated with this thread flow location.
    */
  var webResponse: js.UndefOr[WebResponse] = js.undefined
}

object ThreadFlowLocation_ {
  @scala.inline
  def apply(
    executionOrder: js.UndefOr[Double] = js.undefined,
    executionTimeUtc: String = null,
    importance: importance = null,
    index: js.UndefOr[Double] = js.undefined,
    kinds: js.Array[String] = null,
    location: Location = null,
    module: String = null,
    nestingLevel: js.UndefOr[Double] = js.undefined,
    properties: PropertyBag = null,
    stack: Stack = null,
    state: StringDictionary[MultiformatMessageString] = null,
    taxa: js.Array[ReportingDescriptorReference] = null,
    webRequest: WebRequest = null,
    webResponse: WebResponse = null
  ): ThreadFlowLocation_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(executionOrder)) __obj.updateDynamic("executionOrder")(executionOrder.get.asInstanceOf[js.Any])
    if (executionTimeUtc != null) __obj.updateDynamic("executionTimeUtc")(executionTimeUtc.asInstanceOf[js.Any])
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (kinds != null) __obj.updateDynamic("kinds")(kinds.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevel)) __obj.updateDynamic("nestingLevel")(nestingLevel.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (taxa != null) __obj.updateDynamic("taxa")(taxa.asInstanceOf[js.Any])
    if (webRequest != null) __obj.updateDynamic("webRequest")(webRequest.asInstanceOf[js.Any])
    if (webResponse != null) __obj.updateDynamic("webResponse")(webResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadFlowLocation_]
  }
}

