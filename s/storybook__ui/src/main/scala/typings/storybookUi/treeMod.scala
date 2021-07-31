package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.NamedExoticComponent
import typings.std.HTMLButtonElement
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Data
import typings.storybookUi.anon.PickDetailedHTMLPropsButt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Tree", "Action")
  @js.native
  val Action: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    PickDetailedHTMLPropsButt, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Tree", "Tree")
  @js.native
  val Tree: NamedExoticComponent[Data] = js.native
}
