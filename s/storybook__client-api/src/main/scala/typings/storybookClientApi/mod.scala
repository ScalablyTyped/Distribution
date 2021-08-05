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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/client-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addArgTypesEnhancer")(enhancer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addDecorator(decorator: DecoratorFunction[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDecorator")(decorator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addDecorator(decorator: DecoratorFunction[js.Any], deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDecorator")(decorator.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addLoader(loader: LoaderFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLoader")(loader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addLoader(loader: LoaderFunction, deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLoader")(loader.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addParameters(parameters: Parameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addParameters")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addParameters(parameters: Parameters, deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParameters")(parameters.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyHooks")(applyDecorators.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, js.Any]
  ]]
  
  inline def combineParameters(parameterSets: Parameters*): Parameters = ^.asInstanceOf[js.Dynamic].applyDynamic("combineParameters")(parameterSets.asInstanceOf[js.Any]).asInstanceOf[Parameters]
  
  inline def defaultDecorateStory(storyFn: StoryFn[js.Any], decorators: js.Array[DecoratorFunction[js.Any]]): js.Function1[/* context */ js.UndefOr[StoryContext], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDecorateStory")(storyFn.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ js.UndefOr[StoryContext], js.Any]]
  
  inline def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParam")(key.asInstanceOf[js.Any]).asInstanceOf[String | (js.Array[ParsedQs | String]) | ParsedQs]
  
  inline def getQueryParams(): ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParams")().asInstanceOf[ParsedQs]
  
  @JSImport("@storybook/client-api", "inferControls")
  @js.native
  val inferControls: ArgTypesEnhancer = js.native
  
  inline def pathToId(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToId")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def simulateDOMContentLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulateDOMContentLoaded")().asInstanceOf[Unit]
  
  inline def simulatePageLoad($container: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulatePageLoad")($container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useAddonState[S](addonId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  inline def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  
  inline def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgs")().asInstanceOf[js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ]]
  
  inline def useCallback[T](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useCallback[T](callback: T, deps: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useChannel(eventMap: EventMap): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def useChannel(eventMap: EventMap, deps: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobals")().asInstanceOf[js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]]]
  
  inline def useMemo[T](nextCreate: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useParameter[S](parameterKey: String): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
  inline def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
  
  inline def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  inline def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialArg.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  
  inline def useRef[T](initialValue: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  inline def useSharedState[S](sharedId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(sharedId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  inline def useSharedState[S](sharedId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(sharedId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  
  inline def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  
  inline def useStoryContext(): StoryContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryContext")().asInstanceOf[StoryContext]
}
