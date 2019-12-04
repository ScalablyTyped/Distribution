package typings.atStorybookClientDashApi

import typings.atStorybookAddons.Anon_Current
import typings.atStorybookAddons.distHooksMod.Decorator
import typings.atStorybookAddons.distHooksMod.EventMap
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import typings.atStorybookAddons.distTypesMod.StoryGetter
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
  class HooksContext ()
    extends typings.atStorybookClientDashApi.distHooksMod.HooksContext
  
  @js.native
  class StoryStore protected ()
    extends typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default {
    def this(params: Anon_Channel_1428041883) = this()
  }
  
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): StoryFn[_] = js.native
  def getQueryParam(key: String): String | Unit = js.native
  def getQueryParams(): js.Any = js.native
  def pathToId(path: String): String = js.native
  def useCallback[T](callback: T): T = js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useRef[T](initialValue: T): Anon_Current[T] = js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useStoryContext(): StoryContext = js.native
  @js.native
  object subscriptionsStore extends js.Object {
    def clearUnused(): Unit = js.native
    def markAllAsUnused(): Unit = js.native
    def register(subscribe: js.Function0[Unit]): Unit = js.native
  }
  
}

