package typings
package reactDashTestingDashLibraryLib.reactDashTestingDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResult[Q /* <: Queries */] extends js.Object {
  var baseElement: stdLib.HTMLElement = js.native
  var container: stdLib.HTMLElement = js.native
  def asFragment(): stdLib.DocumentFragment = js.native
  def debug(): scala.Unit = js.native
  def debug(baseElement: stdLib.DocumentFragment): scala.Unit = js.native
  def debug(baseElement: stdLib.HTMLElement): scala.Unit = js.native
  def rerender(ui: reactLib.reactMod.ReactElement[_]): scala.Unit = js.native
  def unmount(): scala.Boolean = js.native
}

