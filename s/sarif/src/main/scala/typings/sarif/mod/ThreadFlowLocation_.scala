package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.ThreadFlowLocation.importance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadFlowLocation_ extends js.Object {
  /**
    * An integer representing the temporal order in which execution reached this location.
    */
  var executionOrder: js.UndefOr[Double] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which this location was executed.
    */
  var executionTimeUtc: js.UndefOr[String] = js.native
  /**
    * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most
    * to least important is "essential", "important", "unimportant". Default: "important".
    */
  var importance: js.UndefOr[importance] = js.native
  /**
    * The index within the run threadFlowLocations array.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * A set of distinct strings that categorize the thread flow location. Well-known kinds include 'acquire',
    * 'release', 'enter', 'exit', 'call', 'return', 'branch', 'implicit', 'false', 'true', 'caution', 'danger',
    * 'unknown', 'unreachable', 'taint', 'function', 'handler', 'lock', 'memory', 'resource', 'scope' and 'value'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The code location.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * The name of the module that contains the code that is executing.
    */
  var module: js.UndefOr[String] = js.native
  /**
    * An integer representing a containment hierarchy within the thread flow.
    */
  var nestingLevel: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the threadflow location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The call stack leading to this location.
    */
  var stack: js.UndefOr[Stack] = js.native
  /**
    * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents
    * the variable or expression value. For an annotation of kind 'continuation', for example, this dictionary might
    * hold the current assumed values of a set of global variables.
    */
  var state: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow
    * location.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.native
  /**
    * A web request associated with this thread flow location.
    */
  var webRequest: js.UndefOr[WebRequest] = js.native
  /**
    * A web response associated with this thread flow location.
    */
  var webResponse: js.UndefOr[WebResponse] = js.native
}

object ThreadFlowLocation_ {
  @scala.inline
  def apply(): ThreadFlowLocation_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadFlowLocation_]
  }
  @scala.inline
  implicit class ThreadFlowLocation_Ops[Self <: ThreadFlowLocation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecutionOrder(value: Double): Self = this.set("executionOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionOrder: Self = this.set("executionOrder", js.undefined)
    @scala.inline
    def setExecutionTimeUtc(value: String): Self = this.set("executionTimeUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionTimeUtc: Self = this.set("executionTimeUtc", js.undefined)
    @scala.inline
    def setImportance(value: importance): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setKindsVarargs(value: String*): Self = this.set("kinds", js.Array(value :_*))
    @scala.inline
    def setKinds(value: js.Array[String]): Self = this.set("kinds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinds: Self = this.set("kinds", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setNestingLevel(value: Double): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setStack(value: Stack): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setState(value: StringDictionary[MultiformatMessageString]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTaxaVarargs(value: ReportingDescriptorReference*): Self = this.set("taxa", js.Array(value :_*))
    @scala.inline
    def setTaxa(value: js.Array[ReportingDescriptorReference]): Self = this.set("taxa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxa: Self = this.set("taxa", js.undefined)
    @scala.inline
    def setWebRequest(value: WebRequest): Self = this.set("webRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebRequest: Self = this.set("webRequest", js.undefined)
    @scala.inline
    def setWebResponse(value: WebResponse): Self = this.set("webResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebResponse: Self = this.set("webResponse", js.undefined)
  }
  
}

