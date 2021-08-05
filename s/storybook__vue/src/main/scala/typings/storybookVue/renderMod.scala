package typings.storybookVue

import typings.storybookClientApi.typesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("@storybook/vue/dist/client/preview/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasStoryFnKindNameArgsShowMainShowErrorShowExceptionForceRender: RenderContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStoryFnKindNameArgsShowMainShowErrorShowExceptionForceRender.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@storybook/vue/dist/client/preview/render", "COMPONENT")
  @js.native
  val COMPONENT: /* "STORYBOOK_COMPONENT" */ String = js.native
  
  @JSImport("@storybook/vue/dist/client/preview/render", "VALUES")
  @js.native
  val VALUES: /* "STORYBOOK_VALUES" */ String = js.native
}
