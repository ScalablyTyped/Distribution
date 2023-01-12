package typings.quotesy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quotesy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseJson(): js.Array[Quote] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_json")().asInstanceOf[js.Array[Quote]]
  
  inline def random(): Quote = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Quote]
  
  inline def randomByTag(tag: String): Quote = ^.asInstanceOf[js.Dynamic].applyDynamic("random_by_tag")(tag.asInstanceOf[js.Any]).asInstanceOf[Quote]
  
  trait Quote extends StObject {
    
    /** The author of the quote */
    var author: String
    
    /** A URL where the origin of the quote can be verified */
    var source: js.UndefOr[String] = js.undefined
    
    /** Comma-separated list of words associated with the quote */
    var tags: js.UndefOr[String] = js.undefined
    
    /** The text of the quote */
    var text: String
  }
  object Quote {
    
    inline def apply(author: String, text: String): Quote = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quote]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Quote] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
