package typings.storybookPreviewWeb

import typings.std.HTMLElement
import typings.std.Pick
import typings.storybookAddons.mod.Channel
import typings.storybookPreviewWeb.anon.ForceRemount
import typings.storybookPreviewWeb.anon.ViewModeChangedBoolean
import typings.storybookStore.anon.Description
import typings.storybookStore.mod.StoryStore
import typings.storybookStore.ts39TypesMod.RenderContext
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyRenderMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/StoryRender", "PREPARE_ABORTED")
  @js.native
  val PREPARE_ABORTED: js.Error = js.native
  
  @JSImport("@storybook/preview-web/dist/ts3.9/StoryRender", "StoryRender")
  @js.native
  open class StoryRender[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] protected ()
    extends StObject
       with Render[TFramework] {
    def this(
      channel: Channel,
      store: StoryStore[TFramework],
      renderToScreen: js.Function2[
            /* renderContext */ RenderContext[TFramework], 
            /* canvasElement */ HTMLElement, 
            Unit | js.Promise[Unit]
          ],
      callbacks: RenderContextCallbacks[TFramework],
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
    ) = this()
    def this(
      channel: Channel,
      store: StoryStore[TFramework],
      renderToScreen: js.Function2[
            /* renderContext */ RenderContext[TFramework], 
            /* canvasElement */ HTMLElement, 
            Unit | js.Promise[Unit]
          ],
      callbacks: RenderContextCallbacks[TFramework],
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any,
      story: Story[TFramework]
    ) = this()
    
    /* private */ var abortController: Any = js.native
    
    /* private */ var callbacks: Any = js.native
    
    def cancelRender(): Unit = js.native
    
    /* private */ var canvasElement: Any = js.native
    
    var channel: Channel = js.native
    
    def context(): Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework, imported_csf.Args> */ Any, 
        String | Double
      ] = js.native
    
    def isEqual(): Boolean = js.native
    def isEqual(other: Render[TFramework]): Boolean = js.native
    
    def isPending(): Boolean = js.native
    
    /* private */ var notYetRendered: Any = js.native
    
    var phase: js.UndefOr[RenderPhase] = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    def remount(): js.Promise[Unit] = js.native
    
    def render(): js.Promise[Unit] = js.native
    def render(hasInitialForceRemount: ForceRemount): js.Promise[Unit] = js.native
    
    /* private */ var renderToScreen: Any = js.native
    
    def rerender(): js.Promise[Unit] = js.native
    
    /* private */ var runPhase: Any = js.native
    
    var store: StoryStore[TFramework] = js.native
    
    def teardown(): js.Promise[Unit] = js.native
    def teardown(options: js.Object): js.Promise[Unit] = js.native
    
    var viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any = js.native
  }
  
  @js.native
  trait Render[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var disableKeyListeners: Boolean = js.native
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any = js.native
    
    def isPreparing(): Boolean = js.native
    
    def renderToElement(canvasElement: HTMLElement): js.Promise[Unit] = js.native
    def renderToElement(canvasElement: HTMLElement, renderStoryToElement: Any): js.Promise[Unit] = js.native
    
    var story: js.UndefOr[Story[TFramework]] = js.native
    
    def teardown(options: ViewModeChangedBoolean): js.Promise[Unit] = js.native
  }
  
  /* Inlined std.Pick<@storybook/store.@storybook/store.RenderContext<TFramework>, 'showMain' | 'showError' | 'showException'> */
  trait RenderContextCallbacks[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var showError: js.Function1[/* error */ Description, Unit]
    
    var showException: js.Function1[/* err */ js.Error, Unit]
    
    var showMain: js.Function0[Unit]
  }
  object RenderContextCallbacks {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      showError: /* error */ Description => Unit,
      showException: /* err */ js.Error => Unit,
      showMain: () => Unit
    ): RenderContextCallbacks[TFramework] = {
      val __obj = js.Dynamic.literal(showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain))
      __obj.asInstanceOf[RenderContextCallbacks[TFramework]]
    }
    
    extension [Self <: RenderContextCallbacks[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & RenderContextCallbacks[TFramework]) {
      
      inline def setShowError(value: /* error */ Description => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
      
      inline def setShowException(value: /* err */ js.Error => Unit): Self = StObject.set(x, "showException", js.Any.fromFunction1(value))
      
      inline def setShowMain(value: () => Unit): Self = StObject.set(x, "showMain", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.preparing
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.loading
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.rendering
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.playing
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.played
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.completed
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.aborted
    - typings.storybookPreviewWeb.storybookPreviewWebStrings.errored
  */
  trait RenderPhase extends StObject
  object RenderPhase {
    
    inline def aborted: typings.storybookPreviewWeb.storybookPreviewWebStrings.aborted = "aborted".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.aborted]
    
    inline def completed: typings.storybookPreviewWeb.storybookPreviewWebStrings.completed = "completed".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.completed]
    
    inline def errored: typings.storybookPreviewWeb.storybookPreviewWebStrings.errored = "errored".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.errored]
    
    inline def loading: typings.storybookPreviewWeb.storybookPreviewWebStrings.loading = "loading".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.loading]
    
    inline def played: typings.storybookPreviewWeb.storybookPreviewWebStrings.played = "played".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.played]
    
    inline def playing: typings.storybookPreviewWeb.storybookPreviewWebStrings.playing = "playing".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.playing]
    
    inline def preparing: typings.storybookPreviewWeb.storybookPreviewWebStrings.preparing = "preparing".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.preparing]
    
    inline def rendering: typings.storybookPreviewWeb.storybookPreviewWebStrings.rendering = "rendering".asInstanceOf[typings.storybookPreviewWeb.storybookPreviewWebStrings.rendering]
  }
}
