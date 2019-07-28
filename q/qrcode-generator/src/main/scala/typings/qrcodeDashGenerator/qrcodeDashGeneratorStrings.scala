package typings.qrcodeDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object qrcodeDashGeneratorStrings {
  @js.native
  sealed trait Alphanumeric extends Mode
  
  @js.native
  sealed trait Byte extends Mode
  
  @js.native
  sealed trait H extends ErrorCorrectionLevel
  
  @js.native
  sealed trait Kanji extends Mode
  
  @js.native
  sealed trait L extends ErrorCorrectionLevel
  
  @js.native
  sealed trait M extends ErrorCorrectionLevel
  
  @js.native
  sealed trait Numeric extends Mode
  
  @js.native
  sealed trait Q extends ErrorCorrectionLevel
  
  @scala.inline
  def Alphanumeric: Alphanumeric = "Alphanumeric".asInstanceOf[Alphanumeric]
  @scala.inline
  def Byte: Byte = "Byte".asInstanceOf[Byte]
  @scala.inline
  def H: H = "H".asInstanceOf[H]
  @scala.inline
  def Kanji: Kanji = "Kanji".asInstanceOf[Kanji]
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  @scala.inline
  def M: M = "M".asInstanceOf[M]
  @scala.inline
  def Numeric: Numeric = "Numeric".asInstanceOf[Numeric]
  @scala.inline
  def Q: Q = "Q".asInstanceOf[Q]
}

