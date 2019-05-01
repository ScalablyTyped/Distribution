package typings
package rollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rollLibStrings {
  @js.native
  sealed trait InvalidInputError extends js.Object
  
  @js.native
  sealed trait add
    extends rollLib.rollMod.RollTransformationKey
  
  @js.native
  sealed trait `best-of`
    extends rollLib.rollMod.RollTransformationKey
  
  @js.native
  sealed trait divide
    extends rollLib.rollMod.RollTransformationKey
  
  @js.native
  sealed trait multiply
    extends rollLib.rollMod.RollTransformationKey
  
  @js.native
  sealed trait subtract
    extends rollLib.rollMod.RollTransformationKey
  
  @js.native
  sealed trait sum
    extends rollLib.rollMod.RollTransformationKey
  
  @js.native
  sealed trait `worst-of`
    extends rollLib.rollMod.RollTransformationKey
  
  @scala.inline
  def InvalidInputError: InvalidInputError = "InvalidInputError".asInstanceOf[InvalidInputError]
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def `best-of`: `best-of` = "best-of".asInstanceOf[`best-of`]
  @scala.inline
  def divide: divide = "divide".asInstanceOf[divide]
  @scala.inline
  def multiply: multiply = "multiply".asInstanceOf[multiply]
  @scala.inline
  def subtract: subtract = "subtract".asInstanceOf[subtract]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def `worst-of`: `worst-of` = "worst-of".asInstanceOf[`worst-of`]
}

