package typings.remarkMessageControl

import typings.unifiedMessageControl.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remark-message-control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): js.Function2[/* node */ Root, /* file */ VFile, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* node */ Root, /* file */ VFile, Unit]]
  
  trait MessageControl extends StObject {
    
    def default(options: typings.unifiedMessageControl.mod.Options): js.Function2[/* tree */ Node, /* file */ typings.unifiedMessageControl.mod.VFile, Unit]
  }
  object MessageControl {
    
    inline def apply(
      default: typings.unifiedMessageControl.mod.Options => js.Function2[/* tree */ Node, /* file */ typings.unifiedMessageControl.mod.VFile, Unit]
    ): MessageControl = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
      __obj.asInstanceOf[MessageControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageControl] (val x: Self) extends AnyVal {
      
      inline def setDefault(
        value: typings.unifiedMessageControl.mod.Options => js.Function2[/* tree */ Node, /* file */ typings.unifiedMessageControl.mod.VFile, Unit]
      ): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.remarkMessageControl.anon.OmitOptionsWithoutResetma
    - typings.remarkMessageControl.anon.OmitOptionsWithResetmarke
  */
  trait Options extends StObject
  object Options {
    
    inline def OmitOptionsWithResetmarke(name: String): typings.remarkMessageControl.anon.OmitOptionsWithResetmarke = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reset = true)
      __obj.asInstanceOf[typings.remarkMessageControl.anon.OmitOptionsWithResetmarke]
    }
    
    inline def OmitOptionsWithoutResetma(name: String): typings.remarkMessageControl.anon.OmitOptionsWithoutResetma = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.remarkMessageControl.anon.OmitOptionsWithoutResetma]
    }
  }
  
  type Root = typings.mdast.mod.Root
  
  type VFile = typings.vfile.mod.VFile
}
