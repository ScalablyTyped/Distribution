package typings.reactSwipeableViews

import typings.reactSwipeableViews.mod.AxisType
import typings.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSwipeableViewsStrings {
  @js.native
  sealed trait end extends OnSwitchingCallbackTypeDescriptor
  
  @js.native
  sealed trait move extends OnSwitchingCallbackTypeDescriptor
  
  @js.native
  sealed trait x extends AxisType
  
  @js.native
  sealed trait `x-reverse` extends AxisType
  
  @js.native
  sealed trait y extends AxisType
  
  @js.native
  sealed trait `y-reverse` extends AxisType
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def `x-reverse`: `x-reverse` = "x-reverse".asInstanceOf[`x-reverse`]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  @scala.inline
  def `y-reverse`: `y-reverse` = "y-reverse".asInstanceOf[`y-reverse`]
}

