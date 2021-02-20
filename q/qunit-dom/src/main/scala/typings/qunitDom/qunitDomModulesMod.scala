package typings.qunitDom

import typings.qunitDom.mod.global.Assert
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qunitDomModulesMod {
  
  @JSImport("qunit-dom/dist/qunit-dom-modules", "install")
  @js.native
  def install(assert: Assert): Unit = js.native
  
  @JSImport("qunit-dom/dist/qunit-dom-modules", "setup")
  @js.native
  def setup(assert: Assert): Unit = js.native
  @JSImport("qunit-dom/dist/qunit-dom-modules", "setup")
  @js.native
  def setup(assert: Assert, options: SetupOptions): Unit = js.native
  
  @js.native
  trait SetupOptions extends StObject {
    
    var getRootElement: js.UndefOr[js.Function0[Element | Null]] = js.native
  }
  object SetupOptions {
    
    @scala.inline
    def apply(): SetupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetupOptions]
    }
    
    @scala.inline
    implicit class SetupOptionsMutableBuilder[Self <: SetupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRootElement(value: () => Element | Null): Self = StObject.set(x, "getRootElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootElementUndefined: Self = StObject.set(x, "getRootElement", js.undefined)
    }
  }
}
