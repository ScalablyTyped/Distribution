package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins extends js.Object {
  @JSName("dragNodes")
  var dragNodes_Original: DragNodes = js.native
  def dragNodes(sigma: Sigma, renderer: Renderer): DragNodes = js.native
}

