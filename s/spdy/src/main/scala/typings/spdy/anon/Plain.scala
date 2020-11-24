package typings.spdy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plain extends js.Object {
  
  var plain: js.UndefOr[Boolean] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var protocols: js.UndefOr[js.Array[String]] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
  
  var `x-forwarded-for`: js.UndefOr[String] = js.native
}
object Plain {
  
  @scala.inline
  def apply(): Plain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plain]
  }
  
  @scala.inline
  implicit class PlainOps[Self <: Plain] (val x: Self) extends AnyVal {
    
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
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def `setX-forwarded-for`(value: String): Self = this.set("x-forwarded-for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-forwarded-for`: Self = this.set("x-forwarded-for", js.undefined)
  }
}
