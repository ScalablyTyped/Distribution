package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tool extends js.Object {
  /**
    * The analysis tool that was run.
    */
  var driver: ToolComponent
  /**
    * Tool extensions that contributed to or reconfigured the analysis tool that was run.
    */
  var extensions: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  /**
    * The tool language (expressed as an ISO 649 two-letter lowercase culture code) and region (expressed as an ISO
    * 3166 two-letter uppercase subculture code associated with a country or region).
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the tool.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Tool {
  @scala.inline
  def apply(
    driver: ToolComponent,
    extensions: js.Array[ToolComponent] = null,
    language: java.lang.String = null,
    properties: PropertyBag = null
  ): Tool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("driver")(driver)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (language != null) __obj.updateDynamic("language")(language)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Tool]
  }
}

