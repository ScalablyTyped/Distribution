package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlParams extends js.Object {
  
  // tag to differentiate between attributes and elements
  var attribute_prefix: js.UndefOr[String] = js.native
  
  // tags with which documents are identified
  var doc_tag: js.UndefOr[String] = js.native
  
  // encoding in which data source is encoded
  var encoding: js.UndefOr[String] = js.native
  
  // tag until which xml is ignored
  var root_tag: js.UndefOr[String] = js.native
  
  // tag used for the value when there are attributes in the element having no child
  var value_tag: js.UndefOr[String] = js.native
}
object XmlParams {
  
  @scala.inline
  def apply(): XmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlParams]
  }
  
  @scala.inline
  implicit class XmlParamsOps[Self <: XmlParams] (val x: Self) extends AnyVal {
    
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
    def setAttribute_prefix(value: String): Self = this.set("attribute_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute_prefix: Self = this.set("attribute_prefix", js.undefined)
    
    @scala.inline
    def setDoc_tag(value: String): Self = this.set("doc_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc_tag: Self = this.set("doc_tag", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setRoot_tag(value: String): Self = this.set("root_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot_tag: Self = this.set("root_tag", js.undefined)
    
    @scala.inline
    def setValue_tag(value: String): Self = this.set("value_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue_tag: Self = this.set("value_tag", js.undefined)
  }
}
