package typings
package reactDashTestDashRendererLib.shallowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowRenderer extends js.Object {
  /**
    * After `shallowRenderer.render()` has been called, returns mounted instance.
    */
  def getMountedInstance(): reactLib.reactMod.ReactNs.ReactInstance = js.native
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  def getRenderOutput(): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  @JSName("getRenderOutput")
  def getRenderOutput_EReactElementE[E /* <: reactLib.reactMod.ReactNs.ReactElement[_] */](): E = js.native
  /**
    * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
    */
  def render(element: reactLib.reactMod.ReactNs.ReactElement[_]): scala.Unit = js.native
  def render(element: reactLib.reactMod.ReactNs.ReactElement[_], context: js.Any): scala.Unit = js.native
  def unmount(): scala.Unit = js.native
}

