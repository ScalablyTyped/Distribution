package typings.storybookPreviewWeb

import typings.std.HTMLElement
import typings.storybookPreviewWeb.typesMod.DocsContextProps
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderDocsMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/renderDocs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderDocs[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    story: Story[TFramework],
    docsContext: DocsContextProps[TFramework],
    element: HTMLElement,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDocs")(story.asInstanceOf[js.Any], docsContext.asInstanceOf[js.Any], element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def unmountDocs(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountDocs")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
