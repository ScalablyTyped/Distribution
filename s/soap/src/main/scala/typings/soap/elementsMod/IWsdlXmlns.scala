package typings.soap.elementsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWsdlXmlns extends /* prop */ StringDictionary[String | Unit] {
  
  var __tns__ : js.UndefOr[String] = js.native
  
  var soap: js.UndefOr[String] = js.native
  
  var tns: js.UndefOr[String] = js.native
  
  var wsam: js.UndefOr[String] = js.native
  
  var wsp: js.UndefOr[String] = js.native
  
  var wsu: js.UndefOr[String] = js.native
  
  var xsd: js.UndefOr[String] = js.native
}
object IWsdlXmlns {
  
  @scala.inline
  def apply(): IWsdlXmlns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWsdlXmlns]
  }
  
  @scala.inline
  implicit class IWsdlXmlnsOps[Self <: IWsdlXmlns] (val x: Self) extends AnyVal {
    
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
    def set__tns__(value: String): Self = this.set("__tns__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__tns__ : Self = this.set("__tns__", js.undefined)
    
    @scala.inline
    def setSoap(value: String): Self = this.set("soap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoap: Self = this.set("soap", js.undefined)
    
    @scala.inline
    def setTns(value: String): Self = this.set("tns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTns: Self = this.set("tns", js.undefined)
    
    @scala.inline
    def setWsam(value: String): Self = this.set("wsam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsam: Self = this.set("wsam", js.undefined)
    
    @scala.inline
    def setWsp(value: String): Self = this.set("wsp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsp: Self = this.set("wsp", js.undefined)
    
    @scala.inline
    def setWsu(value: String): Self = this.set("wsu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsu: Self = this.set("wsu", js.undefined)
    
    @scala.inline
    def setXsd(value: String): Self = this.set("xsd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsd: Self = this.set("xsd", js.undefined)
  }
}
