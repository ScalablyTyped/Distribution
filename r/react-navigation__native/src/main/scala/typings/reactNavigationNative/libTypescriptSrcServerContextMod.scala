package typings.reactNavigationNative

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationNative.anon.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcServerContextMod extends Shortcut {
  
  @JSImport("@react-navigation/native/lib/typescript/src/ServerContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[ServerContextType]] = js.native
  
  trait ServerContextType extends StObject {
    
    var location: js.UndefOr[Pathname] = js.undefined
  }
  object ServerContextType {
    
    inline def apply(): ServerContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerContextType]
    }
    
    extension [Self <: ServerContextType](x: Self) {
      
      inline def setLocation(value: Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[ServerContextType]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcServerContextMod.foo` */
  override def _to: Context[js.UndefOr[ServerContextType]] = default
}
