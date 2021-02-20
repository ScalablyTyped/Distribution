package typings.roll

import typings.roll.mod.RollTransformationKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollStrings {
  
  @js.native
  sealed trait InvalidInputError extends StObject
  @scala.inline
  def InvalidInputError: InvalidInputError = "InvalidInputError".asInstanceOf[InvalidInputError]
  
  @js.native
  sealed trait add extends RollTransformationKey
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait `best-of` extends RollTransformationKey
  @scala.inline
  def `best-of`: `best-of` = "best-of".asInstanceOf[`best-of`]
  
  @js.native
  sealed trait divide extends RollTransformationKey
  @scala.inline
  def divide: divide = "divide".asInstanceOf[divide]
  
  @js.native
  sealed trait multiply extends RollTransformationKey
  @scala.inline
  def multiply: multiply = "multiply".asInstanceOf[multiply]
  
  @js.native
  sealed trait subtract extends RollTransformationKey
  @scala.inline
  def subtract: subtract = "subtract".asInstanceOf[subtract]
  
  @js.native
  sealed trait sum extends RollTransformationKey
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait `worst-of` extends RollTransformationKey
  @scala.inline
  def `worst-of`: `worst-of` = "worst-of".asInstanceOf[`worst-of`]
}
