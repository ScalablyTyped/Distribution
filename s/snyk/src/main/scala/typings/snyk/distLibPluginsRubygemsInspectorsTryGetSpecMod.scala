package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsRubygemsInspectorsTryGetSpecMod {
  
  @JSImport("snyk/dist/lib/plugins/rubygems/inspectors/try-get-spec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryGetSpec(dir: String, name: String): js.Promise[File | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetSpec")(dir.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File | Null]]
  
  trait File extends StObject {
    
    var contents: String
    
    var name: String
  }
  object File {
    
    inline def apply(contents: String, name: String): File = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    var gemfileLock: js.UndefOr[File] = js.undefined
    
    var gemspec: js.UndefOr[File] = js.undefined
  }
  object Files {
    
    inline def apply(): Files = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Files]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
      
      inline def setGemfileLock(value: File): Self = StObject.set(x, "gemfileLock", value.asInstanceOf[js.Any])
      
      inline def setGemfileLockUndefined: Self = StObject.set(x, "gemfileLock", js.undefined)
      
      inline def setGemspec(value: File): Self = StObject.set(x, "gemspec", value.asInstanceOf[js.Any])
      
      inline def setGemspecUndefined: Self = StObject.set(x, "gemspec", js.undefined)
    }
  }
}
