package typings.reactSwipeableViews

import typings.reactSwipeableViews.mod.AxisType
import typings.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSwipeableViewsStrings {
  
  @js.native
  sealed trait end
    extends StObject
       with OnSwitchingCallbackTypeDescriptor
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait move
    extends StObject
       with OnSwitchingCallbackTypeDescriptor
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait x
    extends StObject
       with AxisType
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait `x-reverse`
    extends StObject
       with AxisType
  @scala.inline
  def `x-reverse`: `x-reverse` = "x-reverse".asInstanceOf[`x-reverse`]
  
  @js.native
  sealed trait y
    extends StObject
       with AxisType
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait `y-reverse`
    extends StObject
       with AxisType
  @scala.inline
  def `y-reverse`: `y-reverse` = "y-reverse".asInstanceOf[`y-reverse`]
}
