package typings.strftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleFormats extends js.Object {
  
  var D: js.UndefOr[String] = js.native
  
  var F: js.UndefOr[String] = js.native
  
  var R: js.UndefOr[String] = js.native
  
  var T: js.UndefOr[String] = js.native
  
  var X: js.UndefOr[String] = js.native
  
  var c: js.UndefOr[String] = js.native
  
  var r: js.UndefOr[String] = js.native
  
  var v: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[String] = js.native
}
object LocaleFormats {
  
  @scala.inline
  def apply(): LocaleFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleFormats]
  }
  
  @scala.inline
  implicit class LocaleFormatsOps[Self <: LocaleFormats] (val x: Self) extends AnyVal {
    
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
    def setD(value: String): Self = this.set("D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("D", js.undefined)
    
    @scala.inline
    def setF(value: String): Self = this.set("F", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("F", js.undefined)
    
    @scala.inline
    def setR(value: String): Self = this.set("R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("R", js.undefined)
    
    @scala.inline
    def setT(value: String): Self = this.set("T", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteT: Self = this.set("T", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("X", js.undefined)
    
    @scala.inline
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
}
