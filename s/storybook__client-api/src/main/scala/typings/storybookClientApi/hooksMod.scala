package typings.storybookClientApi

import typings.storybookAddons.anon.Current
import typings.storybookAddons.hooksMod.Decorator
import typings.storybookAddons.hooksMod.EventMap
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@storybook/client-api/dist/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "HooksContext")
  @js.native
  class HooksContext ()
    extends typings.storybookAddons.mod.HooksContext
  
  @scala.inline
  def applyHooks(
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
  
  @scala.inline
  def useAddonState[S](addonId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  @scala.inline
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  
  @scala.inline
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgs")().asInstanceOf[js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ]]
  
  @scala.inline
  def useCallback[T](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useCallback[T](callback: T, deps: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def useChannel(eventMap: EventMap): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def useChannel(eventMap: EventMap, deps: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobals")().asInstanceOf[js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]]]
  
  @scala.inline
  def useMemo[T](nextCreate: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def useParameter[S](parameterKey: String): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
  @scala.inline
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
  
  @scala.inline
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  @scala.inline
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialArg.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  
  @scala.inline
  def useRef[T](initialValue: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  @scala.inline
  def useSharedState[S](sharedId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(sharedId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  @scala.inline
  def useSharedState[S](sharedId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(sharedId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  
  @scala.inline
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  
  @scala.inline
  def useStoryContext(): StoryContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryContext")().asInstanceOf[StoryContext]
}
