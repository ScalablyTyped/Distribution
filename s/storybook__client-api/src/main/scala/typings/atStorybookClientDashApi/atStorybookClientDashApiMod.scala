package typings.atStorybookClientDashApi

import typings.atStorybookClientDashApi.distClientUnderscoreApiMod.default
import typings.atStorybookClientDashApi.distTypesMod.ClientApiParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api", JSImport.Namespace)
@js.native
object atStorybookClientDashApiMod extends js.Object {
  @js.native
  class ClientApi protected () extends default {
    def this(hasStoryStoreDecorateStory: ClientApiParams) = this()
  }
  
  @js.native
  class ConfigApi protected ()
    extends typings.atStorybookClientDashApi.distConfigUnderscoreApiMod.default {
    def this(hasChannelStoryStoreClientApiClearDecorators: Anon_Channel) = this()
  }
  
  @js.native
  class StoryStore protected ()
    extends typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default {
    def this(params: Anon_Channel_1494956137) = this()
  }
  
  def defaultDecorateStory(
    storyFn: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryFn<unknown> */ js.Any,
    decorators: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecoratorFunction<unknown> */ _
    ]
  ): js.Any = js.native
  def getQueryParam(key: String): String | Unit = js.native
  def getQueryParams(): js.Any = js.native
  def pathToId(path: String): String = js.native
  @js.native
  object subscriptionsStore extends js.Object {
    def clearUnused(): Unit = js.native
    def markAllAsUnused(): Unit = js.native
    def register(subscribe: js.Function0[Unit]): Unit = js.native
  }
  
}

