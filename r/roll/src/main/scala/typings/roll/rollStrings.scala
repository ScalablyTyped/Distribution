package typings.roll

import typings.roll.mod.RollTransformationKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rollStrings {
  @js.native
  sealed trait InvalidInputError extends js.Object
  
  @js.native
  sealed trait add extends RollTransformationKey
  
  @js.native
  sealed trait `best-of` extends RollTransformationKey
  
  @js.native
  sealed trait divide extends RollTransformationKey
  
  @js.native
  sealed trait multiply extends RollTransformationKey
  
  @js.native
  sealed trait subtract extends RollTransformationKey
  
  @js.native
  sealed trait sum extends RollTransformationKey
  
  @js.native
  sealed trait `worst-of` extends RollTransformationKey
  
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

