package typings.qunitDom

import typings.std.Element
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementToStringMod {
  
  @JSImport("qunit-dom/dist/helpers/element-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(el: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(el: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(el: NodeList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[String]
}
