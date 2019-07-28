package typings.sarif.sarifMod

import typings.sarif.sarifMod.ReportingConfigurationNs.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingConfiguration extends js.Object {
  /**
    * Specifies whether the report may be produced during the scan.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the failure level for the report.
    */
  var level: js.UndefOr[typings.sarif.sarifMod.ReportingConfigurationNs.level] = js.undefined
  /**
    * Contains configuration information specific to a report.
    */
  var parameters: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Specifies the relative priority of the report. Used for analysis output only.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object ReportingConfiguration {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    level: level = null,
    parameters: PropertyBag = null,
    properties: PropertyBag = null,
    rank: Int | Double = null
  ): ReportingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (level != null) __obj.updateDynamic("level")(level)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingConfiguration]
  }
}

