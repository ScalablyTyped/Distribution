package typings.storybookAddons

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.std.WeakMap
import typings.storybookAddons.anon.Current
import typings.storybookAddons.storybookAddonsStrings.MOUNT
import typings.storybookAddons.storybookAddonsStrings.NONE
import typings.storybookAddons.storybookAddonsStrings.UPDATE
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@storybook/addons/dist/hooks", "HooksContext")
  @js.native
  class HooksContext () extends StObject {
    
    def addRenderListeners(): Unit = js.native
    
    def clean(): Unit = js.native
    
    var currentContext: StoryContext | Null = js.native
    
    var currentDecoratorName: String | Null = js.native
    
    var currentEffects: js.Array[Effect] = js.native
    
    var currentHooks: js.Array[Hook] = js.native
    
    var currentPhase: MOUNT | UPDATE | NONE = js.native
    
    def getNextHook(): Hook = js.native
    
    var hasUpdates: Boolean = js.native
    
    var hookListsMap: WeakMap[AbstractFunction, js.Array[Hook]] = js.native
    
    def init(): Unit = js.native
    
    var mountedDecorators: Set[AbstractFunction] = js.native
    
    var nextHookIndex: Double = js.native
    
    var prevEffects: js.Array[Effect] = js.native
    
    var prevMountedDecorators: Set[AbstractFunction] = js.native
    
    def removeRenderListeners(): Unit = js.native
    
    def renderListener(): Unit = js.native
    
    def triggerEffects(): Unit = js.native
  }
  
  @JSImport("@storybook/addons/dist/hooks", "applyHooks")
  @js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useArgs")
  @js.native
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useCallback")
  @js.native
  def useCallback[T](callback: T): T = js.native
  @JSImport("@storybook/addons/dist/hooks", "useCallback")
  @js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  @JSImport("@storybook/addons/dist/hooks", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  @JSImport("@storybook/addons/dist/hooks", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useGlobals")
  @js.native
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  @JSImport("@storybook/addons/dist/hooks", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  @JSImport("@storybook/addons/dist/hooks", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useReducer")
  @js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  @JSImport("@storybook/addons/dist/hooks", "useReducer")
  @js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useRef")
  @js.native
  def useRef[T](initialValue: T): Current[T] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useState")
  @js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  @JSImport("@storybook/addons/dist/hooks", "useState")
  @js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  
  @JSImport("@storybook/addons/dist/hooks", "useStoryContext")
  @js.native
  def useStoryContext(): StoryContext = js.native
  
  type AbstractFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Decorator = js.Function2[/* getStory */ StoryGetter, /* context */ StoryContext, js.Any]
  
  @js.native
  trait Effect extends StObject {
    
    def create(): js.Function0[Unit] | Unit = js.native
    
    var destroy: js.UndefOr[js.Function0[Unit] | Unit] = js.native
  }
  object Effect {
    
    @scala.inline
    def apply(create: () => js.Function0[Unit] | Unit): Effect = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[Effect]
    }
    
    @scala.inline
    implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: () => js.Function0[Unit] | Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: js.Function0[Unit] | Unit): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyFunction0(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    }
  }
  
  type EventMap = StringDictionary[Listener]
  
  @js.native
  trait Hook extends StObject {
    
    var deps: js.UndefOr[js.Array[_]] = js.native
    
    var memoizedState: js.UndefOr[js.Any] = js.native
    
    var name: String = js.native
  }
  object Hook {
    
    @scala.inline
    def apply(name: String): Hook = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook]
    }
    
    @scala.inline
    implicit class HookMutableBuilder[Self <: Hook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[_]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      @scala.inline
      def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setMemoizedState(value: js.Any): Self = StObject.set(x, "memoizedState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoizedStateUndefined: Self = StObject.set(x, "memoizedState", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
}
