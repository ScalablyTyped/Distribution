package typings.storybookClientApi

import typings.node.NodeModule
import typings.storybookClientApi.anon.StoryStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/client-api/dist/config_api", JSImport.Namespace)
@js.native
object configApiMod extends js.Object {
  
  @js.native
  trait ConfigApi extends js.Object {
    
    var _storyStore: typings.storybookClientApi.storyStoreMod.default = js.native
    
    def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
    def configure(loaders: js.Function0[Unit], module: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
  }
  
  @js.native
  class default protected () extends ConfigApi {
    def this(hasStoryStore: StoryStore) = this()
  }
}
