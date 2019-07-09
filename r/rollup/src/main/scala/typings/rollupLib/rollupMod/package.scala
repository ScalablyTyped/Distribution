package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollupMod {
  type AddonHook = java.lang.String | (js.ThisFunction0[/* this */ PluginContext, java.lang.String | js.Promise[java.lang.String]])
  type EmitAsset = js.Function2[
    /* name */ java.lang.String, 
    /* source */ js.UndefOr[java.lang.String | nodeLib.Buffer], 
    java.lang.String
  ]
  type EmitChunk = js.Function2[
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[rollupLib.Anon_Name], 
    java.lang.String
  ]
  type ExternalOption = js.Array[java.lang.String] | IsExternal
  type GetManualChunk = js.Function1[/* id */ java.lang.String, js.UndefOr[java.lang.String | scala.Null]]
  type GlobalsOption = org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* name */ java.lang.String, java.lang.String])
  type HasModuleSideEffects = js.Function2[/* id */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]
  type InputOption = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IsExternal = js.Function3[
    /* source */ java.lang.String, 
    /* importer */ java.lang.String, 
    /* isResolved */ scala.Boolean, 
    js.UndefOr[scala.Boolean | scala.Null]
  ]
  type IsPureModule = js.Function1[/* id */ java.lang.String, js.UndefOr[scala.Boolean | scala.Null]]
  type LoadHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* id */ java.lang.String, 
    (js.Promise[SourceDescription | java.lang.String | scala.Null]) | SourceDescription | java.lang.String | scala.Null
  ]
  type ManualChunksOption = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | GetManualChunk
  type ModuleSideEffectsOption = scala.Boolean | rollupLib.rollupLibStrings.`no-external` | js.Array[java.lang.String] | HasModuleSideEffects
  type OptionsPaths = (stdLib.Record[java.lang.String, java.lang.String]) | (js.Function1[/* id */ java.lang.String, java.lang.String])
  type OutputBundle = org.scalablytyped.runtime.StringDictionary[OutputAsset | OutputChunk]
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], Plugin]
  type PureModulesOption = scala.Boolean | js.Array[java.lang.String] | IsPureModule
  type RenderChunkHook = js.ThisFunction3[
    /* this */ PluginContext, 
    /* code */ java.lang.String, 
    /* chunk */ RenderedChunk, 
    /* options */ OutputOptions, 
    (js.Promise[rollupLib.Anon_Code | scala.Null]) | rollupLib.Anon_Code | java.lang.String | scala.Null
  ]
  type ResolveAssetUrlHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* options */ rollupLib.Anon_AssetFileName, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveDynamicImportHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* specifier */ java.lang.String | estreeLib.estreeMod.Node, 
    /* importer */ java.lang.String, 
    js.Promise[ResolveIdResult] | ResolveIdResult
  ]
  type ResolveFileUrlHook = js.ThisFunction1[
    /* this */ PluginContext, 
    /* options */ rollupLib.Anon_AssetReferenceId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveIdHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
    js.Promise[ResolveIdResult] | ResolveIdResult
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - rollupLib.rollupLibNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - PartialResolvedId
  */
  type ResolveIdResult = js.UndefOr[_ResolveIdResult | java.lang.String | scala.Null]
  type ResolveImportMetaHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* prop */ java.lang.String | scala.Null, 
    /* options */ rollupLib.Anon_ChunkId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolvedIdMap = org.scalablytyped.runtime.StringDictionary[ResolvedId]
  type SerializablePluginCache = org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, js.Any]]
  type SerializedTimings = org.scalablytyped.runtime.StringDictionary[js.Tuple3[scala.Double, scala.Double, scala.Double]]
  /* Rewritten from type alias, can be one of: 
    - ExistingRawSourceMap
    - java.lang.String
    - scala.Null
    - rollupLib.Anon_
  */
  type SourceMapInput = _SourceMapInput | java.lang.String | scala.Null
  type SourceMapSegment = js.Array[scala.Double] | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type TransformChunkHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* code */ java.lang.String, 
    /* options */ OutputOptions, 
    js.UndefOr[
      (js.Promise[js.UndefOr[rollupLib.Anon_Code | scala.Null]]) | rollupLib.Anon_Code | scala.Null
    ]
  ]
  type TransformHook = js.ThisFunction2[
    /* this */ PluginContext, 
    /* code */ java.lang.String, 
    /* id */ java.lang.String, 
    js.Promise[TransformResult] | TransformResult
  ]
  type TransformResult = js.UndefOr[java.lang.String | scala.Null | TransformSourceDescription]
  type WarningHandler = js.Function1[/* warning */ java.lang.String | RollupWarning, scala.Unit]
  type WarningHandlerWithDefault = js.Function2[
    /* warning */ java.lang.String | RollupWarning, 
    /* defaultHandler */ WarningHandler, 
    scala.Unit
  ]
}
