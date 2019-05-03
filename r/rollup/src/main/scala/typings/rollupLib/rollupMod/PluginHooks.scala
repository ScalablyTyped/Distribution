package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginHooks extends js.Object {
  var buildEnd: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[stdLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ] = js.undefined
  var buildStart: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ InputOptions, 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ] = js.undefined
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ scala.Boolean, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ] = js.undefined
  var load: js.UndefOr[LoadHook] = js.undefined
  /** @deprecated */
  var ongenerate: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnGenerateOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ] = js.undefined
  /** @deprecated */
  var onwrite: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnWriteOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ] = js.undefined
  var options: js.UndefOr[
    js.ThisFunction1[
      /* this */ MinimalPluginContext, 
      /* options */ InputOptions, 
      InputOptions | scala.Unit | scala.Null
    ]
  ] = js.undefined
  var outputOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      OutputOptions | scala.Unit | scala.Null
    ]
  ] = js.undefined
  var renderChunk: js.UndefOr[RenderChunkHook] = js.undefined
  var renderError: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[stdLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ] = js.undefined
  var renderStart: js.UndefOr[js.ThisFunction0[/* this */ PluginContext, js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  /** @deprecated */
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.undefined
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.undefined
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.undefined
  var resolveId: js.UndefOr[ResolveIdHook] = js.undefined
  var resolveImportMeta: js.UndefOr[ResolveImportMetaHook] = js.undefined
  var transform: js.UndefOr[TransformHook] = js.undefined
  /** @deprecated */
  var transformBundle: js.UndefOr[TransformChunkHook] = js.undefined
  /** @deprecated */
  var transformChunk: js.UndefOr[TransformChunkHook] = js.undefined
  var watchChange: js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.undefined
  var writeBundle: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* bundle */ OutputBundle, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ] = js.undefined
}

object PluginHooks {
  @scala.inline
  def apply(
    buildEnd: js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[stdLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ] = null,
    buildStart: js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ InputOptions, 
      js.Promise[scala.Unit] | scala.Unit
    ] = null,
    generateBundle: js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ scala.Boolean, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null,
    load: LoadHook = null,
    ongenerate: js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnGenerateOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null,
    onwrite: js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnWriteOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null,
    options: js.ThisFunction1[
      /* this */ MinimalPluginContext, 
      /* options */ InputOptions, 
      InputOptions | scala.Unit | scala.Null
    ] = null,
    outputOptions: js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      OutputOptions | scala.Unit | scala.Null
    ] = null,
    renderChunk: RenderChunkHook = null,
    renderError: js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[stdLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ] = null,
    renderStart: js.ThisFunction0[/* this */ PluginContext, js.Promise[scala.Unit] | scala.Unit] = null,
    resolveAssetUrl: ResolveAssetUrlHook = null,
    resolveDynamicImport: ResolveDynamicImportHook = null,
    resolveFileUrl: ResolveFileUrlHook = null,
    resolveId: ResolveIdHook = null,
    resolveImportMeta: ResolveImportMetaHook = null,
    transform: TransformHook = null,
    transformBundle: TransformChunkHook = null,
    transformChunk: TransformChunkHook = null,
    watchChange: /* id */ java.lang.String => scala.Unit = null,
    writeBundle: js.ThisFunction1[
      /* this */ PluginContext, 
      /* bundle */ OutputBundle, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null
  ): PluginHooks = {
    val __obj = js.Dynamic.literal()
    if (buildEnd != null) __obj.updateDynamic("buildEnd")(buildEnd)
    if (buildStart != null) __obj.updateDynamic("buildStart")(buildStart)
    if (generateBundle != null) __obj.updateDynamic("generateBundle")(generateBundle)
    if (load != null) __obj.updateDynamic("load")(load)
    if (ongenerate != null) __obj.updateDynamic("ongenerate")(ongenerate)
    if (onwrite != null) __obj.updateDynamic("onwrite")(onwrite)
    if (options != null) __obj.updateDynamic("options")(options)
    if (outputOptions != null) __obj.updateDynamic("outputOptions")(outputOptions)
    if (renderChunk != null) __obj.updateDynamic("renderChunk")(renderChunk)
    if (renderError != null) __obj.updateDynamic("renderError")(renderError)
    if (renderStart != null) __obj.updateDynamic("renderStart")(renderStart)
    if (resolveAssetUrl != null) __obj.updateDynamic("resolveAssetUrl")(resolveAssetUrl)
    if (resolveDynamicImport != null) __obj.updateDynamic("resolveDynamicImport")(resolveDynamicImport)
    if (resolveFileUrl != null) __obj.updateDynamic("resolveFileUrl")(resolveFileUrl)
    if (resolveId != null) __obj.updateDynamic("resolveId")(resolveId)
    if (resolveImportMeta != null) __obj.updateDynamic("resolveImportMeta")(resolveImportMeta)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transformBundle != null) __obj.updateDynamic("transformBundle")(transformBundle)
    if (transformChunk != null) __obj.updateDynamic("transformChunk")(transformChunk)
    if (watchChange != null) __obj.updateDynamic("watchChange")(js.Any.fromFunction1(watchChange))
    if (writeBundle != null) __obj.updateDynamic("writeBundle")(writeBundle)
    __obj.asInstanceOf[PluginHooks]
  }
}

