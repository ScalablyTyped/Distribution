package typings.railsUjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cspMod {
  
  @JSImport("@rails/ujs/utils/csp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cspNonce(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cspNonce")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def loadCSPNonce(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCSPNonce")().asInstanceOf[js.UndefOr[String]]
}
