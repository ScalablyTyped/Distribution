package typings.rcSlider.interfaceMod

import typings.rcSlider.anon.Value
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericSliderClass[Props, State]
  extends Component[Props, State, js.Any] {
  
  def getLowerBound(): Double = js.native
  
  def getUpperBound(): Double = js.native
  
  def onChange(state: Value): Unit = js.native
  
  def onEnd(): Unit = js.native
  def onEnd(force: Boolean): Unit = js.native
  
  def onKeyboard(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
  
  def onMove(e: MouseEvent[HTMLDivElement, NativeMouseEvent], position: Double): Unit = js.native
  def onMove(e: TouchEvent[HTMLDivElement], position: Double): Unit = js.native
  
  def onStart(position: Double): Unit = js.native
  
  def trimAlignValue(v: Double): Double = js.native
  def trimAlignValue(v: Double, nextProps: Partial[Props]): Double = js.native
}
