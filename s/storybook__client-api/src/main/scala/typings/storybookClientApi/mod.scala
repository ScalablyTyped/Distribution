package typings.storybookClientApi

import typings.qs.mod.ParsedQs
import typings.storybookAddons.anon.Current
import typings.storybookAddons.hooksMod.Decorator
import typings.storybookAddons.hooksMod.EventMap
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryGetter
import typings.storybookClientApi.anon.Channel
import typings.storybookClientApi.clientApiMod.default
import typings.storybookClientApi.typesMod.ArgTypesEnhancer
import typings.storybookClientApi.typesMod.ClientApiParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/client-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = js.native
  
  def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  def addDecorator(decorator: DecoratorFunction[_], deprecationWarning: Boolean): Unit = js.native
  
  def addLoader(loader: LoaderFunction): Unit = js.native
  def addLoader(loader: LoaderFunction, deprecationWarning: Boolean): Unit = js.native
  
  def addParameters(parameters: Parameters): Unit = js.native
  def addParameters(parameters: Parameters, deprecationWarning: Boolean): Unit = js.native
  
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  
  def combineParameters(parameterSets: Parameters*): Parameters = js.native
  
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Function1[/* context */ js.UndefOr[StoryContext], _] = js.native
  
  def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = js.native
  
  def getQueryParams(): ParsedQs = js.native
  
  val inferControls: ArgTypesEnhancer = js.native
  
  def pathToId(path: String): String = js.native
  
  def simulateDOMContentLoaded(): Unit = js.native
  
  def simulatePageLoad($container: js.Any): Unit = js.native
  
  def useAddonState[S](addonId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = js.native
  
  def useCallback[T](callback: T): T = js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  
  def useChannel(eventMap: EventMap): js.Any = js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = js.native
  
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
  
  def useRef[T](initialValue: T): Current[T] = js.native
  
  def useSharedState[S](sharedId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  def useSharedState[S](sharedId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  
  def useStoryContext(): StoryContext = js.native
  
  @js.native
  class ClientApi protected () extends default {
    def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
  }
  
  @js.native
  class ConfigApi protected ()
    extends typings.storybookClientApi.configApiMod.default {
    def this(hasStoryStore: typings.storybookClientApi.anon.StoryStore) = this()
  }
  
  @js.native
  class HooksContext ()
    extends typings.storybookClientApi.hooksMod.HooksContext
  
  @js.native
  class StoryStore protected ()
    extends typings.storybookClientApi.storyStoreMod.default {
    def this(params: Channel) = this()
  }
}
