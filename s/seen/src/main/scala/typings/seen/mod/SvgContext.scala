package typings.seen.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SvgContext")
@js.native
object SvgContext extends js.Object {
  
  def apply(elementOrId: String): SvgRenderContext = js.native
  def apply(elementOrId: String, scene: Scene): SvgRenderContext = js.native
  def apply(elementOrId: HTMLElement): SvgRenderContext = js.native
  def apply(elementOrId: HTMLElement, scene: Scene): SvgRenderContext = js.native
}
