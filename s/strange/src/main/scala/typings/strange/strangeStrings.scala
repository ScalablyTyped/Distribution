package typings.strange

import typings.strange.strangeMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object strangeStrings {
  @js.native
  sealed trait `()` extends Bounds
  
  @js.native
  sealed trait `(]` extends Bounds
  
  @js.native
  sealed trait `[)` extends Bounds
  
  @js.native
  sealed trait `[]` extends Bounds
  
  @scala.inline
  def `()`: `()` = "()".asInstanceOf[`()`]
  @scala.inline
  def `(]`: `(]` = "(]".asInstanceOf[`(]`]
  @scala.inline
  def `[)`: `[)` = "[)".asInstanceOf[`[)`]
  @scala.inline
  def `[]`: `[]` = "[]".asInstanceOf[`[]`]
}

