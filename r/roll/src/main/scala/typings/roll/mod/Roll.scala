package typings.roll.mod

import typings.roll.anon.Quantity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Roll extends js.Object {
  
  /**
    * Parse a string into a roll object
    * @throws InvalidInputError
    */
  def parse(input: String): Quantity = js.native
  
  /**
    * Roll based on a string or roll object
    */
  def roll(input: String): RollOutput = js.native
  def roll(input: RollObject): RollOutput = js.native
  
  /**
    * Validate user input
    */
  def validate(input: String): Boolean = js.native
}
