package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SceneLayer")
@js.native
open class SceneLayer protected () extends RenderLayer {
  def this(scene: Scene) = this()
  
  var cache: Boolean = js.native
  
  var camera: Camera = js.native
  
  var cullBackfaces: Boolean = js.native
  
  var fractionalPoints: Boolean = js.native
  
  var model: Model = js.native
  
  var shader: Shader = js.native
  
  var viewport: Viewport = js.native
}
