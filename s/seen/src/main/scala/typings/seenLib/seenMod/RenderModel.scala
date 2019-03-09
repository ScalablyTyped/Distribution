package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "RenderModel")
@js.native
class RenderModel protected () extends js.Object {
  def this(surface: Surface, transform: Matrix, projection: Matrix, viewport: Matrix) = this()
  def update(transform: Matrix, projection: Matrix, viewport: Matrix): scala.Unit = js.native
}

