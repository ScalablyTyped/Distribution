package typings.spected

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object spectedStrings {
  @js.native
  sealed trait Result extends js.Object
  
  @js.native
  sealed trait SpecObject extends js.Object
  
  @scala.inline
  def Result: Result = "Result".asInstanceOf[Result]
  @scala.inline
  def SpecObject: SpecObject = "SpecObject".asInstanceOf[SpecObject]
}

