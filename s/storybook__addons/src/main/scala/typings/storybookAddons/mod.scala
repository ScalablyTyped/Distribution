package typings.storybookAddons

import typings.storybookAddons.anon.Current
import typings.storybookAddons.distTs3Dot9HooksMod.EventMap
import typings.storybookAddons.distTs3Dot9MakeDecoratorMod.MakeDecoratorOptions
import typings.storybookAddons.distTs3Dot9MakeDecoratorMod.MakeDecoratorResult
import typings.storybookAddons.distTs3Dot9TypesMod.Types_
import typings.storybookChannels.mod.ChannelArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addons", JSImport.Default)
  @js.native
  val default: typings.storybookAddons.distTs3Dot9Mod.AddonStore = js.native
  
  @JSImport("@storybook/addons", "AddonStore")
  @js.native
  open class AddonStore ()
    extends typings.storybookAddons.distTs3Dot9Mod.AddonStore
  
  @JSImport("@storybook/addons", "Channel")
  @js.native
  open class Channel ()
    extends typings.storybookAddons.distTs3Dot9Mod.Channel {
    def this(hasTransportAsync: ChannelArgs) = this()
  }
  
  @JSImport("@storybook/addons", "HooksContext")
  @js.native
  open class HooksContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typings.storybookAddons.distTs3Dot9HooksMod.HooksContext[TFramework]
  
  @JSImport("@storybook/addons", "addons")
  @js.native
  val addons: typings.storybookAddons.distTs3Dot9Mod.AddonStore = js.native
  
  inline def applyHooks[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    applyDecorators: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorApplicator<TFramework, Args> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyHooks")(applyDecorators.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isSupportedType(`type`: Types_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptions: MakeDecoratorOptions): MakeDecoratorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(hasNameParameterNameWrapperSkipIfNoParametersOrOptions.asInstanceOf[js.Any]).asInstanceOf[MakeDecoratorResult]
  
  inline def mockChannel(): typings.storybookChannels.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("mockChannel")().asInstanceOf[typings.storybookChannels.mod.default]
  
  @JSImport("@storybook/addons", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookAddons.distTs3Dot9TypesMod.types & String] = js.native
    
    /* "notes-element" */ val NOTES_ELEMENT: typings.storybookAddons.distTs3Dot9TypesMod.types.NOTES_ELEMENT & String = js.native
    
    /* "panel" */ val PANEL: typings.storybookAddons.distTs3Dot9TypesMod.types.PANEL & String = js.native
    
    /* "preview" */ val PREVIEW: typings.storybookAddons.distTs3Dot9TypesMod.types.PREVIEW & String = js.native
    
    /* "tab" */ val TAB: typings.storybookAddons.distTs3Dot9TypesMod.types.TAB & String = js.native
    
    /* "tool" */ val TOOL: typings.storybookAddons.distTs3Dot9TypesMod.types.TOOL & String = js.native
    
    /* "toolextra" */ val TOOLEXTRA: typings.storybookAddons.distTs3Dot9TypesMod.types.TOOLEXTRA & String = js.native
  }
  
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
}
