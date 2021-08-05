package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: java.lang.String = typings.rollup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]

inline def rollup(options: typings.rollup.mod.RollupOptions): js.Promise[typings.rollup.mod.RollupBuild] = typings.rollup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.rollup.mod.RollupBuild]]

inline def watch(config: js.Array[typings.rollup.mod.RollupWatchOptions]): typings.rollup.mod.RollupWatcher = typings.rollup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[typings.rollup.mod.RollupWatcher]
inline def watch(config: typings.rollup.mod.RollupWatchOptions): typings.rollup.mod.RollupWatcher = typings.rollup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[typings.rollup.mod.RollupWatcher]

type AddonHook = java.lang.String | typings.rollup.mod.AddonHookFunction

type AddonHookFunction = js.ThisFunction0[
/* this */ typings.rollup.mod.PluginContext, 
java.lang.String | js.Promise[java.lang.String]]

type CustomPluginOptions = org.scalablytyped.runtime.StringDictionary[js.Any]

type EmitAsset = js.Function2[
/* name */ java.lang.String, 
/* source */ js.UndefOr[java.lang.String | typings.std.Uint8Array], 
java.lang.String]

type EmitChunk = js.Function2[
/* id */ java.lang.String, 
/* options */ js.UndefOr[typings.rollup.anon.Name], 
java.lang.String]

type EmitFile = js.Function1[/* emittedFile */ typings.rollup.mod.EmittedFile, java.lang.String]

type ExternalOption = (js.Array[java.lang.String | typings.std.RegExp]) | java.lang.String | typings.std.RegExp | (js.Function3[
/* source */ java.lang.String, 
/* importer */ js.UndefOr[java.lang.String], 
/* isResolved */ scala.Boolean, 
js.UndefOr[scala.Boolean | scala.Null]])

type GetInterop = js.Function1[/* id */ java.lang.String | scala.Null, typings.rollup.mod.InteropType]

type GetManualChunk = js.Function2[
/* id */ java.lang.String, 
/* api */ typings.rollup.mod.GetManualChunkApi, 
js.UndefOr[java.lang.String | scala.Null]]

type GetModuleInfo = js.Function1[/* moduleId */ java.lang.String, typings.rollup.mod.ModuleInfo | scala.Null]

type GlobalsOption = org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* name */ java.lang.String, java.lang.String])

type HasModuleSideEffects = js.Function2[/* id */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]

type InputOption = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typings.rollup.rollupStrings.auto
  - typings.rollup.rollupStrings.esModule
  - typings.rollup.rollupStrings.default
  - typings.rollup.rollupStrings.defaultOnly
*/
type InteropType = typings.rollup.mod._InteropType | scala.Boolean

type IsExternal = js.Function3[
/* source */ java.lang.String, 
/* importer */ js.UndefOr[java.lang.String], 
/* isResolved */ scala.Boolean, 
scala.Boolean]

type IsPureModule = js.Function1[/* id */ java.lang.String, js.UndefOr[scala.Boolean | scala.Null]]

type LoadHook = js.ThisFunction1[
/* this */ typings.rollup.mod.PluginContext, 
/* id */ java.lang.String, 
js.Promise[typings.rollup.mod.LoadResult] | typings.rollup.mod.LoadResult]

type LoadResult = js.UndefOr[typings.rollup.mod.SourceDescription | java.lang.String | scala.Null]

type ManualChunksOption = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | typings.rollup.mod.GetManualChunk

type ModuleParsedHook = js.ThisFunction1[
/* this */ typings.rollup.mod.PluginContext, 
/* info */ typings.rollup.mod.ModuleInfo, 
js.Promise[scala.Unit] | scala.Unit]

type ModuleSideEffectsOption = scala.Boolean | typings.rollup.rollupStrings.`no-external` | js.Array[java.lang.String] | typings.rollup.mod.HasModuleSideEffects

type OptionsPaths = (typings.std.Record[java.lang.String, java.lang.String]) | (js.Function1[/* id */ java.lang.String, java.lang.String])

type OutputBundle = org.scalablytyped.runtime.StringDictionary[typings.rollup.mod.OutputAsset | typings.rollup.mod.OutputChunk]

type OutputBundleWithPlaceholders = org.scalablytyped.runtime.StringDictionary[
typings.rollup.mod.OutputAsset | typings.rollup.mod.OutputChunk | typings.rollup.mod.FilePlaceholder]

