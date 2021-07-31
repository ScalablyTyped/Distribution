package typings.storybookTheming

import org.scalablytyped.runtime.Shortcut
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightMod extends Shortcut {
  
  @JSImport("@storybook/theming/dist/themes/light", JSImport.Default)
  @js.native
  val default: ThemeVars = js.native
  
  type _To = ThemeVars
  
  /* This means you don't have to write `default`, but can instead just say `lightMod.foo` */
  override def _to: ThemeVars = default
}
