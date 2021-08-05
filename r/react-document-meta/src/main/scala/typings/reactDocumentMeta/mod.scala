package typings.reactDocumentMeta

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-document-meta", JSImport.Default)
  @js.native
  class default ()
    extends Component[DocumentMetaProps, js.Object, js.Any]
  
  type DocumentMeta = Component[DocumentMetaProps, js.Object, js.Any]
  
  trait DocumentMetaProps extends StObject {
    
    val canonical: js.UndefOr[String] = js.undefined
    
    val description: js.UndefOr[String] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
  }
  object DocumentMetaProps {
    
    inline def apply(): DocumentMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentMetaProps]
    }
    
    extension [Self <: DocumentMetaProps](x: Self) {
      
      inline def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
