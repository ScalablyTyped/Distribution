package typings.reactSpeechRecognition.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListeningOptions extends js.Object {
  
  var continuous: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
}
object ListeningOptions {
  
  @scala.inline
  def apply(): ListeningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListeningOptions]
  }
  
  @scala.inline
  implicit class ListeningOptionsOps[Self <: ListeningOptions] (val x: Self) extends AnyVal {
    
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
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
