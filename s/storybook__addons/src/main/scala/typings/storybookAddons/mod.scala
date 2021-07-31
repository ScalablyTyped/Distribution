package typings.storybookAddons

import typings.storybookAddons.anon.Current
import typings.storybookAddons.hooksMod.Decorator
import typings.storybookAddons.hooksMod.EventMap
import typings.storybookAddons.makeDecoratorMod.MakeDecoratorOptions
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryGetter
import typings.storybookAddons.typesMod.Types_
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
  val default: typings.storybookAddons.distMod.AddonStore = js.native
  
  @JSImport("@storybook/addons", "AddonStore")
  @js.native
  class AddonStore ()
    extends typings.storybookAddons.distMod.AddonStore
  
  @JSImport("@storybook/addons", "Channel")
  @js.native
  class Channel ()
    extends typings.storybookAddons.distMod.Channel {
    def this(hasTransportAsync: ChannelArgs) = this()
  }
  
  @JSImport("@storybook/addons", "HooksContext")
  @js.native
  class HooksContext ()
    extends typings.storybookAddons.hooksMod.HooksContext
  
  @JSImport("@storybook/addons", "addons")
  @js.native
  val addons: typings.storybookAddons.distMod.AddonStore = js.native
  
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
  def isSupportedType(`type`: Types_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptions: MakeDecoratorOptions): typings.storybookAddons.makeDecoratorMod.MakeDecoratorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDecorator")(hasNameParameterNameWrapperSkipIfNoParametersOrOptions.asInstanceOf[js.Any]).asInstanceOf[typings.storybookAddons.makeDecoratorMod.MakeDecoratorResult]
  
  @scala.inline
  def mockChannel(): typings.storybookChannels.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("mockChannel")().asInstanceOf[typings.storybookChannels.mod.default]
  
  @JSImport("@storybook/addons", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookAddons.typesMod.types & String] = js.native
    
    /* "notes-element" */ val NOTES_ELEMENT: typings.storybookAddons.typesMod.types.NOTES_ELEMENT & String = js.native
    
    /* "panel" */ val PANEL: typings.storybookAddons.typesMod.types.PANEL & String = js.native
    
    /* "preview" */ val PREVIEW: typings.storybookAddons.typesMod.types.PREVIEW & String = js.native
    
    /* "tab" */ val TAB: typings.storybookAddons.typesMod.types.TAB & String = js.native
    
    /* "tool" */ val TOOL: typings.storybookAddons.typesMod.types.TOOL & String = js.native
    
    /* "toolextra" */ val TOOLEXTRA: typings.storybookAddons.typesMod.types.TOOLEXTRA & String = js.native
  }
  
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
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  
  @scala.inline
  def useStoryContext(): StoryContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryContext")().asInstanceOf[StoryContext]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.storybookAddons.typesMod.MakeDecoratorResult because Already inherited */ @js.native
  trait MakeDecoratorResult
    extends typings.storybookAddons.makeDecoratorMod.MakeDecoratorResult
}
