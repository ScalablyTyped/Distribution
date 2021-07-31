package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Material")
@js.native
class Material () extends StObject {
  def this(color: Color) = this()
  def this(color: Unit, options: MaterialOptions) = this()
  def this(color: Color, options: MaterialOptions) = this()
  
  var color: Color = js.native
  
  var defaults: MaterialOptions = js.native
  
  var metallic: Boolean = js.native
  
  def render(): Color = js.native
  def render(lights: js.Array[Light]): Color = js.native
  def render(lights: js.Array[Light], shader: Unit, renderData: RenderModel): Color = js.native
  def render(lights: js.Array[Light], shader: Shader): Color = js.native
  def render(lights: js.Array[Light], shader: Shader, renderData: RenderModel): Color = js.native
  def render(lights: Unit, shader: Unit, renderData: RenderModel): Color = js.native
  def render(lights: Unit, shader: Shader): Color = js.native
  def render(lights: Unit, shader: Shader, renderData: RenderModel): Color = js.native
  
  var shader: Shader = js.native
  
  var specularColor: Color = js.native
  
  var specularExponent: Double = js.native
}
/* static members */
object Material {
  
  @JSImport("seen", "Material")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Material]
  @scala.inline
  def create(value: String): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Material]
  @scala.inline
  def create(value: Color): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Material]
  @scala.inline
  def create(value: Material): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Material]
}
