package typings.sbd

import typings.sbd.sbdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sbd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sentences(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sentences")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sentences(text: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sentences")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    var abbreviations: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowed_tags: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    var html_boundaries: js.UndefOr[Boolean] = js.undefined
    
    var html_boundaries_tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var newline_boundaries: js.UndefOr[Boolean] = js.undefined
    
    var preserve_whitespace: js.UndefOr[Boolean] = js.undefined
    
    var sanitize: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAbbreviations(value: js.Array[String]): Self = StObject.set(x, "abbreviations", value.asInstanceOf[js.Any])
      
      inline def setAbbreviationsUndefined: Self = StObject.set(x, "abbreviations", js.undefined)
      
      inline def setAbbreviationsVarargs(value: String*): Self = StObject.set(x, "abbreviations", js.Array(value*))
      
      inline def setAllowed_tags(value: `false` | js.Array[String]): Self = StObject.set(x, "allowed_tags", value.asInstanceOf[js.Any])
      
      inline def setAllowed_tagsUndefined: Self = StObject.set(x, "allowed_tags", js.undefined)
      
      inline def setAllowed_tagsVarargs(value: String*): Self = StObject.set(x, "allowed_tags", js.Array(value*))
      
      inline def setHtml_boundaries(value: Boolean): Self = StObject.set(x, "html_boundaries", value.asInstanceOf[js.Any])
      
      inline def setHtml_boundariesUndefined: Self = StObject.set(x, "html_boundaries", js.undefined)
      
      inline def setHtml_boundaries_tags(value: js.Array[String]): Self = StObject.set(x, "html_boundaries_tags", value.asInstanceOf[js.Any])
      
      inline def setHtml_boundaries_tagsUndefined: Self = StObject.set(x, "html_boundaries_tags", js.undefined)
      
      inline def setHtml_boundaries_tagsVarargs(value: String*): Self = StObject.set(x, "html_boundaries_tags", js.Array(value*))
      
      inline def setNewline_boundaries(value: Boolean): Self = StObject.set(x, "newline_boundaries", value.asInstanceOf[js.Any])
      
      inline def setNewline_boundariesUndefined: Self = StObject.set(x, "newline_boundaries", js.undefined)
      
      inline def setPreserve_whitespace(value: Boolean): Self = StObject.set(x, "preserve_whitespace", value.asInstanceOf[js.Any])
      
      inline def setPreserve_whitespaceUndefined: Self = StObject.set(x, "preserve_whitespace", js.undefined)
      
      inline def setSanitize(value: Boolean): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    }
  }
}
