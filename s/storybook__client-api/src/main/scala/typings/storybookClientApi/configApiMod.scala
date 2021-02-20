package typings.storybookClientApi

import typings.node.NodeModule
import typings.storybookClientApi.anon.StoryStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configApiMod {
  
  @JSImport("@storybook/client-api/dist/config_api", JSImport.Default)
  @js.native
  class default protected () extends ConfigApi {
    def this(hasStoryStore: StoryStore) = this()
  }
  
  @js.native
  trait ConfigApi extends StObject {
    
    var _storyStore: typings.storybookClientApi.storyStoreMod.default = js.native
    
    def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
    def configure(loaders: js.Function0[Unit], module: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
  }
}
