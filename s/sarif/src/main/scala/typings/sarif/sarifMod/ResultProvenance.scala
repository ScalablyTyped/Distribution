package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProvenance extends js.Object {
  /**
    * An array of physicalLocation objects which specify the portions of an analysis tool's output that a converter
    * transformed into the result.
    */
  var conversionSources: js.UndefOr[js.Array[PhysicalLocation]] = js.undefined
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first
    * detected.
    */
  var firstDetectionRunGuid: js.UndefOr[String] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time
    * properties" in the SARIF spec for the required format.
    */
  var firstDetectionTimeUtc: js.UndefOr[String] = js.undefined
  /**
    * The index within the run.invocations array of the invocation object which describes the tool invocation that
    * detected the result.
    */
  var invocationIndex: js.UndefOr[Double] = js.undefined
  /**
    * A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most
    * recently detected.
    */
  var lastDetectionRunGuid: js.UndefOr[String] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastDetectionTimeUtc: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ResultProvenance {
  @scala.inline
  def apply(
    conversionSources: js.Array[PhysicalLocation] = null,
    firstDetectionRunGuid: String = null,
    firstDetectionTimeUtc: String = null,
    invocationIndex: Int | Double = null,
    lastDetectionRunGuid: String = null,
    lastDetectionTimeUtc: String = null,
    properties: PropertyBag = null
  ): ResultProvenance = {
    val __obj = js.Dynamic.literal()
    if (conversionSources != null) __obj.updateDynamic("conversionSources")(conversionSources.asInstanceOf[js.Any])
    if (firstDetectionRunGuid != null) __obj.updateDynamic("firstDetectionRunGuid")(firstDetectionRunGuid.asInstanceOf[js.Any])
    if (firstDetectionTimeUtc != null) __obj.updateDynamic("firstDetectionTimeUtc")(firstDetectionTimeUtc.asInstanceOf[js.Any])
    if (invocationIndex != null) __obj.updateDynamic("invocationIndex")(invocationIndex.asInstanceOf[js.Any])
    if (lastDetectionRunGuid != null) __obj.updateDynamic("lastDetectionRunGuid")(lastDetectionRunGuid.asInstanceOf[js.Any])
    if (lastDetectionTimeUtc != null) __obj.updateDynamic("lastDetectionTimeUtc")(lastDetectionTimeUtc.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProvenance]
  }
}

