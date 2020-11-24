package typings.storybookUi

import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLIFrameElement
import typings.storybookUi.anon.Chromatic
import typings.storybookUi.iframeMod.IFrameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/preview/iframe.stories", JSImport.Namespace)
@js.native
object iframeStoriesMod extends js.Object {
  
  def missingStory(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: js.Function1[/* props */ IFrameProps with IframeHTMLAttributes[HTMLIFrameElement], Element] = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object workingStory extends js.Object {
    
    def apply(): Element = js.native
    
    var parameters: Chromatic = js.native
  }
}
