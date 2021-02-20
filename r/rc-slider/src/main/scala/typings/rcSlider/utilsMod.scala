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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rc-slider/lib/utils", "calculateNextValue")
  @js.native
  def calculateNextValue(func: js.Any, value: js.Any, props: js.Any): js.Any = js.native
  
  @JSImport("rc-slider/lib/utils", "ensureValueInRange")
  @js.native
  def ensureValueInRange(`val`: Double, hasMaxMin: Min): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "ensureValuePrecision")
  @js.native
  def ensureValuePrecision(`val`: Double, props: js.Any): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getClosestPoint")
  @js.native
  def getClosestPoint(`val`: Double, hasMarksStepMinMax: Marks): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getHandleCenterPosition")
  @js.native
  def getHandleCenterPosition(vertical: Boolean, handle: HTMLElement): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getKeyboardValueMutator")
  @js.native
  def getKeyboardValueMutator(e: KeyboardEvent[Element], vertical: Boolean, reverse: Boolean): js.Function2[/* value */ js.Any, /* props */ js.Any, _] = js.native
  
  @JSImport("rc-slider/lib/utils", "getMousePosition")
  @js.native
  def getMousePosition(vertical: Boolean, e: MouseEvent[Element, NativeMouseEvent]): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getPrecision")
  @js.native
  def getPrecision(step: Double): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getTouchPosition")
  @js.native
  def getTouchPosition(vertical: Boolean, e: TouchEvent[Element]): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "isEventFromHandle")
  @js.native
  def isEventFromHandle(e: Target, handles: Record[Double, ReactElement]): Boolean = js.native
  
  @JSImport("rc-slider/lib/utils", "isNotTouchEvent")
  @js.native
  def isNotTouchEvent(e: TouchEvent[Element]): Boolean = js.native
  
  @JSImport("rc-slider/lib/utils", "isValueOutOfRange")
  @js.native
  def isValueOutOfRange(value: Double, hasMinMax: Max): Boolean = js.native
  
  @JSImport("rc-slider/lib/utils", "pauseEvent")
  @js.native
  def pauseEvent(e: SyntheticEvent[Element, Event]): Unit = js.native
}
