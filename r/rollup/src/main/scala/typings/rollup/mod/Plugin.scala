package typings.rollup.mod

import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PluginHooks> */
/* Inlined parent std.Partial<rollup.rollup.OutputPluginValueHooks> */
@js.native
trait Plugin extends StObject {
  
  // for inter-plugin communication
  var api: js.UndefOr[js.Any] = js.native
  
  var augmentChunkHash: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
  ] = js.native
  
  var banner: js.UndefOr[AddonHook] = js.native
  
  var buildEnd: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
  ] = js.native
  
  var buildStart: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var closeWatcher: js.UndefOr[js.ThisFunction0[/* this */ PluginContext, Unit]] = js.native
  
  var footer: js.UndefOr[AddonHook] = js.native
  
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
  
  var intro: js.UndefOr[AddonHook] = js.native
  
  var load: js.UndefOr[LoadHook] = js.native
  
  var moduleParsed: js.UndefOr[ModuleParsedHook] = js.native
  
  var name: String = js.native
  
  var options: js.UndefOr[
    js.ThisFunction1[
      /* this */ MinimalPluginContext, 
      /* options */ InputOptions, 
      js.UndefOr[(js.Promise[js.UndefOr[InputOptions | Null]]) | InputOptions | Null]
    ]
  ] = js.native
  
  var outputOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      js.UndefOr[OutputOptions | Null]
    ]
  ] = js.native
  
  var outro: js.UndefOr[AddonHook] = js.native
  
  var renderChunk: js.UndefOr[RenderChunkHook] = js.native
  
  var renderDynamicImport: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
  ] = js.native
  
  var renderError: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
  ] = js.native
  
  var renderStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ NormalizedOutputOptions, 
      /* inputOptions */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.native
  
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.native
  
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.native
  
  var resolveId: js.UndefOr[ResolveIdHook] = js.native
  
  var resolveImportMeta: js.UndefOr[ResolveImportMetaHook] = js.native
  
  var transform: js.UndefOr[TransformHook] = js.native
  
  var watchChange: js.UndefOr[WatchChangeHook] = js.native
  
  var writeBundle: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
}
object Plugin {
  
  @scala.inline
  def apply(name: String): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setAugmentChunkHash(value: js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]): Self = StObject.set(x, "augmentChunkHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAugmentChunkHashUndefined: Self = StObject.set(x, "augmentChunkHash", js.undefined)
    
    @scala.inline
    def setBanner(value: AddonHook): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    @scala.inline
    def setBuildEnd(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
    ): Self = StObject.set(x, "buildEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildEndUndefined: Self = StObject.set(x, "buildEnd", js.undefined)
    
    @scala.inline
    def setBuildStart(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildStartUndefined: Self = StObject.set(x, "buildStart", js.undefined)
    
    @scala.inline
    def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    @scala.inline
    def setCloseWatcher(value: js.ThisFunction0[/* this */ PluginContext, Unit]): Self = StObject.set(x, "closeWatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseWatcherUndefined: Self = StObject.set(x, "closeWatcher", js.undefined)
    
    @scala.inline
    def setFooter(value: AddonHook): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setGenerateBundle(
      value: js.ThisFunction3[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          /* isWrite */ Boolean, 
          Unit | js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "generateBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateBundleUndefined: Self = StObject.set(x, "generateBundle", js.undefined)
    
    @scala.inline
    def setIntro(value: AddonHook): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    @scala.inline
    def setLoad(value: LoadHook): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setModuleParsed(value: ModuleParsedHook): Self = StObject.set(x, "moduleParsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleParsedUndefined: Self = StObject.set(x, "moduleParsed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(
      value: js.ThisFunction1[
          /* this */ MinimalPluginContext, 
          /* options */ InputOptions, 
          js.UndefOr[(js.Promise[js.UndefOr[InputOptions | Null]]) | InputOptions | Null]
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOutputOptions(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ OutputOptions, 
          js.UndefOr[OutputOptions | Null]
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    
    @scala.inline
    def setOutro(value: AddonHook): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    @scala.inline
    def setRenderChunk(value: RenderChunkHook): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderChunkUndefined: Self = StObject.set(x, "renderChunk", js.undefined)
    
    @scala.inline
    def setRenderDynamicImport(
      value: js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDynamicImportUndefined: Self = StObject.set(x, "renderDynamicImport", js.undefined)
    
    @scala.inline
    def setRenderError(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    
    @scala.inline
    def setRenderStart(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* outputOptions */ NormalizedOutputOptions, 
          /* inputOptions */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderStartUndefined: Self = StObject.set(x, "renderStart", js.undefined)
    
    @scala.inline
    def setResolveAssetUrl(value: ResolveAssetUrlHook): Self = StObject.set(x, "resolveAssetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveAssetUrlUndefined: Self = StObject.set(x, "resolveAssetUrl", js.undefined)
    
    @scala.inline
    def setResolveDynamicImport(value: ResolveDynamicImportHook): Self = StObject.set(x, "resolveDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveDynamicImportUndefined: Self = StObject.set(x, "resolveDynamicImport", js.undefined)
    
    @scala.inline
    def setResolveFileUrl(value: ResolveFileUrlHook): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveFileUrlUndefined: Self = StObject.set(x, "resolveFileUrl", js.undefined)
    
    @scala.inline
    def setResolveId(value: ResolveIdHook): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveIdUndefined: Self = StObject.set(x, "resolveId", js.undefined)
    
    @scala.inline
    def setResolveImportMeta(value: ResolveImportMetaHook): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveImportMetaUndefined: Self = StObject.set(x, "resolveImportMeta", js.undefined)
    
    @scala.inline
    def setTransform(value: TransformHook): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setWatchChange(value: WatchChangeHook): Self = StObject.set(x, "watchChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchChangeUndefined: Self = StObject.set(x, "watchChange", js.undefined)
    
    @scala.inline
    def setWriteBundle(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          Unit | js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "writeBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteBundleUndefined: Self = StObject.set(x, "writeBundle", js.undefined)
  }
}
