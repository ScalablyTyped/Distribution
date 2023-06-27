package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.anon.AssertionsRecord
import typings.rollup.anon.Ast
import typings.rollup.anon.Change
import typings.rollup.anon.ChunkId
import typings.rollup.anon.Chunks
import typings.rollup.anon.Code
import typings.rollup.anon.Column
import typings.rollup.anon.Custom
import typings.rollup.anon.Event
import typings.rollup.anon.FileName
import typings.rollup.anon.Handler
import typings.rollup.anon.PartialSourceDescription
import typings.rollup.mod.^
import typings.rollup.rollupBooleans.`false`
import typings.rollup.rollupStrings.`no-external`
import typings.rollup.rollupStrings.error_
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

inline def defineConfig(optionsFunction: RollupOptionsFunction): RollupOptionsFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(optionsFunction.asInstanceOf[js.Any]).asInstanceOf[RollupOptionsFunction]
inline def defineConfig(options: js.Array[RollupOptions]): js.Array[RollupOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RollupOptions]]
inline def defineConfig(options: RollupOptions): RollupOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(options.asInstanceOf[js.Any]).asInstanceOf[RollupOptions]

inline def rollup(options: RollupOptions): js.Promise[RollupBuild] = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RollupBuild]]

inline def watch(config: js.Array[RollupWatchOptions]): RollupWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[RollupWatcher]
inline def watch(config: RollupWatchOptions): RollupWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[RollupWatcher]

type AddonFunction = js.Function1[/* chunk */ RenderedChunk, String | js.Promise[String]]

type AddonHook = String | AddonHookFunction

type AddonHookFunction = js.ThisFunction1[/* this */ PluginContext, /* chunk */ RenderedChunk, String | js.Promise[String]]

type AwaitedEventListener[T /* <: StringDictionary[js.Function1[/* parameters */ Any, Any]] */, K /* <: /* keyof T */ String */] = js.Function1[
/* parameters */ Parameters[
  /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
], 
Unit | js.Promise[Unit]]

type CustomPluginOptions = StringDictionary[Any]

type EmitFile = js.Function1[/* emittedFile */ EmittedFile, String]

type ExternalOption = (js.Array[String | js.RegExp]) | String | js.RegExp | (js.Function3[
/* source */ String, 
/* importer */ js.UndefOr[String], 
/* isResolved */ Boolean, 
Boolean | NullValue])

type GetInterop = js.Function1[/* id */ String | Null, InteropType]

type GetManualChunk = js.Function2[/* id */ String, /* meta */ ManualChunkMeta, String | NullValue]

type GetModuleInfo = js.Function1[/* moduleId */ String, ModuleInfo | Null]

type GlobalsOption = StringDictionary[String] | (js.Function1[/* name */ String, String])

type HasModuleSideEffects = js.Function2[/* id */ String, /* external */ Boolean, Boolean]

type InputOption = String | js.Array[String] | StringDictionary[String]

/** 
NOTE: Rewritten from type alias:
{{{
type InputPluginOption = rollup.rollup.MaybePromise<rollup.rollup.Plugin | rollup.rollup.NullValue | false | std.Array<rollup.rollup.InputPluginOption>>
}}}
to avoid circular code involving: 
- rollup.rollup.InputPluginOption
*/
type InputPluginOption = MaybePromise[Plugin | NullValue | `false` | js.Array[Any]]

type IsExternal = js.Function3[
/* source */ String, 
/* importer */ js.UndefOr[String], 
/* isResolved */ Boolean, 
Boolean]

type IsPureModule = js.Function1[/* id */ String, Boolean | NullValue]

type LoadHook = js.ThisFunction1[/* this */ PluginContext, /* id */ String, LoadResult]

type LoadResult = SourceDescription | String | NullValue

type LogHandler = js.Function2[/* level */ LogLevel, /* log */ RollupLog, Unit]

type LogHandlerWithDefault = js.Function3[
/* level */ LogLevel, 
/* log */ RollupLog, 
/* defaultHandler */ LogOrStringHandler, 
Unit]

type LogOrStringHandler = js.Function2[/* level */ LogLevel | error_, /* log */ RollupLog | String, Unit]

type LoggingFunction = js.Function1[/* log */ RollupLog | String | (js.Function0[RollupLog | String]), Unit]

type LoggingFunctionWithPosition = js.Function2[
/* log */ RollupLog | String | (js.Function0[RollupLog | String]), 
/* pos */ js.UndefOr[Double | Column], 
Unit]

