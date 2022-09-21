package typings.recoilize

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recoilize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nodes: Any): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def default(nodes: Any, root: HTMLElement): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Null]
}
