package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptions extends js.Object {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var camera: js.UndefOr[Camera] = js.native
  
  var cullBackfaces: js.UndefOr[Boolean] = js.native
  
  var fractionalPoints: js.UndefOr[Boolean] = js.native
  
  var model: js.UndefOr[Model] = js.native
  
  var shader: js.UndefOr[Shader] = js.native
  
  var viewport: js.UndefOr[Viewport] = js.native
}
object SceneOptions {
  
  @scala.inline
  def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  @scala.inline
  implicit class SceneOptionsOps[Self <: SceneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setCullBackfaces(value: Boolean): Self = this.set("cullBackfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCullBackfaces: Self = this.set("cullBackfaces", js.undefined)
    
    @scala.inline
    def setFractionalPoints(value: Boolean): Self = this.set("fractionalPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFractionalPoints: Self = this.set("fractionalPoints", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setShader(value: Shader): Self = this.set("shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShader: Self = this.set("shader", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
