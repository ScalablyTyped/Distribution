package typings.storybookReact

import typings.std.HTMLElement
import typings.storybookReact.distTs3Dot9ClientPreviewTypes60Mod.ReactFramework
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewRenderMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview/render", "render")
  @js.native
  val render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFn<ReactFramework> */ Any = js.native
  
  inline def renderToDOM(param0: RenderContext[ReactFramework], domElement: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToDOM")(param0.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
