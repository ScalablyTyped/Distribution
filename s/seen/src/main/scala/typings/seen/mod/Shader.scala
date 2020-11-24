package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Shader")
@js.native
class Shader () extends js.Object {
  
  def shade(lights: js.Array[Light], renderModel: RenderModel, material: Material): Unit = js.native
}
