package typings.rcComponentPortal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod {
  
  @JSImport("@rc-component/portal/es/mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/portal/es/mock", "inline")
  @js.native
  val `inline`: Boolean = js.native
  
  inline def inlineMock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")().asInstanceOf[Boolean]
  inline def inlineMock(nextInline: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")(nextInline.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
