package typings.storybookUi

import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLIFrameElement
import typings.storybookUi.anon.Chromatic
import typings.storybookUi.iframeMod.IFrameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "default.component")
    @js.native
    def component: js.Function1[/* props */ IFrameProps with IframeHTMLAttributes[HTMLIFrameElement], Element] = js.native
    @scala.inline
    def component_=(x: js.Function1[/* props */ IFrameProps with IframeHTMLAttributes[HTMLIFrameElement], Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "missingStory")
  @js.native
  def missingStory(): Element = js.native
  
  object workingStory {
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "workingStory")
    @js.native
    def apply(): Element = js.native
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "workingStory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "workingStory.parameters")
    @js.native
    def parameters: Chromatic = js.native
    @scala.inline
    def parameters_=(x: Chromatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
  }
}
