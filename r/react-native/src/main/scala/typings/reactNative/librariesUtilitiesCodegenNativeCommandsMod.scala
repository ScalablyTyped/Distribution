package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesUtilitiesCodegenNativeCommandsMod {
  
  @JSImport("react-native/Libraries/Utilities/codegenNativeCommands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Object */](
    options: Options[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : never */ js.Any
    ]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait Options[T /* <: String */] extends StObject {
    
    val supportedCommands: js.Array[T]
  }
  object Options {
    
    inline def apply[T /* <: String */](supportedCommands: js.Array[T]): Options[T] = {
      val __obj = js.Dynamic.literal(supportedCommands = supportedCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T /* <: String */] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setSupportedCommands(value: js.Array[T]): Self = StObject.set(x, "supportedCommands", value.asInstanceOf[js.Any])
      
      inline def setSupportedCommandsVarargs(value: T*): Self = StObject.set(x, "supportedCommands", js.Array(value*))
    }
  }
}
