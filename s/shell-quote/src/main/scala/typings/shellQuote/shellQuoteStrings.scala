package typings.shellQuote

import typings.shellQuote.mod.ControlOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object shellQuoteStrings {
  @js.native
  sealed trait Ampersand extends ControlOperator
  
  @js.native
  sealed trait AmpersandAmpersand extends ControlOperator
  
  @js.native
  sealed trait Greaterthansign extends ControlOperator
  
  @js.native
  sealed trait GreaterthansignAmpersand extends ControlOperator
  
  @js.native
  sealed trait GreaterthansignGreaterthansign extends ControlOperator
  
  @js.native
  sealed trait Leftparenthesis extends ControlOperator
  
  @js.native
  sealed trait Lessthansign extends ControlOperator
  
  @js.native
  sealed trait LessthansignLeftparenthesis extends ControlOperator
  
  @js.native
  sealed trait Rightparenthesis extends ControlOperator
  
  @js.native
  sealed trait Semicolon extends ControlOperator
  
  @js.native
  sealed trait SemicolonSemicolon extends ControlOperator
  
  @js.native
  sealed trait Verticalline extends ControlOperator
  
  @js.native
  sealed trait VerticallineAmpersand extends ControlOperator
  
  @js.native
  sealed trait VerticallineVerticalline extends ControlOperator
  
  @js.native
  sealed trait glob extends js.Object
  
  @scala.inline
  def Ampersand: Ampersand = "&".asInstanceOf[Ampersand]
  @scala.inline
  def AmpersandAmpersand: AmpersandAmpersand = "&&".asInstanceOf[AmpersandAmpersand]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GreaterthansignAmpersand: GreaterthansignAmpersand = ">&".asInstanceOf[GreaterthansignAmpersand]
  @scala.inline
  def GreaterthansignGreaterthansign: GreaterthansignGreaterthansign = ">>".asInstanceOf[GreaterthansignGreaterthansign]
  @scala.inline
  def Leftparenthesis: Leftparenthesis = "(".asInstanceOf[Leftparenthesis]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LessthansignLeftparenthesis: LessthansignLeftparenthesis = "<(".asInstanceOf[LessthansignLeftparenthesis]
  @scala.inline
  def Rightparenthesis: Rightparenthesis = ")".asInstanceOf[Rightparenthesis]
  @scala.inline
  def Semicolon: Semicolon = ";".asInstanceOf[Semicolon]
  @scala.inline
  def SemicolonSemicolon: SemicolonSemicolon = ";;".asInstanceOf[SemicolonSemicolon]
  @scala.inline
  def Verticalline: Verticalline = "|".asInstanceOf[Verticalline]
  @scala.inline
  def VerticallineAmpersand: VerticallineAmpersand = "|&".asInstanceOf[VerticallineAmpersand]
  @scala.inline
  def VerticallineVerticalline: VerticallineVerticalline = "||".asInstanceOf[VerticallineVerticalline]
  @scala.inline
  def glob: glob = "glob".asInstanceOf[glob]
}

