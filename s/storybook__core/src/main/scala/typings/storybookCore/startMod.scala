package typings.storybookCore

import typings.storybookCore.anon.Channel
import typings.storybookCore.anon.DecorateStory
import typings.storybookCore.typesMod.RenderStoryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startMod {
  
  @JSImport("@storybook/core/dist/client/preview/start", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(render: RenderStoryFunction): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(render.asInstanceOf[js.Any]).asInstanceOf[Channel]
  inline def default(render: RenderStoryFunction, hasDecorateStory: DecorateStory): Channel = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(render.asInstanceOf[js.Any], hasDecorateStory.asInstanceOf[js.Any])).asInstanceOf[Channel]
}
