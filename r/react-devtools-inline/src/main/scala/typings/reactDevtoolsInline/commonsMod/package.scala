package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BackendBridge = Bridge[BackendEvents, FrontendEvents]

type BatchUID = Double

type CanViewElementSource = js.Function1[/* inspectedElement */ InspectedElement, Boolean]

type Context = FetchFileWithCaching | Null

type FBSourceMetadata = js.Tuple2[js.UndefOr[Any], js.UndefOr[ReactSourceMetadata | Null]]

type FBSourcesArray = js.Array[js.UndefOr[FBSourceMetadata | Null]]

type FetchFileWithCaching = js.Function1[/* url */ String, js.Promise[String]]

type FindNativeNodesForFiberID = js.Function1[/* id */ Double, js.UndefOr[js.Array[Any] | Null]]

type Flamechart = js.Array[FlamechartStackLayer]

type FlamechartStackLayer = js.Array[FlamechartStackFrame]

type FrontendBridge = Bridge[FrontendEvents, BackendEvents]

type GetDisplayNameForFiberID = js.Function2[
/* id */ Double, 
/* findNearestUnfilteredAncestor */ js.UndefOr[Boolean], 
String | Null]

type GetFiberIDForNative = js.Function2[
/* component */ NativeType, 
/* findNearestUnfilteredAncestor */ js.UndefOr[Boolean], 
Double | Null]

type HookEventListener[EV /* <: HookEvents */] = js.Function1[
/* import warning: importer.ImportType#apply Failed type conversion: EV extends 'renderer' | 'operations' | 'traceUpdates' | 'react-devtools' | 'renderer-attached' | 'shutdown' | 'fastRefreshScheduled' | 'unsupported-renderer-version' ? react-devtools-inline.react-devtools-inline/commons.HookEventPayload[EV] : unknown */ /* params */ js.Any, 
Any]

type HookName = String | Null

type HookNames = Map[HookSourceLocationKey, HookName]

type HookNamesModuleLoaderFunction = js.Function0[PromiseLike[ParseHookNamesModule]]

type HookSourceLocationKey = String

type InternalModuleSourceToRanges = Map[String, js.Array[js.Tuple2[ErrorStackFrame, ErrorStackFrame]]]

type Lane = Double

type LaneToLabelMap = Map[ReactLane, String]

type ListenerHandler = js.Function1[/* data */ Any, Unit]

type Milliseconds = Double

type NativeType = Any

type ParseHookNames = js.Function2[
/* hooksTree */ js.Array[HooksNode], 
/* fetchFileWithCaching */ FetchFileWithCaching | Null, 
js.Promise[HookNames | Null]]

type ParseSourceAndMetadata = js.Function2[
/* hooksList */ js.Array[HooksNode], 
/* locationKeyToHookSourceAndMetadata */ Map[String, HookSourceAndMetadata], 
js.Promise[HookNames | Null]]

type ReactLane = Double

type ReactSourceMetadata = js.Array[js.UndefOr[EncodedHookMap | Null]]

type ReactSourcesArray = js.Array[js.UndefOr[ReactSourceMetadata | Null]]

type RendererID = Double

type ResolveNativeStyle = js.Function1[/* stylesheetID */ Any, js.UndefOr[(Record[String, Any]) | Null]]

type ViewAttributeSource = js.Function2[/* id */ Double, /* path */ js.Array[String | Double], Unit]

type ViewElementSource = js.Function2[/* id */ Double, /* inspectedElement */ InspectedElement, Unit]

type getCommitTree = js.Function1[/* options */ typings.reactDevtoolsInline.anon.ProfilerStore, CommitTree]
