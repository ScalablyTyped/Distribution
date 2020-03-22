package typings.schemaUtils.rangeMod

import typings.schemaUtils.schemaUtilsStrings.Greaterthansign
import typings.schemaUtils.schemaUtilsStrings.GreaterthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.Lessthansign
import typings.schemaUtils.schemaUtilsStrings.LessthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/util/Range", "getOperator")
@js.native
object getOperator_left extends js.Object {
  /**
    * @param {"left" | "right"} side
    * @param {boolean} exclusive
    * @returns {">" | ">=" | "<" | "<="}
    */
  def apply(side: left, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = js.native
}

