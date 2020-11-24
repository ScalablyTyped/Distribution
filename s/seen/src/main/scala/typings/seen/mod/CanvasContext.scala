package typings.seen.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasContext")
@js.native
object CanvasContext extends js.Object {
  
  def apply(elementOrId: String): CanvasRenderContext = js.native
  def apply(elementOrId: String, scene: Scene): CanvasRenderContext = js.native
  def apply(elementOrId: HTMLElement): CanvasRenderContext = js.native
  def apply(elementOrId: HTMLElement, scene: Scene): CanvasRenderContext = js.native
}
