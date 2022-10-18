package typings.storybookHtml

import typings.std.HTMLElement
import typings.storybookHtml.distTs3Dot9ClientPreviewTypes60Mod.HtmlFramework
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewConfigMod {
  
  @JSImport("@storybook/html/dist/ts3.9/client/preview/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object parameters {
    
    @JSImport("@storybook/html/dist/ts3.9/client/preview/config", "parameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/html/dist/ts3.9/client/preview/config", "parameters.framework")
    @js.native
    def framework: String = js.native
    inline def framework_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framework")(x.asInstanceOf[js.Any])
  }
  
  inline def renderToDOM(
    hasStoryFnKindNameShowMainShowErrorForceRemount: RenderContext[HtmlFramework],
    domElement: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToDOM")(hasStoryFnKindNameShowMainShowErrorForceRemount.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
