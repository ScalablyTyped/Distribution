package typings.reactDragula

import typings.dragula.mod.DragulaOptions
import typings.dragula.mod.Drake
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(containers: js.Array[HTMLElement]): Drake = ^.asInstanceOf[js.Dynamic].apply(containers.asInstanceOf[js.Any]).asInstanceOf[Drake]
  inline def apply(containers: js.Array[HTMLElement], options: DragulaOptions): Drake = (^.asInstanceOf[js.Dynamic].apply(containers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Drake]
  
  @JSImport("react-dragula", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
