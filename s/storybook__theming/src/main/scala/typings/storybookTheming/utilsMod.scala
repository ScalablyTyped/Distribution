package typings.storybookTheming

import typings.storybookTheming.anon.Color
import typings.storybookTheming.storybookThemingStrings.dark
import typings.storybookTheming.storybookThemingStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/theming/dist/utils", "darkenColor")
  @js.native
  def darkenColor(color: String): String = js.native
  
  @JSImport("@storybook/theming/dist/utils", "getPreferredColorScheme")
  @js.native
  def getPreferredColorScheme(): light | dark = js.native
  
  @JSImport("@storybook/theming/dist/utils", "lightenColor")
  @js.native
  def lightenColor(color: String): String = js.native
  
  @JSImport("@storybook/theming/dist/utils", "mkColor")
  @js.native
  def mkColor(color: String): Color = js.native
}
