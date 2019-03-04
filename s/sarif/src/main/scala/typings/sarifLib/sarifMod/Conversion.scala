package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conversion extends js.Object {
  /**
    * The locations of the analysis tool's per-run log files.
    */
  var analysisToolLogFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.undefined
  /**
    * An invocation object that describes the invocation of the converter.
    */
  var invocation: js.UndefOr[Invocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the conversion.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A tool object that describes the converter.
    */
  var tool: Tool
}

object Conversion {
  @scala.inline
  def apply(
    tool: Tool,
    analysisToolLogFiles: js.Array[ArtifactLocation] = null,
    invocation: Invocation = null,
    properties: PropertyBag = null
  ): Conversion = {
    val __obj = js.Dynamic.literal(tool = tool)
    if (analysisToolLogFiles != null) __obj.updateDynamic("analysisToolLogFiles")(analysisToolLogFiles)
    if (invocation != null) __obj.updateDynamic("invocation")(invocation)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Conversion]
  }
}

