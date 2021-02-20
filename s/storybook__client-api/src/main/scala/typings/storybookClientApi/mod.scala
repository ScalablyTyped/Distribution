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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/client-api", "ClientApi")
  @js.native
  class ClientApi protected () extends default {
    def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
  }
  
  @JSImport("@storybook/client-api", "ConfigApi")
  @js.native
  class ConfigApi protected ()
    extends typings.storybookClientApi.configApiMod.default {
    def this(hasStoryStore: typings.storybookClientApi.anon.StoryStore) = this()
  }
  
  @JSImport("@storybook/client-api", "HooksContext")
  @js.native
  class HooksContext ()
    extends typings.storybookClientApi.hooksMod.HooksContext
  
  @JSImport("@storybook/client-api", "StoryStore")
  @js.native
  class StoryStore protected ()
    extends typings.storybookClientApi.storyStoreMod.default {
    def this(params: Channel) = this()
  }
  
  @JSImport("@storybook/client-api", "addArgTypesEnhancer")
  @js.native
  def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = js.native
  
  @JSImport("@storybook/client-api", "addDecorator")
  @js.native
  def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  @JSImport("@storybook/client-api", "addDecorator")
  @js.native
  def addDecorator(decorator: DecoratorFunction[_], deprecationWarning: Boolean): Unit = js.native
  
  @JSImport("@storybook/client-api", "addLoader")
  @js.native
  def addLoader(loader: LoaderFunction): Unit = js.native
  @JSImport("@storybook/client-api", "addLoader")
  @js.native
  def addLoader(loader: LoaderFunction, deprecationWarning: Boolean): Unit = js.native
  
  @JSImport("@storybook/client-api", "addParameters")
  @js.native
  def addParameters(parameters: Parameters): Unit = js.native
  @JSImport("@storybook/client-api", "addParameters")
  @js.native
  def addParameters(parameters: Parameters, deprecationWarning: Boolean): Unit = js.native
  
  @JSImport("@storybook/client-api", "applyHooks")
  @js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  
  @JSImport("@storybook/client-api", "combineParameters")
  @js.native
  def combineParameters(parameterSets: Parameters*): Parameters = js.native
  
  @JSImport("@storybook/client-api", "defaultDecorateStory")
  @js.native
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Function1[/* context */ js.UndefOr[StoryContext], _] = js.native
  
  @JSImport("@storybook/client-api", "getQueryParam")
  @js.native
  def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = js.native
  
  @JSImport("@storybook/client-api", "getQueryParams")
  @js.native
  def getQueryParams(): ParsedQs = js.native
  
  @JSImport("@storybook/client-api", "inferControls")
  @js.native
  val inferControls: ArgTypesEnhancer = js.native
  
  @JSImport("@storybook/client-api", "pathToId")
  @js.native
  def pathToId(path: String): String = js.native
  
  @JSImport("@storybook/client-api", "simulateDOMContentLoaded")
  @js.native
  def simulateDOMContentLoaded(): Unit = js.native
  
  @JSImport("@storybook/client-api", "simulatePageLoad")
  @js.native
  def simulatePageLoad($container: js.Any): Unit = js.native
  
  @JSImport("@storybook/client-api", "useAddonState")
  @js.native
  def useAddonState[S](addonId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  @JSImport("@storybook/client-api", "useAddonState")
  @js.native
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  
  @JSImport("@storybook/client-api", "useArgs")
  @js.native
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = js.native
  
  @JSImport("@storybook/client-api", "useCallback")
  @js.native
  def useCallback[T](callback: T): T = js.native
  @JSImport("@storybook/client-api", "useCallback")
  @js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/client-api", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  @JSImport("@storybook/client-api", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  
  @JSImport("@storybook/client-api", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  @JSImport("@storybook/client-api", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  
  @JSImport("@storybook/client-api", "useGlobals")
  @js.native
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = js.native
  
  @JSImport("@storybook/client-api", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  @JSImport("@storybook/client-api", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/client-api", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  @JSImport("@storybook/client-api", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  
  @JSImport("@storybook/client-api", "useReducer")
  @js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  @JSImport("@storybook/client-api", "useReducer")
  @js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  
  @JSImport("@storybook/client-api", "useRef")
  @js.native
  def useRef[T](initialValue: T): Current[T] = js.native
  
  @JSImport("@storybook/client-api", "useSharedState")
  @js.native
  def useSharedState[S](sharedId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  @JSImport("@storybook/client-api", "useSharedState")
  @js.native
  def useSharedState[S](sharedId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  
  @JSImport("@storybook/client-api", "useState")
  @js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  @JSImport("@storybook/client-api", "useState")
  @js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  
  @JSImport("@storybook/client-api", "useStoryContext")
  @js.native
  def useStoryContext(): StoryContext = js.native
}
