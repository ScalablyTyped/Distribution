package typings.roxDashNode.roxDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rox-node", "dynamicApi")
@js.native
object dynamicApiNs extends js.Object {
  /**
    * Getting boolean value of a flag
    */
  def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean): Boolean = js.native
  def isEnabled(nameSpacedFlagName: String, defaultValue: Boolean, context: js.Any): Boolean = js.native
  /**
    * Getting string value of a Variant flag
    */
  def value(nameSpacedFlagName: String, defaultValue: String): String = js.native
  def value(nameSpacedFlagName: String, defaultValue: String, context: js.Any): String = js.native
}

