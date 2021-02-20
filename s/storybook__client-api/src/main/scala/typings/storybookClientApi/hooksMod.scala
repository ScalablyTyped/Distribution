package typings.storybookClientApi

import typings.storybookAddons.anon.Current
import typings.storybookAddons.hooksMod.Decorator
import typings.storybookAddons.hooksMod.EventMap
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@storybook/client-api/dist/hooks", "HooksContext")
  @js.native
  class HooksContext ()
    extends typings.storybookAddons.mod.HooksContext
  
  @JSImport("@storybook/client-api/dist/hooks", "applyHooks")
  @js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useAddonState")
  @js.native
  def useAddonState[S](addonId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useAddonState")
  @js.native
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useArgs")
  @js.native
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useCallback")
  @js.native
  def useCallback[T](callback: T): T = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useCallback")
  @js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useGlobals")
  @js.native
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useReducer")
  @js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useReducer")
  @js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useRef")
  @js.native
  def useRef[T](initialValue: T): Current[T] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useSharedState")
  @js.native
  def useSharedState[S](sharedId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useSharedState")
  @js.native
  def useSharedState[S](sharedId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useState")
  @js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  @JSImport("@storybook/client-api/dist/hooks", "useState")
  @js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  
  @JSImport("@storybook/client-api/dist/hooks", "useStoryContext")
  @js.native
  def useStoryContext(): StoryContext = js.native
}
