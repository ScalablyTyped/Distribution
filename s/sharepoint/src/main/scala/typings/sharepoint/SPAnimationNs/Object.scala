package typings.sharepoint.SPAnimationNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPAnimation.Object")
@js.native
class Object protected () extends js.Object {
  def this(animationID: ID, delay: Double, element: js.Array[HTMLElement], finalState: State) = this()
  def this(animationID: ID, delay: Double, element: HTMLElement, finalState: State) = this()
  def this(
    animationID: ID,
    delay: Double,
    element: js.Array[HTMLElement],
    finalState: State,
    finishFunc: js.Function1[/* data */ js.Any, Unit]
  ) = this()
  def this(
    animationID: ID,
    delay: Double,
    element: HTMLElement,
    finalState: State,
    finishFunc: js.Function1[/* data */ js.Any, Unit]
  ) = this()
  def this(
    animationID: ID,
    delay: Double,
    element: js.Array[HTMLElement],
    finalState: State,
    finishFunc: js.Function1[/* data */ js.Any, Unit],
    data: js.Any
  ) = this()
  def this(
    animationID: ID,
    delay: Double,
    element: HTMLElement,
    finalState: State,
    finishFunc: js.Function1[/* data */ js.Any, Unit],
    data: js.Any
  ) = this()
  def RunAnimation(): Unit = js.native
}

