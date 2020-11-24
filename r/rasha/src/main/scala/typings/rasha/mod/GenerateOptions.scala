package typings.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateOptions extends js.Object {
  
  var encoding: js.UndefOr[String] = js.native
  
  var format: String = js.native
  
  var modulusLength: js.UndefOr[Double] = js.native
  
  var publicExponent: js.UndefOr[Double] = js.native
}
object GenerateOptions {
  
  @scala.inline
  def apply(format: String): GenerateOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
  
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setModulusLength(value: Double): Self = this.set("modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulusLength: Self = this.set("modulusLength", js.undefined)
    
    @scala.inline
    def setPublicExponent(value: Double): Self = this.set("publicExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicExponent: Self = this.set("publicExponent", js.undefined)
  }
}
