package typings.shellQuote

import typings.shellQuote.mod.ControlOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shellQuoteStrings {
  
  @js.native
  sealed trait Ampersand extends ControlOperator
  @scala.inline
  def Ampersand: Ampersand = "&".asInstanceOf[Ampersand]
  
  @js.native
  sealed trait AmpersandAmpersand extends ControlOperator
  @scala.inline
  def AmpersandAmpersand: AmpersandAmpersand = "&&".asInstanceOf[AmpersandAmpersand]
  
  @js.native
  sealed trait Greaterthansign extends ControlOperator
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignAmpersand extends ControlOperator
  @scala.inline
  def GreaterthansignAmpersand: GreaterthansignAmpersand = ">&".asInstanceOf[GreaterthansignAmpersand]
  
  @js.native
  sealed trait GreaterthansignGreaterthansign extends ControlOperator
  @scala.inline
  def GreaterthansignGreaterthansign: GreaterthansignGreaterthansign = ">>".asInstanceOf[GreaterthansignGreaterthansign]
  
  @js.native
  sealed trait Leftparenthesis extends ControlOperator
  @scala.inline
  def Leftparenthesis: Leftparenthesis = "(".asInstanceOf[Leftparenthesis]
  
  @js.native
  sealed trait Lessthansign extends ControlOperator
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignLeftparenthesis extends ControlOperator
  @scala.inline
  def LessthansignLeftparenthesis: LessthansignLeftparenthesis = "<(".asInstanceOf[LessthansignLeftparenthesis]
  
  @js.native
  sealed trait Rightparenthesis extends ControlOperator
  @scala.inline
  def Rightparenthesis: Rightparenthesis = ")".asInstanceOf[Rightparenthesis]
  
  @js.native
  sealed trait Semicolon extends ControlOperator
  @scala.inline
  def Semicolon: Semicolon = ";".asInstanceOf[Semicolon]
  
  @js.native
  sealed trait SemicolonSemicolon extends ControlOperator
  @scala.inline
  def SemicolonSemicolon: SemicolonSemicolon = ";;".asInstanceOf[SemicolonSemicolon]
  
  @js.native
  sealed trait Verticalline extends ControlOperator
  @scala.inline
  def Verticalline: Verticalline = "|".asInstanceOf[Verticalline]
  
  @js.native
  sealed trait VerticallineAmpersand extends ControlOperator
  @scala.inline
  def VerticallineAmpersand: VerticallineAmpersand = "|&".asInstanceOf[VerticallineAmpersand]
  
  @js.native
  sealed trait VerticallineVerticalline extends ControlOperator
  @scala.inline
  def VerticallineVerticalline: VerticallineVerticalline = "||".asInstanceOf[VerticallineVerticalline]
  
  @js.native
  sealed trait glob extends StObject
  @scala.inline
  def glob: glob = "glob".asInstanceOf[glob]
}
