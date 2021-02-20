package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlParams extends StObject {
  
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
  implicit class XmlParamsMutableBuilder[Self <: XmlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute_prefix(value: String): Self = StObject.set(x, "attribute_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute_prefixUndefined: Self = StObject.set(x, "attribute_prefix", js.undefined)
    
    @scala.inline
    def setDoc_tag(value: String): Self = StObject.set(x, "doc_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_tagUndefined: Self = StObject.set(x, "doc_tag", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setRoot_tag(value: String): Self = StObject.set(x, "root_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot_tagUndefined: Self = StObject.set(x, "root_tag", js.undefined)
    
    @scala.inline
    def setValue_tag(value: String): Self = StObject.set(x, "value_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_tagUndefined: Self = StObject.set(x, "value_tag", js.undefined)
  }
}
