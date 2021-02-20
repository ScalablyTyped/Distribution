package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.storybookAddons.distMod.Collection
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import typings.storybookUi.providerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fakeProviderMod {
  
  @JSImport("@storybook/ui/dist/FakeProvider", "Centered")
  @js.native
  val Centered: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/FakeProvider", "FakeProvider")
  @js.native
  class FakeProvider () extends default {
    
    def getElements(`type`: js.Any): Collection = js.native
    
    def renderPreview(): Element = js.native
  }
  
  @JSImport("@storybook/ui/dist/FakeProvider", "PrettyFakeProvider")
  @js.native
  class PrettyFakeProvider () extends FakeProvider {
    
    def renderPreview(args: js.Any*): Element = js.native
  }
}
