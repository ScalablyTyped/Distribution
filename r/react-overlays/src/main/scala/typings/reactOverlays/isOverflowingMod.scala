package typings.reactOverlays

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isOverflowingMod {
  
  @JSImport("react-overlays/cjs/isOverflowing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