type ManualChunksOption = StringDictionary[js.Array[String]] | GetManualChunk

type MaybeArray[T] = T | js.Array[T]

/** 
NOTE: Rewritten from type alias:
{{{
type MaybePromise = T | std.Promise<T>
}}}
to avoid circular code involving: 
- rollup.rollup.InputPluginOption
- rollup.rollup.MaybePromise
*/
type MaybePromise[T] = T | js.Promise[T]

type ModuleParsedHook = js.ThisFunction1[/* this */ PluginContext, /* info */ ModuleInfo, Unit]

type ModuleSideEffectsOption = Boolean | `no-external` | js.Array[String] | HasModuleSideEffects

// utils
type NullValue = js.UndefOr[Null | Unit]

// eslint-disable-next-line @typescript-eslint/ban-types
type ObjectHook[T, O] = T | (Handler[T] & O)

type OptionsPaths = (Record[String, String]) | (js.Function1[/* id */ String, String])

type OutputBundle = StringDictionary[OutputAsset | OutputChunk]

/** 
NOTE: Rewritten from type alias:
{{{
type OutputPluginOption = rollup.rollup.MaybePromise<rollup.rollup.OutputPlugin | rollup.rollup.NullValue | false | std.Array<rollup.rollup.OutputPluginOption>>
}}}
to avoid circular code involving: 
- rollup.rollup.MaybePromise
- rollup.rollup.OutputPluginOption
*/
type OutputPluginOption = Any

type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], Plugin]

type RenderChunkHook = js.ThisFunction4[
/* this */ PluginContext, 
/* code */ String, 
/* chunk */ RenderedChunk, 
/* options */ NormalizedOutputOptions, 
/* meta */ Chunks, 
Code | String | NullValue]

type ResolveDynamicImportHook = js.ThisFunction3[
/* this */ PluginContext, 
/* specifier */ String | AcornNode, 
/* importer */ String, 
/* options */ AssertionsRecord, 
ResolveIdResult]

type ResolveFileUrlHook = js.ThisFunction1[/* this */ PluginContext, /* options */ FileName, String | NullValue]

type ResolveIdHook = js.ThisFunction3[
/* this */ PluginContext, 
/* source */ String, 
/* importer */ js.UndefOr[String], 
/* options */ Custom, 
ResolveIdResult]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.rollup.mod.NullValue
  - typings.rollup.rollupBooleans.`false`
  - typings.rollup.mod.PartialResolvedId
*/
type ResolveIdResult = _ResolveIdResult | String | NullValue

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.rollup.rollupBooleans.`false`
  - typings.rollup.mod.PartialResolvedId
*/
type ResolveIdResultWithoutNullValue = _ResolveIdResultWithoutNullValue | String

type ResolveImportMetaHook = js.ThisFunction2[
/* this */ PluginContext, 
/* property */ String | Null, 
/* options */ ChunkId, 
String | NullValue]

type ResolvedIdMap = StringDictionary[ResolvedId]

type RollupOptionsFunction = js.Function1[
/* commandLineArguments */ Record[String, Any], 
MaybePromise[RollupOptions | js.Array[RollupOptions]]]

type RollupWarning = RollupLog

type RollupWatcher = AwaitingEventEmitter[Change]

type SerializablePluginCache = StringDictionary[js.Tuple2[Double, Any]]

type SerializedTimings = StringDictionary[js.Tuple3[Double, Double, Double]]

type ShouldTransformCachedModuleHook = js.ThisFunction1[/* this */ PluginContext, /* options */ Ast, Boolean | NullValue]

/* Rewritten from type alias, can be one of: 
  - typings.rollup.mod.ExistingRawSourceMap
  - java.lang.String
  - scala.Null
  - typings.rollup.anon.`0`
*/
type SourceMapInput = _SourceMapInput | String | Null

type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])

type SourcemapIgnoreListOption = js.Function2[/* relativeSourcePath */ String, /* sourcemapPath */ String, Boolean]

type SourcemapPathTransformOption = js.Function2[/* relativeSourcePath */ String, /* sourcemapPath */ String, String]

type TransformHook = js.ThisFunction2[/* this */ TransformPluginContext, /* code */ String, /* id */ String, TransformResult]

type TransformResult = String | NullValue | PartialSourceDescription

type WarningHandlerWithDefault = js.Function2[/* warning */ RollupLog, /* defaultHandler */ LoggingFunction, Unit]

type WatchChangeHook = js.ThisFunction2[/* this */ PluginContext, /* id */ String, /* change */ Event, Unit]
