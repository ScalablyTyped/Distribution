package typings.reapop

import org.scalablytyped.runtime.Shortcut
import typings.reapop.themesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wyboMod extends Shortcut {
  
  @JSImport("reapop/dist/themes/wybo", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  @JSImport("reapop/dist/themes/wybo", "wyboTheme")
  @js.native
  val wyboTheme: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `wyboMod.foo` */
  override def _to: Theme = default
}
