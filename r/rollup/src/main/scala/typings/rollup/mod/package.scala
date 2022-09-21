package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.rollup.anon.AssetFileName
import typings.rollup.anon.AssetReferenceId
import typings.rollup.anon.Ast
import typings.rollup.anon.Change
import typings.rollup.anon.ChunkId
import typings.rollup.anon.Code
import typings.rollup.anon.Event
import typings.rollup.anon.Handler
import typings.rollup.anon.IsEntry
import typings.rollup.anon.Name
import typings.rollup.anon.PartialSourceDescription
import typings.rollup.mod.^
import typings.rollup.rollupStrings.`no-external`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

inline def defineConfig(options: js.Array[RollupOptions]): js.Array[RollupOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RollupOptions]]
inline def defineConfig(options: RollupOptions): RollupOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defineConfig")(options.asInstanceOf[js.Any]).asInstanceOf[RollupOptions]

inline def rollup(options: RollupOptions): js.Promise[RollupBuild] = ^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RollupBuild]]

inline def watch(config: js.Array[RollupWatchOptions]): RollupWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[RollupWatcher]
inline def watch(config: RollupWatchOptions): RollupWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[RollupWatcher]

type AddonHook = String | AddonHookFunction

type AddonHookFunction = js.ThisFunction0[/* this */ PluginContext, String | js.Promise[String]]

type CustomPluginOptions = StringDictionary[Any]

type EmitAsset = js.Function2[
/* name */ String, 
/* source */ js.UndefOr[String | js.typedarray.Uint8Array], 
String]

type EmitChunk = js.Function2[/* id */ String, /* options */ js.UndefOr[Name], String]

type EmitFile = js.Function1[/* emittedFile */ EmittedFile, String]

type ExternalOption = (js.Array[String | js.RegExp]) | String | js.RegExp | (js.Function3[
/* source */ String, 
/* importer */ js.UndefOr[String], 
/* isResolved */ Boolean, 
Boolean | Null | Unit])

type GetInterop = js.Function1[/* id */ String | Null, InteropType]

type GetManualChunk = js.Function2[/* id */ String, /* api */ GetManualChunkApi, String | Null | Unit]

type GetModuleInfo = js.Function1[/* moduleId */ String, ModuleInfo | Null]

type GlobalsOption = StringDictionary[String] | (js.Function1[/* name */ String, String])

type HasModuleSideEffects = js.Function2[/* id */ String, /* external */ Boolean, Boolean]

type InputOption = String | js.Array[String] | StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.rollup.rollupStrings.auto
  - typings.rollup.rollupStrings.esModule
  - typings.rollup.rollupStrings.default
  - typings.rollup.rollupStrings.defaultOnly
*/
type InteropType = _InteropType | Boolean

type IsExternal = js.Function3[
/* source */ String, 
/* importer */ js.UndefOr[String], 
/* isResolved */ Boolean, 
Boolean]

type IsPureModule = js.Function1[/* id */ String, Boolean | Null | Unit]

type LoadHook = js.ThisFunction1[/* this */ PluginContext, /* id */ String, LoadResult]

type LoadResult = SourceDescription | String | Null | Unit

type MakeAsync[Fn] = js.ThisFunction1[/* this */ Any, /* args */ Any, Any | js.Promise[Any]]

type ManualChunksOption = StringDictionary[js.Array[String]] | GetManualChunk

type ModuleParsedHook = js.ThisFunction1[/* this */ PluginContext, /* info */ ModuleInfo, Unit]

type ModuleSideEffectsOption = Boolean | `no-external` | js.Array[String] | HasModuleSideEffects

// eslint-disable-next-line @typescript-eslint/ban-types
type ObjectHook[T, O] = T | (Handler[T] & O)

type OptionsPaths = (Record[String, String]) | (js.Function1[/* id */ String, String])

type OutputBundle = StringDictionary[OutputAsset | OutputChunk]

type OutputBundleWithPlaceholders = StringDictionary[OutputAsset | OutputChunk | FilePlaceholder]

type PartialNull[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: T[P] | null}
  */ typings.rollup.rollupStrings.PartialNull & TopLevel[T]

type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], Plugin]

type PureModulesOption = Boolean | js.Array[String] | IsPureModule

type RenderChunkHook = js.ThisFunction3[
/* this */ PluginContext, 
/* code */ String, 
/* chunk */ RenderedChunk, 
/* options */ NormalizedOutputOptions, 
js.UndefOr[Code | String | Null]]

type ResolveAssetUrlHook = js.ThisFunction1[/* this */ PluginContext, /* options */ AssetFileName, String | Null | Unit]

type ResolveDynamicImportHook = js.ThisFunction2[
/* this */ PluginContext, 
/* specifier */ String | AcornNode, 
/* importer */ String, 
ResolveIdResult]

type ResolveFileUrlHook = js.ThisFunction1[/* this */ PluginContext, /* options */ AssetReferenceId, String | Null | Unit]

type ResolveIdHook = js.ThisFunction3[
/* this */ PluginContext, 
/* source */ String, 
/* importer */ js.UndefOr[String], 
/* options */ IsEntry, 
ResolveIdResult]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.rollup.rollupBooleans.`false`
  - scala.Null
  - scala.Unit
  - typings.rollup.mod.PartialResolvedId
*/
type ResolveIdResult = _ResolveIdResult | String | Null | Unit

type ResolveImportMetaHook = js.ThisFunction2[
/* this */ PluginContext, 
/* prop */ String | Null, 
/* options */ ChunkId, 
String | Null | Unit]

type ResolvedIdMap = StringDictionary[ResolvedId]

type RollupWatcher = RollupAwaitingEmitter[Change]

type SerializablePluginCache = StringDictionary[js.Tuple2[Double, Any]]

type SerializedTimings = StringDictionary[js.Tuple3[Double, Double, Double]]

type ShouldTransformCachedModuleHook = js.ThisFunction1[/* this */ PluginContext, /* options */ Ast, Boolean]

/* Rewritten from type alias, can be one of: 
  - typings.rollup.mod.ExistingRawSourceMap
  - java.lang.String
  - scala.Null
  - typings.rollup.anon.`0`
*/
type SourceMapInput = _SourceMapInput | String | Null

type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])

type SourcemapPathTransformOption = js.Function2[/* relativeSourcePath */ String, /* sourcemapPath */ String, String]

type TransformHook = js.ThisFunction2[/* this */ TransformPluginContext, /* code */ String, /* id */ String, TransformResult]

type TransformResult = String | Null | Unit | PartialSourceDescription

type WarningHandler = js.Function1[/* warning */ RollupWarning, Unit]

type WarningHandlerWithDefault = js.Function2[/* warning */ RollupWarning, /* defaultHandler */ WarningHandler, Unit]

type WatchChangeHook = js.ThisFunction2[/* this */ PluginContext, /* id */ String, /* change */ Event, Unit]
