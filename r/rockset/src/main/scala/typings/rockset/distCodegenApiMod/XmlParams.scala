package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlParams extends StObject {
  
  /**
    * tag to differentiate between attributes and elements
    * @type {string}
    * @memberof XmlParams
    */
  var attribute_prefix: js.UndefOr[String] = js.undefined
  
  /**
    * tags with which documents are identified
    * @type {string}
    * @memberof XmlParams
    */
  var doc_tag: js.UndefOr[String] = js.undefined
  
  /**
    * encoding in which data source is encoded
    * @type {string}
    * @memberof XmlParams
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * tag until which xml is ignored
    * @type {string}
    * @memberof XmlParams
    */
  var root_tag: js.UndefOr[String] = js.undefined
  
  /**
    * tag used for the value when there are attributes in the element having no child
    * @type {string}
    * @memberof XmlParams
    */
  var value_tag: js.UndefOr[String] = js.undefined
}
object XmlParams {
  
  inline def apply(): XmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlParams]
  }
  
  extension [Self <: XmlParams](x: Self) {
    
    inline def setAttribute_prefix(value: String): Self = StObject.set(x, "attribute_prefix", value.asInstanceOf[js.Any])
    
    inline def setAttribute_prefixUndefined: Self = StObject.set(x, "attribute_prefix", js.undefined)
    
    inline def setDoc_tag(value: String): Self = StObject.set(x, "doc_tag", value.asInstanceOf[js.Any])
    
    inline def setDoc_tagUndefined: Self = StObject.set(x, "doc_tag", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setRoot_tag(value: String): Self = StObject.set(x, "root_tag", value.asInstanceOf[js.Any])
    
    inline def setRoot_tagUndefined: Self = StObject.set(x, "root_tag", js.undefined)
    
    inline def setValue_tag(value: String): Self = StObject.set(x, "value_tag", value.asInstanceOf[js.Any])
    
    inline def setValue_tagUndefined: Self = StObject.set(x, "value_tag", js.undefined)
  }
}
