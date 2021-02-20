package typings.reactDocgenTypescriptLoader

import typings.reactDocgenTypescript.parserMod.ComponentDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateDocgenCodeBlockMod {
  
  @JSImport("react-docgen-typescript-loader/dist/generateDocgenCodeBlock", JSImport.Default)
  @js.native
  def default(options: GeneratorOptions): String = js.native
  
  @js.native
  trait GeneratorOptions extends StObject {
    
    var componentDocs: js.Array[ComponentDoc] = js.native
    
    var docgenCollectionName: String | Null = js.native
    
    var filename: String = js.native
    
    var setDisplayName: Boolean = js.native
    
    var source: String = js.native
    
    var typePropName: String = js.native
  }
  object GeneratorOptions {
    
    @scala.inline
    def apply(
      componentDocs: js.Array[ComponentDoc],
      filename: String,
      setDisplayName: Boolean,
      source: String,
      typePropName: String
    ): GeneratorOptions = {
      val __obj = js.Dynamic.literal(componentDocs = componentDocs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], setDisplayName = setDisplayName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], typePropName = typePropName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorOptions]
    }
    
    @scala.inline
    implicit class GeneratorOptionsMutableBuilder[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentDocs(value: js.Array[ComponentDoc]): Self = StObject.set(x, "componentDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentDocsVarargs(value: ComponentDoc*): Self = StObject.set(x, "componentDocs", js.Array(value :_*))
      
      @scala.inline
      def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
    }
  }
}