type PartialNull[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: T[P] | null}
  */ typings.rollup.rollupStrings.PartialNull & org.scalablytyped.runtime.TopLevel[T]

type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], typings.rollup.mod.Plugin]

type PureModulesOption = scala.Boolean | js.Array[java.lang.String] | typings.rollup.mod.IsPureModule

type RenderChunkHook = js.ThisFunction3[
/* this */ typings.rollup.mod.PluginContext, 
/* code */ java.lang.String, 
/* chunk */ typings.rollup.mod.RenderedChunk, 
/* options */ typings.rollup.mod.NormalizedOutputOptions, 
(js.Promise[typings.rollup.anon.Code | scala.Null]) | typings.rollup.anon.Code | java.lang.String | scala.Null]

type ResolveAssetUrlHook = js.ThisFunction1[
/* this */ typings.rollup.mod.PluginContext, 
/* options */ typings.rollup.anon.AssetFileName, 
js.UndefOr[java.lang.String | scala.Null]]

type ResolveDynamicImportHook = js.ThisFunction2[
/* this */ typings.rollup.mod.PluginContext, 
/* specifier */ java.lang.String | typings.rollup.mod.AcornNode, 
/* importer */ java.lang.String, 
js.Promise[typings.rollup.mod.ResolveIdResult] | typings.rollup.mod.ResolveIdResult]

type ResolveFileUrlHook = js.ThisFunction1[
/* this */ typings.rollup.mod.PluginContext, 
/* options */ typings.rollup.anon.AssetReferenceId, 
js.UndefOr[java.lang.String | scala.Null]]

type ResolveIdHook = js.ThisFunction3[
/* this */ typings.rollup.mod.PluginContext, 
/* source */ java.lang.String, 
/* importer */ js.UndefOr[java.lang.String], 
/* options */ typings.rollup.anon.`1`, 
js.Promise[typings.rollup.mod.ResolveIdResult] | typings.rollup.mod.ResolveIdResult]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.rollup.rollupBooleans.`false`
  - scala.Null
  - scala.Unit
  - typings.rollup.mod.PartialResolvedId
*/
type ResolveIdResult = js.UndefOr[typings.rollup.mod._ResolveIdResult | java.lang.String | scala.Null]

type ResolveImportMetaHook = js.ThisFunction2[
/* this */ typings.rollup.mod.PluginContext, 
/* prop */ java.lang.String | scala.Null, 
/* options */ typings.rollup.anon.ChunkId, 
js.UndefOr[java.lang.String | scala.Null]]

type ResolvedIdMap = org.scalablytyped.runtime.StringDictionary[typings.rollup.mod.ResolvedId]

type SerializablePluginCache = org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, js.Any]]

type SerializedTimings = org.scalablytyped.runtime.StringDictionary[js.Tuple3[scala.Double, scala.Double, scala.Double]]

/* Rewritten from type alias, can be one of: 
  - typings.rollup.mod.ExistingRawSourceMap
  - java.lang.String
  - scala.Null
  - typings.rollup.anon.`0`
*/
type SourceMapInput = typings.rollup.mod._SourceMapInput | java.lang.String | scala.Null

type SourceMapSegment = js.Array[scala.Double] | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])

type SourcemapPathTransformOption = js.Function2[
/* relativeSourcePath */ java.lang.String, 
/* sourcemapPath */ java.lang.String, 
java.lang.String]

type TransformHook = js.ThisFunction2[
/* this */ typings.rollup.mod.TransformPluginContext, 
/* code */ java.lang.String, 
/* id */ java.lang.String, 
js.Promise[typings.rollup.mod.TransformResult] | typings.rollup.mod.TransformResult]

type TransformResult = js.UndefOr[java.lang.String | scala.Null | typings.rollup.anon.PartialSourceDescription]

type WarningHandler = js.Function1[/* warning */ typings.rollup.mod.RollupWarning, scala.Unit]

type WarningHandlerWithDefault = js.Function2[
/* warning */ typings.rollup.mod.RollupWarning, 
/* defaultHandler */ typings.rollup.mod.WarningHandler, 
scala.Unit]

type WatchChangeHook = js.ThisFunction2[
/* this */ typings.rollup.mod.PluginContext, 
/* id */ java.lang.String, 
/* change */ typings.rollup.anon.Event, 
scala.Unit]
