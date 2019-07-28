package typings.sarif.sarifMod

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
    * Key/value pairs that provide additional information about the tool.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Tool {
  @scala.inline
  def apply(driver: ToolComponent, extensions: js.Array[ToolComponent] = null, properties: PropertyBag = null): Tool = {
    val __obj = js.Dynamic.literal(driver = driver)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Tool]
  }
}

