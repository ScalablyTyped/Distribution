package typings.reactNativeCommunityCliDoctor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createShortcutMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/windows/create-shortcut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createShortcut(hasPathNameIco: LnkOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createShortcut")(hasPathNameIco.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait LnkOptions extends StObject {
    
    var ico: String
    
    var name: String
    
    var path: String
  }
  object LnkOptions {
    
    inline def apply(ico: String, name: String, path: String): LnkOptions = {
      val __obj = js.Dynamic.literal(ico = ico.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LnkOptions]
    }
    
    extension [Self <: LnkOptions](x: Self) {
      
      inline def setIco(value: String): Self = StObject.set(x, "ico", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
