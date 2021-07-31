package typings.rcSlider

import typings.rcSlider.anon.Marks
import typings.rcSlider.anon.Max
import typings.rcSlider.anon.Min
import typings.rcSlider.anon.Target
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rc-slider/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculateNextValue(func: js.Any, value: js.Any, props: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateNextValue")(func.asInstanceOf[js.Any], value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ensureValueInRange(`val`: Double, hasMaxMin: Min): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureValueInRange")(`val`.asInstanceOf[js.Any], hasMaxMin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def ensureValuePrecision(`val`: Double, props: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureValuePrecision")(`val`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getClosestPoint(`val`: Double, hasMarksStepMinMax: Marks): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClosestPoint")(`val`.asInstanceOf[js.Any], hasMarksStepMinMax.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getHandleCenterPosition(vertical: Boolean, handle: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHandleCenterPosition")(vertical.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getKeyboardValueMutator(e: KeyboardEvent[Element], vertical: Boolean, reverse: Boolean): js.Function2[/* value */ js.Any, /* props */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardValueMutator")(e.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* value */ js.Any, /* props */ js.Any, js.Any]]
  
  @scala.inline
  def getMousePosition(vertical: Boolean, e: MouseEvent[Element, NativeMouseEvent]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(vertical.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getPrecision(step: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrecision")(step.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getTouchPosition(vertical: Boolean, e: TouchEvent[Element]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchPosition")(vertical.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isEventFromHandle(e: Target, handles: Record[Double, ReactElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEventFromHandle")(e.asInstanceOf[js.Any], handles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isNotTouchEvent(e: TouchEvent[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotTouchEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValueOutOfRange(value: Double, hasMinMax: Max): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValueOutOfRange")(value.asInstanceOf[js.Any], hasMinMax.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def pauseEvent(e: SyntheticEvent[Element, Event]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
