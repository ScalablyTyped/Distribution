package typings.strange

import typings.strange.strangeMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object strangeStrings {
  @js.native
  sealed trait LeftparenthesisRightparenthesis extends Bounds
  
  @js.native
  sealed trait LeftparenthesisRightsquarebracket extends Bounds
  
  @js.native
  sealed trait LeftsquarebracketRightparenthesis extends Bounds
  
  @js.native
  sealed trait LeftsquarebracketRightsquarebracket extends Bounds
  
  @scala.inline
  def LeftparenthesisRightparenthesis: LeftparenthesisRightparenthesis = "()".asInstanceOf[LeftparenthesisRightparenthesis]
  @scala.inline
  def LeftparenthesisRightsquarebracket: LeftparenthesisRightsquarebracket = "(]".asInstanceOf[LeftparenthesisRightsquarebracket]
  @scala.inline
  def LeftsquarebracketRightparenthesis: LeftsquarebracketRightparenthesis = "[)".asInstanceOf[LeftsquarebracketRightparenthesis]
  @scala.inline
  def LeftsquarebracketRightsquarebracket: LeftsquarebracketRightsquarebracket = "[]".asInstanceOf[LeftsquarebracketRightsquarebracket]
}

