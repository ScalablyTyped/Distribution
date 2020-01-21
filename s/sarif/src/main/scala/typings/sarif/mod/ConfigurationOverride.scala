package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOverride extends js.Object {
  /**
    * Specifies how the rule or notification was configured during the scan.
    */
  var configuration: ReportingConfiguration
  /**
    * A reference used to locate the descriptor whose configuration was overridden.
    */
  var descriptor: ReportingDescriptorReference
  /**
    * Key/value pairs that provide additional information about the configuration override.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ConfigurationOverride {
  @scala.inline
  def apply(
    configuration: ReportingConfiguration,
    descriptor: ReportingDescriptorReference,
    properties: PropertyBag = null
  ): ConfigurationOverride = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOverride]
  }
}

