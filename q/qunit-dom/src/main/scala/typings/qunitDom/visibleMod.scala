package typings.qunitDom

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibleMod {
  
  @JSImport("qunit-dom/dist/helpers/visible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
