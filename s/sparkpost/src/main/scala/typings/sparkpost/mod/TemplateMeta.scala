package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateMeta extends StObject {
  
  /** Template description */
  var description: String
  
  /** Unique template ID */
  var id: String
  
  /** Template name */
  var name: String
  
  /** Published state of the template (true = published, false = draft) */
  var published: Boolean
}
object TemplateMeta {
  
  inline def apply(description: String, id: String, name: String, published: Boolean): TemplateMeta = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateMeta] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
  }
}
