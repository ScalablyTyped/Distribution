package typings.storybookReactDocgenTypescriptPlugin

import typings.reactDocgenTypescript.libParserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompilerOptions extends StObject {
    
    var compilerOptions: typings.typescript.mod.CompilerOptions
    
    var docgenOptions: ParserOptions
    
    var generateOptions: SetDisplayName
  }
  object CompilerOptions {
    
    inline def apply(
      compilerOptions: typings.typescript.mod.CompilerOptions,
      docgenOptions: ParserOptions,
      generateOptions: SetDisplayName
    ): CompilerOptions = {
      val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], docgenOptions = docgenOptions.asInstanceOf[js.Any], generateOptions = generateOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerOptions]
    }
    
    extension [Self <: CompilerOptions](x: Self) {
      
      inline def setCompilerOptions(value: typings.typescript.mod.CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setDocgenOptions(value: ParserOptions): Self = StObject.set(x, "docgenOptions", value.asInstanceOf[js.Any])
      
      inline def setGenerateOptions(value: SetDisplayName): Self = StObject.set(x, "generateOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocgenCollectionName extends StObject {
    
    var docgenCollectionName: String
    
    var setDisplayName: Boolean
    
    var typePropName: String
  }
  object DocgenCollectionName {
    
    inline def apply(docgenCollectionName: String, setDisplayName: Boolean, typePropName: String): DocgenCollectionName = {
      val __obj = js.Dynamic.literal(docgenCollectionName = docgenCollectionName.asInstanceOf[js.Any], setDisplayName = setDisplayName.asInstanceOf[js.Any], typePropName = typePropName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenCollectionName]
    }
    
    extension [Self <: DocgenCollectionName](x: Self) {
      
      inline def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      inline def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      inline def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetDisplayName extends StObject {
    
    var docgenCollectionName: String | Null
    
    var setDisplayName: Boolean
    
    var typePropName: String
  }
  object SetDisplayName {
    
    inline def apply(setDisplayName: Boolean, typePropName: String): SetDisplayName = {
      val __obj = js.Dynamic.literal(setDisplayName = setDisplayName.asInstanceOf[js.Any], typePropName = typePropName.asInstanceOf[js.Any], docgenCollectionName = null)
      __obj.asInstanceOf[SetDisplayName]
    }
    
    extension [Self <: SetDisplayName](x: Self) {
      
      inline def setDocgenCollectionName(value: String): Self = StObject.set(x, "docgenCollectionName", value.asInstanceOf[js.Any])
      
      inline def setDocgenCollectionNameNull: Self = StObject.set(x, "docgenCollectionName", null)
      
      inline def setSetDisplayName(value: Boolean): Self = StObject.set(x, "setDisplayName", value.asInstanceOf[js.Any])
      
      inline def setTypePropName(value: String): Self = StObject.set(x, "typePropName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var _value: String
  }
  object Value {
    
    inline def apply(_value: String): Value = {
      val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def set_value(value: String): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
