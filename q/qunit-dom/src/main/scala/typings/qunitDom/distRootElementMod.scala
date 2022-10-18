package typings.qunitDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRootElementMod {
  
  @JSImport("qunit-dom/dist/root-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRootElement(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootElement")().asInstanceOf[Element]
  
  inline def overrideRootElement(fn: js.Function0[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideRootElement")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
