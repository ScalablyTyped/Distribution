package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaLink extends StObject {
  
  /**
    * Any unique category name, links are grouped based on their category.
    *
    * Some recommended categories are: actor, director, writer,
    * while the following categories are reserved and should not be used: imdb, share, similar.
    */
  var category: String = js.native
  
  /**
    * Human readable name for the link.
    */
  var name: String = js.native
  
  /**
    * An external URL or Meta Link.
    */
  var url: String = js.native
}
object MetaLink {
  
  @scala.inline
  def apply(category: String, name: String, url: String): MetaLink = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaLink]
  }
  
  @scala.inline
  implicit class MetaLinkMutableBuilder[Self <: MetaLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
