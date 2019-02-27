package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingConfigurationOverride extends js.Object {
  /**
    * Specifies how the report was configured during the scan.
    */
  var configuration: js.UndefOr[ReportingConfiguration] = js.undefined
  /**
    * The index within the run.tool.extensions array of the toolComponent object which describes the plug-in or tool
    * extension that produced the report.
    */
  var extensionIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The index within the toolComponent.notificationDescriptors array of the reportingDescriptor associated with this
    * override.
    */
  var notificationIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The index within the toolComponent.ruleDescriptors array of the reportingDescriptor associated with this
    * override.
    */
  var ruleIndex: js.UndefOr[scala.Double] = js.undefined
}

