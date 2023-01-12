package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPlugin extends StObject {
  
  var enabled: Boolean
  
  var fullName: String
  
  var name: String
  
  var supportedCategories: js.Array[String]
  
  var url: String
  
  var version: String
}
object SearchPlugin {
  
  inline def apply(
    enabled: Boolean,
    fullName: String,
    name: String,
    supportedCategories: js.Array[String],
    url: String,
    version: String
  ): SearchPlugin = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedCategories = supportedCategories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPlugin] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupportedCategories(value: js.Array[String]): Self = StObject.set(x, "supportedCategories", value.asInstanceOf[js.Any])
    
    inline def setSupportedCategoriesVarargs(value: String*): Self = StObject.set(x, "supportedCategories", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
