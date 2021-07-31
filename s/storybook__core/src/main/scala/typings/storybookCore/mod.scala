package typings.storybookCore

import org.scalablytyped.runtime.Instantiable1
import typings.storybookClientApi.anon.Channel
import typings.storybookClientApi.typesMod.ClientApiParams
import typings.storybookCore.anon.DecorateStory
import typings.storybookCore.typesMod.RenderStoryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@storybook/core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core", "default.ClientApi")
    @js.native
    class ClientApi protected ()
      extends typings.storybookClientApi.mod.ClientApi {
      def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
    }
    @JSImport("@storybook/core", "default.ClientApi")
    @js.native
    def ClientApi: Instantiable1[
        /* hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose */ ClientApiParams, 
        typings.storybookClientApi.mod.ClientApi
      ] = js.native
    @scala.inline
    def ClientApi_=(
      x: Instantiable1[
          /* hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose */ ClientApiParams, 
          typings.storybookClientApi.mod.ClientApi
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientApi")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core", "default.ConfigApi")
    @js.native
    class ConfigApi protected ()
      extends typings.storybookClientApi.mod.ConfigApi {
      def this(hasStoryStore: typings.storybookClientApi.anon.StoryStore) = this()
    }
    @JSImport("@storybook/core", "default.ConfigApi")
    @js.native
    def ConfigApi: Instantiable1[
        /* hasStoryStore */ typings.storybookClientApi.anon.StoryStore, 
        typings.storybookClientApi.mod.ConfigApi
      ] = js.native
    @scala.inline
    def ConfigApi_=(
      x: Instantiable1[
          /* hasStoryStore */ typings.storybookClientApi.anon.StoryStore, 
          typings.storybookClientApi.mod.ConfigApi
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigApi")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core", "default.StoryStore")
    @js.native
    class StoryStore protected ()
      extends typings.storybookClientApi.mod.StoryStore {
      def this(params: Channel) = this()
    }
    @JSImport("@storybook/core", "default.StoryStore")
    @js.native
    def StoryStore: Instantiable1[/* params */ Channel, typings.storybookClientApi.mod.StoryStore] = js.native
    @scala.inline
    def StoryStore_=(x: Instantiable1[/* params */ Channel, typings.storybookClientApi.mod.StoryStore]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoryStore")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/core", "default.start")
    @js.native
    def start: js.Function2[
        /* render */ RenderStoryFunction, 
        /* hasDecorateStory */ js.UndefOr[DecorateStory], 
        typings.storybookCore.anon.Channel
      ] = js.native
    @scala.inline
    def start_=(
      x: js.Function2[
          /* render */ RenderStoryFunction, 
          /* hasDecorateStory */ js.UndefOr[DecorateStory], 
          typings.storybookCore.anon.Channel
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
