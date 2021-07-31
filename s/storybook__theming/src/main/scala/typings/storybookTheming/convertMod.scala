package typings.storybookTheming

import typings.storybookTheming.typesMod.Theme
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod {
  
  @JSImport("@storybook/theming/dist/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convert(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")().asInstanceOf[Theme]
  @scala.inline
  def convert(inherit: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(inherit.asInstanceOf[js.Any]).asInstanceOf[Theme]
}
