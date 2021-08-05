package typings.rollup.mod

import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PluginHooks> */
/* Inlined parent std.Partial<rollup.rollup.OutputPluginValueHooks> */
trait Plugin extends StObject {
  
  // for inter-plugin communication
  var api: js.UndefOr[js.Any] = js.undefined
  
  var augmentChunkHash: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
  ] = js.undefined
  
  var banner: js.UndefOr[AddonHook] = js.undefined
  
  var buildEnd: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
  ] = js.undefined
  
  var buildStart: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var closeWatcher: js.UndefOr[js.ThisFunction0[/* this */ PluginContext, Unit]] = js.undefined
  
  var footer: js.UndefOr[AddonHook] = js.undefined
  
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  
  var intro: js.UndefOr[AddonHook] = js.undefined
  
  var load: js.UndefOr[LoadHook] = js.undefined
  
  var moduleParsed: js.UndefOr[ModuleParsedHook] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[
    js.ThisFunction1[
      /* this */ MinimalPluginContext, 
      /* options */ InputOptions, 
      js.UndefOr[(js.Promise[js.UndefOr[InputOptions | Null]]) | InputOptions | Null]
    ]
  ] = js.undefined
  
  var outputOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      js.UndefOr[OutputOptions | Null]
    ]
  ] = js.undefined
  
  var outro: js.UndefOr[AddonHook] = js.undefined
  
  var renderChunk: js.UndefOr[RenderChunkHook] = js.undefined
  
  var renderDynamicImport: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
  ] = js.undefined
  
  var renderError: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
  ] = js.undefined
  
  var renderStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ NormalizedOutputOptions, 
      /* inputOptions */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.undefined
  
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.undefined
  
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.undefined
  
  var resolveId: js.UndefOr[ResolveIdHook] = js.undefined
  
  var resolveImportMeta: js.UndefOr[ResolveImportMetaHook] = js.undefined
  
  var transform: js.UndefOr[TransformHook] = js.undefined
  
  var watchChange: js.UndefOr[WatchChangeHook] = js.undefined
  
  var writeBundle: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
}
object Plugin {
  
  inline def apply(name: String): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setAugmentChunkHash(value: js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]): Self = StObject.set(x, "augmentChunkHash", value.asInstanceOf[js.Any])
    
    inline def setAugmentChunkHashUndefined: Self = StObject.set(x, "augmentChunkHash", js.undefined)
    
    inline def setBanner(value: AddonHook): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setBuildEnd(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
    ): Self = StObject.set(x, "buildEnd", value.asInstanceOf[js.Any])
    
    inline def setBuildEndUndefined: Self = StObject.set(x, "buildEnd", js.undefined)
    
    inline def setBuildStart(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    inline def setBuildStartUndefined: Self = StObject.set(x, "buildStart", js.undefined)
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setCloseWatcher(value: js.ThisFunction0[/* this */ PluginContext, Unit]): Self = StObject.set(x, "closeWatcher", value.asInstanceOf[js.Any])
    
    inline def setCloseWatcherUndefined: Self = StObject.set(x, "closeWatcher", js.undefined)
    
    inline def setFooter(value: AddonHook): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setGenerateBundle(
      value: js.ThisFunction3[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          /* isWrite */ Boolean, 
          Unit | js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "generateBundle", value.asInstanceOf[js.Any])
    
    inline def setGenerateBundleUndefined: Self = StObject.set(x, "generateBundle", js.undefined)
    
    inline def setIntro(value: AddonHook): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    inline def setLoad(value: LoadHook): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setModuleParsed(value: ModuleParsedHook): Self = StObject.set(x, "moduleParsed", value.asInstanceOf[js.Any])
    
    inline def setModuleParsedUndefined: Self = StObject.set(x, "moduleParsed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: js.ThisFunction1[
          /* this */ MinimalPluginContext, 
          /* options */ InputOptions, 
          js.UndefOr[(js.Promise[js.UndefOr[InputOptions | Null]]) | InputOptions | Null]
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOutputOptions(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ OutputOptions, 
          js.UndefOr[OutputOptions | Null]
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    
    inline def setOutro(value: AddonHook): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    inline def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    inline def setRenderChunk(value: RenderChunkHook): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderChunkUndefined: Self = StObject.set(x, "renderChunk", js.undefined)
    
    inline def setRenderDynamicImport(
      value: js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setRenderDynamicImportUndefined: Self = StObject.set(x, "renderDynamicImport", js.undefined)
    
    inline def setRenderError(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    
    inline def setRenderStart(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* outputOptions */ NormalizedOutputOptions, 
          /* inputOptions */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    inline def setRenderStartUndefined: Self = StObject.set(x, "renderStart", js.undefined)
    
    inline def setResolveAssetUrl(value: ResolveAssetUrlHook): Self = StObject.set(x, "resolveAssetUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveAssetUrlUndefined: Self = StObject.set(x, "resolveAssetUrl", js.undefined)
    
    inline def setResolveDynamicImport(value: ResolveDynamicImportHook): Self = StObject.set(x, "resolveDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setResolveDynamicImportUndefined: Self = StObject.set(x, "resolveDynamicImport", js.undefined)
    
    inline def setResolveFileUrl(value: ResolveFileUrlHook): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrlUndefined: Self = StObject.set(x, "resolveFileUrl", js.undefined)
    
    inline def setResolveId(value: ResolveIdHook): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    
    inline def setResolveIdUndefined: Self = StObject.set(x, "resolveId", js.undefined)
    
    inline def setResolveImportMeta(value: ResolveImportMetaHook): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMetaUndefined: Self = StObject.set(x, "resolveImportMeta", js.undefined)
    
    inline def setTransform(value: TransformHook): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWatchChange(value: WatchChangeHook): Self = StObject.set(x, "watchChange", value.asInstanceOf[js.Any])
    
    inline def setWatchChangeUndefined: Self = StObject.set(x, "watchChange", js.undefined)
    
    inline def setWriteBundle(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          Unit | js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "writeBundle", value.asInstanceOf[js.Any])
    
    inline def setWriteBundleUndefined: Self = StObject.set(x, "writeBundle", js.undefined)
  }
}
