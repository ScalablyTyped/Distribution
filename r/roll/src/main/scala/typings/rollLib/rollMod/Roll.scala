package typings
package rollLib.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Roll extends js.Object {
  /**
    * Parse a string into a roll object
    * @throws InvalidInputError
    */
  def parse(input: java.lang.String): rollLib.Anon_Transformations = js.native
  /**
    * Roll based on a string or roll object
    */
  def roll(input: java.lang.String): RollOutput = js.native
  def roll(input: RollObject): RollOutput = js.native
  /**
    * Validate user input
    */
  def validate(input: java.lang.String): scala.Boolean = js.native
}

