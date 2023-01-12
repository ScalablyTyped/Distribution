package typings.settings

import org.scalablytyped.runtime.StringDictionary
import typings.settings.anon.DictenvName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("settings", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Settings {
    def this(pathOrModule: PathOrModule) = this()
    def this(pathOrModule: PathOrModule, options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var defaults: js.UndefOr[Any] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type PathOrModule = String | DictenvName
  
  type Settings = StringDictionary[Any]
}
