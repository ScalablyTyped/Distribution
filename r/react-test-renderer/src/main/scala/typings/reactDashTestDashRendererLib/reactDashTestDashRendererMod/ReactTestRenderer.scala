package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTestRenderer extends js.Object {
  var root: ReactTestInstance = js.native
  def getInstance(): scala.Null | ReactTestInstance = js.native
  def toJSON(): scala.Null | ReactTestRendererJSON = js.native
  def toTree(): scala.Null | ReactTestRendererTree = js.native
  def unmount(): scala.Unit = js.native
  def unmount(nextElement: reactLib.reactMod.ReactElement[_]): scala.Unit = js.native
  def update(nextElement: reactLib.reactMod.ReactElement[_]): scala.Unit = js.native
}

