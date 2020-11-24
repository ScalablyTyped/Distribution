package typings.storybookCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.storybookClientApi.typesMod.ClientApiParams
import typings.storybookCore.anon.Channel
import typings.storybookCore.anon.DecorateStory
import typings.storybookCore.typesMod.RenderStoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core/dist/client/preview", JSImport.Namespace)
@js.native
object previewMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var start: js.Function2[
        /* render */ RenderStoryFunction, 
        /* hasDecorateStory */ js.UndefOr[DecorateStory], 
        Channel
      ] = js.native
    
    def toId(kind: String, name: String): String = js.native
    
    @js.native
    class ClientApi protected ()
      extends typings.storybookClientApi.mod.ClientApi {
      def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
    }
    @js.native
    object ClientApi
      extends TopLevel[
              Instantiable1[
                /* hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose */ ClientApiParams, 
                typings.storybookClientApi.mod.ClientApi
              ]
            ]
    
    @js.native
    class ConfigApi protected ()
      extends typings.storybookClientApi.mod.ConfigApi {
      def this(hasStoryStore: typings.storybookClientApi.anon.StoryStore) = this()
    }
    @js.native
    object ConfigApi
      extends TopLevel[
              Instantiable1[
                /* hasStoryStore */ typings.storybookClientApi.anon.StoryStore, 
                typings.storybookClientApi.mod.ConfigApi
              ]
            ]
    
    @js.native
    class StoryStore protected ()
      extends typings.storybookClientApi.mod.StoryStore {
      def this(params: typings.storybookClientApi.anon.Channel) = this()
    }
    @js.native
    object StoryStore
      extends TopLevel[
              Instantiable1[
                /* params */ typings.storybookClientApi.anon.Channel, 
                typings.storybookClientApi.mod.StoryStore
              ]
            ]
  }
}
