package typings.storybookReactDocgenTypescriptPlugin

import typings.reactDocgenTypescript.parserMod.ComponentDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateDocgenCodeBlockMod {
  
  @JSImport("@storybook/react-docgen-typescript-plugin/dist/generateDocgenCodeBlock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateDocgenCodeBlock(options: GeneratorOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDocgenCodeBlock")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GeneratorOptions extends StObject {
    
    var componentDocs: js.Array[ComponentDoc]
    
    var docgenCollectionName: String | Null
    
    var filename: String
    
    var setDisplayName: Boolean
    
    var source: String
    
    var typePropName: String
  }
  object GeneratorOptions {
    
    inline def apply(
      componentDocs: js.Array[ComponentDoc],
      filename: String,
      setDisplayName: Boolean,
      source: String,
      typePropName: String
    ): GeneratorOptions = {
      val __obj = js.Dynamic.literal(componentDocs = componentDocs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], setDisplayName = setDisplayName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], typePropName = typePropName.asInstanceOf[js.Any], docgenCollectionName = null)
      __obj.asInstanceOf[GeneratorOptions]
    }
    
    extension [Self <: GeneratorOptions](x: Self) {
      
      inline def setComponentDocs(value: js.Array[ComponentDoc]): Self = StObject.set(x, "componentDocs", value.asInstanceOf[js.Any])
      
      inline def setComponentDocsVarargs(value: ComponentDoc*): Self = StObject.set(x, "componentDocs", js.Array(value*))
      
      inline def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      inline def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
    }
  }
}
