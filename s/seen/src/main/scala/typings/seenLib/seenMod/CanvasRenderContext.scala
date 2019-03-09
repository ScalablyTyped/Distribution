package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "CanvasRenderContext")
@js.native
class CanvasRenderContext protected () extends RenderContext {
  def this(elementOrId: java.lang.String) = this()
  def this(elementOrId: stdLib.HTMLElement) = this()
  var ctx: stdLib.CanvasRenderingContext2D = js.native
  var el: stdLib.HTMLCanvasElement = js.native
}

