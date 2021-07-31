package typings.storybookTheming

import typings.storybookTheming.anon.Color
import typings.storybookTheming.storybookThemingStrings.dark
import typings.storybookTheming.storybookThemingStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/theming/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def darkenColor(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("darkenColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPreferredColorScheme(): light | dark = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreferredColorScheme")().asInstanceOf[light | dark]
  
  @scala.inline
  def lightenColor(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lightenColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def mkColor(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("mkColor")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
}
