package typings.seen.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "RenderModel")
@js.native
class RenderModel protected () extends js.Object {
  def this(surface: Surface, transform: Matrix, projection: Matrix, viewport: Matrix) = this()
  def update(transform: Matrix, projection: Matrix, viewport: Matrix): Unit = js.native
}

