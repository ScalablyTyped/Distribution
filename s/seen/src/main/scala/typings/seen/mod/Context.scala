package typings.seen.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Context")
@js.native
object Context extends js.Object {
  def apply(elementOrId: String): RenderContext = js.native
  def apply(elementOrId: String, scene: Scene): RenderContext = js.native
  def apply(elementOrId: HTMLElement): RenderContext = js.native
  def apply(elementOrId: HTMLElement, scene: Scene): RenderContext = js.native
}

