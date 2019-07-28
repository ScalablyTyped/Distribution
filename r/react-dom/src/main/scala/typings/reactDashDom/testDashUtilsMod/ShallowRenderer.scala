package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowRenderer extends js.Object {
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  def getRenderOutput(): ReactElement = js.native
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  @JSName("getRenderOutput")
  def getRenderOutput_E_ReactElement_E[E /* <: ReactElement */](): E = js.native
  /**
    * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
    */
  def render(element: ReactElement): Unit = js.native
  def render(element: ReactElement, context: js.Any): Unit = js.native
  def unmount(): Unit = js.native
}

