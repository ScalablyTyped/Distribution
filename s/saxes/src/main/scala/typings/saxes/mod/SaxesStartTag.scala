package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<saxes.saxes.SaxesTag, 'name' | 'attributes' | 'ns'> */
@js.native
trait SaxesStartTag
  extends StartTagForOptions[js.Any] {
  
  var attributes: Record[String, SaxesAttributeNS | String] = js.native
  
  var name: String = js.native
  
  var ns: js.UndefOr[Record[String, String]] = js.native
}
object SaxesStartTag {
  
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], name: String): SaxesStartTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTag]
  }
  
  @scala.inline
  implicit class SaxesStartTagOps[Self <: SaxesStartTag] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Record[String, SaxesAttributeNS | String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: Record[String, String]): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
  }
}
