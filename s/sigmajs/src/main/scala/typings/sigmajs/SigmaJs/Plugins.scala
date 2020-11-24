package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugins extends js.Object {
  
  def dragNodes(sigma: Sigma, renderer: Renderer): DragNodes = js.native
  @JSName("dragNodes")
  var dragNodes_Original: DragNodes = js.native
}
