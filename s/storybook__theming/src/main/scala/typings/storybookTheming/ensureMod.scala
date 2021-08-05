package typings.storybookTheming

import typings.storybookTheming.typesMod.Theme
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ensureMod {
  
  @JSImport("@storybook/theming/dist/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensure(input: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(input.asInstanceOf[js.Any]).asInstanceOf[Theme]
}
