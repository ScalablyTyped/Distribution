package typings.qunitDom

import typings.qunitDom.mod.global.Assert
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distQunitDomModulesMod {
  
  @JSImport("qunit-dom/dist/qunit-dom-modules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(assert: Assert): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(assert.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setup(assert: Assert): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(assert.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setup(assert: Assert, options: SetupOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(assert.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait SetupOptions extends StObject {
    
    var getRootElement: js.UndefOr[js.Function0[Element | Null]] = js.undefined
  }
  object SetupOptions {
    
    inline def apply(): SetupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetupOptions]
    }
    
    extension [Self <: SetupOptions](x: Self) {
      
      inline def setGetRootElement(value: () => Element | Null): Self = StObject.set(x, "getRootElement", js.Any.fromFunction0(value))
      
      inline def setGetRootElementUndefined: Self = StObject.set(x, "getRootElement", js.undefined)
    }
  }
}
