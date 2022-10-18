package typings.reapop

import org.scalablytyped.runtime.Shortcut
import typings.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemesBootstrapMod extends Shortcut {
  
  @JSImport("reapop/dist/themes/bootstrap", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  @JSImport("reapop/dist/themes/bootstrap", "bootstrapTheme")
  @js.native
  val bootstrapTheme: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `distThemesBootstrapMod.foo` */
  override def _to: Theme = default
}
