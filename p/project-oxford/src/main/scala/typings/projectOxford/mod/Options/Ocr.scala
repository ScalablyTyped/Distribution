package typings.projectOxford.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ocr extends js.Object {
  
   //BCP - 47 language code of the text to be detected in the image.Default value is "unk", then the service will auto detect the language of the text in the image.
  var detectOrientation: js.UndefOr[Boolean] = js.native
  
   // Path to image to be analyzed
  var language: js.UndefOr[String] = js.native
  
   // URL to image to be analyzed
  var path: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Ocr {
  
  @scala.inline
  def apply(): Ocr = {
    val __obj = js.Dynamic.literal()
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
    def setDetectOrientation(value: Boolean): Self = this.set("detectOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectOrientation: Self = this.set("detectOrientation", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
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
