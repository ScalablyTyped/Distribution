package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultProvenance extends js.Object {
  /**
    * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter
    * transformed into the result.
    */
  var conversionSources: js.UndefOr[js.Array[PhysicalLocation]] = js.native
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first
    * detected.
    */
  var firstDetectionRunGuid: js.UndefOr[String] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time
    * properties" in the SARIF spec for the required format.
    */
  var firstDetectionTimeUtc: js.UndefOr[String] = js.native
  /**
    * The index within the run.invocations array of the invocation object which describes the tool invocation that
    * detected the result.
    */
  var invocationIndex: js.UndefOr[Double] = js.native
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most
    * recently detected.
    */
  var lastDetectionRunGuid: js.UndefOr[String] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastDetectionTimeUtc: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object ResultProvenance {
  @scala.inline
  def apply(): ResultProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultProvenance]
  }
  @scala.inline
  implicit class ResultProvenanceOps[Self <: ResultProvenance] (val x: Self) extends AnyVal {
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
    def setConversionSourcesVarargs(value: PhysicalLocation*): Self = this.set("conversionSources", js.Array(value :_*))
    @scala.inline
    def setConversionSources(value: js.Array[PhysicalLocation]): Self = this.set("conversionSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionSources: Self = this.set("conversionSources", js.undefined)
    @scala.inline
    def setFirstDetectionRunGuid(value: String): Self = this.set("firstDetectionRunGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDetectionRunGuid: Self = this.set("firstDetectionRunGuid", js.undefined)
    @scala.inline
    def setFirstDetectionTimeUtc(value: String): Self = this.set("firstDetectionTimeUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDetectionTimeUtc: Self = this.set("firstDetectionTimeUtc", js.undefined)
    @scala.inline
    def setInvocationIndex(value: Double): Self = this.set("invocationIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocationIndex: Self = this.set("invocationIndex", js.undefined)
    @scala.inline
    def setLastDetectionRunGuid(value: String): Self = this.set("lastDetectionRunGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDetectionRunGuid: Self = this.set("lastDetectionRunGuid", js.undefined)
    @scala.inline
    def setLastDetectionTimeUtc(value: String): Self = this.set("lastDetectionTimeUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDetectionTimeUtc: Self = this.set("lastDetectionTimeUtc", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

