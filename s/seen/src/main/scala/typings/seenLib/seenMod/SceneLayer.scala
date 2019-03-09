package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SceneLayer")
@js.native
class SceneLayer protected () extends RenderLayer {
  def this(scene: Scene) = this()
  var cache: scala.Boolean = js.native
  var camera: Camera = js.native
  var cullBackfaces: scala.Boolean = js.native
  var fractionalPoints: scala.Boolean = js.native
  var model: Model = js.native
  var shader: Shader = js.native
  var viewport: Viewport = js.native
}

