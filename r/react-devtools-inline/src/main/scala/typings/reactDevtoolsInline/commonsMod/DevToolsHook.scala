package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`react-devtools`
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`renderer-attached`
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`unsupported-renderer-version`
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.fastRefreshScheduled
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.operations
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.renderer
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.shutdown
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.traceUpdates
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevToolsHook extends StObject {
  
  /** React uses these methods. */
  def checkDCE(fn: AnyFn): Unit = js.native
  
  var dangerous_setTargetConsoleForTesting: js.UndefOr[js.Function1[/* fakeConsole */ Record[String, Any], js.UndefOr[Unit]]] = js.native
  
  def emit(event: HookEvents, data: Any): Unit = js.native
  
  def getFiberRoots(rendererID: RendererID): Set[FiberRootNode] = js.native
  
  /** Timeline internal module filtering */
  def getInternalModuleRanges(): js.Array[js.Tuple2[String, String]] = js.native
  
  def inject(renderer: ReactRenderer): Double | Null = js.native
  
  var listeners: Record[String, js.Array[ListenerHandler]] = js.native
  
  var nativeStyleEditorValidAttributes: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("off")
  def off_fastRefreshScheduled(event: fastRefreshScheduled, handler: HookEventListener[fastRefreshScheduled]): Unit = js.native
  @JSName("off")
  def off_operations(event: operations, handler: HookEventListener[operations]): Unit = js.native
  @JSName("off")
  def off_reactdevtools(event: `react-devtools`, handler: HookEventListener[`react-devtools`]): Unit = js.native
  @JSName("off")
  def off_renderer(event: renderer, handler: HookEventListener[renderer]): Unit = js.native
  @JSName("off")
  def off_rendererattached(event: `renderer-attached`, handler: HookEventListener[`renderer-attached`]): Unit = js.native
  @JSName("off")
  def off_shutdown(event: shutdown, handler: HookEventListener[shutdown]): Unit = js.native
  @JSName("off")
  def off_traceUpdates(event: traceUpdates, handler: HookEventListener[traceUpdates]): Unit = js.native
  @JSName("off")
  def off_unsupportedrendererversion(event: `unsupported-renderer-version`, handler: HookEventListener[`unsupported-renderer-version`]): Unit = js.native
  
  def onCommitFiberRoot(
    rendererID: RendererID,
    /** Added in v16.9 to support Profiler priority labels */
  fiber: Record[String, Any]
  ): Unit = js.native
  def onCommitFiberRoot(
    rendererID: RendererID,
    /** Added in v16.9 to support Profiler priority labels */
  fiber: Record[String, Any],
    /** Added in v16.9 to support Fast Refresh */
  commitPriority: Double
  ): Unit = js.native
  def onCommitFiberRoot(
    rendererID: RendererID,
    /** Added in v16.9 to support Profiler priority labels */
  fiber: Record[String, Any],
    /** Added in v16.9 to support Fast Refresh */
  commitPriority: Double,
    didError: Boolean
  ): Unit = js.native
  def onCommitFiberRoot(
    rendererID: RendererID,
    /** Added in v16.9 to support Profiler priority labels */
  fiber: Record[String, Any],
    /** Added in v16.9 to support Fast Refresh */
  commitPriority: Unit,
    didError: Boolean
  ): Unit = js.native
  
  def onCommitFiberUnmount(rendererID: RendererID, fiber: Record[String, Any]): Unit = js.native
  
  @JSName("on")
  def on_fastRefreshScheduled(event: fastRefreshScheduled, handler: HookEventListener[fastRefreshScheduled]): Unit = js.native
  @JSName("on")
  def on_operations(event: operations, handler: HookEventListener[operations]): Unit = js.native
  @JSName("on")
  def on_reactdevtools(event: `react-devtools`, handler: HookEventListener[`react-devtools`]): Unit = js.native
  @JSName("on")
  def on_renderer(event: renderer, handler: HookEventListener[renderer]): Unit = js.native
  @JSName("on")
  def on_rendererattached(event: `renderer-attached`, handler: HookEventListener[`renderer-attached`]): Unit = js.native
  @JSName("on")
  def on_shutdown(event: shutdown, handler: HookEventListener[shutdown]): Unit = js.native
  @JSName("on")
  def on_traceUpdates(event: traceUpdates, handler: HookEventListener[traceUpdates]): Unit = js.native
  @JSName("on")
  def on_unsupportedrendererversion(event: `unsupported-renderer-version`, handler: HookEventListener[`unsupported-renderer-version`]): Unit = js.native
  
  var reactDevtoolsAgent: js.UndefOr[(Record[String, Any]) | Null] = js.native
  
  def registerInternalModuleStart(moduleStartError: js.Error): Unit = js.native
  
  def registerInternalModuleStop(moduleStopError: js.Error): Unit = js.native
  
  var rendererInterfaces: Map[RendererID, RendererInterface] = js.native
  
  var renderers: Map[RendererID, ReactRenderer] = js.native
  
  /**
    * Used by react-native-web and Flipper/Inspector
    */
  var resolveRNStyle: js.UndefOr[ResolveNativeStyle] = js.native
  
  @JSName("sub")
  def sub_fastRefreshScheduled(event: fastRefreshScheduled, handler: HookEventListener[fastRefreshScheduled]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_operations(event: operations, handler: HookEventListener[operations]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_reactdevtools(event: `react-devtools`, handler: HookEventListener[`react-devtools`]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_renderer(event: renderer, handler: HookEventListener[renderer]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_rendererattached(event: `renderer-attached`, handler: HookEventListener[`renderer-attached`]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_shutdown(event: shutdown, handler: HookEventListener[shutdown]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_traceUpdates(event: traceUpdates, handler: HookEventListener[traceUpdates]): js.Function0[Unit] = js.native
  @JSName("sub")
  def sub_unsupportedrendererversion(event: `unsupported-renderer-version`, handler: HookEventListener[`unsupported-renderer-version`]): js.Function0[Unit] = js.native
}
