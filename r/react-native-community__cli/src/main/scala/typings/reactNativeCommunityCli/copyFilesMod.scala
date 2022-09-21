package typings.reactNativeCommunityCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyFilesMod {
  
  @JSImport("@react-native-community/cli/build/tools/copyFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Copy files (binary included) recursively.
    */
  inline def default(srcPath: String, destPath: String): js.Promise[js.Array[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(srcPath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Unit]]]
  inline def default(srcPath: String, destPath: String, options: Options): js.Promise[js.Array[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(srcPath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Unit]]]
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: js.RegExp*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
}
