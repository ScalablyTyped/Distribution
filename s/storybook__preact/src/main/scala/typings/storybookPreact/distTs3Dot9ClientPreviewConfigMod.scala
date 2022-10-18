package typings.storybookPreact

import typings.std.HTMLElement
import typings.storybookPreact.distTs3Dot9ClientPreviewTypes60Mod.PreactFramework
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewConfigMod {
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object parameters {
    
    @JSImport("@storybook/preact/dist/ts3.9/client/preview/config", "parameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/preact/dist/ts3.9/client/preview/config", "parameters.framework")
    @js.native
    def framework: String = js.native
    inline def framework_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framework")(x.asInstanceOf[js.Any])
  }
  
  inline def renderToDOM(
    hasStoryFnTitleNameShowMainShowErrorForceRemount: RenderContext[PreactFramework],
    domElement: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToDOM")(hasStoryFnTitleNameShowMainShowErrorForceRemount.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
