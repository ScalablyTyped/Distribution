package typings.soap.wssecuritycertMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlSignerOptions extends js.Object {
  
  var attrs: js.UndefOr[StringDictionary[String]] = js.native
  
  var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object IXmlSignerOptions {
  
  @scala.inline
  def apply(): IXmlSignerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlSignerOptions]
  }
  
  @scala.inline
  implicit class IXmlSignerOptionsOps[Self <: IXmlSignerOptions] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: StringDictionary[String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setExistingPrefixes(value: StringDictionary[String]): Self = this.set("existingPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingPrefixes: Self = this.set("existingPrefixes", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
