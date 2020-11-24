package typings.projectOxford.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analyze extends js.Object {
  
   // Detects if faces are present.If present, generate coordinates, gender and age.
  var Adult: js.UndefOr[Boolean] = js.native
  
   // Detects if image is pornographic in nature(nudity or sex act).Sexually suggestive content is also detected.
  var Categories: js.UndefOr[Boolean] = js.native
  
   // Detects if image is clipart or a line drawing.
  var Color: js.UndefOr[Boolean] = js.native
  
   // Determines the accent color, dominant color, if image is black& white.
  var Faces: js.UndefOr[Boolean] = js.native
  
   // Path to image to be analyzed
  var ImageType: js.UndefOr[Boolean] = js.native
  
   // Url to image to be analyzed
  var path: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Analyze {
  
  @scala.inline
  def apply(): Analyze = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyze]
  }
  
  @scala.inline
  implicit class AnalyzeOps[Self <: Analyze] (val x: Self) extends AnyVal {
    
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
    def setAdult(value: Boolean): Self = this.set("Adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdult: Self = this.set("Adult", js.undefined)
    
    @scala.inline
    def setCategories(value: Boolean): Self = this.set("Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("Categories", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("Color", js.undefined)
    
    @scala.inline
    def setFaces(value: Boolean): Self = this.set("Faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaces: Self = this.set("Faces", js.undefined)
    
    @scala.inline
    def setImageType(value: Boolean): Self = this.set("ImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("ImageType", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
