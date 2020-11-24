package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAXOptions extends js.Object {
  
  var lowercase: js.UndefOr[Boolean] = js.native
  
  var normalize: js.UndefOr[Boolean] = js.native
  
  var noscript: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  var xmlns: js.UndefOr[Boolean] = js.native
}
object SAXOptions {
  
  @scala.inline
  def apply(): SAXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAXOptions]
  }
  
  @scala.inline
  implicit class SAXOptionsOps[Self <: SAXOptions] (val x: Self) extends AnyVal {
    
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
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setNoscript(value: Boolean): Self = this.set("noscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoscript: Self = this.set("noscript", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setXmlns(value: Boolean): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
}
