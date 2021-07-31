package typings.settings

import org.scalablytyped.runtime.StringDictionary
import typings.settings.anon.DictenvName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("settings", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Settings {
    def this(pathOrModule: PathOrModule) = this()
    def this(pathOrModule: PathOrModule, options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var defaults: js.UndefOr[js.Any] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type PathOrModule = String | DictenvName
  
  type Settings = StringDictionary[js.Any]
}
