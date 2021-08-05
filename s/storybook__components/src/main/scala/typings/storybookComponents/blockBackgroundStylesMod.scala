package typings.storybookComponents

import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockBackgroundStylesMod {
  
  @JSImport("@storybook/components/dist/blocks/BlockBackgroundStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlockBackgroundStyle(theme: Theme): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockBackgroundStyle")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
