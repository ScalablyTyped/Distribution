package typings.storybookReact

import typings.std.HTMLElement
import typings.storybookReact.distTs3Dot9ClientPreviewTypes60Mod.ReactFramework
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewConfigMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object parameters {
    
    @JSImport("@storybook/react/dist/ts3.9/client/preview/config", "parameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/react/dist/ts3.9/client/preview/config", "parameters.framework")
    @js.native
    def framework: String = js.native
    inline def framework_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framework")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview/config", "render")
  @js.native
  val render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFn<ReactFramework> */ Any = js.native
  
  inline def renderToDOM(
    hasStoryContextUnboundStoryFnShowMainShowExceptionForceRemount: RenderContext[ReactFramework],
    domElement: HTMLElement
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToDOM")(hasStoryContextUnboundStoryFnShowMainShowExceptionForceRemount.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
