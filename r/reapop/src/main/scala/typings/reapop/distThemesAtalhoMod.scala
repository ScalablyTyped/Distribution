package typings.reapop

import org.scalablytyped.runtime.Shortcut
import typings.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemesAtalhoMod extends Shortcut {
  
  @JSImport("reapop/dist/themes/atalho", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  @JSImport("reapop/dist/themes/atalho", "atalhoTheme")
  @js.native
  val atalhoTheme: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `distThemesAtalhoMod.foo` */
  override def _to: Theme = default
}
