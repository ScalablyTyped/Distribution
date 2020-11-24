package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.storybookAddons.distMod.Collection
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import typings.storybookUi.providerMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/FakeProvider", JSImport.Namespace)
@js.native
object fakeProviderMod extends js.Object {
  
  val Centered: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @js.native
  class FakeProvider () extends Provider {
    
    def getElements(`type`: js.Any): Collection = js.native
    
    def renderPreview(): Element = js.native
  }
  
  @js.native
  class PrettyFakeProvider () extends FakeProvider {
    
    def renderPreview(args: js.Any*): Element = js.native
  }
}
