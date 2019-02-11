package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProvenance extends js.Object {
  /**
    * An array of physicalLocation objects which specify the portions of an analysis tool's output that a
    * converter transformed into the result.
    */
  var conversionSources: js.UndefOr[js.Array[PhysicalLocation]] = js.undefined
  /**
    * A GUID-valued string equal to the id.instanceGuid property of the run in which the result was first
    * detected.
    */
  var firstDetectionRunInstanceGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was first detected. See "Date/time
    * properties" in the SARIF spec for the required format.
    */
  var firstDetectionTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index within the run.invocations array of the invocation object which describes the tool invocation that
    * detected the result.
    */
  var invocationIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * A GUID-valued string equal to the id.instanceGuid property of the run in which the result was most recently
    * detected.
    */
  var lastDetectionRunInstanceGuid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See
    * "Date/time properties" in the SARIF spec for the required format.
    */
  var lastDetectionTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

