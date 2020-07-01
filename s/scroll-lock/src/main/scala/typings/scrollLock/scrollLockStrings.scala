package typings.scrollLock

import typings.scrollLock.mod.FillGapMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scrollLockStrings {
  @js.native
  sealed trait margin extends FillGapMethod
  
  @js.native
  sealed trait `max-width` extends FillGapMethod
  
  @js.native
  sealed trait none extends FillGapMethod
  
  @js.native
  sealed trait padding extends FillGapMethod
  
  @js.native
  sealed trait width extends FillGapMethod
  
  @scala.inline
  def margin: margin = "margin".asInstanceOf[margin]
  @scala.inline
  def `max-width`: `max-width` = "max-width".asInstanceOf[`max-width`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  @scala.inline
  def width: width = "width".asInstanceOf[width]
}

