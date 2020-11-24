package typings.projectOxford.mod.VisionResponses

import typings.projectOxford.anon.Lines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ocr extends js.Object {
  
  var language: String = js.native
  
  var orientation: String = js.native
  
  var regions: js.Array[Lines] = js.native
  
  var textAngle: Double = js.native
}
object Ocr {
  
  @scala.inline
  def apply(language: String, orientation: String, regions: js.Array[Lines], textAngle: Double): Ocr = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ocr]
  }
  
  @scala.inline
  implicit class OcrOps[Self <: Ocr] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsVarargs(value: Lines*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[Lines]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAngle(value: Double): Self = this.set("textAngle", value.asInstanceOf[js.Any])
  }
}
