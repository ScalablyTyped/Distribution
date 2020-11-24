package typings.storybookCore

import typings.storybookCore.anon.Channel
import typings.storybookCore.anon.DecorateStory
import typings.storybookCore.typesMod.RenderStoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core/dist/client/preview/start", JSImport.Namespace)
@js.native
object startMod extends js.Object {
  
  def default(render: RenderStoryFunction): Channel = js.native
  def default(render: RenderStoryFunction, hasDecorateStory: DecorateStory): Channel = js.native
}
