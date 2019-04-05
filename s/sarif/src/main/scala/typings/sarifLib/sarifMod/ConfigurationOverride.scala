package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOverride extends js.Object {
  /**
    * Specifies how the report was configured during the scan.
    */
  var configuration: ReportingConfiguration
  /**
    * A reference used to locate the descriptor relevant to this configuration override.
    */
  var descriptor: ReportingDescriptorReference
  /**
    * Key/value pairs that provide additional information about the reporting configuration.
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
    val __obj = js.Dynamic.literal(configuration = configuration, descriptor = descriptor)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ConfigurationOverride]
  }
}

