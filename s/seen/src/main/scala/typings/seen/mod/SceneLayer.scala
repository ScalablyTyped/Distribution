package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SceneLayer")
@js.native
class SceneLayer protected () extends RenderLayer {
  def this(scene: Scene) = this()
  var cache: Boolean = js.native
  var camera: Camera = js.native
  var cullBackfaces: Boolean = js.native
  var fractionalPoints: Boolean = js.native
  var model: Model = js.native
  var shader: Shader = js.native
  var viewport: Viewport = js.native
}

