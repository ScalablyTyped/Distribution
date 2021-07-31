package typings.reapop

import typings.reapop.themesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThemeMod {
  
  @JSImport("reapop/dist/hooks/useTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useTheme(): js.UndefOr[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[Theme]]
}
