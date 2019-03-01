package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var banner: js.UndefOr[AddonHook] = js.undefined
  var buildEnd: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[nodeLib.Error], 
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
  var cacheKey: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[AddonHook] = js.undefined
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ scala.Boolean, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ] = js.undefined
  var intro: js.UndefOr[AddonHook] = js.undefined
  var load: js.UndefOr[LoadHook] = js.undefined
  var name: java.lang.String
  /** @deprecated */
  var ongenerate: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ]
  ] = js.undefined
  /** @deprecated */
  var onwrite: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
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
  var outro: js.UndefOr[AddonHook] = js.undefined
  var renderChunk: js.UndefOr[RenderChunkHook] = js.undefined
  var renderError: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[nodeLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ] = js.undefined
  var renderStart: js.UndefOr[js.ThisFunction0[/* this */ PluginContext, js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.undefined
  var resolveId: js.UndefOr[ResolveIdHook] = js.undefined
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

object Plugin {
  @scala.inline
  def apply(
    name: java.lang.String,
    banner: AddonHook = null,
    buildEnd: js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[nodeLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ] = null,
    buildStart: js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ InputOptions, 
      js.Promise[scala.Unit] | scala.Unit
    ] = null,
    cacheKey: java.lang.String = null,
    footer: AddonHook = null,
    generateBundle: js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ scala.Boolean, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null,
    intro: AddonHook = null,
    load: LoadHook = null,
    ongenerate: js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null,
    onwrite: js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* chunk */ OutputChunk, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null,
    options: js.ThisFunction1[
      /* this */ MinimalPluginContext, 
      /* options */ InputOptions, 
      InputOptions | scala.Unit | scala.Null
    ] = null,
    outro: AddonHook = null,
    renderChunk: RenderChunkHook = null,
    renderError: js.ThisFunction1[
      /* this */ PluginContext, 
      /* err */ js.UndefOr[nodeLib.Error], 
      js.Promise[scala.Unit] | scala.Unit
    ] = null,
    renderStart: js.ThisFunction0[/* this */ PluginContext, js.Promise[scala.Unit] | scala.Unit] = null,
    resolveDynamicImport: ResolveDynamicImportHook = null,
    resolveId: ResolveIdHook = null,
    transform: TransformHook = null,
    transformBundle: TransformChunkHook = null,
    transformChunk: TransformChunkHook = null,
    watchChange: js.Function1[/* id */ java.lang.String, scala.Unit] = null,
    writeBundle: js.ThisFunction1[
      /* this */ PluginContext, 
      /* bundle */ OutputBundle, 
      scala.Unit | js.Promise[scala.Unit]
    ] = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (buildEnd != null) __obj.updateDynamic("buildEnd")(buildEnd)
    if (buildStart != null) __obj.updateDynamic("buildStart")(buildStart)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (generateBundle != null) __obj.updateDynamic("generateBundle")(generateBundle)
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load)
    if (ongenerate != null) __obj.updateDynamic("ongenerate")(ongenerate)
    if (onwrite != null) __obj.updateDynamic("onwrite")(onwrite)
    if (options != null) __obj.updateDynamic("options")(options)
    if (outro != null) __obj.updateDynamic("outro")(outro.asInstanceOf[js.Any])
    if (renderChunk != null) __obj.updateDynamic("renderChunk")(renderChunk)
    if (renderError != null) __obj.updateDynamic("renderError")(renderError)
    if (renderStart != null) __obj.updateDynamic("renderStart")(renderStart)
    if (resolveDynamicImport != null) __obj.updateDynamic("resolveDynamicImport")(resolveDynamicImport)
    if (resolveId != null) __obj.updateDynamic("resolveId")(resolveId)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transformBundle != null) __obj.updateDynamic("transformBundle")(transformBundle)
    if (transformChunk != null) __obj.updateDynamic("transformChunk")(transformChunk)
    if (watchChange != null) __obj.updateDynamic("watchChange")(watchChange)
    if (writeBundle != null) __obj.updateDynamic("writeBundle")(writeBundle)
    __obj.asInstanceOf[Plugin]
  }
}

