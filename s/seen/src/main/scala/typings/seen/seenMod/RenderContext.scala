package typings.seen.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "RenderContext")
@js.native
class RenderContext () extends js.Object {
  var layers: js.Array[RenderLayerContext] = js.native
  def animate(): RenderAnimator = js.native
  def cleanup(): Unit = js.native
  def layer(layer: RenderLayerContext): this.type = js.native
  def render(): this.type = js.native
  def reset(): Unit = js.native
  def sceneLayer(scene: Scene): this.type = js.native
}

