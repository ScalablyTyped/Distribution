package typings.storybookAddons

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.std.WeakMap
import typings.storybookAddons.anon.Current
import typings.storybookAddons.storybookAddonsStrings.MOUNT
import typings.storybookAddons.storybookAddonsStrings.NONE
import typings.storybookAddons.storybookAddonsStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@storybook/addons/dist/ts3.9/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addons/dist/ts3.9/hooks", "HooksContext")
  @js.native
  open class HooksContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends StObject {
    
    def addRenderListeners(): Unit = js.native
    
    def clean(): Unit = js.native
    
    var currentContext: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any) | Null = js.native
    
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
    
    def renderListener(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Unit = js.native
    
    def triggerEffects(): Unit = js.native
  }
  
  inline def applyHooks[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    applyDecorators: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorApplicator<TFramework, Args> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyHooks")(applyDecorators.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useArgs(): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newArgs */ Any, 
      Unit
    ], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgs")().asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newArgs */ Any, 
      Unit
    ], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ]]
  
  inline def useCallback[T](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useCallback[T](callback: T, deps: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useChannel(eventMap: EventMap): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useChannel(eventMap: EventMap, deps: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobals(): js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newGlobals */ Any, 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobals")().asInstanceOf[js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newGlobals */ Any, 
      Unit
    ]
  ]]
  
  inline def useMemo[T](nextCreate: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useParameter[S](parameterKey: String): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
  inline def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
  
  inline def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  inline def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialArg.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  
  inline def useRef[T](initialValue: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  inline def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  
  inline def useStoryContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryContext")().asInstanceOf[Any]
  
  @js.native
  trait AbstractFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait Effect extends StObject {
    
    def create(): js.Function0[Unit] | Unit
    
    var destroy: js.UndefOr[js.Function0[Unit] | Unit] = js.undefined
  }
  object Effect {
    
    inline def apply(create: () => js.Function0[Unit] | Unit): Effect = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[Effect]
    }
    
    extension [Self <: Effect](x: Self) {
      
      inline def setCreate(value: () => js.Function0[Unit] | Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: js.Function0[Unit] | Unit): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyFunction0(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    }
  }
  
  type EventMap = StringDictionary[Listener]
  
  trait Hook extends StObject {
    
    var deps: js.UndefOr[js.Array[Any]] = js.undefined
    
    var memoizedState: js.UndefOr[Any] = js.undefined
    
    var name: String
  }
  object Hook {
    
    inline def apply(name: String): Hook = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook]
    }
    
    extension [Self <: Hook](x: Self) {
      
      inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
      
      inline def setMemoizedState(value: Any): Self = StObject.set(x, "memoizedState", value.asInstanceOf[js.Any])
      
      inline def setMemoizedStateUndefined: Self = StObject.set(x, "memoizedState", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Listener = js.Function1[/* repeated */ Any, Unit]
}
