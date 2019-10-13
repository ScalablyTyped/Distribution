package typings.atStorybookAddons

import typings.atStorybookAddons.distHooksMod.Decorator
import typings.atStorybookAddons.distHooksMod.EventMap
import typings.atStorybookAddons.distMakeDashDecoratorMod.MakeDecoratorOptions
import typings.atStorybookAddons.distMakeDashDecoratorMod.MakeDecoratorResult
import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryGetter
import typings.atStorybookAddons.distTypesMod.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/public_api", JSImport.Namespace)
@js.native
object distPublicUnderscoreApiMod extends js.Object {
  @js.native
  class AddonStore ()
    extends typings.atStorybookAddons.distMod.AddonStore
  
  @js.native
  class HooksContext ()
    extends typings.atStorybookAddons.distHooksMod.HooksContext
  
  val addons: typings.atStorybookAddons.distMod.AddonStore = js.native
  val default: typings.atStorybookAddons.distMod.AddonStore = js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  def isSupportedType(`type`: Types): Boolean = js.native
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptionsAllowDeprecatedUsage: MakeDecoratorOptions): MakeDecoratorResult = js.native
  def mockChannel(): typings.atStorybookChannels.atStorybookChannelsMod.default = js.native
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
  object types extends js.Object {
    /* "notes-element" */ val NOTES_ELEMENT: typings.atStorybookAddons.distTypesMod.types.NOTES_ELEMENT with String = js.native
    /* "panel" */ val PANEL: typings.atStorybookAddons.distTypesMod.types.PANEL with String = js.native
    /* "preview" */ val PREVIEW: typings.atStorybookAddons.distTypesMod.types.PREVIEW with String = js.native
    /* "tab" */ val TAB: typings.atStorybookAddons.distTypesMod.types.TAB with String = js.native
    /* "tool" */ val TOOL: typings.atStorybookAddons.distTypesMod.types.TOOL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.atStorybookAddons.distTypesMod.types with String] = js.native
  }
  
}

