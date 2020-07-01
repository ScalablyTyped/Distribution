package typings.rcRate.rateMod

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLUListElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rate
  extends Component[RateProps, RateState, js.Any] {
  var onKeyDown: KeyboardEventHandler[HTMLUListElement] = js.native
  var rate: HTMLUListElement = js.native
  var stars: Record[String, typings.rcRate.starMod.default] = js.native
  def blur(): Unit = js.native
  def changeValue(value: Double): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRate(): Unit = js.native
  def focus(): Unit = js.native
  def getStarDOM(index: Double): HTMLElement = js.native
  def getStarValue(index: Double, x: Double): Double = js.native
  def onBlur(): Unit = js.native
  def onClick(event: KeyboardEvent[Element], index: Double): Unit = js.native
  def onClick(event: MouseEvent[Element, NativeMouseEvent], index: Double): Unit = js.native
  def onFocus(): Unit = js.native
  def onHover(event: MouseEvent[HTMLDivElement, NativeMouseEvent], index: Double): Unit = js.native
  def onMouseLeave(): Unit = js.native
  def saveRate(node: HTMLUListElement): Unit = js.native
  def saveRef(index: Double): js.Function1[/* node */ typings.rcRate.starMod.default, Unit] = js.native
}

