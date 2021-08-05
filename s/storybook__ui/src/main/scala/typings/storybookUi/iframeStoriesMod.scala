package typings.storybookUi

import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLIFrameElement
import typings.storybookUi.anon.Chromatic
import typings.storybookUi.iframeMod.IFrameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/preview/iframe.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "default.component")
    @js.native
    def component: js.Function1[/* props */ IFrameProps & IframeHTMLAttributes[HTMLIFrameElement], Element] = js.native
    inline def component_=(x: js.Function1[/* props */ IFrameProps & IframeHTMLAttributes[HTMLIFrameElement], Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def missingStory(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("missingStory")().asInstanceOf[Element]
  
  object workingStory {
    
    inline def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "workingStory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/preview/iframe.stories", "workingStory.parameters")
    @js.native
    def parameters: Chromatic = js.native
    inline def parameters_=(x: Chromatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
  }
}
