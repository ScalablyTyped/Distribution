package typings.rcComponentPortal

import typings.rcComponentPortal.esPortalMod.PortalProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/portal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PortalProps & RefAttributes[Any]] = js.native
  
  inline def inlineMock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")().asInstanceOf[Boolean]
  inline def inlineMock(nextInline: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")(nextInline.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
