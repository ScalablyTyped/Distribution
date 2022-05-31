package typings.rosie

import typings.rosie.mod.IFactory
import typings.rosie.mod.IFactoryStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Factory {
    
    @JSGlobal("Factory")
    @js.native
    val ^ : js.Any = js.native
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Factory.Factory")
    @js.native
    class Factory[T] ()
      extends StObject
         with IFactory[T]
    @JSGlobal("Factory.Factory")
    @js.native
    def Factory: IFactoryStatic = js.native
    inline def Factory_=(x: IFactoryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Factory")(x.asInstanceOf[js.Any])
  }
}
