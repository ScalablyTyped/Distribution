package typings.qunitDom

import typings.qunitDom.distAssertionsMod.default
import typings.qunitDom.distQunitDomModulesMod.SetupOptions
import typings.qunitDom.mod.global.Assert
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qunit-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setup(assert: Assert): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(assert.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setup(assert: Assert, options: SetupOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(assert.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    @js.native
    trait Assert extends StObject {
      
      def dom(): default = js.native
      def dom(target: String): default = js.native
      def dom(target: String, rootElement: Element): default = js.native
      def dom(target: Null, rootElement: Element): default = js.native
      def dom(target: Unit, rootElement: Element): default = js.native
      def dom(target: Element): default = js.native
      def dom(target: Element, rootElement: Element): default = js.native
    }
  }
}
