package typings.reactstrap

import typings.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("reactstrap/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setGlobalCssModule(cssModule: CSSModule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalCssModule")(cssModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
