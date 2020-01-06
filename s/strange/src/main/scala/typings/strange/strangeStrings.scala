package typings.strange

import typings.strange.strangeMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object strangeStrings {
  @js.native
  sealed trait LeftparenthesisRightparenthesis extends Bounds
  
  @js.native
  sealed trait `Leftparenthesis]` extends Bounds
  
  @js.native
  sealed trait `[Rightparenthesis` extends Bounds
  
  @js.native
  sealed trait `[]` extends Bounds
  
  @scala.inline
  def LeftparenthesisRightparenthesis: LeftparenthesisRightparenthesis = "()".asInstanceOf[LeftparenthesisRightparenthesis]
  @scala.inline
  def `Leftparenthesis]`: `Leftparenthesis]` = "(]".asInstanceOf[`Leftparenthesis]`]
  @scala.inline
  def `[Rightparenthesis`: `[Rightparenthesis` = "[)".asInstanceOf[`[Rightparenthesis`]
  @scala.inline
  def `[]`: `[]` = "[]".asInstanceOf[`[]`]
}

