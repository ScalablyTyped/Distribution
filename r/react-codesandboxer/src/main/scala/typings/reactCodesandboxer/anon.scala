package typings.reactCodesandboxer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
  }
  object Content {
    
    inline def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
  }
  object Error {
    
    inline def apply(error: Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    var files: typings.reactCodesandboxer.mod.Files
    
    var parameters: String
  }
  object Files {
    
    inline def apply(files: typings.reactCodesandboxer.mod.Files, parameters: String): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: typings.reactCodesandboxer.mod.Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsLoading extends StObject {
    
    var files: js.UndefOr[typings.reactCodesandboxer.mod.Files] = js.undefined
    
    var isLoading: Boolean
    
    var sandboxId: js.UndefOr[String] = js.undefined
    
    var sandboxUrl: js.UndefOr[String] = js.undefined
  }
  object IsLoading {
    
    inline def apply(isLoading: Boolean): IsLoading = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsLoading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsLoading] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: typings.reactCodesandboxer.mod.Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
      
      inline def setSandboxIdUndefined: Self = StObject.set(x, "sandboxId", js.undefined)
      
      inline def setSandboxUrl(value: String): Self = StObject.set(x, "sandboxUrl", value.asInstanceOf[js.Any])
      
      inline def setSandboxUrlUndefined: Self = StObject.set(x, "sandboxUrl", js.undefined)
    }
  }
}
