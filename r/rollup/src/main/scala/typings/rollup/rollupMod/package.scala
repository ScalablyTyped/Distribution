package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollupMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.estree.estreeMod.Node
  import typings.node.Buffer
  import typings.rollup.Anon_AssetFileName
  import typings.rollup.Anon_AssetReferenceId
  import typings.rollup.Anon_ChunkId
  import typings.rollup.Anon_Code
  import typings.rollup.Anon_Name
  import typings.rollup.rollupStrings.`no-external`
  import typings.std.Record

  type AddonHook = String | (js.ThisFunction0[/* this */ PluginContext, String | js.Promise[String]])
  type EmitAsset = js.Function2[/* name */ String, /* source */ js.UndefOr[String | Buffer], String]
  type EmitChunk = js.Function2[/* id */ String, /* options */ js.UndefOr[Anon_Name], String]
  type EmitFile = js.Function1[/* emittedFile */ EmittedFile, String]
  type ExternalOption = js.Array[String] | IsExternal
  type GetManualChunk = js.Function1[/* id */ String, js.UndefOr[String | Null]]
  type GlobalsOption = StringDictionary[String] | (js.Function1[/* name */ String, String])
  type HasModuleSideEffects = js.Function2[/* id */ String, /* external */ Boolean, Boolean]
  type InputOption = String | js.Array[String] | StringDictionary[String]
  type IsExternal = js.Function3[
    /* source */ String, 
    /* importer */ String, 
    /* isResolved */ Boolean, 
    js.UndefOr[Boolean | Null]
  ]
  type IsPureModule = js.Function1[/* id */ String, js.UndefOr[Boolean | Null]]
  type LoadHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* id */ String, 
    (js.Promise[SourceDescription | String | Null]) | SourceDescription | String | Null
  ]
  type ManualChunksOption = StringDictionary[js.Array[String]] | GetManualChunk
  type ModuleSideEffectsOption = Boolean | `no-external` | js.Array[String] | HasModuleSideEffects
  type OptionsPaths = (Record[String, String]) | (js.Function1[/* id */ String, String])
  type OutputBundle = StringDictionary[OutputAsset | OutputChunk]
  type OutputBundleWithPlaceholders = StringDictionary[OutputAsset | OutputChunk | FilePlaceholder]
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], Plugin]
  type PureModulesOption = Boolean | js.Array[String] | IsPureModule
  type RenderChunkHook = js.ThisFunction3[
    /* this */ PluginContext, 
    /* code */ String, 
    /* chunk */ RenderedChunk, 
    /* options */ OutputOptions, 
    (js.Promise[Anon_Code | Null]) | Anon_Code | String | Null
  ]
  type ResolveAssetUrlHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* options */ Anon_AssetFileName, 
    js.UndefOr[String | Null]
  ]
  type ResolveDynamicImportHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* specifier */ String | Node, 
    /* importer */ String, 
    js.Promise[ResolveIdResult] | ResolveIdResult
  ]
  type ResolveFileUrlHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* options */ Anon_AssetReferenceId, 
    js.UndefOr[String | Null]
  ]
  type ResolveIdHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* source */ String, 
    /* importer */ js.UndefOr[String], 
    js.Promise[ResolveIdResult] | ResolveIdResult
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.rollup.rollupNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - typings.rollup.rollupMod.PartialResolvedId
  */
  type ResolveIdResult = js.UndefOr[_ResolveIdResult | String | Null]
  type ResolveImportMetaHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* prop */ String | Null, 
    /* options */ Anon_ChunkId, 
    js.UndefOr[String | Null]
  ]
  type ResolvedIdMap = StringDictionary[ResolvedId]
  type SerializablePluginCache = StringDictionary[js.Tuple2[Double, js.Any]]
  type SerializedTimings = StringDictionary[js.Tuple3[Double, Double, Double]]
  /* Rewritten from type alias, can be one of: 
    - typings.rollup.rollupMod.ExistingRawSourceMap
    - java.lang.String
    - scala.Null
    - typings.rollup.Anon_
  */
  type SourceMapInput = _SourceMapInput | String | Null
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
  type TransformChunkHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* code */ String, 
    /* options */ OutputOptions, 
    js.UndefOr[(js.Promise[js.UndefOr[Anon_Code | Null]]) | Anon_Code | Null]
  ]
  type TransformHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* code */ String, 
    /* id */ String, 
    js.Promise[TransformResult] | TransformResult
  ]
  type TransformResult = js.UndefOr[String | Null | TransformSourceDescription]
  type WarningHandler = js.Function1[/* warning */ RollupWarning, Unit]
  type WarningHandlerWithDefault = js.Function2[/* warning */ RollupWarning, /* defaultHandler */ WarningHandler, Unit]
}
