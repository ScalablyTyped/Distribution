package typings.seen.seenMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "CanvasRenderContext")
@js.native
class CanvasRenderContext protected () extends RenderContext {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  var ctx: CanvasRenderingContext2D = js.native
  var el: HTMLCanvasElement = js.native
}

