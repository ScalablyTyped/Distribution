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

