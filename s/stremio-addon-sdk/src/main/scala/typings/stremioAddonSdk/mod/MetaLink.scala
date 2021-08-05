package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaLink extends StObject {
  
  /**
    * Any unique category name, links are grouped based on their category.
    *
    * Some recommended categories are: actor, director, writer,
    * while the following categories are reserved and should not be used: imdb, share, similar.
    */
  var category: String
  
  /**
    * Human readable name for the link.
    */
  var name: String
  
  /**
    * An external URL or Meta Link.
    */
  var url: String
}
object MetaLink {
  
  inline def apply(category: String, name: String, url: String): MetaLink = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaLink]
  }
  
  extension [Self <: MetaLink](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
