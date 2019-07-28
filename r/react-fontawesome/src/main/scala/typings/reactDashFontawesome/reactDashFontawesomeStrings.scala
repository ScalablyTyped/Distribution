package typings.reactDashFontawesome

import typings.reactDashFontawesome.reactDashFontawesomeMod.FontAwesomeFlip
import typings.reactDashFontawesome.reactDashFontawesomeMod.FontAwesomeSize
import typings.reactDashFontawesome.reactDashFontawesomeMod.FontAwesomeStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashFontawesomeStrings {
  @js.native
  sealed trait `1x` extends FontAwesomeStack
  
  @js.native
  sealed trait `2x`
    extends FontAwesomeSize
       with FontAwesomeStack
  
  @js.native
  sealed trait `3x` extends FontAwesomeSize
  
  @js.native
  sealed trait `4x` extends FontAwesomeSize
  
  @js.native
  sealed trait `5x` extends FontAwesomeSize
  
  @js.native
  sealed trait horizontal extends FontAwesomeFlip
  
  @js.native
  sealed trait lg extends FontAwesomeSize
  
  @js.native
  sealed trait vertical extends FontAwesomeFlip
  
  @scala.inline
  def `1x`: `1x` = "1x".asInstanceOf[`1x`]
  @scala.inline
  def `2x`: `2x` = "2x".asInstanceOf[`2x`]
  @scala.inline
  def `3x`: `3x` = "3x".asInstanceOf[`3x`]
  @scala.inline
  def `4x`: `4x` = "4x".asInstanceOf[`4x`]
  @scala.inline
  def `5x`: `5x` = "5x".asInstanceOf[`5x`]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def lg: lg = "lg".asInstanceOf[lg]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

